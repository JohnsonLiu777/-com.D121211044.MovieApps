package com.Tugas.moviesapp.movieList.data.local.movie;

import java.lang.System;

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/Tugas/moviesapp/movieList/data/local/movie/MovieDao;", "", "getMovieById", "Lcom/Tugas/moviesapp/movieList/data/local/movie/MovieEntity;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieListByCategory", "", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsertMovieList", "", "movieList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Upsert
    public abstract java.lang.Object upsertMovieList(@org.jetbrains.annotations.NotNull
    java.util.List<com.Tugas.moviesapp.movieList.data.local.movie.MovieEntity> movieList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM MovieEntity WHERE id = :id")
    public abstract java.lang.Object getMovieById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.Tugas.moviesapp.movieList.data.local.movie.MovieEntity> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM MovieEntity WHERE category = :category")
    public abstract java.lang.Object getMovieListByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.Tugas.moviesapp.movieList.data.local.movie.MovieEntity>> continuation);
}