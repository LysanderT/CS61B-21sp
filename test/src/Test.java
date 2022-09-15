public class Test {
    public static void testSort(){
        String[] input = {"a","c","b"};
        String[] expected = {"a","b","c"};
        Sort.sort(input);
        org.junit.Assert.assertEquals(expected,input);
    }
    public static void testSmall(){
        String[] input = {"hole","in","an","ysm"};
        int expected = 2;
        int actual = Sort.findSmallest(input,0);
        org.junit.Assert.assertEquals(expected,actual);
    }
    public static void testSwap(){
        String[] input ={"I","love","you"};
        int a = 0;
        int b = 2;
        String[] expected = {"you","love","I"};
        Sort.swap(input,a,b);
        org.junit.Assert.assertEquals(expected,input);

    }
    public static void main(String[] args){
        testSort();
    }
}
