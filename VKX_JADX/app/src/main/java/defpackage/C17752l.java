package defpackage;

/* JADX INFO: renamed from: lؚ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17752l {
    public final String admob;
    public final boolean amazon;
    public final String billing;
    public final boolean crashlytics;
    public final int firebase;
    public final boolean isPro;
    public final boolean loadAd;
    public final boolean mopub;
    public final boolean purchase;
    public final boolean smaato;
    public final boolean subs;
    public final boolean yandex;

    public C17752l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, String str2, boolean z7, boolean z8, int i, boolean z9) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = z3;
        this.amazon = z4;
        this.purchase = z5;
        this.billing = str;
        this.mopub = z6;
        this.admob = str2;
        this.subs = z7;
        this.isPro = z8;
        this.firebase = i;
        this.smaato = z9;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.yandex);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.loadAd);
        sb.append(", isLenient=");
        sb.append(this.crashlytics);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.amazon);
        sb.append(", prettyPrint=false, explicitNulls=");
        sb.append(this.purchase);
        sb.append(", prettyPrintIndent='");
        sb.append(this.billing);
        sb.append("', coerceInputValues=");
        sb.append(this.mopub);
        sb.append(", useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.admob);
        sb.append("', allowSpecialFloatingPointValues=");
        sb.append(this.subs);
        sb.append(", useAlternativeNames=");
        sb.append(this.isPro);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        int i = this.firebase;
        if (i == 1) {
            str = "NONE";
        } else if (i != 2) {
            str = i != 3 ? "null" : "POLYMORPHIC";
        } else {
            str = "ALL_JSON_OBJECTS";
        }
        sb.append(str);
        sb.append(", exceptionsWithDebugInfo=");
        return AbstractC0653l.tapsense(sb, this.smaato, ')');
    }
}
