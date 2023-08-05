package com.example.newproject.ui.utils

import android.content.Context
import android.util.TypedValue

object SpUtils {

    fun dp2px(value: Float, context: Context): Float {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            value,
            context.resources.displayMetrics
        )
    }




}
