package com.example.book_list

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun FirstFragment(modifier: Modifier = Modifier) {
    Text(
        text = "first fragment!",
        modifier = modifier
    )
}