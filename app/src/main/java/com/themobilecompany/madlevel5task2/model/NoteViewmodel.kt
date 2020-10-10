package com.themobilecompany.madlevel5task2.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.themobilecompany.madlevel5task2.database.NoteRepository

class NoteViewmodel(application: Application): AndroidViewModel(application) {
    private val noteRepository = NoteRepository(application.applicationContext)
    val note = noteRepository.getNotepad()
}