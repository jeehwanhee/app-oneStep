package com.jeepark.onestep.ui.screens

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.jeepark.onestep.ui.components.BottomButton
import com.jeepark.onestep.ui.theme.purple
import com.jeepark.onestep.ui.theme.text_Bold_28
import com.jeepark.onestep.ui.theme.white
import com.jeepark.onestep.ui.viewmodels.AuthViewModel


@Composable
fun AuthScreen(
    onNavigateToMain : () -> Unit,
    onNavigateToInitQuestion: () -> Unit,
    screenModel: AuthViewModel = viewModel()
) {
    val context = LocalContext.current

    val googleSignInLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        // 결과가 돌아오면 ViewModel의 login 함수에 데이터를 넘겨줌
        screenModel.login(
            data = result.data,
            onNewUser = onNavigateToInitQuestion,
            onExistingUser = onNavigateToMain
        )
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 60.dp, vertical = 180.dp)
        ) {
            Text(text="한걸음,", style = text_Bold_28)
        }

        Spacer(modifier = Modifier.weight(1f))

        Box(
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            BottomButton(
                modifier = Modifier
                    .width(300.dp)
                    .height(60.dp),
                text="Google 로그인",
                onClick = {
                    val signInClient = screenModel.getGoogleSignInClient(context)
                    googleSignInLauncher.launch(signInClient.signInIntent)
                },
                containerColor = white,
                borderWidth=2)
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewAuthScreen() {
    AuthScreen(
        onNavigateToMain = {},
        onNavigateToInitQuestion = {}
    )
}