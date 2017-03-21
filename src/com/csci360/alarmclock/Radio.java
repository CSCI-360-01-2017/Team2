package com.csci360.alarmclock;

import java.text.DecimalFormat;

public class Radio {
	public double freq;
	public int vol;
	
	public Radio() {
        this.freq = 50;
        this.vol = 50;
    }
	
	public Radio(double freq, int vol) {
	        this.freq = freq;
	        this.vol = vol;
	    }
	
	public void setFreq(double freq) {
		if (freq <= 107.9 && freq >= 88.1){
			DecimalFormat format = new DecimalFormat("#.0");
	        this.freq = Double.parseDouble(format.format(freq));
	    }            
	}
	
	public void setVol(int vol) {
	    if (vol <= 100 && vol >= 0){
	        this.vol = vol;
	    }
	}
}