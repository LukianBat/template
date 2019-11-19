package com.education.android.geophysics.сore.presentation.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R\u001c\u0010\u0007\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\r\u001a\u00020\u000eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00028\u0001X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u000eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/education/android/geophysics/\u0441ore/presentation/activity/MvvmActivity;", "DB", "Landroidx/databinding/ViewDataBinding;", "VM", "Landroidx/lifecycle/ViewModel;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "layoutId", "", "getLayoutId", "()I", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "viewModelVariableId", "getViewModelVariableId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class MvvmActivity<DB extends androidx.databinding.ViewDataBinding, VM extends androidx.lifecycle.ViewModel> extends dagger.android.support.DaggerAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    protected DB binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final DB getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    DB p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract VM getViewModel();
    
    protected abstract int getLayoutId();
    
    protected abstract int getViewModelVariableId();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public MvvmActivity() {
        super();
    }
}