package java;

/**
 * Created by AnLu on
 * 2017/3/28 10:03.
 * JavaSE_20171
 */
public class Games {

    private static final String[] COLORS = {"a","b","c","d"};

    public static void main(String[] args) {
        String[][] strings= new String[10][10];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] =COLORS[(int)(Math.random()*4)];

                System.out.print(strings[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
