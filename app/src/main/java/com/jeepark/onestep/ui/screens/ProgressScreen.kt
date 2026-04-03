package com.jeepark.onestep.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jeepark.onestep.R


@Composable
fun ProgressScreen(
    modifier: Modifier = Modifier,
    onNavigateToMain : () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),

    ){
        Row(modifier = Modifier
            .height(92.dp)
            .fillMaxWidth()
            .padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.tier_test_image_challenger),
                contentDescription = "현재 티어 이미지",
                modifier = Modifier
                    .size(60.dp),
                contentScale = ContentScale.Fit)
            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier //프레임 16
                .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween){
                Column(modifier = Modifier //임시 경험치바 -> progress bar로 구현해야됨
                    .height(16.dp)
                    .fillMaxWidth()
                    .background(Color.Green)) { }

                Spacer(modifier = Modifier.height(16.dp))

                Row(modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween){
                    Text(text = "현재 경험치 120 / 300") // 유저 데이터와 연결 필요
                    Text(text = "40%") //유저 데이터와 연결 필요
                }
            }
        }
        Column(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 32.dp)){

        }
    }
    }

@Preview
@Composable
private fun df() {
    ProgressScreen(onNavigateToMain = {})
}

