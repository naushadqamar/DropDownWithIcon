package com.naushad.dropdownwithicon;
//

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

///**
// * Created by naushad on 2/12/2015.
// */
public class SpinnerWithImageAdapter extends ArrayAdapter<SpinnerObject>{

    String DEFAULT_SPINNER_IMAGE = "ic_launcher";
    Integer defaultResourceId;
    private Context context;
    private List<SpinnerObject> myObjs;
    boolean showImage = false;

    public SpinnerWithImageAdapter(Context context, int textViewResourceId,
                                   List<SpinnerObject> myObjs) {
        super(context, textViewResourceId, myObjs);
        this.context = context;
        this.myObjs = myObjs;
        defaultResourceId = context.getResources().getIdentifier(DEFAULT_SPINNER_IMAGE,  "drawable", context.getPackageName());

    }
    public SpinnerWithImageAdapter(Context context, int textViewResourceId,
                            List<SpinnerObject> myObjs,boolean showImage) {
        super(context, textViewResourceId, myObjs);
        this.context = context;
        this.myObjs = myObjs;
        this.showImage = showImage;
       // if (!showImage)
         defaultResourceId = this.context.getResources().getIdentifier(DEFAULT_SPINNER_IMAGE, "drawable", context.getPackageName());
    }

    public SpinnerWithImageAdapter(Context context, int textViewResourceId,
                                   List<SpinnerObject> myObjs,boolean showImage,boolean showDefaultImage) {
        super(context, textViewResourceId, myObjs);
        this.context = context;
        this.myObjs = myObjs;
        this.showImage = showImage;
        if (!showDefaultImage)
        defaultResourceId =0;// this.context.getResources().getIdentifier(DEFAULT_SPINNER_IMAGE, "drawable", context.getPackageName());
    }

    public int getCount(){
        return myObjs.size();
    }

    public SpinnerObject getItem(int position){
        return myObjs.get(position);
    }

    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView label = new TextView(context);
        label.setText(myObjs.get(position).getSpinDisplayText());
        return label;
    }

    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {
//            TextView label = new TextView(context);
//            label.setText(myObjs.get(position).getSpinDisplayText());
//
//            return label;
        return getCustomView(position,convertView,parent);
    }

    public View getCustomView(int position, View convertView,
                              ViewGroup parent) {
        // TODO Auto-generated method stub
        // return super.getView(position, convertView, parent);

        //LayoutInflater inflater = getLayoutInflater();
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.row, parent, false);
        TextView label = (TextView) row.findViewById(R.id.DisplayText);
        label.setText(myObjs.get(position).getSpinDisplayText());

        ImageView icon = (ImageView) row.findViewById(R.id.icon);
        if (showImage) {
            Integer Img = getResourceId("c" + myObjs.get(position).getSpinValue(), "drawable", context.getPackageName());
            icon.setImageResource(Img);
        }
        else {

       // Integer defaultResourceId = context.getResources().getIdentifier(DEFAULT_SPINNER_IMAGE,  "drawable", context.getPackageName());
        icon.setImageResource(defaultResourceId);
        }
        return row;
    }

    public  Integer getResourceId(String pVariableName, String pResourcename, String pPackageName)
    {
        Integer resourceId =0;// context.getResources().getIdentifier(DEFAULT_SPINNER_IMAGE, pResourcename, pPackageName);
        try {
            resourceId = context.getResources().getIdentifier(pVariableName, pResourcename, pPackageName);
            return resourceId==0?defaultResourceId:resourceId;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}