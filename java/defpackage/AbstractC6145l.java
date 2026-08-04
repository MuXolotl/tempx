package defpackage;

/* JADX INFO: renamed from: lؘۨٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6145l {
    public static final C12463l yandex = new C12463l();
    public static final C12463l loadAd = new C12463l();
    public static final C13660l crashlytics = new C13660l();
    public static final C13660l amazon = new C13660l();

    public static C9894l yandex(int i) {
        Integer numValueOf = Integer.valueOf(i);
        C13660l c13660l = amazon;
        C9894l c9894l = (C9894l) c13660l.mopub(numValueOf);
        return c9894l == null ? (C9894l) c13660l.mopub(0) : c9894l;
    }
}
