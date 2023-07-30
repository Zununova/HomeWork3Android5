package com.example.homework3android5.presentation.ui.fragments.info

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.homework3android5.domain.usecases.GetInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserInfoViewModel @Inject constructor(private val getInfoUseCase: GetInfoUseCase) :
    ViewModel() {

    private var _userInfo = MutableLiveData<List<String>>()
    val userInfo: LiveData<List<String>> = _userInfo

    init {
        getUserInfo()
    }

    private fun getUserInfo() {
        _userInfo.value = getInfoUseCase()
    }

}