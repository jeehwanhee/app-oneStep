package com.jeepark.onestep.util

import android.R.attr.data
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore
import com.jeepark.onestep.data.model.InitQuestions
import com.jeepark.onestep.data.model.User

class FirestoreRepository {
    private val db = Firebase.firestore
    private val auth = Firebase.auth

    fun saveUser(
        nickname: String,
        age: Int,
        gender: Boolean,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val currentUser = Firebase.auth.currentUser
        val uid = currentUser!!.uid
        val email = currentUser.email

        val user = User(
            uid= uid,
            email= email!!,
            nickname=nickname,
            age=age,
            gender=gender,
        )
        db.collection("users").document(uid)
            .set(user)
            .addOnSuccessListener { onSuccess() }
            .addOnFailureListener { onFailure(it) }
    }

    fun saveInitQuestions(
        data: InitQuestions,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val uid = auth.currentUser?.uid ?: return

        db.collection("users").document(uid)
            .collection("initquestions")
            .add(data)
            .addOnSuccessListener { onSuccess() }
            .addOnFailureListener { onFailure(it) }
    }
}
