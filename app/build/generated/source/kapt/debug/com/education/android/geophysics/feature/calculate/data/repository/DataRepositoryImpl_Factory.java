// Generated by Dagger (https://google.github.io/dagger).
package com.education.android.geophysics.feature.calculate.data.repository;

import com.education.android.geophysics.feature.calculate.data.datasource.api.DataApiDataSource;
import com.education.android.geophysics.feature.calculate.data.datasource.db.DataCacheDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DataRepositoryImpl_Factory implements Factory<DataRepositoryImpl> {
  private final Provider<DataCacheDataSource> cacheDataSourceProvider;

  private final Provider<DataApiDataSource> apiDataSourceProvider;

  public DataRepositoryImpl_Factory(
      Provider<DataCacheDataSource> cacheDataSourceProvider,
      Provider<DataApiDataSource> apiDataSourceProvider) {
    this.cacheDataSourceProvider = cacheDataSourceProvider;
    this.apiDataSourceProvider = apiDataSourceProvider;
  }

  @Override
  public DataRepositoryImpl get() {
    return new DataRepositoryImpl(cacheDataSourceProvider.get(), apiDataSourceProvider.get());
  }

  public static DataRepositoryImpl_Factory create(
      Provider<DataCacheDataSource> cacheDataSourceProvider,
      Provider<DataApiDataSource> apiDataSourceProvider) {
    return new DataRepositoryImpl_Factory(cacheDataSourceProvider, apiDataSourceProvider);
  }

  public static DataRepositoryImpl newInstance(
      DataCacheDataSource cacheDataSource, DataApiDataSource apiDataSource) {
    return new DataRepositoryImpl(cacheDataSource, apiDataSource);
  }
}
