package com.Tugas.moviesapp.movieList.presentaion;

import com.Tugas.moviesapp.movieList.domain.repository.MovieListRepository;
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
public final class MovieListViewModel_Factory implements Factory<MovieListViewModel> {
  private final Provider<MovieListRepository> movieListRepositoryProvider;

  public MovieListViewModel_Factory(Provider<MovieListRepository> movieListRepositoryProvider) {
    this.movieListRepositoryProvider = movieListRepositoryProvider;
  }

  @Override
  public MovieListViewModel get() {
    return newInstance(movieListRepositoryProvider.get());
  }

  public static MovieListViewModel_Factory create(
      Provider<MovieListRepository> movieListRepositoryProvider) {
    return new MovieListViewModel_Factory(movieListRepositoryProvider);
  }

  public static MovieListViewModel newInstance(MovieListRepository movieListRepository) {
    return new MovieListViewModel(movieListRepository);
  }
}
