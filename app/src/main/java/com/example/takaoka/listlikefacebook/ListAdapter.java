package com.example.takaoka.listlikefacebook;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by takaoka on 2016/04/24.
 */
public class ListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private final List<Post> items = new ArrayList<>();

    public ListAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.list_row, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Post post = getItem(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.titleTextView.setText(post.getTitle());
        viewHolder.descriptionTextView.setText(post.getDescription());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public Post getItem(int position) {
        return items.get(position);
    }

    public void addAll(@NonNull Collection<Post> items) {
        final int positionStart = this.items.size();
        this.items.addAll(items);
        notifyItemRangeInserted(positionStart, items.size());
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView titleTextView;

        private TextView descriptionTextView;

        public ViewHolder(View view) {
            super(view);
            titleTextView = (TextView) view.findViewById(R.id.title_text_view);
            descriptionTextView = (TextView) view.findViewById(R.id.description_text_view);
        }
    }
}
