package defpackage;

/* JADX INFO: renamed from: lٌؖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4233l {
    public static final C4233l subs = new C4233l(null, C6702l.loadAd, 0, false, false, false, false, false);
    public final boolean admob;
    public final boolean amazon;
    public final boolean billing;
    public final int crashlytics;
    public final C6702l loadAd;
    public final boolean mopub;
    public final boolean purchase;
    public final C7073l yandex;

    public C4233l(C7073l c7073l, C6702l c6702l, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.yandex = c7073l;
        this.loadAd = c6702l;
        this.crashlytics = i;
        this.amazon = z;
        this.purchase = z2;
        this.billing = z3;
        this.mopub = z4;
        this.admob = z5;
    }

    public static C4233l yandex(C4233l c4233l, C7073l c7073l, C6702l c6702l, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            c7073l = c4233l.yandex;
        }
        C7073l c7073l2 = c7073l;
        if ((i2 & 2) != 0) {
            c6702l = c4233l.loadAd;
        }
        C6702l c6702l2 = c6702l;
        if ((i2 & 4) != 0) {
            i = c4233l.crashlytics;
        }
        int i3 = i;
        boolean z5 = (i2 & 8) != 0 ? c4233l.amazon : true;
        if ((i2 & 16) != 0) {
            z = c4233l.purchase;
        }
        boolean z6 = z;
        if ((i2 & 32) != 0) {
            z2 = c4233l.billing;
        }
        boolean z7 = z2;
        if ((i2 & 64) != 0) {
            z3 = c4233l.mopub;
        }
        boolean z8 = z3;
        boolean z9 = (i2 & 128) != 0 ? c4233l.admob : z4;
        c4233l.getClass();
        return new C4233l(c7073l2, c6702l2, i3, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4233l) {
            C4233l c4233l = (C4233l) obj;
            if (AbstractC8576l.yandex(this.yandex, c4233l.yandex) && this.loadAd == c4233l.loadAd && this.crashlytics == c4233l.crashlytics && this.amazon == c4233l.amazon && this.purchase == c4233l.purchase && this.billing == c4233l.billing && this.mopub == c4233l.mopub && this.admob == c4233l.admob) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C7073l c7073l = this.yandex;
        int iHashCode = (this.loadAd.hashCode() + ((c7073l == null ? 0 : c7073l.hashCode()) * 31)) * 31;
        int i = this.crashlytics;
        return ((((((((((iHashCode + (i != 0 ? AbstractC5020l.inmobi(i) : 0)) * 31) + (this.amazon ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.mopub ? 1231 : 1237)) * 31) + (this.admob ? 1231 : 1237);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("KCallableOverriddenStorage(instanceReceiverParameter=");
        sb.append(this.yandex);
        sb.append(", typeSubstitutor=");
        sb.append(this.loadAd);
        sb.append(", modality=");
        int i = this.crashlytics;
        if (i == 1) {
            str = "FINAL";
        } else if (i == 2) {
            str = "SEALED";
        } else if (i != 3) {
            str = i != 4 ? "null" : "ABSTRACT";
        } else {
            str = "OPEN";
        }
        sb.append(str);
        sb.append(", isFakeOverride=");
        sb.append(this.amazon);
        sb.append(", forceIsExternal=");
        sb.append(this.purchase);
        sb.append(", forceIsOperator=");
        sb.append(this.billing);
        sb.append(", forceIsInfix=");
        sb.append(this.mopub);
        sb.append(", forceIsInline=");
        return AbstractC0653l.tapsense(sb, this.admob, ')');
    }
}
