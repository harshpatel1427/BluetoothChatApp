package com.example.pharsh.bluetoothchat;

import android.bluetooth.*;

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
