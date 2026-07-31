package defpackage;

/* JADX INFO: renamed from: lؑٓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0303l {
    public static final C7351l Companion = new C7351l();
    public final long crashlytics;
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C0303l(int i, long j, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C1331l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = j;
    }

    public final C2855l yandex() {
        if (AbstractC7866l.yandex.purchase().f4736l < this.crashlytics) {
            return new C2855l(this.yandex, this.loadAd);
        }
        return null;
    }

    public C0303l(long j, String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = j;
    }
}
