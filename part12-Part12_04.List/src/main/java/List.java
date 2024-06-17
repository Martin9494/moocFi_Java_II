// Class List generic type (What Type is will be dependent of the instance)
public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    public List(){
        //values starts with space for 10 objects (0-9)
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value){
        if(this.firstFreeIndex == this.values.length){
            grow();
        }
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    public void grow(){
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int idx = 0; idx < this.values.length; idx++) {
            newValues[idx] = this.values[idx];
            
        }

        this.values = newValues;
    }

    public boolean contains(Type value){
        return indexOfValue(value) >= 0;
    }

    public  int indexOfValue(Type value){
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if(this.values[i].equals(value)){
                return i;
            }
        }
        return -1;
    }    

    private void moveToTheLeft(int fromIndex){
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i+1];
        }
    }

    public void remove(Type value){
        int indexOfValue = indexOfValue(value);
        if(indexOfValue < 0){
            return;
        }
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public Type value(int index){
        if(index < 0   || index >= this.firstFreeIndex){
            throw new ArrayIndexOutOfBoundsException("Index " +index+" should be  [higher than 0 and smaller than "+ this.firstFreeIndex+"]");
        }

        return this.values[index];
        
    }

    public int size(){
        return this.firstFreeIndex;
    }
}
