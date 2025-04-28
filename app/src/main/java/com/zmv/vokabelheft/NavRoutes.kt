package com.zmv.vokabelheft

sealed class NavRoutes(val route: String) {
    object Welcome : NavRoutes("welcome")
    object Words : NavRoutes("words")
    object Word : NavRoutes("word")
}