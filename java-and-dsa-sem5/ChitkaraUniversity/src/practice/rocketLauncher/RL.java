package practice.rocketLauncher;

import java.util.*;

public class RL {
//    CHECKING THE 5 FOLLOWING THINGS EACH SECOND/STEP

//    5 - FUEL CHECK
//    4 - OXYGEN CHECK
//    3 - NETLINK CHECK
//    2 - POWER CHECK
//    1 - ENGINE CHECK
//    0 - IGNITION ON

    FuelChecker FuelCheckerObj = new FuelChecker();
    OxygenChecker OxygenCheckerObj = new OxygenChecker();
    NetlinkChecker NetlinkCheckerObj = new NetlinkChecker();
    PowerChecker PowerCheckerObj = new PowerChecker();
    EngineChecker EngineCheckerObj = new EngineChecker();

    Checker[] checkingList = new Checker[]{FuelCheckerObj, OxygenCheckerObj, NetlinkCheckerObj, PowerCheckerObj, EngineCheckerObj};

    public void checkStatus() {
        System.out.println("\n--CHECKING ALL SYSTEMS--\n");
        for (Checker checker : checkingList) {
            checker.setWorking();
        }
    }


    public void launchRocket() {
        System.out.println("\n--LAUNCHING ROCKET--");
        System.out.println("Starting Countdown:");
        for (int i = 0; i < 5; i++) {
            if (! checkingList[i].checkWorking()) {
                System.out.printf("Launch Failed due to %s failure!", checkingList[i].checkType);
                return;
            };
            System.out.println(5-i);
        }
        System.out.println("Ignition ON\nRocket Launched!");

    }
}
