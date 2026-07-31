package defpackage;

/* JADX INFO: renamed from: lؘؘٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C5492l {
    public static final C1920l Companion = new C1920l();
    public final C2106l amazon;
    public final boolean crashlytics;
    public final long loadAd;
    public final boolean purchase;
    public final long yandex;

    public /* synthetic */ C5492l(int i, long j, long j2, boolean z, C2106l c2106l, boolean z2) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C5504l.yandex.purchase());
            throw null;
        }
        this.yandex = j;
        this.loadAd = j2;
        if ((i & 4) == 0) {
            this.crashlytics = false;
        } else {
            this.crashlytics = z;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = c2106l;
        }
        if ((i & 16) == 0) {
            this.purchase = false;
        } else {
            this.purchase = z2;
        }
    }
}
