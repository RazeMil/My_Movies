package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<movieItem> movieList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<movieItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvName = rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenre);
        ImageView ivRate = rowView.findViewById(R.id.imageViewRate);
        movieItem currentItem = movieList.get(position);

        String name = currentItem.getTitle();
        String year = currentItem.getYear();
        String genre = currentItem.getGenre();

        tvName.setText(name);
        tvYear.setText(year);
        tvGenre.setText(genre);

        if(currentItem.getRated().equals("g")) {
            ivRate.setImageResource(R.drawable.rating_g);
        }
        else if ( currentItem.getRated().equals("pg")) {
            ivRate.setImageResource(R.drawable.rating_pg);
        }else if ( currentItem.getRated().equals("pg13")) {
            ivRate.setImageResource(R.drawable.rating_pg13);
        }else if ( currentItem.getRated().equals("nc16")) {
            ivRate.setImageResource(R.drawable.rating_nc16);
        }else if ( currentItem.getRated().equals("m18")) {
            ivRate.setImageResource(R.drawable.rating_m18);
        }else if ( currentItem.getRated().equals("r21")) {
            ivRate.setImageResource(R.drawable.rating_r21);
        }


        return rowView;
    }
}
