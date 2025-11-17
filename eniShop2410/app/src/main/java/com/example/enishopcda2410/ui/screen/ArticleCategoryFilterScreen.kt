package com.example.enishopcda2410.ui.screen


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.enishopcda2410.repository.ArticleRepository
import com.example.enishopcda2410.ui.common.EniShopAppBar

//----------------------------------------------------
// Pour afficher les catégories du ViewModel avec injection manuelle du repository.
//----------------------------------------------------

@Composable
fun ArticleCategoryFilterScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { EniShopAppBar() }
    ) {
        ArticleDetail(
            article = ArticleRepository.getArticle(2)!!,
            modifier = Modifier.padding(it)
        )
    }
}


@Preview
@Composable
private fun ArticleCategoryFilterPreview() {
    ArticleCategoryFilterScreen()
}
