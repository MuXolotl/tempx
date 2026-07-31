package defpackage;

/* JADX INFO: renamed from: lؙِٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14725l {
    public static final C1328l Companion = new C1328l();
    public final String amazon;
    public final int crashlytics;
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C14725l(int i, int i2, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C0004l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = i2;
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = str3;
        }
    }
}
