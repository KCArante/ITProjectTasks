package com.kcarante.app.itproject.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.kcarante.app.itproject.Constructor.Project;
import com.kcarante.app.itproject.R;

import java.util.ArrayList;

/**
 * Created by SARJ on 8/5/2016.
 */
public class GridView extends ArrayAdapter<Project> {

    private Context context;
    private int resource;
    private ArrayList<Project> objects;

    public GridView(Context context, int resource, ArrayList<Project> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Project project = getItem(position);

        if(convertView == null){

            convertView = LayoutInflater.from(context).inflate(resource, parent, false);
            ImageView mImage = (ImageView) convertView.findViewById(R.id.image);
            TextView mProject= (TextView) convertView.findViewById(R.id.project);
            TextView mNeed = (TextView) convertView.findViewById(R.id.need);
            TextView mInvested = (TextView) convertView.findViewById(R.id.invested);
            ProgressBar mProgress = (ProgressBar) convertView.findViewById(R.id.progress);

            mProgress.setVisibility(convertView.VISIBLE);
            mImage.setImageResource(project.getLogo());
            mProject.setText(project.getName());
            mNeed.setText(project.getNeeded_fund()+"");
            mInvested.setText(project.getReceived_funds()+"");
            mProgress.setProgress(project.getProgress());
        }

        return convertView;
    }

}
