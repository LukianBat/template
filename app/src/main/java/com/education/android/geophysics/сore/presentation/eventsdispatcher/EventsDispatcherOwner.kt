package com.education.android.geophysics.сore.presentation.eventsdispatcher

interface EventsDispatcherOwner<T> {
    val eventsDispatcher: EventsDispatcher<T>
}