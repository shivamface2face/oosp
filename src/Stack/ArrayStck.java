package Stack;

public class ArrayStck {
    public static void main(String[] args) {
MyStack s=new MyStack(5);
 s.push(12);
 s.push(23);


    }
}

class MyStack{
    int arr[];
    int cap;
    int top;

    MyStack (int c){
        top=-1;
        cap=c;
        arr=new int[cap];
    }

     void push(int x){
        top++;
        arr[top]=x;
    }

    int size(){
        return top+1;
    }
    int pop(){
        int res=arr[top-1];
        top--;
        return  res;
    }
  boolean   isEmplty(){
         if(top==-1)return  true;
         return  false;
    }

}
