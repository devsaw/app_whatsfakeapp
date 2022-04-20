package br.digitalhouse.whatsfakeapp.fragmentos

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import br.digitalhouse.whatsfakeapp.R
import br.digitalhouse.whatsfakeapp.adapter.RecyclerAdapter
import br.digitalhouse.whatsfakeapp.data.TopicoBuilder

class Fragmento1 : Fragment(R.layout.fragmento1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buildAdd()
    }

    fun buildAdd() {
        var topicoBuilder = TopicoBuilder()
        topicoBuilder.add(R.drawable.pernalonga, "Oi Perna blz?", "Pernalonga")
        topicoBuilder.add(R.drawable.gaguinho, "That's all?", "Gaguinho")
        topicoBuilder.add(R.drawable.frajola, "Kd o piu-piu?", "Frajola")
        topicoBuilder.add(R.drawable.lola, "s2", "Lola")
        topicoBuilder.add(R.drawable.patolino, "Hahahaha", "Patolino")
        topicoBuilder.add(R.drawable.eufrazino, "Fogo nele!!!", "Eufrazino")
        topicoBuilder.add(R.drawable.hortelino, "Caçou algo??", "Hortelino")
        topicoBuilder.add(R.drawable.ligeirinho, "Já passou aqui?", "Ligeirinho")
        topicoBuilder.add(R.drawable.piupiu, "<3", "Piu-Piu")
        topicoBuilder.add(R.drawable.marvin, "Ta em Marte?", "Marvin")
        topicoBuilder.add(R.drawable.papaleguas, "Correeeee!", "Papaleguas")
        topicoBuilder.add(R.drawable.coyote, "Da pra alcançar...", "Coyote")
        topicoBuilder.add(R.drawable.tazmania, "Ablublubé", "Taz Mania")
        var recyclerView = view?.findViewById<RecyclerView>(R.id.rcva)
        recyclerView?.adapter = RecyclerAdapter(requireContext(), topicoBuilder.listaDeTopicos)
    }
}