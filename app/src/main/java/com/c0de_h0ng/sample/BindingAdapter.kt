package com.c0de_h0ng.sample

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("visible")
fun View?.setVisible(visible: Boolean?) {
    this?.visibility = if (visible == true) View.VISIBLE else View.GONE
}

@BindingAdapter("visible")
fun View?.setVisible(visible: Int?) {
    this?.visibility = if (visible == View.VISIBLE) View.VISIBLE else if (visible == View.INVISIBLE) View.INVISIBLE else View.GONE
}