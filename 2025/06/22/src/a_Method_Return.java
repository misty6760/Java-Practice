public class a_Method_Return {
    public static int[] makeArray() {
        int[] temp;
        temp = new int[4];
        for(int i=0;i<temp.length; i++)
            temp[i] = i;
        return temp;
    }

    public static void main(String[] args) {
        int[] intArray = makeArray();
        for (int j : intArray) System.out.print(j + " ");
    }
}