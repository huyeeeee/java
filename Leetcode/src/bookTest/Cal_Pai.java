package bookTest;

public class Cal_Pai {
    public double calPai(long num){
        double PI = 0;
        long count = 1;
        while (count < num){
            if (count % 2  == 1)
                PI += 1.0 / (count * 2 - 1);
            else
                PI -= 1.0 / (count * 2 - 1);
            count ++;
        }

        return 4 * PI;
    }

    public static void main(String[] args){
        Cal_Pai cal_pai = new Cal_Pai();
        System.out.println(cal_pai.calPai(1));
        System.out.println(cal_pai.calPai(10));
        System.out.println(cal_pai.calPai(100));
        System.out.println(cal_pai.calPai(1000));
        System.out.println(cal_pai.calPai(1000));
        System.out.println(cal_pai.calPai(10000));
        System.out.println(cal_pai.calPai(100000));
        System.out.println(cal_pai.calPai(1000000));
        System.out.println(cal_pai.calPai(10000000));
        System.out.println(cal_pai.calPai(Long.MAX_VALUE));
    }
}
