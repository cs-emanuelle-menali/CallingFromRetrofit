package com.example.emanuelle.callingfromretrofit.viewmodel

import android.arch.lifecycle.ViewModel
import com.example.emanuelle.callingfromretrofit.remote_data_source.DataHandler
import com.example.emanuelle.callingfromretrofit.model.Organization
import com.example.emanuelle.callingfromretrofit.livedata.OrganizationLiveData

/**
 * Created by Emanuelle on 10/11/2017.
 */

class OrganizationViewModel : ViewModel(){

    val liveData : OrganizationLiveData<List<Organization>>
        get() = DataHandler.INSTANCE.organizationHandler.getOrganizations()

    override fun onCleared() {
        liveData.cancel()
    }
}