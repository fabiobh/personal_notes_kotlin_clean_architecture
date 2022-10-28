package com.uaialternativa.personalnotes.framework.di

import android.app.Application
import com.uaialternativa.core.repository.NoteRepository
import com.uaialternativa.personalnotes.framework.RoomNoteDataSource
import dagger.Module
import dagger.Provides

@Module
class RepositoryModule {

    @Provides
    fun provideRepository(app: Application) = NoteRepository(RoomNoteDataSource(app))
}