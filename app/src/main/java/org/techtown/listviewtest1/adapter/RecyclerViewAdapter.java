package org.techtown.listviewtest1.adapter;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.listviewtest1.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder> {

    private ArrayList<SampleData> list;

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected TextView count;
        protected TextView strName;
        protected TextView strText;

        public CustomViewHolder(View itemView) {
            super(itemView);
            this.count = (TextView) itemView.findViewById(R.id.count);
            this.strName = (TextView) itemView.findViewById(R.id.textView);
            this.strText = (TextView) itemView.findViewById(R.id.textView2);
        }
    }

    public RecyclerViewAdapter(ArrayList<SampleData> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_item, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.CustomViewHolder holder, int position) {
        holder.count.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        holder.strName.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        holder.strText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);

        holder.count.setGravity(Gravity.CENTER);
        holder.strName.setGravity(Gravity.CENTER);
        holder.strText.setGravity(Gravity.CENTER);

        holder.count.setText(list.get(position).getCount());
        holder.strName.setText(list.get(position).getStrName());
        holder.strText.setText(list.get(position).getStrText());
    }

    @Override
    public int getItemCount() {
        return (null != list ? list.size() : 0);
    }

}
