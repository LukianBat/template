package com.education.android.geophysics.сore.presentation.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0012\b\u0001\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00060\u0005*\u0004\b\u0002\u0010\u00062\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u0012\u0010\t\u001a\u00028\u0002X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/education/android/geophysics/\u0441ore/presentation/activity/EventsActivity;", "DB", "Landroidx/databinding/ViewDataBinding;", "VM", "Landroidx/lifecycle/ViewModel;", "Lcom/education/android/geophysics/\u0441ore/presentation/eventsdispatcher/EventsDispatcherOwner;", "EL", "Lcom/education/android/geophysics/\u0441ore/presentation/activity/MvvmActivity;", "()V", "eventsListener", "getEventsListener", "()Ljava/lang/Object;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class EventsActivity<DB extends androidx.databinding.ViewDataBinding, VM extends androidx.lifecycle.ViewModel & com.education.android.geophysics.сore.presentation.eventsdispatcher.EventsDispatcherOwner<EL>, EL extends java.lang.Object> extends com.education.android.geophysics.сore.presentation.activity.MvvmActivity<DB, VM> {
    private java.util.HashMap _$_findViewCache;
    
    protected abstract EL getEventsListener();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public EventsActivity() {
        super();
    }
}