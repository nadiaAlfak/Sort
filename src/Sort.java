public class Sort {
    private int[] array;
    public Sort(int[] numbers){
        // برای اینکه از کاربر ورودی بگیریم
        array=numbers;
    }
    public int[] order(){
        int smallest;
        for (int index=0 ; index<array.length-1;index++){
            smallest=index;
            for (int index2= index+1;index2<array.length;index2++) {
                if (array[index2] < array[smallest]){
                smallest = index2;
            }
            }
            swap(index,smallest);
        }
        return array;
    }
    private void swap(int numberOne,int numberTwo){
        int temp=array[numberOne];
        array[numberOne]=array[numberTwo];
        array[numberTwo]=temp;
    }
}
