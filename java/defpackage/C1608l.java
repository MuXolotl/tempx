package defpackage;

/* JADX INFO: renamed from: lؓؕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1608l {
    public final int amazon;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final boolean yandex;

    static {
        new C4839l().yandex();
    }

    public C1608l(C4839l c4839l) {
        this.yandex = c4839l.loadAd;
        this.loadAd = c4839l.crashlytics;
        this.crashlytics = c4839l.amazon;
        this.amazon = c4839l.yandex;
    }
}
