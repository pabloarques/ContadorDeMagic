package com.example.contadordemagic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.contadordemagic.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private Button btnPmas;
    private Button btnPMas2;
    private Button btnPMenos;
    private Button btnPMenos2;
    private ImageButton imgCoraL;
    private ImageButton imgCoraL2;
    private ImageButton imgCoraV;
    private ImageButton imgCoraV2;

    private int vida1;
    private int veneno1;
    private int vida2;
    private int veneno2;



    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        reset();
        return binding.getRoot();
    }

    public void reset(){
        vida1=20;
        vida2=20;
        veneno1=0;
        veneno2=0;

        updateScore();
    }

    private void updateScore() {
        //contador
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}