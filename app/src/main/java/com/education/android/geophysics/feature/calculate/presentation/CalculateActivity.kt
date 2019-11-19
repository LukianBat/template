package com.education.android.geophysics.feature.calculate.presentation

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.education.android.geophysics.R

import javax.inject.Inject
import com.google.android.material.snackbar.Snackbar
import com.education.android.geophysics.BR
import com.education.android.geophysics.databinding.ActivityCalculateBinding
import com.education.android.geophysics.feature.calculate.presentation.recycler.DataListAdapter

import com.education.android.geophysics.сore.presentation.activity.EventsActivity
import kotlinx.android.synthetic.main.activity_calculate.*


class CalculateActivity :
    EventsActivity<ActivityCalculateBinding, CalculateViewModel, CalculateViewModel.EventsListener>(),
    CalculateViewModel.EventsListener {

    override val eventsListener: CalculateViewModel.EventsListener = this
    override val viewModelVariableId: Int = BR.viewModel

    @Inject
    override lateinit var viewModel: CalculateViewModel

    private val adapter: DataListAdapter = DataListAdapter()

    override val layoutId = R.layout.activity_calculate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
        viewModel.dataList.observe(this, Observer {
            progressbar.visibility = View.GONE
            adapter.update(it)
        })
    }

    override fun showMessage(messageId: Int) {
        Snackbar.make(
            findViewById(android.R.id.content),
            resources.getString(messageId),
            Snackbar.LENGTH_SHORT
        ).show()
    }

}