package org.example.array;

public class basic {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6};

        //array length
        System.out.println(numbers.length);

        //last index
        System.out.println(numbers.length-1);

        //traversal
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        //insert
        int[] numberss =new int[5];
        numberss[0]=100;

        numberss[1]=10;
        numberss[2]=20;

        System.out.println(numberss[0]);

        //search

        int target=4;
        for(int j=0;j<numbers.length;j++){
            if(numbers[j]==target){
                System.out.println("found "+j);
                break;
            }
        }

        //update using search
        int target2=2;
        int newvalue=44;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target2){
                numbers[i]=newvalue;
                break;
            }
        }





    }
}
