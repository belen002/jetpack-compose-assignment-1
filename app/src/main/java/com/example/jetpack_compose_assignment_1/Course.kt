package com.example.jetpack_compose_assignment_1

data class Course(
    val id: Int,
    val title: String,
    val code: String,
    val credit: Double,
    val description: String,
    val prerequisites: List<String>
)
