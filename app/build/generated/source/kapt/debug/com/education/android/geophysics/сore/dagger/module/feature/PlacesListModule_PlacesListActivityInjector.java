package com.education.android.geophysics.сore.dagger.module.feature;

import com.education.android.geophysics.feature.calculate.presentation.CalculateActivity;
import com.education.android.geophysics.feature.calculate.presentation.dagger.CalculateActivityModule;
import com.education.android.geophysics.сore.dagger.scope.ActivityScope;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = PlacesListModule_PlacesListActivityInjector.CalculateActivitySubcomponent.class
)
public abstract class PlacesListModule_PlacesListActivityInjector {
  private PlacesListModule_PlacesListActivityInjector() {}

  @Binds
  @IntoMap
  @ClassKey(CalculateActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CalculateActivitySubcomponent.Factory builder);

  @Subcomponent(modules = CalculateActivityModule.class)
  @ActivityScope
  public interface CalculateActivitySubcomponent extends AndroidInjector<CalculateActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CalculateActivity> {}
  }
}
