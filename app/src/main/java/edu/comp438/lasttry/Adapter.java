package edu.comp438.lasttry;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter   extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private LayoutInflater inflater;
    private String[] pName;
    private String[] pDetail;


    public Adapter(Context context, String[] pName, String[] pDetail) {
        this.inflater = LayoutInflater.from(context);
        this.pName = pName;
        this.pDetail = pDetail;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String name = pName[i];
        String detail = pDetail[i];
        viewHolder.SName.setText(name);
        viewHolder.Sdetail.setText(detail);

    }

    @Override
    public int getItemCount() {
        return pName.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView SName, Sdetail;

        public ViewHolder(final View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(v.getContext(),Details.class);
                   i.putExtra("name",pName[getAbsoluteAdapterPosition()]);
                   i.putExtra("det",pDetail[getAbsoluteAdapterPosition()])
                   v.getContext().startActivity(i);
                }
            });
            SName = itemView.findViewById(R.id.phoneName);
            Sdetail = itemView.findViewById(R.id.phoneDetail);

        }

    }
}

