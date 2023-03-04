public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    public boolean push(int val){
        if(this.isFull()){
            //Double the array size
            int[] temp = new int[data.length*2];
            // copy the data of previous array into new array
            for(int i=0; i< data.length; i++){
                temp[i] = data[i];
            }
            // make new array as a permanent array
            data = temp;
        }
        // calling the push method of CustomStack (i.e inserting the value)
        return super.push(val);
    }
}
