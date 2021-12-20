package com.appinionbd.jepackcompose.common

sealed class Screen(val route: String) {
    object CoinsListScreen : Screen("coin_list_screen")
}
