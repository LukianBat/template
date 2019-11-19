package com.education.android.geophysics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityCalculateBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected CalculateViewModel mViewModel;

  protected ActivityCalculateBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerView = recyclerView;
  }

  public abstract void setViewModel(@Nullable CalculateViewModel viewModel);

  @Nullable
  public CalculateViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityCalculateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_calculate, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCalculateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityCalculateBinding>inflateInternal(inflater, com.education.android.geophysics.R.layout.activity_calculate, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityCalculateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_calculate, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityCalculateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityCalculateBinding>inflateInternal(inflater, com.education.android.geophysics.R.layout.activity_calculate, null, false, component);
  }

  public static ActivityCalculateBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityCalculateBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityCalculateBinding)bind(component, view, com.education.android.geophysics.R.layout.activity_calculate);
  }
}
