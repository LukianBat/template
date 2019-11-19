package com.education.android.geophysics.сore.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/education/android/geophysics/\u0441ore/dagger/ApplicationComponent;", "Ldagger/android/AndroidInjector;", "Lcom/education/android/geophysics/\u0441ore/App;", "Builder", "app_debug"})
@dagger.Component(modules = {com.education.android.geophysics.сore.dagger.module.ApplicationModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent extends dagger.android.AndroidInjector<com.education.android.geophysics.сore.App> {
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/education/android/geophysics/\u0441ore/dagger/ApplicationComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lcom/education/android/geophysics/\u0441ore/App;", "()V", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<com.education.android.geophysics.сore.App> {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.education.android.geophysics.сore.dagger.ApplicationComponent.Builder context(@org.jetbrains.annotations.NotNull()
        android.content.Context context);
        
        public Builder() {
            super();
        }
    }
}