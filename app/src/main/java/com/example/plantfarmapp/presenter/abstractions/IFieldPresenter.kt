package com.example.plantfarmapp.presenter.abstractions

interface IFieldPresenter<TView> {
    fun onViewCreated(view : TView)
}