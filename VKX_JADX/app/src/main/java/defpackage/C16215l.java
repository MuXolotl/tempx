package defpackage;

/* JADX INFO: renamed from: lٌؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16215l {
    public final boolean admob;
    public final boolean amazon;
    public final boolean billing;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final boolean mopub;
    public final boolean purchase;
    public final boolean subs;
    public final boolean yandex;

    public C16215l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = z3;
        this.amazon = z4;
        this.purchase = z5;
        this.billing = z6;
        this.mopub = z7;
        this.admob = z8;
        this.subs = z9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CborConfiguration(encodeDefaults=false, ignoreUnknownKeys=");
        sb.append(this.yandex);
        sb.append(", encodeKeyTags=");
        sb.append(this.loadAd);
        sb.append(", encodeValueTags=");
        sb.append(this.crashlytics);
        sb.append(", encodeObjectTags=");
        sb.append(this.amazon);
        sb.append(", verifyKeyTags=");
        sb.append(this.purchase);
        sb.append(", verifyValueTags=");
        sb.append(this.billing);
        sb.append(", verifyObjectTags=");
        sb.append(this.mopub);
        sb.append(", useDefiniteLengthEncoding=");
        sb.append(this.admob);
        sb.append(", preferCborLabelsOverNames=");
        return AbstractC5020l.Signature(sb, this.subs, ", alwaysUseByteString=false)");
    }
}
