package defpackage;

/* JADX INFO: renamed from: lؑؒؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0034l {
    public static final C16551l Companion = new C16551l();
    public final int crashlytics;
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ C0034l(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C15867l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
        this.crashlytics = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0034l)) {
            return false;
        }
        C0034l c0034l = (C0034l) obj;
        return this.yandex == c0034l.yandex && AbstractC8576l.yandex(this.loadAd, c0034l.loadAd) && this.crashlytics == c0034l.crashlytics;
    }

    public final int hashCode() {
        return AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksImageDto(height=");
        sb.append(this.yandex);
        sb.append(", url=");
        sb.append(this.loadAd);
        sb.append(", width=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }
}
