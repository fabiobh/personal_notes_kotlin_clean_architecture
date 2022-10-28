package com.uaialternativa.personalnotes.framework.di

import com.uaialternativa.personalnotes.framework.ListViewModel
import com.uaialternativa.personalnotes.framework.NoteViewModel
import dagger.Component

@Component(modules = [ApplicationModule::class, RepositoryModule::class, UseCasesModule::class])
interface ViewModelComponent {
    fun inject(noteViewModel: NoteViewModel)
    fun inject(listViewModel: ListViewModel)
}