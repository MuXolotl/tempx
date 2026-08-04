package defpackage;

/* JADX INFO: renamed from: lؘؔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2443l {
    public final InterfaceC13898l crashlytics;
    public final int loadAd;
    public final int yandex;

    public C2443l(int i, int i2, InterfaceC13898l interfaceC13898l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = interfaceC13898l;
        if (i < 0) {
            AbstractC14825l.yandex("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        AbstractC14825l.yandex("size should be > 0");
    }
}
