public class StackArray {
    private int[] arr;
    private int top = -1;

    StackArray(int size){
        arr=new int[size];
    }

    public int pop(){
        if(top==-1){
            System.out.println("empty");
            throw new NullPointerException("this is empty");
        }else{
            int temp = arr[top];
            top--;
            return temp;
        }

    }

    public void push(int da){
        if(top==arr.length-1){
            throw new NullPointerException("its full");
        }else
        {
            top++;
            arr[top]=da;
        }
    }

    public boolean isFull(){
        return top==arr.length-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

}
