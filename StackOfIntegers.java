public class StackOfIntegers {
    private int elements[];
    private int size;

    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int capacity){
       this.elements = new int[capacity];
       this.size = 0;
    }

    public boolean empty(){
       if(size==0){
           return true;
       }
       else{
           return false;
       }
    }

    public int peek(){
       return elements[size-1];
    }

    public void push(int value){
        elements[size] = value;
        size++;
    }

    public int pop(){
       int pop = elements[size-1]; 
       int temp[];
       temp = new int[16];
       int i;
       for(i=0; i<size-1; i++){
           temp[i] = elements[i];
       }
       elements = temp;
       size--;
       return pop;
    }

    public int getSize(){
        return size;
    }


}
