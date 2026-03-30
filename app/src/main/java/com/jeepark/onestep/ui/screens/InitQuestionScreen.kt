package com.jeepark.onestep.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import kotlinx.coroutines.launch

@Composable
fun InitQuestionScreen(
    modifier: Modifier = Modifier,
    onNavigateToMain : () -> Unit,
    onNavigateToInit : () -> Unit,
    repository: FirestoreRepository = remember { FirestoreRepository() }
) {
    val answers = remember { mutableStateListOf(0, 0, 0, 0, 0) }
    var isLoading by remember { mutableStateOf(false) }

    val scope = rememberCoroutineScope()
    val pagerState = rememberPagerState(pageCount = { 5 })
    val questions = listOf("동거인 수", "식사 횟수", "수면 시간", "외출 빈도" ,"히키 기간")

    Column(

    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f),
            userScrollEnabled = false,
        ) { pageIndex ->
            val currentQuestion = questions[pageIndex]

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 60.dp, vertical = 160.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top
            ) {
                Text(
                text=currentQuestion,
                style= text_Bold_28,
                )

                Spacer(modifier = Modifier.height(80.dp))

                TextInput(
                    isDigit = true,
                    placeholder = "답변",
                    onValueChange = { newValue ->
                        answers[pageIndex] = newValue.toIntOrNull() ?: 0
                    },
                    text = if (answers[pageIndex] == 0) "" else answers[pageIndex].toString(),

                )
            }


        }

        Box(
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth()
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


            if (answers[pagerState.currentPage] > 0) {
                if (pagerState.currentPage < 4) {
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
