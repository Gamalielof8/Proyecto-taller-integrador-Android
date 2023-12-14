package com.example.gicpc_eats_.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gicpc_eats_.R;
import com.example.gicpc_eats_.adapters.HomeHorAdapter;
import com.example.gicpc_eats_.adapters.HomeVerAdapter;
import com.example.gicpc_eats_.adapters.UpdateVerticalRec;
import com.example.gicpc_eats_.models.HomeHorModel;
import com.example.gicpc_eats_.models.HomeVerModel;

import java.util.ArrayList;

public class HomeFragment extends  Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec,homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;
    ///Vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home,container,false);

        homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
        homeVerticalRec =root.findViewById(R.id.home_ver_rec);

        ///Horizontal Recycler View
        homeHorModelList = new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.mix,"Lo mas Llevado"));
        homeHorModelList.add(new HomeHorModel(R.drawable.pizza,"Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.westerm,"Hamburgesa"));
        homeHorModelList.add(new HomeHorModel(R.drawable.torta_ahogada,"Tortas"));
        homeHorModelList.add(new HomeHorModel(R.drawable.tacos_asada,"Tacos"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sushi_1,"Sushi"));
        homeHorModelList.add(new HomeHorModel(R.drawable.chiles_rellenos,"Comida Mexicana"));

        homeHorAdapter = new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);



        ////Vertical Recycler View
        homeVerModelList = new ArrayList<>();


        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));


        return root;
    }


    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);

    }
}