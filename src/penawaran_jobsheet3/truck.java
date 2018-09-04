/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penawaran_jobsheet3;

/**
 *
 * @author SMK TELKOM
 */
public class truck {
    public int cadence;
    public int gear;
    public int speed;
    
    public truck (int startcadence, int startspeed, int startgear){
    gear = startgear;
    cadence = startcadence;
    speed = startspeed;
    }
    
    public void setgear(int newvalue){
    gear = newvalue;
    }
    
    public void applybrake(int decrement){//mengurangi
    speed = decrement;
    }
    
    public void speedup(int increment){//menambah
    speed = increment;
    }


}
