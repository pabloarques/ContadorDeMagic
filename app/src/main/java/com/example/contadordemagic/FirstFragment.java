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

        binding.imgB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vida1++;
                vida2--;
                updateScore();
            }
        });

        binding.imgB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vida1--;
                vida2++;
                updateScore();
            }
        });

      binding.btnPmas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            veneno1++;
            updateScore();
        }
      });

      binding.btnPmas2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              veneno2++;
              updateScore();
          }
      });

      binding.btnPmenos.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              veneno1--;
              updateScore();
          }
      });

      binding.btnPmenos2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              veneno2--;
              updateScore();
          }
      });

      binding.imgCoraL.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              vida1++;
              updateScore();
          }
      });

      binding.imgCoraL2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              vida2++;

              updateScore();
          }
      });

      binding.imgCoraV.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              vida1--;

              updateScore();
          }
      });

      binding.imgCoraV2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
                vida2--;

              updateScore();
          }
      });

        reset();


        if(savedInstanceState != null) {
            vida1 = savedInstanceState.getInt("vida1");
            vida2 = savedInstanceState.getInt("vida2");
            veneno1 = savedInstanceState.getInt("veneno1");
            veneno2 = savedInstanceState.getInt("veneno2");

        }

        updateScore();
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
        binding.contador.setText(String.format("%d/%d", vida1, veneno1));
        binding.contador2.setText(String.format("%d/%d", vida2, veneno2));
    }


    public void onSaveInstanceState(Bundle outState){
        outState.putInt("vida1", vida1);
        outState.putInt("vida2", vida2);
        outState.putInt("veneno1", veneno1);
        outState.putInt("veneno2", veneno2);

    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}