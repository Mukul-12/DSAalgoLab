package LAB;

public class StudentArray {
    Student[] st = null;
    int size;

    public StudentArray(int size) {
        st = new Student[size];
        this.size = size;

        for (int i = 0; i < size; i++) {
            st[i] = new Student();

        }
    }

    //method to insert the data
    public void insert(int index, String name1, float percentage) {
        try {
            //st[index].setRollNumber(rollNumber);
            st[index].setName(name1);
            st[index].setPercentage(percentage);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }
    }

    //method to print value at particular index
    public void indexValue(int index) {
        String value = "";
        try {
            value = st[index].toString();
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }
    }

    //method to search the element in the arrray
    public int search(String name) {
        for (int i = 0; i < st.length; i++) {
            if (st[i].getName() == name) {
                System.out.println("name is found at " + i + "th Index");
                return i;
            }
        }
        System.out.println("name is not found");
        return -1;
    }

    //method to delete the array value
    public void delete(String name) {
        int a = search(name);
        if (a == -1) {
            return;
        } else {
            //st[a].setRollNumber(-1);
            st[a].setName("null");
            st[a].setPercentage(0.0f);
        }
    }

    // method to delete the complete array
    public void deleteAllArray() {
        st = null;
        System.out.println("array deleted");
    }

    // method to print the array element
    public void print() {
        try {
            for (int i = 0; i < st.length; i++) {
                System.out.println(st[i].toString() + " ");
            }
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }

}
