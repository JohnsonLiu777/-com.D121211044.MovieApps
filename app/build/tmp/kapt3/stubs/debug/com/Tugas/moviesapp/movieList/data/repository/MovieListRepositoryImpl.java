package com.Tugas.moviesapp.movieList.data.repository;

import java.lang.System;

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ;\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\t0\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/Tugas/moviesapp/movieList/data/repository/MovieListRepositoryImpl;", "Lcom/Tugas/moviesapp/movieList/domain/repository/MovieListRepository;", "movieApi", "Lcom/Tugas/moviesapp/movieList/data/remote/MovieApi;", "movieDatabase", "Lcom/Tugas/moviesapp/movieList/data/local/movie/MovieDatabase;", "(Lcom/Tugas/moviesapp/movieList/data/remote/MovieApi;Lcom/Tugas/moviesapp/movieList/data/local/movie/MovieDatabase;)V", "getMovie", "Lkotlinx/coroutines/flow/Flow;", "Lcom/Tugas/moviesapp/movieList/util/Resource;", "Lcom/Tugas/moviesapp/movieList/domain/model/Movie;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieList", "", "forceFetchFromRemote", "", "category", "", "page", "(ZLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MovieListRepositoryImpl implements com.Tugas.moviesapp.movieList.domain.repository.MovieListRepository {
    private final com.Tugas.moviesapp.movieList.data.remote.MovieApi movieApi = null;
    private final com.Tugas.moviesapp.movieList.data.local.movie.MovieDatabase movieDatabase = null;
    
    @javax.inject.Inject
    public MovieListRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.Tugas.moviesapp.movieList.data.remote.MovieApi movieApi, @org.jetbrains.annotations.NotNull
    com.Tugas.moviesapp.movieList.data.local.movie.MovieDatabase movieDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMovieList(boolean forceFetchFromRemote, @org.jetbrains.annotations.NotNull
    java.lang.String category, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.Tugas.moviesapp.movieList.util.Resource<java.util.List<com.Tugas.moviesapp.movieList.domain.model.Movie>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMovie(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.Tugas.moviesapp.movieList.util.Resource<com.Tugas.moviesapp.movieList.domain.model.Movie>>> continuation) {
        return null;
    }
}