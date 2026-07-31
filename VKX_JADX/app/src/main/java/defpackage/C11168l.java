package defpackage;

/* JADX INFO: renamed from: lُؙٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C11168l {
    public static final C8826l Companion = new C8826l();
    public final long amazon;
    public final String crashlytics;
    public final String loadAd;
    public final long purchase;
    public final String yandex;

    public /* synthetic */ C11168l(int i, String str, String str2, String str3, long j, long j2) {
        if (31 != (i & 31)) {
            AbstractC11036l.isPro(i, 31, C4223l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = j;
        this.purchase = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11168l)) {
            return false;
        }
        C11168l c11168l = (C11168l) obj;
        return AbstractC8576l.yandex(this.yandex, c11168l.yandex) && AbstractC8576l.yandex(this.loadAd, c11168l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c11168l.crashlytics) && this.amazon == c11168l.amazon && this.purchase == c11168l.purchase;
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
        long j = this.amazon;
        long j2 = this.purchase;
        return ((iAdvert + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastTrackInformation(id=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", artist=");
        sb.append(this.crashlytics);
        sb.append(", progressCurrent=");
        sb.append(this.amazon);
        sb.append(", progressTotal=");
        return AbstractC12900l.smaato(sb, this.purchase, ')');
    }

    public C11168l(long j, long j2, String str, String str2, String str3) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = j;
        this.purchase = j2;
    }
}
