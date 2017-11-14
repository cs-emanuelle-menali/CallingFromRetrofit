package com.example.emanuelle.callingfromretrofit.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.example.emanuelle.callingfromretrofit.model.Organization

/**
 * Created by Emanuelle on 10/11/2017.
 */
class OrganizationAdapter(val items: List<Organization>?) :
        RecyclerView.Adapter<OrganizationAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder{
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items?.get(position).toString()
    }

    override fun getItemCount(): Int = items?.size!!

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}