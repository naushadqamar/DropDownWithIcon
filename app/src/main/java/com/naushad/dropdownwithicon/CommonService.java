package com.naushad.dropdownwithicon;

import android.content.Context;

import java.util.List;

/**
 * Created by naushad on 2/11/2015.
 */
public class CommonService {
    Context context;
    public CommonService(Context context)
    {
        this.context = context;
    }

    public List<SpinnerObject> getFineTypes(){

        CommonDao commonDao = new CommonDao(context);
        return  commonDao.getFineTypes();
    }

   }
