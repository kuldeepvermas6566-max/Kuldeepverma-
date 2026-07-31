package com.kuldeep.momento

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kuldeep.momento.ui.MomentoAppRoot
import com.kuldeep.momento.ui.theme.MomentoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MomentoTheme {
                MomentoAppRoot()
            }
        }
    }
}
