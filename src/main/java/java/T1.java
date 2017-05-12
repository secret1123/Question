package java;

import java.util.Scanner;

/**
 * Created by AnLu on
 * 2017/5/6 14:51.
 * JavaSE_20171
 */
//利用 switch 语句将学生成绩分级,当从键盘中输入学生成绩在 100~90 范围时,
//        输出“优 秀”,在 89~80 范围时输出“良好”,在 79~70 范围时输出“中等”,
//        在 69~60 范围时输出 “及格”,在 59~0 范围时输出“不及格”,
//        在其他范围时输出“成绩输入有误!”。
public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input : ");
        String s = scanner.nextLine();
        int i = Integer.parseInt(s);

        switch (s) {
            case "90-100":
                System.out.println("优秀");
                break;

            case "89-80":
                System.out.println("良好");
                break;

            case "79-70":
                System.out.println("中等");
                break;

            case "69-60":
                System.out.println("及格");
                break;

            case "59-0":
                System.out.println("不及格");
                break;
        }

        if (i >= 90) {
            System.out.println("优秀");
        } else if (i <= 89 && i >= 80) {
            System.out.println("良好");
        } else if (i <= 79 && i >= 70) {
            System.out.println("中等");
        } else if (i <= 69 && i >= 60) {
            System.out.println("及格");
        } else if (i <= 59 && i >= 0) {
            System.out.println("不及格");
        } else {
            System.out.println("输入有误");
        }
    }
}
