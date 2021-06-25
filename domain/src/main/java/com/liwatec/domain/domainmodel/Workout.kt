package com.liwatec.domain.domainmodel

data class Workout(
    val name: String,
    val createdOn: String,
    val exercises: List<Excercise>
)