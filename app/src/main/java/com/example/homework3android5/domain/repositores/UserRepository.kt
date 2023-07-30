package com.example.homework3android5.domain.repositores

interface UserRepository {

    fun getUserInfo(): List<String>

    fun sighnUpUser(name: String, email: String, password: String)
}