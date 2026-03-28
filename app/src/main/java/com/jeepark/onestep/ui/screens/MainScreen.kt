package com.jeepark.onestep.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jeepark.onestep.ui.components.PlainTextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    onNavigateToMainQuest : () -> Unit,
    onNavigateToProgress : () -> Unit,
    onNavigateToSetting : () -> Unit,
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        PlainTextButton(text="퀘스트 받기", onClick = {onNavigateToMainQuest()})

        PlainTextButton(text="진척도 보기", onClick = {onNavigateToProgress()})

        PlainTextButton(text="설정", onClick = {onNavigateToSetting()})
    }
    
}

@Preview(showBackground = true)
@Composable
private fun PreviewMainScreen() {
    MainScreen(onNavigateToMainQuest={}, onNavigateToProgress = {}, onNavigateToSetting = {})
}