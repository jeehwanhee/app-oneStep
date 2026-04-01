package com.jeepark.onestep.ui.screens

import android.R.attr.text
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.jeepark.onestep.data.model.User
import com.jeepark.onestep.ui.components.BottomButton
import com.jeepark.onestep.ui.components.InputWithWarning
import com.jeepark.onestep.ui.components.SelectButton
import com.jeepark.onestep.ui.components.TextInput
import com.jeepark.onestep.util.FirestoreRepository

@Composable
fun SignupScreen(
    modifier: Modifier = Modifier,
    onNavigateToInitQuestion: () -> Unit,
    onNavigateToInit: () -> Unit,
    repository: FirestoreRepository = remember { FirestoreRepository() }) {

    val context = LocalContext.current

    var nickname by remember { mutableStateOf("") }
    var age by remember { mutableIntStateOf(0) }
    var gender by remember { mutableStateOf(true) }
    val enabled = nickname.isNotEmpty() && age != 0

    val nicknameRegex = "^[가-힣a-zA-Z0-9]*$".toRegex()
    val warning = if (nickname.matches(nicknameRegex)) {
        "한글, 영어, 숫자만 가능합니다."
    } else {
        ""
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 160.dp,
                start = 60.dp,
                end = 60.dp,
                bottom = 60.dp
            ),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {

        InputWithWarning(
            inputComp={TextInput(
                placeholder = "닉네임",
                onValueChange = { newValue ->
                    nickname = newValue
                },
                text = nickname,
            )},
            warningText = warning
        )

        Spacer(modifier = Modifier.height(12.dp))

        if (nickname.isNotEmpty()) {
            TextInput(
                isDigit = true,
                placeholder = "나이",
                onValueChange = { newValue ->
                    age = newValue.toIntOrNull() ?: 0
                },
                text = if(age!=0) age.toString() else "",
            )
        }

        Spacer(modifier = Modifier.height(48.dp))

        if (nickname.isNotEmpty() && age != 0) {
            SelectButton(
                leftText = "남자",
                rightText = "여자",
                leftOnClick = {gender = true},
                rightOnClick = {gender = false},
                isSelectedLeft = gender
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            BottomButton(
                text = "프로필 만들기",
                onClick = {saveUserInFirebase(nickname, age, gender, repository, onNavigateToInitQuestion, onNavigateToInit, context)},
                enabled = enabled,
            )

        }

    }
}

fun saveUserInFirebase(
    nickname: String,
    age: Int,
    gender: Boolean,
    repository: FirestoreRepository,
    onNavigateToInitQuestion: () -> Unit,
    onNavigateToInit: () -> Unit,
    context: android.content.Context
) {
    repository.saveInitUser(
        nickname=nickname,
        age=age,
        gender=gender,
        onSuccess = {onNavigateToInitQuestion()},
        onFailure = {e ->
            Toast.makeText(context, "회원가입에 실패했습니다: ${e.message}", Toast.LENGTH_SHORT).show()
            onNavigateToInit()}
        )
}