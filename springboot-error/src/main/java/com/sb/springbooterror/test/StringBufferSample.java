package com.sb.springbooterror.test;
public class StringBufferSample {
    /*
     * String与StringBuffer的性能区别?
 
         
        然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
        然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间
     */
    public static void main(String[] args) {
        useString();
        useStringBuffer();
    }
    /**
     * 先使用String的+,连接10000个随机字符串,计算消耗的时间
     */
    public static void useStringBuffer() {
        long start = System.currentTimeMillis();
        StringBuffer useStringbuffer = new StringBuffer();
        for(int i = 1;i<=10000;i++) {
            useStringbuffer.append(generatString());
        }
        long end = System.currentTimeMillis();
        System.out.println("运用StringBuffer耗时："+(end-start));
    }
    /**
     * 先使用String的+,连接10000个随机字符串,计算消耗的时间
     */
    public static void useString() {
        long start = System.currentTimeMillis();
        String useStrings = "";
        for(int i = 1;i<=10000;i++) {
            useStrings+=generatString();
        }
        long end = System.currentTimeMillis();
        System.out.println("运用String耗时："+(end-start));
    }
    /**
     * 生成10位长度的随机字符串
     * @return 10位长度的字符串
     */
    public static String generatString() {
        char[] chars = new char[10];
        for (int i = 0; i < chars.length; ) {
            char ch = (char)(Math.random()*130);
            if(Character.isDigit(ch)||Character.isLetter(ch)) {
                chars[i] = ch;
                i++;
            }
        }
        return new String(chars);
    }
}