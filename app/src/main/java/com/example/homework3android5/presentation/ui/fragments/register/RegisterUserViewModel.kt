package com.example.homework3android5.presentation.ui.fragments.register

import androidx.lifecycle.ViewModel
import com.example.homework3android5.domain.usecases.SignUpUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterUserViewModel @Inject constructor(private val signUpUseCase: SignUpUseCase) :
    ViewModel() {

    fun signUpUser(name: String, email: String, password: String) =
        signUpUseCase(name, email, password)

}