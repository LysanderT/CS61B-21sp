package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        AList<Integer> first = new AList<>();
        AList<Double> second = new AList<>();
        AList<Integer> third = new AList<>();
        int m = 10000;
        for(int N=1000;N<=128000;N*=2){
            SLList<Integer> s = new SLList<>();
            for(int i = 0;i<=N;i+=1){s.addFirst(1);}

            // record time
            Stopwatch sw = new Stopwatch();
            for(int i=0;i<=m;i+=1){s.getLast();}
            double time = sw.elapsedTime();
            // record time

            first.addLast(N);
            second.addLast(time);
            third.addLast(m);
        }
        printTimingTable(first,second,third);
    }

}
