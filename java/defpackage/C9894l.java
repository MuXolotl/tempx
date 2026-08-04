package defpackage;

/* JADX INFO: renamed from: lٍۢٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C9894l {
    public static final C14573l Companion = new C14573l();
    public final String crashlytics;
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ C9894l(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C10770l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9894l)) {
            return false;
        }
        C9894l c9894l = (C9894l) obj;
        return this.yandex == c9894l.yandex && AbstractC8576l.yandex(this.loadAd, c9894l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c9894l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EngineAccent(id=");
        sb.append(this.yandex);
        sb.append(", name=");
        sb.append(this.loadAd);
        sb.append(", hex=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
