package org.example.class8;

public class Task1 {
    public static void main(String[] args) {
// print the student name who has Grade A or B
        String[][] data ={
                {"Ann", "Bob", "Cathy","Dylan"},
                {"A","B","C","A"}
        };

            for (int j=0;j<4;j++){
                if (data[1][j]=="A"||data[1][j]=="B"){
                    System.out.println(data[0][j]);
                }
            }

    }
}
