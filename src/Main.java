public class Main {
    public static void main(String args[]){
        StackList st = new StackList<String>();

        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        for(int i=0; i<6; i++){
            System.out.println(st.pop());
        }
    }
}
