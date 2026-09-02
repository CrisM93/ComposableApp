package com.uami.myfirstcomposableapp.Components.state

data class CheckBoxState(
    val id: String,
    val label: String,
    val checked: Boolean = false
)