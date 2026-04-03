package com.jeepark.onestep.ui.screens

import android.R.attr.bottom
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.FirebaseApp
import com.jeepark.onestep.data.model.InitQuestions
import com.jeepark.onestep.ui.components.PagerNavigationButton
import com.jeepark.onestep.ui.components.TextInput
import com.jeepark.onestep.ui.theme.black
import com.jeepark.onestep.ui.theme.gray2
import com.jeepark.onestep.ui.theme.text_Bold_28
import com.jeepark.onestep.ui.theme.text_regular_20
import com.jeepark.onestep.util.FirestoreRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun InitQuestionScreen(
    modifier: Modifier = Modifier,
    onNavigateToMain : () -> Unit,
    onNavigateToInit : () -> Unit,
    repository: FirestoreRepository = remember { FirestoreRepository() }
) {
    val answers = remember { mutableStateListOf(-1, -1, -1, -1, -1, -1) }
    var isLoading by remember { mutableStateOf(false) }

    val scope = rememberCoroutineScope()
    val pagerState = rememberPagerState(pageCount = { 6 })
    val questions = listOf("동거인 수", "어제 식사 횟수", "어제 수면 시간", "지난 일주일 동안 밖에 나간 일 수" ,"일이나 학업을 하지 않은 기간 (월)", "주된 활동 시간: 0(새벽), 1(오전), 2(오후), 3(저녁)")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .imePadding(),
        verticalArrangement = Arrangement.Top
    ) {

        Spacer(modifier = Modifier.height(120.dp))

        HorizontalPager(
            state = pagerState,
            userScrollEnabled = false,
        ) { pageIndex ->
            val currentQuestion = questions[pageIndex]

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(210.dp)
                    .padding(horizontal = 60.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top
            ) {
                Text(
                text=currentQuestion,
                style= text_Bold_28,
                )

                Spacer(modifier = Modifier.height(60.dp))

                val focusRequester = remember { FocusRequester() }

                LaunchedEffect(pagerState.currentPage) {
                    if (pagerState.currentPage == pageIndex) {
                        delay(100)
                        focusRequester.requestFocus()
                    }
                }

                TextInput(
                    modifier = Modifier.focusRequester(focusRequester),
                    isDigit = true,
                    placeholder = "답변",
                    onValueChange = { newValue ->
                        answers[pageIndex] = newValue.toIntOrNull() ?: -1
                    },
                    text = if (answers[pageIndex] == -1) "" else answers[pageIndex].toString(),

                )

                Spacer(modifier = Modifier.weight(1f))
            }

        }

        Spacer(modifier = Modifier.weight(1f))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(horizontal = 20.dp),
            contentAlignment = Alignment.Center
        ) {

            if (pagerState.currentPage > 0) {
                PagerNavigationButton(
                    icon = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                    modifier = Modifier.align(Alignment.CenterStart),
                    onClick = {
                        scope.launch {
                            if (pagerState.currentPage > 0) {
                                pagerState.scrollToPage(pagerState.currentPage - 1)
                            }
                        }
                    }
                )
            }


            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(pagerState.pageCount) { iteration ->
                    val color = if (pagerState.currentPage == iteration) black else gray2
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .size(10.dp)
                            .clip(CircleShape)
                            .background(color)
                    )
                }
            }


            if (answers[pagerState.currentPage] >= 0) {
                if (pagerState.currentPage < 5) {
                    PagerNavigationButton(
                        icon = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        modifier = Modifier.align(Alignment.CenterEnd),
                        onClick = {
                            scope.launch {
                                pagerState.scrollToPage(pagerState.currentPage + 1)
                            }
                        }
                    )
                } else {
                    TextButton(
                        modifier = Modifier.align(Alignment.CenterEnd),
                        enabled = !isLoading,
                        onClick = {
                            isLoading = true
                            onClickSubmit(
                                onNavigateToMain = onNavigateToMain,
                                onNavigateToInit = {
                                    isLoading = false
                                    onNavigateToInit()
                                },
                                answers = answers,
                                repository = repository
                            )
                        },
                    ) {
                        if (isLoading) {
                            CircularProgressIndicator(modifier = Modifier.size(20.dp)) // 로딩 뱅글이
                        } else {
                            Text(text = "완료", style = text_regular_20)
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(30.dp))
    }


}

fun onClickSubmit(
    onNavigateToMain : () -> Unit,
    onNavigateToInit : () -> Unit,
    answers: List<Int>,
    repository: FirestoreRepository
    ) {

    val initQ = InitQuestions(
        member = answers[0],
        meal = answers[1],
        sleepTime = answers[2],
        outside = answers[3],
        hiki = answers[4],
        activeTime = answers[5],
        )

    repository.saveInitQuestions(
        data= initQ,
        onSuccess= {onNavigateToMain()},
        onFailure= {onNavigateToInit()},
    )
}



@Preview(showBackground = true)
@Composable
private fun PreviewInitQuestionScreen() {
    InitQuestionScreen(onNavigateToMain = {}, onNavigateToInit = {})
}
