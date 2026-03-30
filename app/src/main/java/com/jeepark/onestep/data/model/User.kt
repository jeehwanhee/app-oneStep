package com.jeepark.onestep.data.model

data class User(
    val uid: String = "",
    val email: String = "",
    val nickname: String = "",
    val age: Int = 0,
    val gender: Boolean =true, //true-남자

    val initQuestions: InitQuestions? = null,
    val isolated: Int = 0,
    val isolatedLastModified: Long = System.currentTimeMillis(),
    val isolatedCount: Int = 0,

    val prevQuests: List<PrevQuest> = emptyList(),
    val prevQuestLevel: Int = 0,
    val tier: Int = 0,
    val progress: Int = 0,

    val lastAccessDate: Long = System.currentTimeMillis(), //최근 접속일
    val termAgreed: Boolean = true,
    val policyAgreed: Boolean = true,
    val agreedAt: Long = System.currentTimeMillis(),
)