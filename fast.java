public class fast {
    public static void main(String[] args) {

        int[] array = { 2, 2, 2, 2, 2, 2 };
        int[] index = { 4, 4, 4, 4, 4, 4 };
        int[] apex = new int[6];

        for (int ndex = 0; ndex < array.length; ndex++) {

            apex[ndex] = array[ndex] * index[ndex];

        }

        for (int val : apex) {
            System.out.println(val + " ");
        }
    }

}
