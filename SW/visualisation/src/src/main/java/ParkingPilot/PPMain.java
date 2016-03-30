package ParkingPilot;

import ParkingPilot.Manager.PPManager;

import java.awt.*;

/**
 * Created by haxxi on 2016.03.30..
 */
public class PPMain {

    private PPManager manager;

    public PPMain() {

        manager = PPManager.newInstance();
        manager.setSenderListener(parkingListener);
    }

    public void parkingPilotActivate(){
        manager.sendPPData(4, 160f, new Point(0,1));
    }

    // Listener --------------------------------------------------------------------------------------------------------
    private PPManager.ParkinPilotListener parkingListener = new PPManager.ParkinPilotListener() {
        public void onDataChanged() {

        }
    };

}
