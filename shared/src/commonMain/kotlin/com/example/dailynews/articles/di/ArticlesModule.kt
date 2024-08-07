package com.example.dailynews.articles.di

import com.example.dailynews.articles.ArticlesDataSource
import com.example.dailynews.articles.ArticlesRepository
import com.example.dailynews.articles.ArticlesService
import com.example.dailynews.articles.ArticlesUseCase
import com.example.dailynews.articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(get()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}