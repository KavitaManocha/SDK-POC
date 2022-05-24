package com.regula.formtask.pages

import androidx.databinding.ObservableField
import br.com.leandroferreira.wizard_forms.contract.WizardPageViewModel
import com.regula.formtask.dto.User

class MandateDetailsViewModel: WizardPageViewModel<User>() {

    val ach_amt = ObservableField<String>()
    val mandate_date = ObservableField<String>()
    val start_date = ObservableField<String>()
    val end_date = ObservableField<String>()
    val ref_no = ObservableField<String>()

    fun goClick() {
        stateHolder?.stateDto?.ach_amt = ach_amt.get().toString()
        stateHolder?.stateDto?.mandate_date = mandate_date.get().toString()
        stateHolder?.stateDto?.start_date = start_date.get().toString()
        stateHolder?.stateDto?.end_date = end_date.get().toString()
        stateHolder?.stateDto?.ref_no = ref_no.get().toString()
        stateHolder?.notifyStateChange()
        navigator?.nextPage()

    }
}