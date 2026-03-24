package com.jeepark.onestep.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jeepark.onestep.ui.theme.black
import com.jeepark.onestep.ui.theme.gray2
import com.jeepark.onestep.ui.theme.text_Bold_28

@Composable
fun TextInput(
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit,
    placeholder: String,
    text: String = "",
) {
    TextField(
        value = text,
        onValueChange = onValueChange,
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp),
        textStyle = text_Bold_28,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            disabledContainerColor = Color.Transparent,
            // 2. 하단 선(Indicator) 색상 지정
            focusedIndicatorColor = black,    // 포커스 됐을 때 선 색
            unfocusedIndicatorColor = black,   // 포커스 없을 때 선 색
        ),
        placeholder = { Text(placeholder, color = gray2, style = text_Bold_28) },
        singleLine = true,
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewUnderlineTextField() {
    var text by remember { mutableStateOf("") }
    TextInput(
        text = text,
        onValueChange = { text = it },
        placeholder = "이름을 입력하세요"
    )
}