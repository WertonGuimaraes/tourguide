package com.udacity.wertonguimaraes.tourguide.adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.udacity.wertonguimaraes.tourguide.R;
import com.udacity.wertonguimaraes.tourguide.model.Info;

import java.util.List;

/**
 * Created by wertonguimaraes on 27/03/17.
 */

public class InfoListAdapter extends RecyclerView.Adapter<InfoListAdapter.ViewHolder> {

    private Context mContext;
    private List<Info> mInfoList;
    private LinearLayout layoutPhone;

    public InfoListAdapter(Context mContext, List<Info> mInfoList) {
        this.mContext = mContext;
        this.mInfoList = mInfoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, null);
        layoutPhone = (LinearLayout) view.findViewById(R.id.layout_phone);
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

        if (info.getPhoto() > 0) {
            Picasso.with(mContext).load(info.getPhoto())
                    .into(holder.photoView);
        }

        holder.titleView.setText(info.getName());
        holder.streetView.setText(info.getStreet());

        if (info.getPhone() != null) {
            holder.phoneView.setText(info.getPhone());
        } else {
            layoutPhone.setVisibility(View.GONE);

        }
        holder.descriptionView.setText(info.getDescription());
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView titleView;
        protected TextView streetView;
        protected TextView phoneView;
        protected TextView descriptionView;
        protected ImageView photoView;


        public ViewHolder(View view) {
            super(view);
            this.titleView = (TextView) view.findViewById(R.id.name);
            this.streetView = (TextView) view.findViewById(R.id.location);
            this.phoneView = (TextView) view.findViewById(R.id.phone);
            this.descriptionView = (TextView) view.findViewById(R.id.description);
            this.photoView = (ImageView) view.findViewById(R.id.photo_view);
        }
    }
}