package defpackage;

/* JADX INFO: renamed from: lؒۜٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1348l {
    public static final C1348l billing = new C1348l(false, 9205357640488583168L, 0.0f, 1, false);
    public final int amazon;
    public final float crashlytics;
    public final long loadAd;
    public final boolean purchase;
    public final boolean yandex;

    public C1348l(boolean z, long j, float f, int i, boolean z2) {
        this.yandex = z;
        this.loadAd = j;
        this.crashlytics = f;
        this.amazon = i;
        this.purchase = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1348l)) {
            return false;
        }
        C1348l c1348l = (C1348l) obj;
        return this.yandex == c1348l.yandex && C1187l.loadAd(this.loadAd, c1348l.loadAd) && Float.compare(this.crashlytics, c1348l.crashlytics) == 0 && this.amazon == c1348l.amazon && this.purchase == c1348l.purchase;
    }

    public final int hashCode() {
        return AbstractC0653l.firebase(this.amazon, AbstractC9029l.mopub((C1187l.mopub(this.loadAd) + ((this.yandex ? 1231 : 1237) * 31)) * 31, this.crashlytics, 31), 31) + (this.purchase ? 1231 : 1237);
    }

    public final String toString() {
        String strFirebase = C1187l.firebase(this.loadAd);
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.yandex);
        sb.append(", position=");
        sb.append(strFirebase);
        sb.append(", lineHeight=");
        sb.append(this.crashlytics);
        sb.append(", direction=");
        sb.append(AbstractC4338l.m1536throw(this.amazon));
        sb.append(", handlesCrossed=");
        return AbstractC5020l.Signature(sb, this.purchase, ")");
    }
}
