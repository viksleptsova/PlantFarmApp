package com.example.plantfarmapp.model.abstractions

import com.example.plantfarmapp.model.objects.Field


interface IFieldService {
    val fields: List<Field>
    var currentClickedDate: Int
}