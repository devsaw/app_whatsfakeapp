package br.digitalhouse.whatsfakeapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabsAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    var listaDeFragmentos = mutableListOf<Fragment>()
    var listaDeTitulo = mutableListOf<String>()

    fun add(fragment: Fragment, titulo: String) {
        listaDeFragmentos.add(fragment)
        listaDeTitulo.add(titulo)
    }

    override fun getCount(): Int = listaDeFragmentos.size

    override fun getItem(position: Int): Fragment = listaDeFragmentos[position]

    override fun getPageTitle(position: Int): CharSequence? = listaDeTitulo[position]


}