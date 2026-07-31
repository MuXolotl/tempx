package defpackage;

/* JADX INFO: renamed from: lؔۥٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3032l {
    public static final Object billing = new Object();
    public final Object crashlytics;
    public final InterfaceC9765l loadAd;
    public final String yandex;
    public final Object amazon = new Object();
    public volatile Object purchase = null;

    public /* synthetic */ C3032l(String str, Object obj, InterfaceC9765l interfaceC9765l) {
        this.yandex = str;
        this.crashlytics = obj;
        this.loadAd = interfaceC9765l;
    }

    public final Object yandex(Object obj) {
        synchronized (this.amazon) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC18263l.loadAd == null) {
            return this.crashlytics;
        }
        synchronized (billing) {
            try {
                if (C6162l.tapsense()) {
                    return this.purchase == null ? this.crashlytics : this.purchase;
                }
                try {
                    for (C3032l c3032l : AbstractC5981l.yandex) {
                        if (C6162l.tapsense()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            InterfaceC9765l interfaceC9765l = c3032l.loadAd;
                            if (interfaceC9765l != null) {
                                objZza = interfaceC9765l.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (billing) {
                            c3032l.purchase = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC9765l interfaceC9765l2 = this.loadAd;
                if (interfaceC9765l2 != null) {
                    try {
                        return interfaceC9765l2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.crashlytics;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
