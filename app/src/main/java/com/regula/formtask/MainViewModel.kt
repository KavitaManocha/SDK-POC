package com.regula.formtask

import androidx.databinding.ObservableArrayList
import br.com.leandroferreira.wizard_forms.contract.WizardNavigator
import br.com.leandroferreira.wizard_forms.contract.WizardPageViewModel
import br.com.leandroferreira.wizard_forms.contract.WizardStateHolder
import com.regula.formtask.dto.User
import com.regula.formtask.pages.AccountDetailsViewModel
import com.regula.formtask.pages.AllDetailsViewModel
import com.regula.formtask.pages.MandateDetailsViewModel
import com.regula.formtask.pages.PersonalDetailsViewModel
import me.tatarka.bindingcollectionadapter2.OnItemBind

class MainViewModel(val navigator: WizardNavigator) {

    val itemBinding: OnItemBind<WizardPageViewModel<User>>
        get() = OnItemBind { itemBinding1, position, _ ->
            when (position) {
                0 -> itemBinding1.set(BR.viewModel, R.layout.fragment_personal_details)
                1 -> itemBinding1.set(BR.viewModel, R.layout.fragment_account_details)
                2 -> itemBinding1.set(BR.viewModel, R.layout.fragment_mandate_details)
                3 -> itemBinding1.set(BR.viewModel, R.layout.fragment_all_details)
                else -> throw IllegalArgumentException("There is more viewModel than views!")

            }
        }

    val pages = ObservableArrayList<WizardPageViewModel<User>>()
    val stateHolder = WizardStateHolder<User>(User("", "", "","","","",
    "","","","","","","","","",""))

    init {
        pages.add(PersonalDetailsViewModel())
        pages.add(AccountDetailsViewModel())
        pages.add(MandateDetailsViewModel())
        pages.add(AllDetailsViewModel())
    }
}