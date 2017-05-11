package com.example.pharsh.bluetoothchat;

import android.bluetooth.*;

/**
 * Created by pharsh on 5/10/17.
 *
 * This class will contain all event Handler functions
 */

public class EventHandlers {

    public static boolean startButtonClickHandler () {
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            return false;
        } else {
            if (!bluetoothAdapter.isEnabled()) {
                return false; //FIXME
            }
            return true;
        }
    }
}
