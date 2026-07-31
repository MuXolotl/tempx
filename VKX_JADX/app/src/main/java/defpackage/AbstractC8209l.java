package defpackage;

/* JADX INFO: renamed from: lًۗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8209l {
    public static final C2209l yandex = C2209l.crashlytics;
    public static final C4442l loadAd = C4442l.loadAd;

    public static C17442l yandex(long j, long j2, C6956l c6956l, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).subs();
        }
        if ((i2 & 2) != 0) {
            j2 = AbstractC10689l.yandex(j, c6956l);
        }
        return new C17442l(j, j2);
    }
}
