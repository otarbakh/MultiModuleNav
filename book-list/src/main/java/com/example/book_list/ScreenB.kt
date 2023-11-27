package com.example.book_list

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun ProfileScreen(
    id: Int, // <-- required navigation argument
    groupName: String?, // <-- optional navigation argument
    isOwnUser: Boolean = false // <-- optional navigation argument
) { /*...*/ }