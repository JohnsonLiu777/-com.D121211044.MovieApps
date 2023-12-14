package com.Tugas.moviesapp.core.details.presentation;

import androidx.lifecycle.SavedStateHandle;
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
public final class DetailsViewModel_Factory implements Factory<DetailsViewModel> {
  private final Provider<MovieListRepository> movieListRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public DetailsViewModel_Factory(Provider<MovieListRepository> movieListRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.movieListRepositoryProvider = movieListRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public DetailsViewModel get() {
    return newInstance(movieListRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static DetailsViewModel_Factory create(
      Provider<MovieListRepository> movieListRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new DetailsViewModel_Factory(movieListRepositoryProvider, savedStateHandleProvider);
  }

  public static DetailsViewModel newInstance(MovieListRepository movieListRepository,
      SavedStateHandle savedStateHandle) {
    return new DetailsViewModel(movieListRepository, savedStateHandle);
  }
}
