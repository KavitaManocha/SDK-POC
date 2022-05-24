package com.regula.formtask.pages

import android.widget.Toast
import androidx.databinding.ObservableField
import br.com.leandroferreira.wizard_forms.contract.WizardPageViewModel
import com.regula.formtask.dto.User

class PersonalDetailsViewModel : WizardPageViewModel<User>() {

//    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

    val loan_id = ObservableField<String>()
    val benef_name = ObservableField<String>()
    val cust_mob = ObservableField<String>()
    val cust_email = ObservableField<String>()

    fun goClick() {
        stateHolder?.stateDto?.loan_id = loan_id.get()
        stateHolder?.stateDto?.benef_name = benef_name.get()
        if(stateHolder?.stateDto?.cust_mob?.length!! < 10 || stateHolder?.stateDto?.cust_mob?.length!! > 10){
            cust_mob.set("Enter a Valid Phone Number")
        } else{
            stateHolder?.stateDto?.cust_mob = cust_mob.get()
        }
        stateHolder?.stateDto?.cust_email = cust_email.get()

        stateHolder?.notifyStateChange()
        navigator?.nextPage()
    }
}