package com.example.dailynews.di

import com.example.dailynews.articles.di.articlesModule

val sharedKoinModules = listOf(
    articlesModule,
    networkModule
)