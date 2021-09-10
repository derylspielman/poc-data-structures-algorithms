package com.derylspielman.problems;

/**
 * Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of
 * conference rooms required.
 * <p>
 * Input: intervals = [[0,30],[5,10],[15,20]]<br/>
 * Output: 2
 * <p>
 * Input: intervals = [[7,10],[2,4]] <br/>
 * Output: 1
 */
public class MeetingRooms2 {

    public int roomsNeeded(int[][] schedules) {
        // TODO: implement me
        // sort the given meetings by their start time
        // initialize a new min-heap and add the first meeting's ending time to the heap. We simply need to keep track of the ending times as that tells us when a meeting room will ge tfree
        // for every meeting room check if the minimum element of the heap i.e. the room at the of the heap is free or not
        // if the room is free we extract the topmost element and add it back when the ending time of the current meeting we are processing
        // if not then we allocate a new room and add it to the heap        

        return 0;
    }

}
