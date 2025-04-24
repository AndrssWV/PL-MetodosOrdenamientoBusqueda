import controllers.SortingMethods;

public class App {
    public static void main(String[] args) throws Exception {
        SortingMethods s = new SortingMethods();
        int[] arr = {5,8,2,6,4,0,11,67,2,34};
        s.insercion(arr);
        s.print(arr);
        int i = s.binario(arr, 8);
        System.out.print(arr[i]);
    }
}
