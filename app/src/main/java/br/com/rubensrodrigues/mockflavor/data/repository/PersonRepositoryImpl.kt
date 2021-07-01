package br.com.rubensrodrigues.mockflavor.data.repository

import br.com.rubensrodrigues.mockflavor.data.models.PersonResponse
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PersonRepositoryImpl @Inject constructor() : PersonRepository {

    override fun fetchPerson(id: Int) = flow {
        emit(
            PersonResponse(
                name = "Beltrano Remoto",
                birthDate = "18/11/1985",
                gender = 'M',
                document = "666.666.666-66"
            )
        )
    }

}