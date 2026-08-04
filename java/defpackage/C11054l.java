package defpackage;

/* JADX INFO: renamed from: lًُٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C11054l implements InterfaceC9265l {
    public static final C16341l Companion = new C16341l();
    public final String crashlytics;
    public final long loadAd;
    public final long yandex;

    public /* synthetic */ C11054l(int i, long j, long j2, String str) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C4205l.yandex.purchase());
            throw null;
        }
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11054l)) {
            return false;
        }
        C11054l c11054l = (C11054l) obj;
        return this.yandex == c11054l.yandex && this.loadAd == c11054l.loadAd && AbstractC8576l.yandex(this.crashlytics, c11054l.crashlytics);
    }

    public final int hashCode() {
        long j = this.yandex;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.loadAd;
        return this.crashlytics.hashCode() + ((i + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    @Override // defpackage.InterfaceC9265l
    public final long loadAd() {
        return this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Text(beginMs=");
        sb.append(this.yandex);
        sb.append(", endMs=");
        sb.append(this.loadAd);
        sb.append(", text=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }

    @Override // defpackage.InterfaceC9265l
    public final long yandex() {
        return this.yandex;
    }

    public C11054l(String str, long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = str;
    }
}
