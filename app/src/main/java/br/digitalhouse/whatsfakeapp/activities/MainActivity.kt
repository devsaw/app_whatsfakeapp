package br.digitalhouse.whatsfakeapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import br.digitalhouse.whatsfakeapp.R
import br.digitalhouse.whatsfakeapp.adapter.TabsAdapter
import br.digitalhouse.whatsfakeapp.fragmentos.Fragmento1
import br.digitalhouse.whatsfakeapp.fragmentos.Fragmento2
import br.digitalhouse.whatsfakeapp.fragmentos.Fragmento3
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        var adapter = TabsAdapter(supportFragmentManager)
        adapter.add(Fragmento1(), "Conversas")
        adapter.add(Fragmento2(), "Status")
        adapter.add(Fragmento3(),"Camera")

        var pager = findViewById<ViewPager>(R.id.pager)
        pager.adapter = adapter

        var tabLayout = findViewById<TabLayout>(R.id.mytablayout)
        tabLayout.setupWithViewPager(pager)

    }
}