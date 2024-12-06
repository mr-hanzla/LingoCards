package com.example.lingocards.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lingocards.ui.theme.LingoCardsTheme

@Composable
fun LingoCards(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "This is from LIngo Cards")
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LingoCards_Preview() {
    LingoCardsTheme {
        LingoCards()
    }
}


