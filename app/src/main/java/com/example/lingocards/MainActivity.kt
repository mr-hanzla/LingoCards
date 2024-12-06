package com.example.lingocards

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.ui.unit.dp
import com.example.lingocards.ui.LingoCards
import com.example.lingocards.ui.theme.LingoCardsTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LingoCardsTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Spacer(modifier = Modifier.width(60.dp))
                                Text("Lingo Cards", maxLines = 1, overflow = TextOverflow.Ellipsis)
                            },
//                            navigationIcon = {
//                                IconButton(onClick = { /* doSomething() */ }) {
//                                    Icon(
//                                        imageVector = Icons.Filled.AccountBox,
//                                        contentDescription = "Localized description"
//                                    )
//                                }
//                            },
//                            actions = {
//                                IconButton(onClick = { /* doSomething() */ }) {
//                                    Icon(
//                                        imageVector = Icons.Filled.Favorite,
//                                        contentDescription = "Localized description"
//                                    )
//                                }
//                            }
                        )
                    },
                    content = { innerPadding ->
                        LingoCards(
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                )
            }
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun MyTopAppBar() {
    TopAppBar(title = {
        Text(text = "Hello")
    })
}
