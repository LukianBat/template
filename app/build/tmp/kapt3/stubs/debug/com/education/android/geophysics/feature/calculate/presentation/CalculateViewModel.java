package com.education.android.geophysics.feature.calculate.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0007R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/education/android/geophysics/feature/calculate/presentation/CalculateViewModel;", "Lcom/education/android/geophysics/\u0441ore/presentation/viewmodel/BaseViewModel;", "Lcom/education/android/geophysics/\u0441ore/presentation/eventsdispatcher/EventsDispatcherOwner;", "Lcom/education/android/geophysics/feature/calculate/presentation/CalculateViewModel$EventsListener;", "getDataUseCase", "Lcom/education/android/geophysics/feature/calculate/domain/usecases/GetDataUseCase;", "(Lcom/education/android/geophysics/feature/calculate/domain/usecases/GetDataUseCase;)V", "dataList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/education/android/geophysics/feature/calculate/domain/model/DataModel;", "getDataList", "()Landroidx/lifecycle/MutableLiveData;", "eventsDispatcher", "Lcom/education/android/geophysics/\u0441ore/presentation/eventsdispatcher/EventsDispatcher;", "getEventsDispatcher", "()Lcom/education/android/geophysics/\u0441ore/presentation/eventsdispatcher/EventsDispatcher;", "getPlaces", "", "EventsListener", "app_debug"})
public final class CalculateViewModel extends com.education.android.geophysics.сore.presentation.viewmodel.BaseViewModel implements com.education.android.geophysics.сore.presentation.eventsdispatcher.EventsDispatcherOwner<com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel.EventsListener> {
    @org.jetbrains.annotations.NotNull()
    private final com.education.android.geophysics.сore.presentation.eventsdispatcher.EventsDispatcher<com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel.EventsListener> eventsDispatcher = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.education.android.geophysics.feature.calculate.domain.model.DataModel>> dataList = null;
    private final com.education.android.geophysics.feature.calculate.domain.usecases.GetDataUseCase getDataUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.education.android.geophysics.сore.presentation.eventsdispatcher.EventsDispatcher<com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel.EventsListener> getEventsDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.education.android.geophysics.feature.calculate.domain.model.DataModel>> getDataList() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getPlaces() {
    }
    
    @javax.inject.Inject()
    public CalculateViewModel(@org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.domain.usecases.GetDataUseCase getDataUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/education/android/geophysics/feature/calculate/presentation/CalculateViewModel$EventsListener;", "", "showMessage", "", "messageId", "", "app_debug"})
    public static abstract interface EventsListener {
        
        public abstract void showMessage(int messageId);
    }
}