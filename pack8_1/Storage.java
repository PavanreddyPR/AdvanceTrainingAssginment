package pack8_1;

import java.lang.Runnable;

public class Storage 
{
	int  i;
    boolean printed = true;
    public void setValue(int i){
          this.i = i;
    }
    public int getValue(){
          return this.i;
    }
    public boolean isPrinted() {
          return printed;
    }
    public void setPrinted(boolean p) {
          printed = p;
    }

}