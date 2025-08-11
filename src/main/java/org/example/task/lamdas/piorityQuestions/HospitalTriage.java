package org.example.task.lamdas.piorityQuestions;

import java.util.PriorityQueue;

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(
                (p1, p2) -> {
                    if (p2.priority != p1.priority) {
                        return Integer.compare(p2.priority, p1.priority); // higher priority first
                    }
                    return Integer.compare(p1.arrivalOrder, p2.arrivalOrder); // earlier arrival first
                }
        );

        int arrivalCounter = 0;

        // Enqueue patients
        pq.add(new Patient("Alice", 2, ++arrivalCounter));
        pq.add(new Patient("Bob", 3, ++arrivalCounter));
        pq.add(new Patient("Charlie", 1, ++arrivalCounter));
        pq.add(new Patient("David", 3, ++arrivalCounter));

        // Serve patients
        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " (Priority " + p.priority + ")");
        }
    }

}
