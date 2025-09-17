package com.sam.notelapp.feature_note.domain.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null

){
    companion object {
        val RedOrange = Color(0xffffab91).toArgb()
        val LightGreen = Color(0xffc5e1a5).toArgb()
        val Violet = Color(0xffe1bee7).toArgb()
        val BabyBlue = Color(0xffb3e5fc).toArgb()
        val RedPink = Color(0xfff48fb1).toArgb()
        val noteColors: List<Int> = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)
