package com.Tugas.moviesapp.movieList.domain.repository

import com.Tugas.moviesapp.movieList.util.Resource
import com.Tugas.moviesapp.movieList.domain.model.Movie
import kotlinx.coroutines.flow.Flow


interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}