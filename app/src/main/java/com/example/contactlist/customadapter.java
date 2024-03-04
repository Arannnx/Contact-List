package com.example.contactlist;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class customadapter extends BaseAdapter {

    private String ContactList[];

    private int contactss[];

    Context context;

    public customadapter(String[] contactList, int[] contactss, Context context) {
        this.ContactList = contactList;
        this.contactss = contactss;
        this.context = context;

    }


    @Override
    public int getCount() {

        return ContactList.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parents) {

        LayoutInflater layoutInflater = (LayoutInflater) parents.getContext().getSystemService((Context.LAYOUT_INFLATER_SERVICE));
        View view = layoutInflater.inflate(R.layout.activity_list_view, null);

        ImageView image = (ImageView) view.findViewById(R.id.prof1);
        TextView text_contactss = (TextView)view.findViewById(R.id.text_data);

        image.setImageResource(contactss[position]);
        text_contactss.setText(ContactList[position]);

        return view;
    }
}
