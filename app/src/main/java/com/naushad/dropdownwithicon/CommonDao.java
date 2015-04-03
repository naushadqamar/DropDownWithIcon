package com.naushad.dropdownwithicon;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by naushad on 2/11/2015.
 */
public class CommonDao  {

    private Context mContext;
    protected static final String TAG = "NaushadTutorials";
      public CommonDao(Context context) {
        this.mContext = context;

    }
    public  List<SpinnerObject>  getFineTypes(){
        List<SpinnerObject> lstSpinnerObject = new ArrayList<SpinnerObject>();
        SpinnerObject displayValue = new SpinnerObject(-1," نوع المخالفة  ",R.drawable.ic_launcher);
        lstSpinnerObject.add(displayValue);
        lstSpinnerObject.add(displayValue);
        lstSpinnerObject.add(displayValue);
        try
        {
//            this.open();
//            String sql = "SELECT * FROM  ticket_categories";
//            Cursor mCur = mDb.rawQuery(sql, null);
//            if (mCur!=null)
//            {
//                while (mCur.moveToNext()) {
//                    SpinnerObject spinnerObject = new SpinnerObject();
//                    spinnerObject.setSpinValue(mCur.getInt(mCur.getColumnIndex("TIC_CTG")));
//                    spinnerObject.setSpinDisplayText(mCur.getString(mCur.getColumnIndex("CTG_DESC")) + "/" + mCur.getString(mCur.getColumnIndex("CTG_DESC")));
//                    lstSpinnerObject.add(spinnerObject);
//                }
//                mCur.close();
//            }
//
//            this.close();
            return lstSpinnerObject;
        }
        catch (android.database.SQLException mSQLException)
        {
            Log.e(TAG, "CommonDao >>" + mSQLException.toString());
            throw mSQLException;
        }
    }
}
