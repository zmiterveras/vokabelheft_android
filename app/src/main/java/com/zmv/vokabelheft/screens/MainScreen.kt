package com.zmv.vokabelheft.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.NavRoutes
import com.zmv.vokabelheft.utils.getAnswer
import com.zmv.vokabelheft.utils.getCheck
import com.zmv.vokabelheft.utils.getResults
import com.zmv.vokabelheft.utils.getTestWord
import com.zmv.vokabelheft.R

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.Results.route
    ) {
        composable(NavRoutes.Welcome.route) {
            Welcome(navController = navController)
        }

        composable(NavRoutes.Words.route) {
            Words(navController = navController)
        }

        composable(NavRoutes.Word.route) {
            Word(navController = navController, getTestWord())
        }

        composable(NavRoutes.AddEdit.route) {
            AddEdit(navController = navController, 2, emptyList())
        }

        composable(NavRoutes.TrainingSelection.route) {
            TrainingSelection(navController = navController)
        }

        composable(NavRoutes.Question.route) {
            Question(navController = navController, "test")
        }

        composable(NavRoutes.WordResult.route) {
            WordResult(navController = navController, getCheck(1), getAnswer(4))
        }

        composable(NavRoutes.Results.route) {
            Results(navController = navController, getResults(), R.drawable.bad148)
        }

        composable(NavRoutes.Test.route) {
            Test(navController = navController)
        }
    }
}
