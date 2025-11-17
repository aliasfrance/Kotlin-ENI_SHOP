package com.example.enishopcda2410.dao

import com.example.enishopcda2410.bo.Article

interface ArticleDAO {

    fun findById(id : Long) : Article?

    fun insert(article: Article) : Long

    // Nouvelle méthode requise pour le TP2 [1] renvoie une liste d'articles
    fun findAll() : List<Article>
}

