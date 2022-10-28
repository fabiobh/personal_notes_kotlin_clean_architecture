package com.uaialternativa.personalnotes.framework.di

import com.uaialternativa.core.repository.NoteRepository
import com.uaialternativa.core.usecase.*
import com.uaialternativa.personalnotes.framework.UseCases
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule {
    @Provides
    fun getUseCases(repository: NoteRepository) = UseCases(
        AddNote(repository),
        GetAllNotes(repository),
        GetNote(repository),
        RemoveNote(repository),
        GetWordCount()
    )
}