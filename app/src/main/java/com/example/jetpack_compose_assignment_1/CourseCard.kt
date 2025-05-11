package com.example.jetpack_compose_assignment_1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.clickable
import androidx.compose.animation.animateContentSize
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme
import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview






@Composable
fun CourseCard(
    course: Course,
    isExpanded: Boolean,
    onCardClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clickable { onCardClick() },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primary // <--- Use theme color here
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .animateContentSize()
        ) {
            Text(
                text = course.title,
                style = MaterialTheme.typography.titleLarge,
                color=MaterialTheme.colorScheme.onPrimary )
            Spacer(modifier = Modifier.padding(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = course.code,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.scrim
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "Credit: ${course.credit}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.scrim
                )
            }
            if (isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = course.description,
                    style = MaterialTheme.typography.bodyLarge,
                    color=MaterialTheme.colorScheme.scrim
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Prerequisites:",
                    style = MaterialTheme.typography.titleLarge,
                    color=MaterialTheme.colorScheme.scrim
                )
                course.prerequisites.forEach { prereq ->
                    Text(
                        text = "• $prereq",
                        style = MaterialTheme.typography.bodyMedium,
                        color=MaterialTheme.colorScheme.scrim
                    )
                }
            }
        }
    }
}
@Preview(
    name = "Course Card - Light Theme",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Preview(
    name = "Course Card - Dark Theme",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun CourseCardPreview() {
    val sampleCourse = Course(
        id = 1,
        title = "Intro to Jetpack Compose",
        code = "SE101",
        credit = 3.0,
        description = "Learn the basics of Jetpack Compose in this foundational course.",
        prerequisites = listOf("Basic Kotlin", "Android Studio Setup")
    )

    Jetpackcomposeassignment1Theme {
        CourseCard(
            course = sampleCourse,
            isExpanded = true,
            onCardClick = {}
        )
    }
}




