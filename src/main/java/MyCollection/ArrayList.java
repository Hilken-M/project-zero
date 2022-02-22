package MyCollection;

public class ArrayList<G> {

    // Will store objects in an array
    Object[] arrayList;

    int elementsInArray;

//	static Object a[]  = {"wam", "bam", "fuu"};
//	static Object b[] = {"wam", "bam", "fuu"};

    public static void main(String[] args) {
//        ArrayList bob = new ArrayList();
//        bob.add(2);
//        bob.add(3);
//        bob.add(7);
//        bob.add(3.14);
//        bob.add("Johnathon");
//        // bob.add(new Object());
//
//        ArrayList john = new ArrayList();
//        john.add(2);
//        john.add(3);
//        john.add(7);
//        john.add(3.14);
//        john.add("Johnathon");
//        // john.add(new Object());
//
//        System.out.println(bob.toString());
//        System.out.println(john.toString());
//
//
//        if(bob.equals(john)) {
//            System.out.println("Both Arrays are equal");
//        } else {
//            System.out.println("The Arrays are not equal");
//        }

    }

    public ArrayList() {
        arrayList = new Object[0];
        elementsInArray = 0;
    }

    public void add(Object x) {

        if (this.arrayList.length == this.elementsInArray) {
            // If true, make array bigger ++
            this.embiggen();
        }
        this.arrayList[this.elementsInArray] = x;
        this.elementsInArray++;
    }

    //a method that can return a boolean determining if your array list contains a certain item
    public void compareElement(){

    }

    private void embiggen() {

        Object[] temp = new Object[this.arrayList.length + 1];
        for (int i = 0; i < arrayList.length; i++) {
            temp[i] = arrayList[i];
            {
            }
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

    public String toString() {
        String temp = new String();
        for (int i = 0; i < arrayList.length; i++) {
            temp += arrayList[i].toString() + ",";
        }
        return temp.substring(0, temp.length() - 1);
    }

    public void add(){
        //a method to add a full array to be itterated over?
    }

    public void getIndex(){
        //pull a specific index
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

