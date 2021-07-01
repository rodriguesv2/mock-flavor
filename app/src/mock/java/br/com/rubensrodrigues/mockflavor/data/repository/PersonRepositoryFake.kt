package br.com.rubensrodrigues.mockflavor.data.repository

import br.com.rubensrodrigues.mockflavor.data.models.PersonResponse
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PersonRepositoryFake @Inject constructor() : PersonRepository {

    override fun fetchPerson(id: Int) = flow {
        emit(
            PersonResponse(
                name = "Ciclana Mock",
                birthDate = "20/10/1993",
                gender = 'F',
                document = "777.777.777-77"
            )
        )
    }

}