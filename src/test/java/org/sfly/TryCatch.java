package org.sfly;

import org.testng.annotations.Test;

public class TryCatch {
    @Test
    public void tryCatch(){
        try{
            int abc = 10/0;   // This gives Arithmetic Exception
            //System.out.println(abc);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }

        System.out.println("Program execution continues");
    }
}
