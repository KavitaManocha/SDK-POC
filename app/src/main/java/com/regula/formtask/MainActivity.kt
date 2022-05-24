package com.regula.formtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import br.com.leandroferreira.wizard_forms.contract.WizardNavigator
import com.regula.formtask.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), WizardNavigator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewModel = MainViewModel(this)
    }

    override fun nextPage() {
        if (viewPager.currentItem < viewPager.adapter!!.count) {
            viewPager.currentItem = viewPager.currentItem + 1
        }
    }

    override fun previousPage() {
        if (viewPager.currentItem > 0) {
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }

    override fun navigateToPage(page: Int) {
        viewPager.currentItem = page
    }

    override fun cancelNavigation() {
        finish()
    }

    override fun currentPage(): Int = viewPager.currentItem
}
