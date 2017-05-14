package java;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by AnLu on
 * 2017/5/13 08:36.
 * Question
 */
// 使用多线程同时下载以下两个视频
//https://gifshow-static.download.ks-cdn.com/video/home-1.mp4
//https://gifshow-static.download.ks-cdn.com/video/home-2.mp4
    public class Thread8{
        private static final String M1_URL = "https://gifshow-static.download.ks-cdn.com/video/home-1.mp4";
        private static final String M2_URL = "https://gifshow-static.download.ks-cdn.com/video/home-2.mp4";

        public static void main(String[] args) {

            Thread thread1 = new Thread(new M1(), "thread1");
            Thread thread2 = new Thread(new M2(), "thread2");
            thread1.start();
            thread2.start();

        }

   static class M1 implements Runnable{

        @Override
        public void run() {
            try {
                URL url = new URL(M1_URL);
                try (
                        InputStream inputStream = url.openStream();
                        OutputStream outputStream1=new FileOutputStream("mv1.mp4");
                ) {
                    int i;
                    while ((i = inputStream.read()) != -1) {
                        outputStream1.write(i);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
        }
            }
        }
    }
    class M2 implements Runnable{
        @Override
        public void run() {
//            try {
////                URL url = new URL(M2_URL);
//                try (
////                        InputStream inputStream = url.openStream();
//                        OutputStream outputStream2=new FileOutputStream("mv2.mp4")                ) {
//                    int i;
//                    while ((i = inputStream.read()) != -1) {
//                        outputStream2.write(i);
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
