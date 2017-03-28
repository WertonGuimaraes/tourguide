package com.udacity.wertonguimaraes.tourguide;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wertonguimaraes on 27/03/17.
 */

public class InfoListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Info> mInfoList;

    public InfoListAdapter(Context mContext, List<Info> mInfoList) {
        this.mContext = mContext;
        this.mInfoList = mInfoList;
    }

    @Override
    public int getCount() {
        return mInfoList.size();
    }

    @Override
    public Object getItem(int position) {
        return mInfoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_list, null);
        TextView tvName = (TextView) v.findViewById(R.id.name);

        tvName.setText(mInfoList.get(position).getName());

        v.setTag(mInfoList.get(position).getId());
        return v;
    }
}
