package plus.demo.com.pickzy_interview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import plus.demo.com.pickzy_interview.Bean.Content;
import plus.demo.com.pickzy_interview.startup.R;


/**
 * Created by VPS on 02-01-2018.
 */

public class PickzyAdapter extends RecyclerView.Adapter<PickzyAdapter.MyViewHolder> {
    List<Content> contents;
    Context context;

    public PickzyAdapter(Context context, List<Content> contents) {
        this.context = context;
        this.contents = contents;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.pickzydata, parent, false);
            return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Content item = contents.get(position);
        String name = item.getName();
        holder.name.setText(item.getName());
        Picasso.with(context).load(item.getURL()).into(holder.url);

    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView url;
        public TextView name;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            url = (ImageView) itemView.findViewById(R.id.img_url);
        }
    }
}
