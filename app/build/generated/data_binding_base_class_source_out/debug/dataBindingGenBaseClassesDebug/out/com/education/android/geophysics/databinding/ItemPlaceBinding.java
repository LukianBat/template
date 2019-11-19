package com.education.android.geophysics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.education.android.geophysics.feature.calculate.domain.model.DataModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemPlaceBinding extends ViewDataBinding {
  @Bindable
  protected DataModel mDataModel;

  protected ItemPlaceBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setDataModel(@Nullable DataModel dataModel);

  @Nullable
  public DataModel getDataModel() {
    return mDataModel;
  }

  @NonNull
  public static ItemPlaceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_place, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPlaceBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPlaceBinding>inflateInternal(inflater, com.education.android.geophysics.R.layout.item_place, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPlaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_place, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPlaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPlaceBinding>inflateInternal(inflater, com.education.android.geophysics.R.layout.item_place, null, false, component);
  }

  public static ItemPlaceBinding bind(@NonNull View view) {
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
  public static ItemPlaceBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemPlaceBinding)bind(component, view, com.education.android.geophysics.R.layout.item_place);
  }
}
