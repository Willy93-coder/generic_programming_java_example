public class MyArrayList {

    private Object[] elementData;
    private int i = 0;

    public MyArrayList(int z) {
        elementData = new Object[z];
    }

    public Object getObject(int i) {
        return elementData[i];
    }

    public void addElement(Object o){
        elementData[i] = o;
        i++;
    }


}
