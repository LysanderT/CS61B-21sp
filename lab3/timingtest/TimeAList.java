package timingtest;

import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
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
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        AList<Integer> first = new AList<>();
        AList<Double> second = new AList<>();
        for(int N = 1000; N <= 128000; N*=2){
            // record time
            Stopwatch sw = new Stopwatch();
            AList<Integer> A= new AList<>();
            for(int i = 0; i <= N;i+=1){A.addLast(1);}
            double time = sw.elapsedTime();
            // record time
            first.addLast(N);
            second.addLast(time);
        }
        printTimingTable(first,second,first);
    }
}
