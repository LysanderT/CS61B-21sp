public class Sort {
    public static void sort(String[] x){
        // find the smallest
        // move it to the front
        //recursive call
        sort(x,0);
    }

    private static void sort(String[] x, int start){
        if (start == x.length){
            return;
        }
        int smallest = findSmallest(x,start);
        swap(x,start,smallest);
        sort(x,start+1);

    }
    public static int findSmallest(String[] x,int start){
        int smallestIndex = start;
        for (int i = start; i < x.length; i +=1){
            int cmp = x[smallestIndex].compareTo(x[i]);
            if (cmp > 0){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    public static void swap(String[] x, int a ,int b){
        String tmp = x[a];
        x[a] = x[b];
        x[b] = tmp;
    }
}
