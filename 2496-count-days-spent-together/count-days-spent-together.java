class Solution {
    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aStart = dateToDayOfYear(arriveAlice);
        int aEnd = dateToDayOfYear(leaveAlice);
        int bStart = dateToDayOfYear(arriveBob);
        int bEnd = dateToDayOfYear(leaveBob);

        int overlapStart = Math.max(aStart, bStart);
        int overlapEnd = Math.min(aEnd, bEnd);

        return Math.max(0, overlapEnd - overlapStart + 1);
    }

    private int dateToDayOfYear(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int dayOfYear = day;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        return dayOfYear;
    }
}