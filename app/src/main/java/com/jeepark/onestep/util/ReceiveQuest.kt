package com.jeepark.onestep.util

fun getQuestDifficulty(
    isolation: Double,    // 0: 고립도 (0~100)
    mood: Int,           // 1: 현재 기분 (1~5)
    prevSuccess: Int,    // 2: 최근 10개 중 성공 개수 (0~10)
    prevDiff: Double,    // 3: 최근 10개 평균 난이도 (1.0~5.0)
    progress: Int        // 4: 진척도 (1~7)
): List<Double> {

    val inputData = doubleArrayOf(
        isolation,
        mood.toDouble(),
        prevSuccess.toDouble(),
        prevDiff,
        progress.toDouble()
    )

    val target = Model_B.predict(inputData)

    // 3. 확률 배분 로직 (슬라이딩 3단계 윈도우)
    val ratios = MutableList(5) { 0.0 }
    val L = target.toInt()      // 메인 레벨 (1~5)
    val d = target - L          // 소수점 잔여량 (0.0 ~ 0.99)

    // 확률 공식: d(소수점)가 커질수록 메인 확률이 줄고 상위 단계 확률이 증가
    val pLower = 0.10
    val pMain = 0.80 - (0.25 * d)
    val pUpper = 0.10 + (0.25 * d)

    // 4. 레벨별 인덱스(0~4)에 확률 할당
    when (L) {
        1 -> {
            // 1단계가 메인일 때 (하위 단계가 없으므로 1단계에 합산)
            ratios[0] = pMain + pLower
            ratios[1] = pUpper
        }
        5 -> {
            // 5단계가 메인일 때 (상위 단계가 없으므로 5단계에 합산)
            ratios[3] = pLower
            ratios[4] = pMain + pUpper
        }
        else -> {
            // 2, 3, 4단계가 메인인 일반적인 경우
            ratios[L - 2] = pLower     // 이전 단계 (L-1단계)
            ratios[L - 1] = pMain      // 현재 메인 (L단계)
            ratios[L] = pUpper         // 다음 단계 (L+1단계)
        }
    }

    return ratios
}