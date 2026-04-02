package com.jeepark.onestep.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
            .background(Color.White)
    ){
        Column(modifier = Modifier
            .height(92.dp)
            .fillMaxWidth()
            .padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.tier_test_image),
                contentDescription = "현재 티어 족자 이미지",
                modifier = Modifier
                    .size(60.dp),
                contentScale = ContentScale.Fit)
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(46.dp)){}
        }

        Column(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()){}
    }
    }

@Preview
@Composable
private fun df() {
    ProgressScreen(onNavigateToMain = {})
}

