package java.nestedClasses.localClasses;

public class Local {

    private int time;
    private String[] activities;

//    let total activities : 25
    private final static int EXPECTED_ACTIVITIES = 10;

    public void morningTimeTable(int time) {
        class Morning {
            int time;
//            static int bruh;
//            ^ cannot declare static members even if the encapsulating method is static
            public void wakeUp (int time) {
                System.out.println("WakeUp Time: " + time);
            }
            public String[] getActivities() {
                String [] morning_activities = new String[EXPECTED_ACTIVITIES];
                return morning_activities;
            }
        }

        Morning objM = new Morning();
        objM.wakeUp(time);
    }
}
