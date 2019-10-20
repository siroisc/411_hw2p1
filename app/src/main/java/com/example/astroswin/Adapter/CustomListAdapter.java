package com.example.astroswin.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.astroswin.Model.Student;
import com.example.astroswin.R;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Student> students;

    public CustomListAdapter(Context context, ArrayList<Student> students) {
        this.context = context;
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.layout_list_view_row_items, parent, false);
        }

        Student currentStudent = (Student) getItem(position);
        TextView textViewItemName = (TextView) convertView.findViewById(R.id.text_view_item_name);
        TextView textViewItemDescription = (TextView) convertView.findViewById(R.id.text_view_item_description);

        textViewItemName.setText(currentStudent.getItemName());
        textViewItemDescription.setText(currentStudent.getItemDescription());

        return convertView;
    }

    private class ViewHolder {
        TextView itemName;
        TextView itemDescription;

        public ViewHolder(View view) {
            itemName = (TextView)view.findViewById(R.id.text_view_item_name);
            itemDescription = (TextView) view.findViewById(R.id.text_view_item_description);
        }
    }
}

