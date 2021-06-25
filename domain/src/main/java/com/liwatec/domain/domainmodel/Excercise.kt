package com.liwatec.domain.domainmodel

import com.liwatec.domain.enums.ExerciseType

data class Exercise(
    val name: String,
    val sets: List<Set>,
    val type: ExerciseType
)