package com.example.jetpack_compose_assignment_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.surfaceColorAtElevation
import com.example.jetpack_compose_assignment_1.getCourses
import androidx.compose.material3.Surface


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpackcomposeassignment1Theme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    // Get the list of courses
                    val courses = getCourses()
                    // Pass the courses to CourseListScreen
                    CourseListScreen(courses = courses)
                }
            }
        }
    }
}
