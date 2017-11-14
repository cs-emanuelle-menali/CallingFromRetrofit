package com.example.emanuelle.callingfromretrofit.remote_data_source

import com.example.emanuelle.callingfromretrofit.model.Organization
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Emanuelle on 10/11/2017.
 */
interface OrganizationServiceInterface {

    @GET("organizations")
    fun getOrganizations(@Query("since") since: Int? = null) : Call<List<Organization>>
}