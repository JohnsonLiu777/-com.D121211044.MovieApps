package com.Tugas.moviesapp.core.details.presentation

import com.Tugas.moviesapp.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
