package br.com.rubensrodrigues.mockflavor.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import br.com.rubensrodrigues.mockflavor.R
import br.com.rubensrodrigues.mockflavor.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setObserver()
        viewModel.fetchPerson()
    }

    private fun setObserver() = binding.run {
        viewModel.data.observe(this@MainActivity) { response ->
            name.text = getString(R.string.name, response.name)
            birthDate.text = getString(R.string.birth_date, response.birthDate)
            gender.text = getString(R.string.gender, response.gender)
            document.text = getString(R.string.document, response.document)
        }
    }
}