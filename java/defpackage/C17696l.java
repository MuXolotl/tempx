package defpackage;

/* JADX INFO: renamed from: l٘ؗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17696l extends AbstractC2520l {
    public final C2759l crashlytics;
    public final String loadAd;

    public C17696l(C2234l c2234l, String str, C2759l c2759l) {
        super(c2234l);
        this.loadAd = str;
        this.crashlytics = c2759l;
    }

    public final String toString() {
        return "FAILURE \"" + this.loadAd + "\" @ " + AbstractC10478l.admob(this.yandex);
    }
}
