package com.example.homework3android5.presentation.ui.fragments.info

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.homework3android5.R
import com.example.homework3android5.base.BaseFragment
import com.example.homework3android5.databinding.FragmentUserInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserInfoFragment :
    BaseFragment<FragmentUserInfoBinding, UserInfoViewModel>(R.layout.fragment_user_info) {

    override val binding: FragmentUserInfoBinding by viewBinding()
    override val viewModel: UserInfoViewModel by viewModels()

    override fun setupListeners() {
        binding.btnGetInfo.setOnClickListener {
            viewModel.userInfo.observe(viewLifecycleOwner) {
               binding.tvUserInfo.text = getString(R.string.info, it[0], it[1],it[2])
            }
        }
    }
}