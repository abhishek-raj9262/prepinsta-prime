package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Practice {
    private int num;
    private int deno;

    public Practice(int num,int deno){
        this.num=num;
        if (deno == 0){
            return;
        }
        this.deno= deno;
        simplify();
    }

    public int getDeno() {
        return deno;
    }

    public int getNum() {
        return num;
    }

    private void simplify() {
        int gcd = 1;
        int min =  Math.min(num,deno);
        for (int i = 2; i <= min ; i++) {
            if (num % i == 0 && deno % i ==0){
                gcd = i;

            }
        }
        num = num / gcd;
        deno = deno/gcd;
    }


}





