package java;

import java.io.*;
import java.util.Random;

/**
 * Created by AnLu on
 * 2017/4/22 09:44.
 * JavaSE_20171
 */
public class Test4 {
    public static void main(String[] args) throws Exception{
        Random r = new Random();
             File file = new File("a.txt");
             FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < 5000; i++) {
                bw.write((r.nextInt(9999)+1)+"");
                bw.newLine();
                bw.flush();
                bw.flush();
            }
            bw.close();
            fw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            int index = 0;
            int a[] =new int[5000];
            while ((s=br.readLine())!=null){
                System.out.println(s);
                a[index] =Integer.valueOf(s);
                index++;
        }
        System.out.println("最大值："+GetMax(a));
            br.close();
            fr.close();
    }
    public static int GetMax(int[]a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
