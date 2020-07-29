package org.techtown.listviewtest1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.techtown.listviewtest1.R;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    Context context = null;
    LayoutInflater layoutInflater = null;
    ArrayList<SampleData> sampleData;

    public ListViewAdapter(Context context) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    public ListViewAdapter(Context context, ArrayList<SampleData> data) {
        this.context = context;
        this.sampleData = data;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return sampleData.size();
    }

    @Override
    public Object getItem(int position) {
        return sampleData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.listview_item, null);
            holder = new ViewHolder();

            holder.count = (TextView) convertView.findViewById(R.id.count);
            holder.strName = (TextView) convertView.findViewById(R.id.textView);
            holder.strText = (TextView) convertView.findViewById(R.id.textView2);

            convertView.setTag(holder);


        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.count.setText(sampleData.get(position).getCount());
        holder.strName.setText(sampleData.get(position).getStrName());
        holder.strText.setText(sampleData.get(position).getStrText());

        return convertView;
    }

    private class ViewHolder {
        TextView count;
        TextView strName;
        TextView strText;
    }
}
