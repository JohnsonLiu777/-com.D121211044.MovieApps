package com.Tugas.moviesapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/Tugas/moviesapp/di/AppModule;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providesMovieApi", "Lcom/Tugas/moviesapp/movieList/data/remote/MovieApi;", "providesMovieDatabase", "Lcom/Tugas/moviesapp/movieList/data/local/movie/MovieDatabase;", "app", "Landroid/app/Application;", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.Tugas.moviesapp.di.AppModule INSTANCE = null;
    private static final okhttp3.logging.HttpLoggingInterceptor interceptor = null;
    private static final okhttp3.OkHttpClient client = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.Tugas.moviesapp.movieList.data.remote.MovieApi providesMovieApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.Tugas.moviesapp.movieList.data.local.movie.MovieDatabase providesMovieDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
}