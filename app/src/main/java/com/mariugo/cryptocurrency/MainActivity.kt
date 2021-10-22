package com.mariugo.cryptocurrency

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.mariugo.cryptocurrency.ui.theme.CryptoCurrencyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoCurrencyTheme {
                Surface(color = MaterialTheme.colors.background) {
                }
            }
        }
    }
}
