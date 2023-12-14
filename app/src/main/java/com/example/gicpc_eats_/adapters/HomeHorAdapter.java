package com.example.gicpc_eats_.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gicpc_eats_.R;
import com.example.gicpc_eats_.models.HomeHorModel;
import com.example.gicpc_eats_.models.HomeVerModel;

import java.util.ArrayList;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {


    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4,"Pizza Familiar 8 Pedazos","25:00-35:00 min","4.9","Min - $100"));
            homeVerModels.add(new HomeVerModel(R.drawable.hamg,"Hamburgeza con papas","25:00-35:00 min","4.9","Min - $120"));
            homeVerModels.add(new HomeVerModel(R.drawable.taco_c,"Tacos se carne asada","25:00-35:00 min","4.9","Min - $200"));
            homeVerModels.add(new HomeVerModel(R.drawable.dog,"Tacos De perro","25:00-35:00 min","5","Min - $4"));
            homeVerModels.add(new HomeVerModel(R.drawable.combo,"Combo todo un poco","25:00-35:00 min","5","Min - $4"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }

            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4,"Pizza Familiar 8 Pedazos","25:00-35:00 min","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.hamg,"Hamburgeza con papas","25:00-35:00 min","4.9","Min - $120"));
                        homeVerModels.add(new HomeVerModel(R.drawable.taco_c,"Tacos se carne asada","25:00-35:00 min","4.9","Min - $200"));
                        homeVerModels.add(new HomeVerModel(R.drawable.dog,"Tacos De perro","25:00-35:00 min","5","Min - $4"));
                        homeVerModels.add(new HomeVerModel(R.drawable.combo,"Combo todo un poco","25:00-35:00 min","5","Min - $4"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    } else if (position == 1) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4,"Pizza Familiar 8 Pedazos","25:00-35:00 min","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.lite,"Pizza Little ceasar","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza_hut," Pizza Hut","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza_pizeta,"Pizza Familiar Pizzeta","10:00-23:00","4.9","Min - $100"));
                        updateVerticalRec.callBack(position,homeVerModels);
                        
                    } else if (position == 2) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.hamburgeza_full_hous,"hamburgesa Full House","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.hamg,"Hamburgeza con papas","25:00-35:00 min","4.9","Min - $120"));
                        homeVerModels.add(new HomeVerModel(R.drawable.doble_mc_donal,"Hamburgesa Doble Mc Donals","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.westerm,"Westerm Beacon Carls JR","10:00-23:00","4.9","Min - $100"));
                        updateVerticalRec.callBack(position,homeVerModels);

                        updateVerticalRec.callBack(position,homeVerModels);

                    } else if (position == 3) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.torta_ahogada,"Torta Ahogada","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.carne_asada_torta_recipe,"Torta Carne Asada","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.chilaquiles,"Torta De Chilaquiles Verde","10:00-23:00","4.9","Min - $100"));


                        updateVerticalRec.callBack(position,homeVerModels);
                        
                    } else if (position == 4) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.dog,"Tacos De perro","25:00-35:00 min","5","Min - $4"));
                        homeVerModels.add(new HomeVerModel(R.drawable.taco_c,"Tacos se carne asada","25:00-35:00 min","4.9","Min - $200"));
                        homeVerModels.add(new HomeVerModel(R.drawable.vampiro,"Vampiro de Asada","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.carne_asada_torta_recipe,"Torta de Carne Asada","10:00-23:00","4.9","Min - $100"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    } else if (position ==5) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.sushi_1,"3 Quesos","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mar_tierra,"Mar Y Tierra","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.guamuchilito,"Guamuchilito","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sushi2,"Mechudo","10:00-23:00","4.9","Min - $100"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }else if (position ==6) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.chiles_rellenos,"Chile Rellenos","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.tacos_dorados,"Tacos Dorados","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mole_poblano,"Mole Poblano","10:00-23:00","4.9","Min - $100"));
                        homeVerModels.add(new HomeVerModel(R.drawable.combo,"Combo todo un poco","25:00-35:00 min","5","Min - $4"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }


                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;

                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else{
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.hor_img);
            name= itemView.findViewById(R.id.hor_text);
            cardView= itemView.findViewById(R.id.cardView);
        }
    }
}
