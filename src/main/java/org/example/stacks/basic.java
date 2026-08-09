package org.example.stacks;

public class basic {

    //stack is last in first out
    //create stack

    static class mystack{
        int[]stack;
        int top;

        mystack(int size){
            stack=new int[size];
            top=-1;
        }
    ////////////////////////////////////////////////////////////////////////////////////////////
    /// insert data
        void push(int value){
            if(top==stack.length-1){
                System.out.println("stack overflow"); //stack eka full
                return;
            }
            top++;
            stack[top]=value;
        }
        /////////////////////////////////////////////////////////////////////////////////////
        /// get data
        int pop(){
            if(top==-1){
                System.out.println("stack underflow"); //stack eka empty
                return -1;
            }
            int value=stack[top];
            top--;
            return value;
        }
        /////////////////////////////////////////////////////////////////////////////////////
        //get peek = top value eka ain karanne nathuwa balaganna
        int peek(){
            if(top==-1){
                System.out.println("stack is empty");
                return -1;
            }
            return stack[top];
        }
        /////////////////////////////////////////////////////////////////////
        //is empty
        boolean isempty(){
            return top==-1;
        }



    }

    public static void main(String[] args) {
        mystack obj=new mystack(5);

        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.isempty());


    }
}
