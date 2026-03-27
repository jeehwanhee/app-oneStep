package com.jeepark.onestep.ui.viewmodels

import android.content.Context
import android.content.Intent
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.Firebase
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.auth
import com.jeepark.onestep.R

class AuthViewModel : ViewModel() {

    private val auth = Firebase.auth

    fun getGoogleSignInClient(context: Context): GoogleSignInClient {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(context.getString(R.string.default_web_client_id)) // Firebase 연동 시 생성되는 키
            .requestEmail() // 이메일 정보 요청
            .build()

        return GoogleSignIn.getClient(context, gso)
    }

    fun login(
        data: Intent?,
        onNewUser: () -> Unit,
        onExistingUser: () -> Unit
    ) {
        try {
            // 1. Intent에서 구글 계정 정보 추출
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            val account = task.getResult(ApiException::class.java)

            // 2. 구글 ID 토큰으로 Firebase 인증 자격 증명 생성
            val credential = GoogleAuthProvider.getCredential(account.idToken, null)

            // 3. Firebase 로그인 시도
            auth.signInWithCredential(credential)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        // [신규 유저 구분 로직]
                        val isNewUser = task.result?.additionalUserInfo?.isNewUser ?: false
                        if (isNewUser) {
                            onNewUser() // 처음이면 진단 화면으로
                        } else {
                            onExistingUser() // 기존 유저면 메인 화면으로
                        }
                    }
                }
        } catch (e: Exception) {

        }
    }

    fun signOut() {
        auth.signOut()
    }
}