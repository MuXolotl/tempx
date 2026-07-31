package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: lؚؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC2470l implements ServiceConnection {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f5255l = false;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final LinkedBlockingQueue f5254l = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5254l.add(iBinder);
    }

    public final IBinder yandex() throws TimeoutException {
        AbstractC1051l.admob("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f5255l) {
            C8339l.smaato("Cannot call get on this connection more than once");
            return null;
        }
        this.f5255l = true;
        IBinder iBinder = (IBinder) this.f5254l.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
