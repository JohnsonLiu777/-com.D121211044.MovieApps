package com.Tugas.moviesapp.core.details.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/Tugas/moviesapp/core/details/presentation/DetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "movieListRepository", "Lcom/Tugas/moviesapp/movieList/domain/repository/MovieListRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/Tugas/moviesapp/movieList/domain/repository/MovieListRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_detailsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/Tugas/moviesapp/core/details/presentation/DetailsState;", "detailsState", "Lkotlinx/coroutines/flow/StateFlow;", "getDetailsState", "()Lkotlinx/coroutines/flow/StateFlow;", "movieId", "", "Ljava/lang/Integer;", "getMovie", "", "id", "app_debug"})
public final class DetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.Tugas.moviesapp.movieList.domain.repository.MovieListRepository movieListRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final java.lang.Integer movieId = null;
    private kotlinx.coroutines.flow.MutableStateFlow<com.Tugas.moviesapp.core.details.presentation.DetailsState> _detailsState;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.Tugas.moviesapp.core.details.presentation.DetailsState> detailsState = null;
    
    @javax.inject.Inject
    public DetailsViewModel(@org.jetbrains.annotations.NotNull
    com.Tugas.moviesapp.movieList.domain.repository.MovieListRepository movieListRepository, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.Tugas.moviesapp.core.details.presentation.DetailsState> getDetailsState() {
        return null;
    }
    
    private final void getMovie(int id) {
    }
}