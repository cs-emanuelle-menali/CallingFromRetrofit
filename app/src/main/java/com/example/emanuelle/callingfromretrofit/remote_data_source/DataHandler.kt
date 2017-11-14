package com.example.emanuelle.callingfromretrofit.remote_data_source

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Emanuelle on 10/11/2017.
 */
class DataHandler private constructor(){

    companion object Singleton {

        val INSTANCE: DataHandler by lazy { DataHandler() }

        const val BASE_URL = "https://api.github.com"
    }

    val organizationHandler: OrganizationHandler

    init {
        val gson = GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()

        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson)).build()

        organizationHandler = OrganizationHandler(retrofit.create(OrganizationServiceInterface::class.java))

    }
}