package com.Tugas.moviesapp.movieList.presentaion;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/Tugas/moviesapp/movieList/presentaion/MovieListViewModel;", "Landroidx/lifecycle/ViewModel;", "movieListRepository", "Lcom/Tugas/moviesapp/movieList/domain/repository/MovieListRepository;", "(Lcom/Tugas/moviesapp/movieList/domain/repository/MovieListRepository;)V", "_movieListState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/Tugas/moviesapp/movieList/presentaion/MovieListState;", "movieListState", "Lkotlinx/coroutines/flow/StateFlow;", "getMovieListState", "()Lkotlinx/coroutines/flow/StateFlow;", "getPopularMovieList", "", "forceFetchFromRemote", "", "getUpcomingMovieList", "onEvent", "event", "Lcom/Tugas/moviesapp/movieList/presentaion/MovieListUiEvent;", "app_debug"})
public final class MovieListViewModel extends androidx.lifecycle.ViewModel {
    private final com.Tugas.moviesapp.movieList.domain.repository.MovieListRepository movieListRepository = null;
    private kotlinx.coroutines.flow.MutableStateFlow<com.Tugas.moviesapp.movieList.presentaion.MovieListState> _movieListState;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.Tugas.moviesapp.movieList.presentaion.MovieListState> movieListState = null;
    
    @javax.inject.Inject
    public MovieListViewModel(@org.jetbrains.annotations.NotNull
    com.Tugas.moviesapp.movieList.domain.repository.MovieListRepository movieListRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.Tugas.moviesapp.movieList.presentaion.MovieListState> getMovieListState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.Tugas.moviesapp.movieList.presentaion.MovieListUiEvent event) {
    }
    
    private final void getPopularMovieList(boolean forceFetchFromRemote) {
    }
    
    private final void getUpcomingMovieList(boolean forceFetchFromRemote) {
    }
}