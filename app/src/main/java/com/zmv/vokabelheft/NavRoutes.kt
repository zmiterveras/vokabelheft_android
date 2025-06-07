package com.zmv.vokabelheft

sealed class NavRoutes(val route: String) {
    object Welcome : NavRoutes("welcome")
    object Words : NavRoutes("words")
    object Word : NavRoutes("word")
    object AddEdit: NavRoutes("add_edit")
    object TrainingSelection: NavRoutes("training_selection")
    object Question: NavRoutes("question")
    object WordResult: NavRoutes("word_result")
    object Results: NavRoutes("results")
    object Test: NavRoutes("test")
}