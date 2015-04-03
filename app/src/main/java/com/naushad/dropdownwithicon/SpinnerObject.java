package com.naushad.dropdownwithicon;

/**
 * Created by naushad on 2/11/2015.
 */
public class SpinnerObject {

    private  int spinValue;
    private String spinDisplayText;
    private Integer spinIcon;
    public SpinnerObject (){}
    public SpinnerObject ( int spinValue, String spinDisplayText) {
        this.spinValue = spinValue;
        this.spinDisplayText = spinDisplayText;
    }

    public SpinnerObject ( int spinValue, String spinDisplayText,Integer spinIcon) {
        this.spinValue = spinValue;
        this.spinDisplayText = spinDisplayText;
        this.spinIcon = spinIcon;
    }

    public void setSpinValue(int spinValue) {
        this.spinValue = spinValue;
    }

    public void setSpinDisplayText(String spinDisplayText) {
        this.spinDisplayText = spinDisplayText;
    }

    public int getSpinValue() {
        return spinValue;
    }

    public String getSpinDisplayText() {
        return spinDisplayText;
    }

    @Override
    public String toString () {
        return spinDisplayText;
    }

    public Integer getSpinIcon() {
        return spinIcon;
    }

    public void setSpinIcon(Integer spinIcon) {
        this.spinIcon = spinIcon;
    }
}