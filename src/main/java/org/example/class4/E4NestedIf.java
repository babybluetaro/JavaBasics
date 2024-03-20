package org.example.class4;

public class E4NestedIf {
    public static void main(String[] args) {

        boolean mainDoor = true;
        boolean room1 = false;
        boolean room2 = false;
//command+option+L = form the code nicely
        if (mainDoor) {

            if (room1) {
                System.out.println("Room 1 is open");
            } else {
                System.out.println("Room 1 is closed");
            }

            if (room2){
                System.out.println("Room 2 is open");
            }else{
                System.out.println("Room 2 is closed");
            }
        } else {
            System.out.println("Main Door is closed");
        }
    }
}
