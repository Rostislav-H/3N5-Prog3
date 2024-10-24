package org.Hudiakov

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.Hudiakov.adapters.MonAdapter
import org.Hudiakov.databinding.ActivityMainBinding
import org.Hudiakov.databinding.ActivitySecondBinding

class SecondActivity: AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private lateinit var adapter: MonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       // setupRecycler()
        fillRecycler()
    }

   // private fun setupRecycler() {
     //   adapter = MonAdapter() // Créer l'adapteur
       // binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
       // binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        //binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
          //  DividerItemDecoration(
            //    binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
       //     )
       // )
  //  }

    private fun fillRecycler(){

        val items: MutableList<String> = mutableListOf()
        for (i in 1.. 10) {
            items.add("#$i")
        }
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}