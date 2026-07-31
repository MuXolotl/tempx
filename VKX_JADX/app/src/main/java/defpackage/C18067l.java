package defpackage;

/* JADX INFO: renamed from: lْ٘ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C18067l {
    public static final C17725l Companion = new C17725l();
    public final long amazon;
    public final int crashlytics;
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C18067l(int i, int i2, long j, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C0083l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = i2;
        this.amazon = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18067l)) {
            return false;
        }
        C18067l c18067l = (C18067l) obj;
        return AbstractC8576l.yandex(this.yandex, c18067l.yandex) && AbstractC8576l.yandex(this.loadAd, c18067l.loadAd) && this.crashlytics == c18067l.crashlytics && this.amazon == c18067l.amazon;
    }

    public final int hashCode() {
        int iAdvert = (AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd) + this.crashlytics) * 31;
        long j = this.amazon;
        return iAdvert + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.yandex);
        sb.append(", firstSessionId=");
        sb.append(this.loadAd);
        sb.append(", sessionIndex=");
        sb.append(this.crashlytics);
        sb.append(", sessionStartTimestampUs=");
        return AbstractC12900l.smaato(sb, this.amazon, ')');
    }

    public C18067l(int i, long j, String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = i;
        this.amazon = j;
    }
}
