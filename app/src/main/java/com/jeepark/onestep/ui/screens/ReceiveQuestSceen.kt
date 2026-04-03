package com.jeepark.onestep.ui.screens

import android.R.attr.enabled
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jeepark.onestep.ui.components.BottomButton
import com.jeepark.onestep.ui.components.DropdownInput
import com.jeepark.onestep.ui.components.InputWithWarning
import com.jeepark.onestep.ui.components.SelectButton
import com.jeepark.onestep.ui.components.TextInput

@Composable
fun ReceiveQuestScreen(
    modifier: Modifier = Modifier,
    onNavigateToQuest: () -> Unit
) {

    var selectedText by remember { mutableStateOf("") }
    val options = listOf("매우 나쁨", "나쁨", "보통", "좋음", "매우 좋음")
    var inside by remember { mutableStateOf(true) }
    val enabled = selectedText != ""



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

        DropdownInput(
            options = options,
            selectedText = selectedText,
            onOptionSelected = { index ->
                selectedText = options[index]
            },
            placeholder = "현재 기분은?"
        )


        Spacer(modifier = Modifier.height(60.dp))

        SelectButton(
            leftText = "실내",
            rightText = "실외",
            leftOnClick = { inside = true},
            rightOnClick = { inside = false},
            isSelectedLeft = inside
        )

        Spacer(modifier = Modifier.weight(1.toFloat()))



        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            BottomButton(
                text = "퀘스트 받기",
                onClick = {},
                enabled = enabled
            )

        }

    }
}
