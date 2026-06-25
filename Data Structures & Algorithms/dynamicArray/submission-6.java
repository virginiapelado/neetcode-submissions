class DynamicArray {

    private int[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity){
            // need to resize, will implement later
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        // assuming the array is not empty:
        int value = arr[length - 1];
        length--;
        return value;
    }

    private void resize() {
        // 1. double capacity
        capacity *= 2;
        // 2. create new array with new capaciy
        int[] newArr = new int[capacity];
        // 3. copy all existing elements from old array to new one
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
