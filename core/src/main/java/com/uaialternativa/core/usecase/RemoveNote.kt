package com.uaialternativa.core.usecase

import com.uaialternativa.core.data.Note
import com.uaialternativa.core.repository.NoteRepository

class RemoveNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}