package Predavanja.Clas4;

public class Stack {
    private Object[] object;
    private int top;
    private int load;

    public Stack(int load){
        top = -1;
        this.load = load;
        object = new Object[load];
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else return false;
    }

    public boolean isFull(){
        if(top == load-1){
            return true;
        }
        else return false;
    }

    public void push(Object obj){
        object[++top] = obj;
    }

    public Object top(){
        return object[top];
    }

    public void pop(){
        top--;
    }

}
