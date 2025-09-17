package com.sam.notelapp.feature_note.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sam.notelapp.feature_note.presentation.notes.NotesScreen
import com.sam.notelapp.ui.theme.NoteLAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            NoteLAppTheme {
                NotesScreen()
            }
        }
    }
}