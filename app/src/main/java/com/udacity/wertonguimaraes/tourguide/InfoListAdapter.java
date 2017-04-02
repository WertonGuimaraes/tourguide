package com.udacity.wertonguimaraes.tourguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wertonguimaraes on 27/03/17.
 */

public class InfoListAdapter extends RecyclerView.Adapter<InfoListAdapter.ViewHolder> {

    private Context mContext;
    private List<Info> mInfoList;

    public InfoListAdapter(Context mContext, List<Info> mInfoList) {
        this.mContext = mContext;
        this.mInfoList = mInfoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return (null != mInfoList ? mInfoList.size() : 0);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Info info = mInfoList.get(position);

//        //Render image using Picasso library
//        if (!TextUtils.isEmpty(feedItem.getThumbnail())) {
//            Picasso.with(mContext).load(feedItem.getThumbnail())
//                    .error(R.drawable.placeholder)
//                    .placeholder(R.drawable.placeholder)
//                    .into(customViewHolder.imageView);
//        }

        holder.textView.setText(info.getName());

    }

    class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView textView;

        public ViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.name);
        }
    }
}