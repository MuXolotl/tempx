package defpackage;

/* JADX INFO: renamed from: lٕؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1064l {
    public final C6901l yandex;
    public int loadAd = 1;
    public long crashlytics = yandex();

    public C1064l(C6901l c6901l) {
        this.yandex = c6901l;
    }

    public final long yandex() {
        C6901l c6901l = this.yandex;
        AbstractC1051l.subs(c6901l);
        long jLongValue = ((Long) AbstractC5981l.license.yandex(null)).longValue();
        long jLongValue2 = ((Long) AbstractC5981l.pro.yandex(null)).longValue();
        for (int i = 1; i < this.loadAd; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        c6901l.mo198abstract().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
