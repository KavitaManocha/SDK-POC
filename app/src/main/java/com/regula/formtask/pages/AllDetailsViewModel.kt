package com.regula.formtask.pages

import androidx.databinding.ObservableField
import br.com.leandroferreira.wizard_forms.contract.OnStateChangeListener
import br.com.leandroferreira.wizard_forms.contract.UpdatableWizardPageViewModel

import com.regula.formtask.dto.User

class AllDetailsViewModel : UpdatableWizardPageViewModel<User>(){

    val loan_id = ObservableField<String?>()
    val benef_name = ObservableField<String?>()
    val cust_mob = ObservableField<String?>()
    val cust_email = ObservableField<String?>()
    val ifsc_code = ObservableField<String?>()
    val cust_bank = ObservableField<String?>()
    val cust_bank_add = ObservableField<String?>()
    val cust_acc_no = ObservableField<String?>()
    val cust_acc_type = ObservableField<String?>()
    val category = ObservableField<String?>()
    val frequency = ObservableField<String?>()
    val ach_amt = ObservableField<String?>()
    val mandate_date = ObservableField<String?>()
    val start_date = ObservableField<String?>()
    val end_date = ObservableField<String?>()
    val ref_no = ObservableField<String?>()

    init {
        loan_id.set(stateHolder?.stateDto?.loan_id)
        benef_name.set(stateHolder?.stateDto?.benef_name)
        cust_mob.set(stateHolder?.stateDto?.cust_mob)
        cust_email.set(stateHolder?.stateDto?.cust_email)
        ifsc_code.set(stateHolder?.stateDto?.ifsc_code)
        cust_bank.set(stateHolder?.stateDto?.cust_bank)
        cust_bank_add.set(stateHolder?.stateDto?.cust_bank_add)
        cust_acc_no.set(stateHolder?.stateDto?.cust_acc_no)
//        cust_acc_type.set(stateHolder?.stateDto?.cust_acc_type)
//        category.set(stateHolder?.stateDto?.category)
//        frequency.set(stateHolder?.stateDto?.frequency)
        ach_amt.set(stateHolder?.stateDto?.ach_amt)
        mandate_date.set(stateHolder?.stateDto?.mandate_date)
        start_date.set(stateHolder?.stateDto?.start_date)
        end_date.set(stateHolder?.stateDto?.end_date)
        ref_no.set(stateHolder?.stateDto?.ref_no)
    }

    override fun getOnStateChangeListener(): OnStateChangeListener<User> =
        object : OnStateChangeListener<User> {
            override fun getState(stateDto: User) {
                loan_id.set(stateDto.loan_id)
                benef_name.set(stateDto.benef_name)
                cust_mob.set(stateDto.cust_mob)
                cust_email.set(stateDto.cust_email)
                ifsc_code.set(stateDto.ifsc_code)
                cust_bank.set(stateDto.cust_bank)
                cust_bank_add.set(stateDto.cust_bank_add)
                cust_acc_no.set(stateDto.cust_acc_no)
//                cust_acc_type.set(stateDto.cust_acc_type)
//                category.set(stateDto.category)
//                frequency.set(stateDto.frequency)
                ach_amt.set(stateDto.ach_amt)
                mandate_date.set(stateDto.mandate_date)
                start_date.set(stateDto.start_date)
                end_date.set(stateDto.end_date)
                ref_no.set(stateDto.ref_no)
            }
        }
}