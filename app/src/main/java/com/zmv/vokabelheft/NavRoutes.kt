package com.zmv.vokabelheft

sealed class NavRoutes(val route: String) {
    object Welcome : NavRoutes("welcome")
    object Words : NavRoutes("words")
    object Word : NavRoutes("word")
    object AddEdit: NavRoutes("add_edit")
    object Test: NavRoutes("test")
}