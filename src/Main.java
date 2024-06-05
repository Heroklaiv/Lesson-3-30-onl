
// Индийский код)))
public class Main {
    public static void main(String[] args) {
        int In = 1250123854;
        int InCopy=In;
        int Mod, min = 9, max = 0,  flag1 = 0, flag2 = 0, flag3 = 0,flag4 = 0, flag5 = 0, flag6 = 0, flag7 = 0, flag8 = 0, flag9 = 0, flag0 = 0, i = 1;
        while(In > 0)
        {
            Mod= In % 10;
            In = (In - Mod) / 10;
            if (min > Mod) min = Mod;
            if (max < Mod) max = Mod;
            System.out.print(Mod);
            switch(Mod){
                case (1): flag1++;break;
                case (2): flag2++;break;
                case (3): flag3++;break;
                case (4): flag4++;break;
                case (5): flag5++;break;
                case (6): flag6++;break;
                case (7): flag7++;break;
                case (8): flag8++;break;
                case (9): flag9++;break;
                case (0): flag0++;break;
            }
        }
        System.out.println(' ');
        System.out.print("MIN = ");
        System.out.println(min);
        System.out.print("MAX = ");
        System.out.println(max);
        if (flag1 > 1 | flag2 > 1 | flag3 > 1 | flag4 > 1 | flag5 > 1 | flag6 > 1 | flag7 > 1 | flag8 > 1 | flag9 > 1 | flag0 > 1)
            System.out.println("TRUE");
        else System.out.println("FALSE");
        while(InCopy > 0)
        {
            Mod = InCopy % 10;
            InCopy = (InCopy - Mod) / 10;
            if ((Mod == (InCopy % 10+1)) && InCopy>=1){
                if (i>0)System.out.print(Mod);
                if (InCopy % 10 < 10 && InCopy>=1) System.out.print(InCopy % 10);
                i = 0;
            } else {
                if (i<1)System.out.println(' ');
                i++;
            }

        }
    }
}
