package com.tugas.recyclerviewkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wisatalist = listOf<Wisata>(
            Wisata(
                R.drawable.danausentasi,
                "Danau-Sentasi",
                "Danau Sentani adalah danau yang terletak di Papua Indonesia Danau Sentani adalah danau yang terletak di Papua Indonesia Danau Sentani adalah danau yang terletak di Papua Indonesia"
            ),
            Wisata(
                R.drawable.gililombok,
                "Gili-Lambok",
                "Gili Lambok adalah kekuatan lain wisata ke pulau timur Bali ini"
            ),
            Wisata(
                R.drawable.pulaukomodo,
                "Pulau-Komodo",
                "Pulau Komodo adalah sebuah pulau yang terletak di Kepulauan Nusa Tenggara, berada di sebelah timur Pulau Sumbawa"
            ),
            Wisata(
                R.drawable.rajaampat,
                "Raja-Ampat",
                "Raja Ampat adalah menawarkan kesempatan untuk melihat segala sesuatu yang Indah"

            ),
            Wisata(
                R.drawable.tamanlautbunaken,
                "Taman-Laut-Bunekan",
                " Taman Laut Bunekan adalah taman laut yang terletak di Sulawesi Utara"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_Wisata)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = WisataAdapter(this, wisatalist) {

        }

    }

}








