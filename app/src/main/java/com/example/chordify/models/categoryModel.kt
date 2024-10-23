package com.example.chordify.models

import java.lang.reflect.Constructor

data class categoryModel(
    val name : String,
    val coverUrl : String,
    var songs : List<String>
    ){
    constructor() : this("","", listOf())
}
