package com.example.plantfarmapp.presenter

import com.example.plantfarmapp.di.App
import com.example.plantfarmapp.model.objects.Field
import com.example.plantfarmapp.presenter.abstractions.IFieldPresenter
import com.example.plantfarmapp.view.abstractions.IFieldsActivityView

class FieldsPresenter: IFieldPresenter<IFieldsActivityView> {


    fun onItemClick(position: Int){
        currentClickedPosition = position
        App.fieldsService.currentClickedDate = position

        //start next activity
    }


    override fun onViewCreated(view: IFieldsActivityView) {
        this.view = view
    }


    private var view: IFieldsActivityView? = null
    var fields: List<Field> =  App.fieldsService.fields
    var fieldsCount: Int = fields.size

    private var currentClickedPosition: Int = -1
}