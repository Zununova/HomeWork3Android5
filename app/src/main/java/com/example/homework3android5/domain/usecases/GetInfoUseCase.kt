package com.example.homework3android5.domain.usecases

import com.example.homework3android5.domain.repositores.UserRepository
import javax.inject.Inject

class GetInfoUseCase @Inject constructor(private val repository: UserRepository) {

    operator fun invoke() = repository.getUserInfo()
}