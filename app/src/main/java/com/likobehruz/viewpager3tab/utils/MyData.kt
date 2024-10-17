package com.likobehruz.viewpager3tab.utils

import com.likobehruz.viewpager3tab.R
import com.likobehruz.viewpager3tab.models.User

object MyData {
    val list = ArrayList<User>()

    fun addUser() {
        list.add(
            User(
                "GeoAxborot ",
                "Geoaxborot moduli orqali siz o'zingizga yaqin",
                "bo'lgan  moduli orqali siz o'zingizga yaqin bo'lgan migrantlar",
                "haqida ma'lumot olishingiz mumkin",
                R.drawable.img
            )
        )
        list.add(
            User(
                "Barcha operatorlar bo’yicha statistika",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Pulvinar",
                "aliquem at donec facilisis.Lacus, justo, volutpat, diam",
                "condimentum ipsum, faucibus rutrum",
                R.drawable.img_1
            )
        )
        list.add(
            User(
                "Tariflarni filtrlash",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Pulvinar",
                "aliquem at donec facilisis.Lacus, justo, volutpat, diam",
                "condimentum ipsum, faucibus rutrum",
                R.drawable.img_2
            )
        )
        list.add(
            User(
                "Yangi imkoniyatlar",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Pulvinar",
                "aliquem at donec facilisis.Lacus, justo, volutpat, diam",
                "condimentum ipsum, faucibus rutrum",
                R.drawable.img_3
            )
        )
    }
}