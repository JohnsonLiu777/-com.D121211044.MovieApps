package com.Tugas.moviesapp.movieList.data.repository;

import com.Tugas.moviesapp.movieList.data.local.movie.MovieDatabase;
import com.Tugas.moviesapp.movieList.data.remote.MovieApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class MovieListRepositoryImpl_Factory implements Factory<MovieListRepositoryImpl> {
  private final Provider<MovieApi> movieApiProvider;

  private final Provider<MovieDatabase> movieDatabaseProvider;

  public MovieListRepositoryImpl_Factory(Provider<MovieApi> movieApiProvider,
      Provider<MovieDatabase> movieDatabaseProvider) {
    this.movieApiProvider = movieApiProvider;
    this.movieDatabaseProvider = movieDatabaseProvider;
  }

  @Override
  public MovieListRepositoryImpl get() {
    return newInstance(movieApiProvider.get(), movieDatabaseProvider.get());
  }

  public static MovieListRepositoryImpl_Factory create(Provider<MovieApi> movieApiProvider,
      Provider<MovieDatabase> movieDatabaseProvider) {
    return new MovieListRepositoryImpl_Factory(movieApiProvider, movieDatabaseProvider);
  }

  public static MovieListRepositoryImpl newInstance(MovieApi movieApi,
      MovieDatabase movieDatabase) {
    return new MovieListRepositoryImpl(movieApi, movieDatabase);
  }
}
