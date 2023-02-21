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
    lateinit var rvVKajian : RecyclerView


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

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*val textView: TextView = binding.
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return root

        /* Recycler View*/
        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.HORIZONTAL

        rvVKajian = root.findViewById(R.id.cv_home_videkajian)

        val adapterVideoKajian = AdapterVideoKajian(ArrayVideoKajian,activity)
        rvVKajian.setHasFixedSize(true)
        rvVKajian.layoutManager = lm
        rvVKajian.adapter = adapterVideoKajian


    }

    val ArrayVideoKajian : ArrayList<ModelVideoKajian>get() {

        val arrayvideokajian = ArrayList<ModelVideoKajian>()

        val videokajian1 = ModelVideoKajian()
        videokajian1.titleVideoKajian = "Al-Quran Membersihkan Hati"
        videokajian1.channelVideoKajian = R.string.yufid_tv.toString()
        videokajian1.thumbnailVideoKajian = R.drawable.iv_alquran_membersihkan_hati

        val videokajian2 = ModelVideoKajian()
        videokajian2.titleVideoKajian = "Baca, Pahami, Amalkan!"
        videokajian2.channelVideoKajian = R.string.firanda_andirja.toString()
        videokajian2.thumbnailVideoKajian = R.drawable.iv_baca_pahami_lalu_amalkan

        arrayvideokajian.add(videokajian1)

        return arrayvideokajian
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}