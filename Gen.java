import java.util.*;
class Job{
    char id ;
    int deadline, profit;

    Job(char id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Gen {
    public static void main(String args[]){
        Job[] jobs = {
            new Job('A', 2, 100),
            new Job('b', 1, 19),
            new Job('c', 2, 27),
            new Job('d', 1,25),
            new Job('E', 3, 15 ),
        };
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 3;
        char[] result = new char [maxDeadline];
        boolean[] slot = new boolean[maxDeadline];

        for(Job job : jobs){
            for(int j = Math.min(maxDeadline, job.deadline) - 1; j>= 0; j--){
                if(!slot[j]){
                    slot[j] = true;
                    result[j] = job.id;
                    break;
                }
            }
        }
        System.out.println("Job sequence: ");

        for(char c : result){
            System.out.print(c + " ");
        }
    }
}