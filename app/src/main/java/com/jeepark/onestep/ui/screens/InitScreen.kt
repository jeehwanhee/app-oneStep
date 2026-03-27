package com.jeepark.onestep.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.jeepark.onestep.ui.theme.text_Bold_28
import kotlinx.coroutines.delay

@Composable
fun InitScreen(
    onNavigateToAuth: () -> Unit, // 로그인 안 되어 있을 때 이동할 함수
    onNavigateToMain: () -> Unit
) {
    LaunchedEffect(Unit) {
        val auth = Firebase.auth
        val currentUser = auth.currentUser

        // 너무 빨리 넘어가면 로고가 안 보이니 1.5초 정도 대기 (선택 사항)
        delay(1500)

        if (currentUser != null) {
            // 1. 로그인 되어 있음 -> 메인(또는 진단) 화면으로
            onNavigateToMain()
        } else {
            // 2. 로그인 안 되어 있음 -> 로그인 화면으로
            onNavigateToAuth()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(horizontal = 60.dp, vertical = 180.dp)
    ) {
        Text(text="한걸음,", style = text_Bold_28)
    }
}