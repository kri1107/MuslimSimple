package com.androweed.muslimsimple.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androweed.muslimsimple.R
import com.androweed.muslimsimple.databinding.FragmentHomeBinding
import com.androweed.muslimsimple.videokajian.home_recyclerview.AdapterVideoKajian
import com.androweed.muslimsimple.videokajian.home_recyclerview.ModelVideoKajian

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null


    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

//        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        /*val textView: TextView = binding.
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/

        /* Recycler View*/
        /*val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.VERTICAL

        rvVKajian = view.findViewById(R.id.rv_videokajian)

        val adapterVideoKajian = AdapterVideoKajian(ArrayVideoKajian,activity)
        rvVKajian.setHasFixedSize(true)
        rvVKajian.layoutManager = lm
        rvVKajian.adapter = adapterVideoKajian*/

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_videokajian)
        val adapter = AdapterVideoKajian(ArrayVideoKajian,activity)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(activity)

        return view
    }

    val ArrayVideoKajian : ArrayList<ModelVideoKajian>get() {

        val firandaAndirja = "Firanda Andirja"
        val yufidTV = "Yufid.TV - Pengajian & Ceramah Islam"

        val arrayvideokajian = ArrayList<ModelVideoKajian>()

        val videokajian1 = ModelVideoKajian()
        videokajian1.titleVideoKajian = "Al-Quran Membersihkan Hati"
        videokajian1.channelVideoKajian = yufidTV
        videokajian1.thumbnailVideoKajian = R.drawable.iv_alquran_membersihkan_hati

        val videokajian2 = ModelVideoKajian()
        videokajian2.titleVideoKajian = "Baca, Pahami, Amalkan!"
        videokajian2.channelVideoKajian = firandaAndirja
        videokajian2.thumbnailVideoKajian = R.drawable.iv_baca_pahami_lalu_amalkan

        arrayvideokajian.add(videokajian1)
        arrayvideokajian.add(videokajian2)

        return arrayvideokajian
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}