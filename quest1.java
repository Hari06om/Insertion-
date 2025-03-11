// Single File Programming Question
// Problem Statement: -
// A robotics competition involves several teams, each submitting scores for their performance. To evaluate the top performers, the organizers need to identify the second-lowest score to determine prize allocations.
// Create a program that takes input for the number of scores and the scores themselves, and then finds and displays the second-lowest score from the list provided.
// Company Tags: Infosys

// Input format :
// The first line of input contains an integer n, representing the number of scores.
// The second line contains n space-separated integers, where each integer represents a score.
// Output format :
// The output displays the second-lowest score.
// Refer to the sample output formatting specifications.
// Code constraints :
// 1 ≤ n ≤ 20
// 1 ≤ scores ≤ 1000
// Sample test cases :
// Input 1 :
// 5
// 4 2 7 1 3
// Output 1 :
// 2
// Input 2 :
// 8
// 10 6 2 9 5 7 3 8
// Output 2 :
// 3



import java.util.*;
public class quest1{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // input
    System.out.println("Enter the size of  elements:");
    int n = sc.nextInt();
    int[] a = new int[n];
    // array
    System.out.println("Enter " + n + " elements:");
    for(int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
        
    }
    // sort(a);
    Arrays.sort(a);
    System.out.println(a[1]);

    sc.close(); // close
    }
}