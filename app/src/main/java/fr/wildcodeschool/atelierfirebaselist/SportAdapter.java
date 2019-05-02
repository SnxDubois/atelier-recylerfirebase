package fr.wildcodeschool.atelierfirebaselist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SportViewHolder> {

    private ArrayList<Sport> sports;

    public SportAdapter(ArrayList<Sport> sports) {
        this.sports = sports;
    }

    @Override
    public SportViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_sport, parent, false);
        return new SportViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SportViewHolder holder, int position) {
        Sport sport = sports.get(position);
        holder.tvName.setText(sport.getName());
    }

    @Override
    public int getItemCount() {
        return sports.size();
    }

    class SportViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;

        public SportViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
