package defpackage;

/* JADX INFO: renamed from: lؕۧؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3790l {
    public static final C3790l mopub;
    public final int amazon;
    public final C10537l billing;
    public final int crashlytics;
    public final Boolean loadAd;
    public final Boolean purchase;
    public final int yandex;

    static {
        int i = 0;
        mopub = new C3790l(i, i, 127);
    }

    public /* synthetic */ C3790l(int i, int i2, int i3) {
        this(-1, (i3 & 2) != 0 ? null : Boolean.FALSE, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2, (i3 & 32) != 0 ? null : Boolean.TRUE, null);
    }

    public final C14966l amazon(boolean z) {
        int i = this.yandex;
        C1290l c1290l = new C1290l(i);
        if (i == -1) {
            c1290l = null;
        }
        int i2 = c1290l != null ? c1290l.yandex : 0;
        Boolean bool = this.loadAd;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.crashlytics;
        C3911l c3911l = i3 != 0 ? new C3911l(i3) : null;
        int i4 = c3911l != null ? c3911l.yandex : 1;
        int iLoadAd = loadAd();
        C10537l c10537l = this.billing;
        if (c10537l == null) {
            c10537l = C10537l.f21447l;
        }
        return new C14966l(z, i2, zBooleanValue, i4, iLoadAd, c10537l);
    }

    public final boolean crashlytics() {
        return this.yandex == -1 && this.loadAd == null && this.crashlytics == 0 && this.amazon == -1 && this.purchase == null && this.billing == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3790l)) {
            return false;
        }
        C3790l c3790l = (C3790l) obj;
        return this.yandex == c3790l.yandex && AbstractC8576l.yandex(this.loadAd, c3790l.loadAd) && this.crashlytics == c3790l.crashlytics && this.amazon == c3790l.amazon && AbstractC8576l.yandex(this.purchase, c3790l.purchase) && AbstractC8576l.yandex(this.billing, c3790l.billing);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        Boolean bool = this.loadAd;
        int iHashCode = (((((i + (bool != null ? bool.hashCode() : 0)) * 31) + this.crashlytics) * 31) + this.amazon) * 961;
        Boolean bool2 = this.purchase;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        C10537l c10537l = this.billing;
        return iHashCode2 + (c10537l != null ? c10537l.f21449l.hashCode() : 0);
    }

    public final int loadAd() {
        int i = this.amazon;
        C14694l c14694l = new C14694l(i);
        if (i == -1) {
            c14694l = null;
        }
        if (c14694l != null) {
            return c14694l.yandex;
        }
        return 1;
    }

    public final String toString() {
        String strYandex = C1290l.yandex(this.yandex);
        String strYandex2 = C3911l.yandex(this.crashlytics);
        String strYandex3 = C14694l.yandex(this.amazon);
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append(strYandex);
        sb.append(", autoCorrectEnabled=");
        sb.append(this.loadAd);
        sb.append(", keyboardType=");
        AbstractC9361l.appmetrica(sb, strYandex2, ", imeAction=", strYandex3, ", platformImeOptions=nullshowKeyboardOnFocus=");
        sb.append(this.purchase);
        sb.append(", hintLocales=");
        sb.append(this.billing);
        sb.append(")");
        return sb.toString();
    }

    public final C3790l yandex(C3790l c3790l) {
        if (c3790l == null || c3790l.crashlytics() || c3790l.equals(this)) {
            return this;
        }
        if (crashlytics()) {
            return c3790l;
        }
        int i = this.yandex;
        C1290l c1290l = new C1290l(i);
        if (i == -1) {
            c1290l = null;
        }
        int i2 = c1290l != null ? c1290l.yandex : c3790l.yandex;
        Boolean bool = this.loadAd;
        if (bool == null) {
            bool = c3790l.loadAd;
        }
        Boolean bool2 = bool;
        int i3 = this.crashlytics;
        C3911l c3911l = new C3911l(i3);
        if (i3 == 0) {
            c3911l = null;
        }
        int i4 = c3911l != null ? c3911l.yandex : c3790l.crashlytics;
        int i5 = this.amazon;
        C14694l c14694l = i5 != -1 ? new C14694l(i5) : null;
        int i6 = c14694l != null ? c14694l.yandex : c3790l.amazon;
        Boolean bool3 = this.purchase;
        if (bool3 == null) {
            bool3 = c3790l.purchase;
        }
        Boolean bool4 = bool3;
        C10537l c10537l = this.billing;
        if (c10537l == null) {
            c10537l = c3790l.billing;
        }
        return new C3790l(i2, bool2, i4, i6, bool4, c10537l);
    }

    public C3790l(int i, Boolean bool, int i2, int i3, Boolean bool2, C10537l c10537l) {
        this.yandex = i;
        this.loadAd = bool;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = bool2;
        this.billing = c10537l;
    }
}
