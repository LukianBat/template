package com.education.android.geophysics.сore.presentation.eventsdispatcher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001b\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000eH\u0007J\b\u0010\u0013\u001a\u00020\u0007H\u0007J\b\u0010\u0014\u001a\u00020\u0007H\u0007J\u001f\u0010\u0015\u001a\u00020\u00072\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\b\bR%\u0010\u0004\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\b\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/education/android/geophysics/\u0441ore/presentation/eventsdispatcher/EventsDispatcher;", "ListenerType", "Landroidx/lifecycle/LifecycleObserver;", "()V", "blocks", "Ljava/util/LinkedList;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "boundListener", "Ljava/lang/Object;", "eventsListener", "bind", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "listener", "(Landroidx/lifecycle/LifecycleOwner;Ljava/lang/Object;)V", "clear", "source", "connectListener", "disconnectListener", "dispatchEvent", "block", "app_debug"})
public final class EventsDispatcher<ListenerType extends java.lang.Object> implements androidx.lifecycle.LifecycleObserver {
    private ListenerType eventsListener;
    private ListenerType boundListener;
    private final java.util.LinkedList<kotlin.jvm.functions.Function1<ListenerType, kotlin.Unit>> blocks = null;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, ListenerType listener) {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    public final void connectListener() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_PAUSE)
    public final void disconnectListener() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void clear(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner source) {
    }
    
    public final void dispatchEvent(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ListenerType, kotlin.Unit> block) {
    }
    
    public EventsDispatcher() {
        super();
    }
}