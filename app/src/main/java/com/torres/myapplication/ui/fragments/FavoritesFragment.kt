package com.torres.myapplication.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.torres.myapplication.R
import com.torres.myapplication.databinding.FragmentFavoritesBinding


class FavoritesFragment : Fragment() {

    private lateinit var binding: FragmentFavoritesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavoritesBinding.bind(
            inflater.inflate(
                R.layout.fragment_favorites,
                container,
                false
            )
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()

    }

    private fun initListeners() {

        binding.btnGoToListar.setOnClickListener {
            findNavController().navigate(
                //AHORA LA CALSE QEU SE GENERA POR DETRAS---- > ENVIO
                //GENERA UNA NUEVA CLASE, PARA QUE SE MUEV TENEMOS QUE PASAR ESTE PARAMETRO. PARA SAVE ARGS
            FavoritesFragmentDirections.actionFavoritesFragmentToModificarFragment("Pablito")

           //ANTES....
                //SIN SAFE ARGS
            //R.id.action_favoritesFragment_to_modificarFragment
            )
        }

    }
}