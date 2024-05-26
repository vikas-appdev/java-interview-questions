package com.gradlic.interviewquestions.concurrent;

public class EvenOddPrint {
    static int counter = 1;

    public static void main(String[] args) {
        EvenOddPrint evenOddPrint = new EvenOddPrint();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                evenOddPrint.printEvenNums();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                evenOddPrint.printOddNums();
            }
        });

        t1.start();
        t2.start();
    }

    public void printOddNums()  {
        synchronized (this){
            while (counter < 20){
                while(counter %2==0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print(counter+ " ");
                counter++;
                notify();
            }
        }
    }

    public void printEvenNums(){
        synchronized (this){
            while (counter < 20){
                while(counter %2==1){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print(counter+ " ");
                counter++;
                notify();
            }
        }
    }
}
