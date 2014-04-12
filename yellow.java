package l1;

import lejos.nxt.*;


public class SimpleColorTest
{   
 

    public static void main(String [] args) 
    {
    	 int yellowID=3;
    	 while (!Button.ESCAPE.isDown()){
       ColorSensor cs = new ColorSensor(SensorPort.S1);
        
        MotorPort.C.controlMotor(65,1); 
        MotorPort.B.controlMotor(65, 1); 
        
        int readColor=cs.getColorID();
        if (readColor==yellowID)
        {
          Sound.twoBeeps();
          
        }
        
    }
    	 
    } 	 
}
