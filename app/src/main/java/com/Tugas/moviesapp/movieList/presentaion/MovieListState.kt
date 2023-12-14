package com.Tugas.moviesapp.movieList.presentaion

import com.Tugas.moviesapp.movieList.domain.model.Movie


data class MovieListState(
    val isLoading: Boolean = false,

    val popularMovieListPage: Int = 1,
    val upcomingMovieListPage: Int = 1,

    val isCurrentPopularScreen: Boolean = true,

    //Untuk menu popular dan Upcoming
    val popularMovieList: List<Movie> = emptyList(),
    val upcomingMovieList: List<Movie> = emptyList()
)