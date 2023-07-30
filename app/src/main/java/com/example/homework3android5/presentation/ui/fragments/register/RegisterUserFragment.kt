package com.example.homework3android5.presentation.ui.fragments.register

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.homework3android5.R
import com.example.homework3android5.base.BaseFragment
import com.example.homework3android5.databinding.FragmentRegisterUserBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterUserFragment :
    BaseFragment<FragmentRegisterUserBinding, RegisterUserViewModel>(R.layout.fragment_register_user) {
    override val binding: FragmentRegisterUserBinding by viewBinding()
    override val viewModel: RegisterUserViewModel by viewModels()

    override fun setupListeners() {
        binding.btnSingIn.setOnClickListener {
            viewModel.signUpUser(
                binding.etName.text.toString(),
                binding.etEmail.text.toString(),
                binding.etPassword.text.toString()
            )
            findNavController().navigate(R.id.action_registerUserFragment_to_userInfoFragment)
        }
    }
}