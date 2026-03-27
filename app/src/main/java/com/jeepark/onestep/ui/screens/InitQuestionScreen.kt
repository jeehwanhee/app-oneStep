package com.jeepark.onestep.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.jeepark.onestep.data.model.InitQuestions

@Composable
fun InitQuestionScreen(
    modifier: Modifier = Modifier,
    onNavigateToMain : () -> Unit,
) {
    val questions = InitQuestions()


}