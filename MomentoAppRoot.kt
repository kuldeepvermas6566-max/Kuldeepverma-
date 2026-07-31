package com.kuldeep.momento.ui

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.kuldeep.momento.ui.navigation.MomentoNavHost

@Composable
fun MomentoAppRoot() {
    Surface {
        MomentoNavHost()
    }
}
