package com.regula.formtask.dto

import android.util.Log
import android.widget.Spinner
import androidx.databinding.Observable
import androidx.databinding.ObservableField

data class User(
    var loan_id: String?,
    var benef_name : String?,
    var cust_mob : String?,
    var cust_email : String?,
    var ifsc_code : String?,
    var cust_bank : String?,
    var cust_bank_add : String?,
    var cust_acc_no : String?,
    var cust_acc_type : String?,
    var category : String?,
    var frequency : String?,
    var ach_amt : String?,
    var mandate_date : String?,
    var start_date : String?,
    var end_date : String?,
    var ref_no : String?){

    fun onDateChanged(year: Int, month: Int, day: Int){
        Log.v("Test_Picker", "$year $month $day")
    }

//    cust_acc_type = ObservableField<String>().apply {
//        addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback(){
//            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
//                Log.d("value",this@apply.get()) //selected value
//            }
//        })
//    }
}
