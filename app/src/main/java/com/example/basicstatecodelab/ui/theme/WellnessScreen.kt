package com.example.basicstatecodelab.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.foundation.layout.Column


@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter()

        WellnessTasksList(
            list = wellnessViewModel.tasks,
            onCheckedTask = wellnessViewModel::changeTaskChecked,
            onCloseTask = { task ->
                wellnessViewModel.remove(task)
            }
        )
    }
}

fun viewModel(): WellnessViewModel {
    TODO("Not yet implemented")
}

val wellnessTasks get() = List(30) { i -> WellnessTask(i, "Task # $i") }