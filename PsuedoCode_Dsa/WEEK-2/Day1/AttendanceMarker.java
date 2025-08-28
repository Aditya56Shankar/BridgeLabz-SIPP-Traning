class AttendanceMarker {
    private char[][] attendance; // rows=students, cols=days
    private int students;
    private int days;

    public AttendanceMarker(int students, int days) {
        this.students = students;
        this.days = days;
        attendance = new char[students][days];

        // Initialize all as Absent
        for(int i=0; i<students; i++) {
            for(int j=0; j<days; j++) {
                attendance[i][j] = 'A';
            }
        }
    }

    // Mark attendance
    public void markAttendance(int studentId, int day, char status) {
        // studentId = 0-based, day = 0-based
        attendance[studentId][day] = status;
    }

    // Update attendance
    public void updateAttendance(int studentId, int day, char status) {
        attendance[studentId][day] = status;
        System.out.println("Updated Student " + (studentId+1) + " Day " + (day+1) + " → " + status);
    }

    // Generate monthly report
    public void generateReport() {
        for(int i=0; i<students; i++) {
            int presentCount = 0;
            for(int j=0; j<days; j++) {
                if(attendance[i][j] == 'P') {
                    presentCount++;
                }
            }
            System.out.println("Student " + (i+1) + ": Present " + presentCount + " days.");
        }
    }

    // Example Run
    public static void main(String[] args) {
        AttendanceMarker am = new AttendanceMarker(2, 7); // 2 students, 7 days (1 week)

        // Student 1’s first week
        am.markAttendance(0, 0, 'P');
        am.markAttendance(0, 1, 'P');
        am.markAttendance(0, 2, 'A');
        am.markAttendance(0, 3, 'P');
        am.markAttendance(0, 4, 'P');
        am.markAttendance(0, 5, 'P');
        am.markAttendance(0, 6, 'A');

        // Update Day 3 from 'A' → 'P'
        am.updateAttendance(0, 2, 'P');

        // Generate report
        am.generateReport();
    }
}
