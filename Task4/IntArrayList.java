package Task4;


public class IntArrayList implements IntList{
    int size = 10;
    int currentIndex = 0;
    Integer[] arrayList = new Integer[size];
    @Override
    public void add(int number) {
        if (currentIndex == arrayList.length){
            int newsize = arrayList.length + arrayList.length / 2;
            Integer[] arrayList2 = new Integer[newsize];
            System.arraycopy(arrayList, 0, arrayList2, 0, arrayList.length);
            arrayList = arrayList2;
        }
        arrayList[currentIndex++] = number;
    }
        int idNum = 0;
    @Override
    public void get(int id) {
        idNum = id;
    }
}
