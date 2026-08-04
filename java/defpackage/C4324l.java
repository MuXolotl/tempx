package defpackage;

/* JADX INFO: renamed from: lؖۖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C4324l {
    public static final C5751l Companion = new C5751l();
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C4324l(int i, int i2, String str) {
        this.yandex = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.loadAd = 0;
        } else {
            this.loadAd = i2;
        }
    }

    public C4324l() {
        this.yandex = "";
        this.loadAd = 0;
    }
}
