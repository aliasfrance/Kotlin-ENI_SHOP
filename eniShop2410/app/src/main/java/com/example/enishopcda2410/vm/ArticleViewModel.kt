package com.example.enishopcda2410.vm

import androidx.lifecycle.ViewModel
import com.example.enishopcda2410.repository.CategoryRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

//----------------------------------------------------
// ViewModel : reçoit le repository via le constructeur
//----------------------------------------------------


class ArticleViewModel (private val categoryRepository: CategoryRepository) : ViewModel() {

    private val _categorieFiltrer = MutableStateFlow<List<String>>(emptyList())
    val categorieFiltrer = _categorieFiltrer.asStateFlow()

    init {
        _categorieFiltrer.value = categoryRepository.getAllListeCategory()
    }

}

