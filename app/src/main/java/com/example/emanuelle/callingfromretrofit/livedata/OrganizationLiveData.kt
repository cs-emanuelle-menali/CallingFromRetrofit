package com.example.emanuelle.callingfromretrofit.livedata

import android.arch.lifecycle.LiveData
import android.util.Log
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

/**
 * Created by Emanuelle on 10/11/2017.
 */
class OrganizationLiveData<T>(private val call: Call<T>) : LiveData<T>(), Callback<T> {

    override fun onActive() {
        if (!call.isCanceled && !call.isExecuted) call.enqueue(this)

    }

    override fun onFailure(call: Call<T>?, t: Throwable){
    }

    override fun onResponse(call: Call<T>?, response: Response<T>?) {
        value = response?.body()
        Log.d("retrofit data", value.toString())
    }

    fun cancel() = if (!call.isCanceled) call.cancel() else Unit
}

