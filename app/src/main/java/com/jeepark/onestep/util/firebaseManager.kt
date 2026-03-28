package com.jeepark.onestep.util

import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore
import com.jeepark.onestep.data.model.InitQuestions

class FirestoreRepository {
    private val db = Firebase.firestore
    private val auth = Firebase.auth

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
