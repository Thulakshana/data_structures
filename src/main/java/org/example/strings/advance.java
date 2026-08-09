package org.example.strings;

public class advance {
    public static void main(String[] args) {
        String text="my name is thulakshana";

        //travel
        for(int i=0;i<text.length();i++){
            System.out.println(text.charAt(i));
        }

        int count=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);

        //reverse
        String school="buluwala";
        String reverse="";
        for(int i=0;i<school.length()-1;i++){
            reverse=reverse+school.charAt(i);
        }
        System.out.println(reverse);

        //palindrom
        String str2="madam";
        String rev="";
        for(int i=0;i< str2.length()-1;i++){
            rev=rev+str2.charAt(i);
        }
        if(str2.equals(rev)){
            System.out.println("that is plaindrom");
        }else{
            System.out.println("that is nt palindrom");
        }

        //count unique charactres
        String fruit="banana";
        int [] arr=new int[256]; //asci values strore karanna 256 ganne
        for(int i=0;i<fruit.length();i++){
            char ch=fruit.charAt(i);
            arr[ch]++; //arry ekat danawa i and ingrement karanawa
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println((char)i+" "+arr[i]);
            }
        }

    }
}
