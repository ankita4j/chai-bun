//https://www.interviewcake.com/question/java/merging-ranges?

package com.pandano1.learn;

public class MergeMeetingTime {
//	static Meeting[] m={new Meeting(0, 1),new Meeting(3, 5),new Meeting(4, 8),new Meeting(10, 12),new Meeting(9, 10)};//,new Meeting(1, 5)

    // Note: Doesnt work for following input:
    static Meeting[] m = {new Meeting(0, 10), new Meeting(3, 5)};

    static int len = m.length;
    static int[] start = new int[len];
    static int[] end = new int[len];

    public static void main(String[] args) {
        for (int i = 0; i < len; i++) {
            start[i] = m[i].getStartTime();
            end[i] = m[i].getEndTime();
        }
        bubbleSort(start, end);
        int k = start[0];
        int i;
        for (i = 0; i < len - 1; ) {
            while (i < len - 1 && start[i + 1] <= end[i])
                i++;
            if (i >= len - 1)
                break;
            System.out.println(k + " , " + end[i]);
            i++;
            k = start[i];
        }
        System.out.println(k + " , " + end[i]);
    }

    private static void bubbleSort(int[] start, int[] end) {
        int len = start.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (start[j] > start[j + 1]) {
                    swap(j, j + 1, start);
                    swap(j, j + 1, end);
                }
            }
        }
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    static class Meeting {

        private int startTime;
        private int endTime;

        public Meeting(int startTime, int endTime) {
            // number of 30 min blocks past 9:00 am
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }
    }

}