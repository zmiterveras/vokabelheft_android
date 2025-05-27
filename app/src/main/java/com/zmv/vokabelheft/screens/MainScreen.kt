package com.zmv.vokabelheft.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zmv.vokabelheft.NavRoutes

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.AddEdit.route
    ) {
        composable(NavRoutes.Welcome.route) {
            Welcome(navController = navController)
        }
        composable(NavRoutes.AddEdit.route) {
            AddEdit(navController = navController, 2, emptyList())
        }

        composable(NavRoutes.Test.route) {
            Test(navController = navController)
        }
    }
}
