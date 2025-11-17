package com.example.enishopcda2410.repository

class CategoryRepository {
    private val ListeCategory = listOf("electronics", "jewelery", "men's clothing",
        "women's clothing")

    fun getAllListeCategory(): List<String>{ return ListeCategory }
//    companion object

}