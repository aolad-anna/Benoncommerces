package com.example.benoncommerces.ui.adapters

import android.content.Context
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.benoncommerces.R
import com.example.benoncommerces.ui.onboarding.OnboardingFragment
import com.example.benoncommerces.ui.onboarding.Slider


class OnboardingViewPagerAdapter(
    fragmentActivity: Slider,
    private val context: Context
) :
    FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): androidx.fragment.app.Fragment {
        return when (position) {
            0 -> OnboardingFragment.newInstance(
                context.resources.getString(R.string.title_onboarding_1),
                context.resources.getString(R.string.description_onboarding_1),
                R.raw.jasn
            )
            1 -> OnboardingFragment.newInstance(
                context.resources.getString(R.string.title_onboarding_2),
                context.resources.getString(R.string.description_onboarding_2),
                R.raw.lottie_developer
            )
            else -> OnboardingFragment.newInstance(
                context.resources.getString(R.string.title_onboarding_3),
                context.resources.getString(R.string.description_onboarding_3),
                R.raw.lottie_girl_with_a_notebook
            )
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}