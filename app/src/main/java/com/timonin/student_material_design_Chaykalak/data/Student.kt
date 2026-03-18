package com.timonin.student_material_design_Chaykalak.data
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Student (
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val description: Int
){
}