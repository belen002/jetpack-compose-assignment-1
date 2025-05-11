package com.example.jetpack_compose_assignment_1

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.foundation.layout.*




@Composable
fun CourseListScreen(courses: List<Course>) {
    Surface(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        color = MaterialTheme.colorScheme.background // White or dark background based on system theme
    ){
        // Custom Saver to handle mutableStateMapOf
        val stateMapSaver = Saver<MutableMap<String, Boolean>, Any>(
            save = { it.toMap() }, // Save as regular map
            restore = { saved ->
                @Suppress("UNCHECKED_CAST")
                mutableStateMapOf<String, Boolean>().apply {
                    putAll(saved as Map<String, Boolean>)
                }
            }
        )

        // Remember the expandedStates using custom Saver
        val expandedStates = rememberSaveable(saver = stateMapSaver) {
            mutableStateMapOf<String, Boolean>().apply {
                courses.forEach { put(it.code, false) }
            }
        }
        Column {
            Text(
                text = "Academic courses",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                textAlign = TextAlign.Center
            )
            LazyColumn {
                items(courses) { course ->
                    CourseCard(
                        course = course,
                        isExpanded = expandedStates[course.code] ?: false,
                        onCardClick = {
                            expandedStates[course.code] = !(expandedStates[course.code] ?: false)
                        }
                    )
                }
            }

        }

    }


}


