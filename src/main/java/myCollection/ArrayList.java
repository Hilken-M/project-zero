package myCollection;

public class ArrayList<G> {

    // Will store objects in an array
    Object[] arrayList;

    public int length;


    public static void main(String[] args) {

    }

    public ArrayList() {
        arrayList = new Object[0];
        length = 0;
    }

    public void add(Object x) {

        if (this.arrayList.length == this.length) {
            // If true, make array bigger ++
            this.embiggen();
        }
        this.arrayList[this.length] = x;
        this.length++;
    }

    //a method that can return a boolean determining if your array list contains a certain item
    public boolean compareElement(Object j){
        for (Object i : arrayList){
            if(i.equals(j)){
            return true;
            }
        }
        return false;
    }

    private void embiggen() {
        Object[] temp = new Object[this.arrayList.length + 1];
        for (int i = 0; i < arrayList.length; i++) {
            temp[i] = arrayList[i];
        }
        arrayList = temp;
    }

    //Checks to see if both arrays have the same length
    //Checks to see if each element at a determined index matches the same index in the second array
    public boolean equals(ArrayList<G> temp) {
        if(temp.arrayList.length != arrayList.length){
            return false;
        }
        for (int i = 0; i < arrayList.length; i++) {
            if(!arrayList[i].equals(temp.arrayList[i])){
                return false;
            }
        }
        return true;
    }

    public boolean contains(Object x) {
        for (Object o : arrayList) {
            if (o.equals(x)) return true;
        }
        return false;
    }

    public String toString() {
        String temp = new String();
        for (int i = 0; i < arrayList.length; i++) {
            temp += arrayList[i].toString() + ",";
        }
        return temp.substring(0, temp.length() - 1);
    }


    public int returnIndex(Object p) {
       var index = -1;
        for(var i = 0; i < arrayList.length; i++) {
            if(arrayList[i].equals(p)) {
                return i;
            }
           }
        return -1;
    }

    public Object getIndex(int i){
        if(i >= this.length || i < 0){
            return null;
        }
        return arrayList[i];
    }

}

//Day 1:
//variables needed:
//Array of something;
//The current amount of somethings;

//Constructor that creates an initial array of some size;

//Get method that returns the something of a given index;

//Add method
//First, check that the arraylist will not break if we try to add at the next index:
//IE, check if the current amount of somethings+1 is not greater that the array size
//if it is greater:
//    Copy the elements of the current array to a new array.
//    set the pointer of the arrayList's internal array to the new array.
//that adds things at an index that is currently unused
//(this will be the current size)

//Day 2:
//    a method that can return a boolean determining if your array list contains a certain item
//    (if you had an arraylist of objects, as opposed to primitives, you may need to implement and use .equals)
//    a method that can determine if your arraylist is identical to another one
//    (again, .equals)
//    a method that sets a given index to a particular value

