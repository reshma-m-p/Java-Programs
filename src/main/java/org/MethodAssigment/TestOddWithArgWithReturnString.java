package org.MethodAssigment;

public class TestOddWithArgWithReturnString {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 50 and 100 using string...");
       // TestOddWithArgWithReturn obj = new TestOddWithArgWithReturn();
        System.out.println(getOddNumbers(50, 100));
    }

    public static String getOddNumbers(int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                result = result + " "+i;
            }
        }
        return result;
    }
}
//
//public String displayOddNumbers3(int start, int end) {
//
//    System.out.println("Method 3: With arguments, With return");
//
//    String result = "";
//
//    for (int i = start; i <= end; i++) {
//
//        if (i % 2 != 0) {
//
//            result = result + i + " ";
//
//        }
//
//    }
//
//    return result;
//
//}