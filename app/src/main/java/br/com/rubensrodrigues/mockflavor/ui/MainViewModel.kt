package br.com.rubensrodrigues.mockflavor.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.rubensrodrigues.mockflavor.data.models.PersonResponse
import br.com.rubensrodrigues.mockflavor.data.repository.PersonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: PersonRepository
): ViewModel() {

    val data = MutableLiveData<PersonResponse>()

    fun fetchPerson() {
        val idPerson = 1234
        viewModelScope.launch {
            repository.fetchPerson(idPerson).collect { response ->
                data.value = response
            }
        }
    }
}