import java.util.ArrayDeque;
import java.util.ArrayList;

public class StackDSA {
    static class MyStack{
        int[] arr;
        int cap;
        int top;
        MyStack(int c){
            top=-1;
            cap=c;
            arr=new int [cap];

        }

        void push(int x){
            if(top==cap-1){System.out.println("Stack is full");return;}
            top++;
            arr[top]=x;
        }

        int pop(){
            if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
            int res=arr[top];
            top--;
            return res;
        }

        int peek(){
            if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
            return arr[top];
        }

        int size(){
            return (top+1);
        }

        boolean isEmpty(){
            return top==-1;
        }
    }
    static class MyStack1{

        ArrayList<Integer> al=new ArrayList<>();
        void push(int x){
            al.add(x);
        }

        int pop(){
            int res=al.get(al.size()-1);
            al.remove(al.size()-1);
            return res;
        }

        int peek(){
            return al.get(al.size()-1);
        }

        int size(){
            return al.size();
        }

        boolean isEmpty(){
            return al.isEmpty();
        }
    }

    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    static class MyStack2{
        Node head;
        int sz;
        MyStack2(){
            head=null;
            sz=0;
        }

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            sz++;
        }

        int pop(){
            if(head==null){return Integer.MAX_VALUE;}
            int res=head.data;
            Node temp=head;
            head=head.next;
            sz--;
            return res;
        }

        int peek(){
            if(head==null){return Integer.MAX_VALUE;}
            return head.data;
        }

        int size(){
            return sz;
        }

        boolean isEmpty(){
            return head==null;
        }
    }

    public static void main (String[] args)
    {
        MyStack s=new MyStack(5);
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

        MyStack1 s1=new MyStack1();
        s1.push(5);
        s1.push(10);
        s1.push(20);
        System.out.println(s1.pop());
        System.out.println(s1.size());
        System.out.println(s1.peek());
        System.out.println(s1.isEmpty());

        MyStack2 s2=new MyStack2();
        s2.push(5);
        s2.push(10);
        s2.push(20);
        System.out.println(s2.pop());
        System.out.println(s2.size());
        System.out.println(s2.peek());
        System.out.println(s2.isEmpty());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
