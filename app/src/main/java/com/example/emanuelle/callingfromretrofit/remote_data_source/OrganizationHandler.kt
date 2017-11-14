package com.example.emanuelle.callingfromretrofit.remote_data_source

import com.example.emanuelle.callingfromretrofit.livedata.OrganizationLiveData
import com.example.emanuelle.callingfromretrofit.model.Organization

/**
 * Created by Emanuelle on 10/11/2017.
 */
class OrganizationHandler(val organizationService: OrganizationServiceInterface) {

    fun getOrganizations() : OrganizationLiveData<List<Organization>> {
        return OrganizationLiveData(organizationService.getOrganizations())
    }
}