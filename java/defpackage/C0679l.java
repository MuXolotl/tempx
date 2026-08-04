package defpackage;

/* JADX INFO: renamed from: lۣؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0679l implements InterfaceC3997l {
    public static final C3924l Companion = new C3924l();
    public final long crashlytics;
    public final long loadAd;
    public final long yandex;

    public /* synthetic */ C0679l(int i, long j, long j2, long j3) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C11289l.yandex.purchase());
            throw null;
        }
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0679l)) {
            return false;
        }
        C0679l c0679l = (C0679l) obj;
        return this.yandex == c0679l.yandex && this.loadAd == c0679l.loadAd && this.crashlytics == c0679l.crashlytics;
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.crashlytics;
        return i + ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FailNotEnoughStorage(total=");
        sb.append(this.yandex);
        sb.append(", free=");
        sb.append(this.loadAd);
        sb.append(", required=");
        return AbstractC12900l.smaato(sb, this.crashlytics, ')');
    }

    public C0679l(long j, long j2, long j3) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
    }
}
