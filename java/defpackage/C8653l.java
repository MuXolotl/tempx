package defpackage;

/* JADX INFO: renamed from: lًٌۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8653l extends C7353l {
    public final Object crashlytics;

    public C8653l(int i) {
        super(i);
        this.crashlytics = new Object();
    }

    @Override // defpackage.C7353l
    public final boolean crashlytics(Object obj) {
        boolean zCrashlytics;
        synchronized (this.crashlytics) {
            zCrashlytics = super.crashlytics(obj);
        }
        return zCrashlytics;
    }

    @Override // defpackage.C7353l
    public final Object yandex() {
        Object objYandex;
        synchronized (this.crashlytics) {
            objYandex = super.yandex();
        }
        return objYandex;
    }
}
