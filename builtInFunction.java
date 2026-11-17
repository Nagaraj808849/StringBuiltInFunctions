class BuiltInFunction1 {
    public static void Demo(){
        String str = "Nagaraj";
        System.out.println(str);
       char[] ch= str.toCharArray();
       for(int c:ch)
       {
        System.out.println((char)c);
       }
    }

    public static void DemoEquals(){
        String str1 = "Nagaraj";
        String str2 = "ramesh";
        String str3 = "Nagaraj";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }

     public static void DemoEqualsIgnoreCase(){
        String str1 = "Nagaraj";
        String str2 = "Nagaraj";
        String str3 = "nagAraj";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
    }
     // compareto- compare to lexicographically
     //return 0 if string is equal
     //compare based on the unicode values
     //syntax str1.compare(str2)
    public static void compareStrings(){
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Appl";
        String str4= "Apple";

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str4));
    }
    // compare to ignore case sensitive
    public static void compareStringsIgnoreCasesensitive(){
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "appl";
        String str4= "Apple";

        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println(str1.compareToIgnoreCase(str4));
    }

    public static void main(String[] args) {
        //DemoEquals();
       // DemoEqualsIgnoreCase();
       //compareStrings();
       compareStringsIgnoreCasesensitive();
    }

}