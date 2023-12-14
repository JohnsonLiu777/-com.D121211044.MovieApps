package com.Tugas.moviesapp.di;

import com.Tugas.moviesapp.movieList.data.remote.MovieApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesMovieApiFactory implements Factory<MovieApi> {
  @Override
  public MovieApi get() {
    return providesMovieApi();
  }

  public static AppModule_ProvidesMovieApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MovieApi providesMovieApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesMovieApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidesMovieApiFactory INSTANCE = new AppModule_ProvidesMovieApiFactory();
  }
}
