package br.com.rubensrodrigues.mockflavor.di

import br.com.rubensrodrigues.mockflavor.data.repository.PersonRepository
import br.com.rubensrodrigues.mockflavor.data.repository.PersonRepositoryFake
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
interface RemoteModule {

    @Binds
    @ViewModelScoped
    fun providePersonRepository(repository: PersonRepositoryFake): PersonRepository
}