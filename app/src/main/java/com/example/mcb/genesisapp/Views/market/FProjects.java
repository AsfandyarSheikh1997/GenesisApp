package com.example.mcb.genesisapp.Views.market;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.eftimoff.viewpagertransformers.DepthPageTransformer;
import com.example.mcb.genesisapp.R;
import com.example.mcb.genesisapp.Layers.base.*;
import com.example.mcb.genesisapp.State.StateActivity;
import com.example.mcb.genesisapp.Views.ObtainerFragment;
import com.example.mcb.genesisapp.Views.creator.CreatorFragment;
import com.example.mcb.genesisapp.Views.wallet.FWallet;

import java.util.ArrayList;
import java.util.List;

/**
 * Fragment holding the Projects view.
 */
public class FProjects extends Fragment {


    public FProjects() {
        // Required empty public constructor
    }

    public static FProjects newInstance() {
        return new FProjects();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fprojects, container, false);
        Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getContext(), MarketActivity.class);
                startActivity(myIntent);
            }
        });

        return view;
    }


}

    /*public void buttonPress(View view) {
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ProducerRatingFragment fragment2 = ProducerRatingFragment.newInstance();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

        });*/





