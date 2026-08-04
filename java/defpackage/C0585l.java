package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: lّؑۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0585l {
    public static C0585l amazon;
    public static final ReentrantLock crashlytics = new ReentrantLock();
    public final SharedPreferences loadAd;
    public final ReentrantLock yandex = new ReentrantLock();

    public C0585l(Context context) {
        this.loadAd = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String yandex(String str) {
        ReentrantLock reentrantLock = this.yandex;
        reentrantLock.lock();
        try {
            return this.loadAd.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
