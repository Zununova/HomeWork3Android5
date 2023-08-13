package com.example.homework3android5.data.repositores

import com.example.homework3android5.data.local.sharedpreferances.UserPreferenceHelper
import com.example.homework3android5.domain.repositores.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val preferences: UserPreferenceHelper) :
    UserRepository {

    override fun getUserInfo() = listOf(
        preferences.userName.toString(),
        preferences.userEmail.toString(),
        preferences.userPassword.toString()
    )

    override fun signUpUser(name: String, email: String, password: String) {
        preferences.apply {
            userName = name
            userEmail = email
            userPassword = password
        }
    }
}