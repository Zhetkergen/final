package com.example.mvvm_kotlin_example.binding_util

import android.util.Log
import android.widget.ImageView
import android.widget.RatingBar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator
import com.squareup.picasso.Target




@BindingAdapter("imageUrlWithPic")
fun ImageView.setImageWithPicasso(imageUrl: String) {
    if (imageUrl != null && imageUrl.isNotBlank()) {
        //Log.d("BindingAdapter", "image: $imageUrl")
        Picasso.get().load(imageUrl).into(this)
    }
}

@BindingAdapter("changeBack")
fun ConstraintLayout.changeBack(imageUrl: String) {
    if (imageUrl != null && imageUrl.isNotBlank()) {
//        Log.d("BindingAdapter", "image: $imageUrl")
        Picasso.get().load(imageUrl)
            .into(CustomLayout(this))
    }
}


@BindingAdapter("rateIt")
fun RatingBar.rateItSimply(rate: Double) {
    this.rating = rate.toFloat() / 2
}
