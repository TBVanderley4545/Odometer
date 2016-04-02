package com.tbvanderleystudios.odometer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class OdometerService extends Service {
    public OdometerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
