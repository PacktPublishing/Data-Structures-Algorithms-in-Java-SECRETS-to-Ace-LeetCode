package Stacks;

public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super(); // calls the constructor of superclass i.e CustomStack()
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item){
        if (this.isFull()){
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i=0; i< data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        // insert item
        return super.push(item);
    }
}
