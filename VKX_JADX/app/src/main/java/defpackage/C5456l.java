package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: lؘؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5456l {
    public static final ReferenceQueue loadAd;
    public static final C5456l yandex = new C5456l();

    static {
        ReferenceQueue referenceQueue = new ReferenceQueue();
        loadAd = referenceQueue;
        Thread thread = new Thread(new RunnableC5360l(8, referenceQueue));
        thread.setName("RealmFinalizingDaemon");
        thread.setDaemon(true);
        thread.setPriority(5);
        thread.start();
    }
}
