package com.example.homework3android5.di

import com.example.homework3android5.data.repositores.UserRepositoryImp
import com.example.homework3android5.domain.repositores.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoresModule {

    @Binds
    fun bindUserRepository( repositoryImp: UserRepositoryImp) : UserRepository
}