package com.education.android.geophysics.feature.calculate.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0014@VX\u0095.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\fX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/education/android/geophysics/feature/calculate/presentation/CalculateActivity;", "Lcom/education/android/geophysics/\u0441ore/presentation/activity/EventsActivity;", "Lcom/education/android/geophysics/databinding/ActivityCalculateBinding;", "Lcom/education/android/geophysics/feature/calculate/presentation/CalculateViewModel;", "Lcom/education/android/geophysics/feature/calculate/presentation/CalculateViewModel$EventsListener;", "()V", "adapter", "Lcom/education/android/geophysics/feature/calculate/presentation/recycler/DataListAdapter;", "eventsListener", "getEventsListener", "()Lcom/education/android/geophysics/feature/calculate/presentation/CalculateViewModel$EventsListener;", "layoutId", "", "getLayoutId", "()I", "<set-?>", "viewModel", "getViewModel", "()Lcom/education/android/geophysics/feature/calculate/presentation/CalculateViewModel;", "setViewModel", "(Lcom/education/android/geophysics/feature/calculate/presentation/CalculateViewModel;)V", "viewModelVariableId", "getViewModelVariableId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showMessage", "messageId", "app_debug"})
public final class CalculateActivity extends com.education.android.geophysics.сore.presentation.activity.EventsActivity<com.education.android.geophysics.databinding.ActivityCalculateBinding, com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel, com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel.EventsListener> implements com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel.EventsListener {
    @org.jetbrains.annotations.NotNull()
    private final com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel.EventsListener eventsListener = null;
    private final int viewModelVariableId = 0;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel viewModel;
    private final com.education.android.geophysics.feature.calculate.presentation.recycler.DataListAdapter adapter = null;
    private final int layoutId = com.education.android.geophysics.R.layout.activity_calculate;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel.EventsListener getEventsListener() {
        return null;
    }
    
    @java.lang.Override()
    protected int getViewModelVariableId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel getViewModel() {
        return null;
    }
    
    public void setViewModel(@org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel p0) {
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showMessage(int messageId) {
    }
    
    public CalculateActivity() {
        super();
    }
}