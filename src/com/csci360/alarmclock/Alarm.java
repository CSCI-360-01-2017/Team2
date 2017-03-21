package com.csci360.alarmclock;

public class Alarm {
    private int hour;
    private int minute;
    private boolean radio;
    private String mid;
    public boolean isActivated = false;
    
    public Alarm(String mid, int hour, int minute, boolean radio) {
    	this.mid = mid;
    	this.hour = hour;
    	this.minute = minute;
    	this.radio = radio;
    }
    public void checkMinutes(int n) {
    	if(n >= 60) {
    		this.hour += 1;
    		this.minute = n % 60;
    	} else {
    		this.minute = n;
    	}
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public String getType() {
        if(radio == true) {
            return "Radio";
        }
        return "Buzzer";
    }
    public void setHour(int n) {
        hour = n;
    }
    public void setMinute(int n) {
    	checkMinutes(n);
    }
    public void snooze(){
    	this.minute += 10;
    	this.isActivated = false;
    }
    public void deactivate(){
    	this.isActivated = false;
    }
    public void setType(boolean b) {
        if(b == true) {
            radio = true;
        } else {
        	radio = false;
        }
    }
    public String displayTime(int n) {
        if(n < 10) {
            return "0" + n;
        }
        return "" + n;
    }
    public String getAlarm() {
        return displayTime(hour) + ":" + displayTime(minute) + " " + mid;
    }
    public boolean checkTime(String time) {
        if(time.compareTo(getAlarm()) != 0) {
            return false;
        }
        return true;
    }
    public void activate() {
    	if(radio == true) {
    		System.out.println("Radio alarm activated!");
    		Radio radio = new Radio();
    		System.out.println(radio.freq + " " + radio.vol);
    	} else {
    		System.out.println("Buzzer is activated!");
    	}
    	this.isActivated = true;
    }
    public String toString() {
    	return getAlarm() + ", Type: " + getType();
    }
/*    public static void main(String[] args) {
        Alarm a = new Alarm("A.M.", 4, 25, true);
        
        System.out.println(a.getAlarm());
    }  */    

}