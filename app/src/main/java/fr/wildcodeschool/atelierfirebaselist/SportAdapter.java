package fr.wildcodeschool.atelierfirebaselist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SportVH> {

    private ArrayList<Sport> sports;

    public SportAdapter(ArrayList<Sport> sports) {
        this.sports = sports;
    }

    @NonNull
    @Override
    public SportVH onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_sport, parent, false);
        return new SportVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SportVH holder, int position) {
        Sport sport = sports.get(position);
        holder.tvName.setText(sport.getName());
    }

    @Override
    public int getItemCount() {
        return sports.size();
    }

    class SportVH extends RecyclerView.ViewHolder {

        private TextView tvName;

        public SportVH(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
