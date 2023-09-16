public class GenericMethods {
    public static void main(String[] args) {

        Integer[] numbersArr = {1, 1, 3, 2, 0};

        System.out.println(ExamineArrays.getMinorElement(numbersArr));
    }
}

class ExamineArrays {

    //'T' tiene que extender de la clase Comparable
    public static <T extends Comparable> T getMinorElement(T[] arr) {
        T minorObject = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minorObject.compareTo(arr[i]) > 0){
                minorObject = arr[i];
            }
        }
        return minorObject;
    }
}
