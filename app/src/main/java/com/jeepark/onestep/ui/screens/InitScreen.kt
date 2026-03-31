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
import com.google.firebase.firestore.firestore
import com.jeepark.onestep.data.model.InitQuestions
import com.jeepark.onestep.data.model.User
import com.jeepark.onestep.ui.theme.text_Bold_28
import kotlinx.coroutines.delay
import kotlin.jvm.java

@Composable
fun InitScreen(
    onNavigateToAuth: () -> Unit,
    onNavigateToMain: () -> Unit,
    onNavigateToInitQuestion: () -> Unit,
    onNavigateToSignup: () -> Unit
) {
    LaunchedEffect(Unit) {
        val auth = Firebase.auth
        val currentUser = auth.currentUser
        val db = Firebase.firestore


        delay(1500)

        if (currentUser != null) {
            val uid = currentUser.uid

            db.collection("users").document(uid).get()
                .addOnSuccessListener { userDoc ->
                    if (userDoc.exists()) {
                        val user = userDoc.toObject(User::class.java)

                        val initQuestions = user?.initQuestions

                        if (initQuestions != null && initQuestions.sleepTime != 0) {
                            onNavigateToMain()
                        } else {
                            onNavigateToInitQuestion()
                        }
                    } else {
                        onNavigateToSignup()
                    }
                }
                .addOnFailureListener {
                    onNavigateToAuth()
                }
        } else {
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