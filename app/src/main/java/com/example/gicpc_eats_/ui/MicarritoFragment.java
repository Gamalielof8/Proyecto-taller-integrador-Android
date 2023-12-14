package com.example.gicpc_eats_.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gicpc_eats_.R;
import com.example.gicpc_eats_.models.CartModel;
import com.example.gicpc_eats_.adapters.CartAdapter;

import java.util.ArrayList;
import java.util.List;


public class MicarritoFragment extends Fragment {

    List<CartModel>list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public MicarritoFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_micarrito, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.taco_c,"Taco","200","4.3"));
        list.add(new CartModel(R.drawable.hamg,"Hamburgeza con papas","120","4.3"));
        list.add(new CartModel(R.drawable.pizza4,"Pizza Familiar 8 pedasos","100","4.3"));
        list.add(new CartModel(R.drawable.dog,"Taco de perro","4","4.3"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);




        return view;
    }
}