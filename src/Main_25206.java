package src;
/*  
 * https://www.acmicpc.net/problem/25206
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제 정확하게 읽기 */
public class Main_25206 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalGrade = 0;
        double totalScore = 0;

        for (int i = 0; i < 20; i++) {
            String[] parts = br.readLine().split(" ");
            String grade = parts[2];

            if (grade.equals("P"))
                continue;

            double score = Double.parseDouble(parts[1]);

            switch (grade) {
                case "A+":
                    totalScore += 4.5 * score;
                    totalGrade += score;
                    break;
                case "A0":
                    totalScore += 4.0 * score;
                    totalGrade += score;
                    break;
                case "B+":
                    totalScore += 3.5 * score;
                    totalGrade += score;
                    break;
                case "B0":
                    totalScore += 3.0 * score;
                    totalGrade += score;
                    break;
                case "C+":
                    totalScore += 2.5 * score;
                    totalGrade += score;
                    break;
                case "C0":
                    totalScore += 2.0 * score;
                    totalGrade += score;
                    break;
                case "D+":
                    totalScore += 1.5 * score;
                    totalGrade += score;
                    break;
                case "D0":
                    totalScore += 1.0 * score;
                    totalGrade += score;
                    break;
                case "F":
                    totalScore += 0.0 * score;
                    totalGrade += score;
                    break;
                default:
                    break;
            }
        }

        System.out.printf("%.6f%n", totalScore / totalGrade);
    }
}