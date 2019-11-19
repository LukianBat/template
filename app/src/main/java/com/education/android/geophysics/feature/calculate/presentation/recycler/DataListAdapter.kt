package com.education.android.geophysics.feature.calculate.presentation.recycler

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.education.android.geophysics.R
import com.education.android.geophysics.databinding.ItemPlaceBinding
import com.education.android.geophysics.feature.calculate.domain.model.DataModel


class DataListAdapter : RecyclerView.Adapter<DataListViewHolder>() {


    private var dataList: ArrayList<DataModel> = arrayListOf()

    fun update(dataList: ArrayList<DataModel>) {
        this.dataList.addAll(dataList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate(
            inflater,
            R.layout.item_place,
            parent,
            false
        ) as ItemPlaceBinding
        return DataListViewHolder(binding)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: DataListViewHolder, position: Int) {
        holder.binding?.dataModel = dataList[position]
        holder.binding?.executePendingBindings()
    }
}

class DataListViewHolder(binding: ItemPlaceBinding) : RecyclerView.ViewHolder(binding.root) {
    var binding: ItemPlaceBinding? = binding
}