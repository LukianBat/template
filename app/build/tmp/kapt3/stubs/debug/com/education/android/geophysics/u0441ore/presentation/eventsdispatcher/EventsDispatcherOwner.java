package com.education.android.geophysics.сore.presentation.eventsdispatcher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/education/android/geophysics/\u0441ore/presentation/eventsdispatcher/EventsDispatcherOwner;", "T", "", "eventsDispatcher", "Lcom/education/android/geophysics/\u0441ore/presentation/eventsdispatcher/EventsDispatcher;", "getEventsDispatcher", "()Lcom/education/android/geophysics/\u0441ore/presentation/eventsdispatcher/EventsDispatcher;", "app_debug"})
public abstract interface EventsDispatcherOwner<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.education.android.geophysics.сore.presentation.eventsdispatcher.EventsDispatcher<T> getEventsDispatcher();
}