package com.csci360.alarmclock;

public class Clock{
    private int sec = 55;
    private int min = 10;
    private int hour = 2;
    private String mid = "P.M.";
    
    public Clock(){
    	Alarm alarm = new Alarm("P.M.", 2, 11, true);
    	Alarm secondAlarm = new Alarm("P.M.", 2, 12, false);
    	run(alarm, secondAlarm);
    }
    public void run(Alarm alarm1, Alarm alarm2){
        while(hour>=0 && hour<=12)
        {
            while(min>=0 && min<60)
            {
                while(sec>=0 && sec<60)
                {            	
                	String sSec = String.format("%02d", sec);
                	String sMin = String.format("%02d", min);
                	String sHour = String.format("%02d", hour);
                	
                    System.out.println(sHour+":"+ sMin +":"+sSec+ " "+mid);
                    try{Thread.sleep(1000);}
                    catch(Exception e){}
                    for(int i=0;i<100;i++)
                    {
                        System.out.println("");
                    }
                    sec+=1;
                }
                if(sec== 60){
                	sec = 0;
                }
                min+=1;
                if ( hour == 11 && min == 60){
                	int change = mid.compareTo("A.M.");
                	if(change == 0){
                		mid = "P.M.";
                	}
                	else{
                		mid = "A.M.";
                	}
                }
                if ( hour == 12 && min == 60){
                	hour = 1;
                }
                String str = String.format("%02d", hour) +":"+String.format("%02d", min) + " " + mid;
                int compare = str.compareTo(alarm1.getAlarm());
                int compare2 = str.compareTo(alarm2.getAlarm());
                if(compare == 0){
                	alarm1.activate();
                }
                if(compare2 == 0){
                	alarm2.activate();
                }
                while(alarm1.isActivated == true){
                	alarm1.activate();
                    try{Thread.sleep(1000);}
                    catch(Exception e){}
                    //alarm1.snooze();
                    //alarm1.deactivate();
                }
                while(alarm2.isActivated == true){
                	alarm2.activate();
                    try{Thread.sleep(1000);}
                    catch(Exception e){}
                    //alarm2.snooze();
                    //alarm2.deactivate();
                }
            }
            if(min== 60){
            	min = 0;
            }
            hour+=1;
        }
    }
    public void setHour(int h){
    	hour = h;
    }
    public int getHour(){
    	return hour;
    }
    public void setMinutes(int m){
    	min = m;
    }
    public int getMin(){
    	return min;
    } 
    public void setSeconds(int s){
    	sec = s;
    }   
    public int getSec(){
    	return sec;
    }   
    public String getAPM(){
    	return mid;
    }
    public void setmid(String m){
    	String string = m.toLowerCase();
    	int am1 = string.compareTo("am");
    	int am2 = string.compareTo("a.m.");
    	int pm1 = string.compareTo("pm");
    	int pm2 = string.compareTo("p.m.");
    	if(am1 == 0 || am2 == 0){
    		mid = "A.M.";
    	}
    	if(pm1 == 0 || pm2 == 0){
    		mid = "P.M.";
    	}
    }  
    public String getTime(){
    	String sMin = String.format("%02d", min);
    	String sHour = String.format("%02d", hour);
    	
        return (sHour + ":" + sMin + " " + mid);
    }  
    public static void main(String args[])
    {
    	Clock clock = new Clock();
    }
}

