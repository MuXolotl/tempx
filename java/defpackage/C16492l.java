package defpackage;

/* JADX INFO: renamed from: lٖٜؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C16492l implements InterfaceC1227l {
    public long yandex = -1;
    public long loadAd = 1;
    public long crashlytics = -1;
    public int amazon = -1;
    public int purchase = -1;
    public int billing = -1;
    public int mopub = -1;
    public String admob = "";
    public boolean subs = false;
    public boolean isPro = false;
    public double firebase = 0.0d;
    public long smaato = -1;
    public int remoteconfig = -1;

    public final String toString() {
        return yandex().toString();
    }

    public C18449l yandex() {
        C18449l c18449lBilling = AbstractC11999l.billing(this);
        c18449lBilling.tapsense(this.yandex, "audioDataLength");
        c18449lBilling.tapsense(this.loadAd, "audioDataStartPosition");
        c18449lBilling.tapsense(this.crashlytics, "audioDataEndPosition");
        c18449lBilling.subscription(this.amazon, "bitRate");
        c18449lBilling.subscription(this.purchase, "noOfChannels");
        c18449lBilling.subscription(this.billing, "samplingRate");
        c18449lBilling.subscription(this.mopub, "bitsPerSample");
        c18449lBilling.Signature(this.admob, "encodingType");
        c18449lBilling.license("isVbr", String.valueOf(this.subs));
        c18449lBilling.license("isLossless", String.valueOf(this.isPro));
        c18449lBilling.license("trackLength", String.valueOf(this.firebase));
        c18449lBilling.tapsense(this.smaato, "noOfSamples");
        c18449lBilling.subscription(this.remoteconfig, "byteRate");
        return c18449lBilling;
    }
}
