package ru.banana.textquest;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Quest_Adapter extends ArrayAdapter {

    public Quest_Adapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);

    }

    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        // создаём элемент для машинки с фотографией и двумя полями

        View view = LayoutInflater.from(getContext()).inflate(R.layout.text_layout, parent, false);



        Action action = (Action) getItem(position);


        TextView textView = (TextView) view.findViewById (R.id.textovoe_pole);
                textView.setText(action.описание);

        ImageView imageView = (ImageView) view.findViewById (R.id.imageView);
        Picasso.with(getContext()).load("http://www.alliphonewallpapers.com/images/wallpapers/640/ovqg47oih.jpg").fit().into(imageView);



        return view;
    }

//

}



