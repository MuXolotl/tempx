package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: lٌۚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9026l {
    public final C3797l loadAd;
    public final ReentrantLock yandex;
    public static final C6760l crashlytics = new C6760l(1);
    public static final LinkedHashMap amazon = new LinkedHashMap();

    public C9026l(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (crashlytics) {
            try {
                LinkedHashMap linkedHashMap = amazon;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.yandex = reentrantLock;
        this.loadAd = z ? new C3797l(str) : null;
    }
}
