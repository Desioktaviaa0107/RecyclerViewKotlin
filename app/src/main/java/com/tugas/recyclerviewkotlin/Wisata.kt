package com.tugas.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Wisata (
    val imgWisata: Int,
    val nameWisata: String,
    val descWisata: String
) : Parcelable