package com.example.emanuelle.callingfromretrofit.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.widget.LinearLayoutManager
import com.example.emanuelle.callingfromretrofit.R
import com.example.emanuelle.callingfromretrofit.model.Organization
import com.example.emanuelle.callingfromretrofit.view.adapter.OrganizationAdapter
import com.example.emanuelle.callingfromretrofit.viewmodel.OrganizationViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    val viewModelProviders = ViewModelProviders.of(this)
//            .get(OrganizationViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retrofit_list.layoutManager = LinearLayoutManager(this)

        val listOrganization: List<Organization>

        ViewModelProviders.of(this)
                .get(OrganizationViewModel::class.java)
                .liveData.observe(this, Observer<List<Organization>> { organization ->
            if (organization != null) {
                retrofit_list.adapter = OrganizationAdapter(organization)

            }
        })
    }
}
