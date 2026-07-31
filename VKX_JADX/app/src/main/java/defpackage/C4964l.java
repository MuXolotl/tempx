package defpackage;

/* JADX INFO: renamed from: lؗ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C4964l {
    public static final C17507l Companion = new C17507l();
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String purchase;
    public final long yandex;

    public /* synthetic */ C4964l(int i, long j, String str, String str2, String str3, String str4) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C14610l.yandex.purchase());
            throw null;
        }
        this.yandex = j;
        if ((i & 2) == 0) {
            this.loadAd = "";
        } else {
            this.loadAd = str;
        }
        if ((i & 4) == 0) {
            this.crashlytics = "";
        } else {
            this.crashlytics = str2;
        }
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str3;
        }
        if ((i & 16) == 0) {
            this.purchase = "";
        } else {
            this.purchase = str4;
        }
    }

    public final String yandex() {
        String str = this.purchase;
        if (str.length() > 0) {
            return str;
        }
        return this.loadAd + ' ' + this.crashlytics;
    }

    public C4964l(long j, String str, String str2) {
        this.yandex = j;
        this.loadAd = "";
        this.crashlytics = "";
        this.amazon = str;
        this.purchase = str2;
    }
}
