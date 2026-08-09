package org.example.array;

import java.util.Arrays;

public class advance {
    public static void main(String[] args) {
        int[] numbers={12,34,45,67,78,32,121};

        int max=numbers[0];

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("max is "+max);

        ///////////////////////////////////////

        //find minimum
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("min "+min);

        ////////////////////////////////////////////

        //find sum
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println("sum is "+sum);


        ////////////////////////////////////////////

        //reverse array
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int temp=numbers[left];
            numbers[left]=numbers[right];
            numbers[right]=temp;

            left++;
            right--;
        }

        //find duplicates
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    System.out.println("duplicates "+numbers[i]);
                }
            }
        }

        //rotate array
        int last=numbers[numbers.length-1];
        for(int i=numbers.length-1;i>0;i--){
            numbers[i]=numbers[i-1];
        }
        numbers[0]=last;

        //two sum
        int target=46;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    System.out.println(i +"and"+j);
                }
            }
        }

        //merge array
        int[] a={1,2,3};
        int[] b={4,5,6};

        int[]marge=new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            marge[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            marge[a.length+i]=b[i];
        }

        System.out.println(Arrays.toString(marge));


    }
}
