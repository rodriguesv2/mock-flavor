package br.com.rubensrodrigues.mockflavor.data.repository

import br.com.rubensrodrigues.mockflavor.data.models.PersonResponse
import kotlinx.coroutines.flow.Flow

interface PersonRepository {
    fun fetchPerson(id: Int): Flow<PersonResponse>
}