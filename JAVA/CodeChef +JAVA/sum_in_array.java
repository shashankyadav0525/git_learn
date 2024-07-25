public class sum_in_array{

  static void size(int[] array){
        for (int i=1; i<array.length; i++) {
            array[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] array=new int[3];
        array[0]=2;
        array[1]=4;
        array[2]=5;

        size(array);

    }
    }