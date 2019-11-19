package com.education.android.geophysics.feature.calculate.presentation

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import com.education.android.geophysics.R
import com.education.android.geophysics.feature.calculate.domain.model.DataModel
import com.education.android.geophysics.feature.calculate.domain.usecases.GetDataUseCase
import com.education.android.geophysics.сore.presentation.eventsdispatcher.EventsDispatcher
import com.education.android.geophysics.сore.presentation.eventsdispatcher.EventsDispatcherOwner
import com.education.android.geophysics.сore.presentation.viewmodel.BaseViewModel
import io.reactivex.rxkotlin.addTo
import javax.inject.Inject

class CalculateViewModel @Inject constructor(
    private val getDataUseCase: GetDataUseCase
) : BaseViewModel(), EventsDispatcherOwner<CalculateViewModel.EventsListener> {

    override val eventsDispatcher: EventsDispatcher<EventsListener> = EventsDispatcher()
    val dataList = MutableLiveData<ArrayList<DataModel>>()

    init {
        getPlaces()
    }

    @SuppressLint("CheckResult")
    fun getPlaces() {
        getDataUseCase.getData()
            .subscribe({ result ->
                dataList.value = arrayListOf(result)
            }, {
                eventsDispatcher.dispatchEvent { showMessage(R.string.error_message) }
            }).addTo(compositeDisposable)

    }

    interface EventsListener {
        fun showMessage(messageId: Int)
    }
}