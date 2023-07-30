package com.example.homework3android5.domain.usecases

import com.example.homework3android5.domain.repositores.UserRepository
import javax.inject.Inject

class SignUpUseCase @Inject constructor(private val repository: UserRepository) {

    operator fun invoke(name: String, email: String, password: String) =
        repository.sighnUpUser(name, email, password)

}