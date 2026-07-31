package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؑۨؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0733l implements InterfaceC1525l {
    public static final C5978l admob;
    public static final C5978l mopub;
    public final long amazon;
    public int billing;
    public final long crashlytics;
    public final String loadAd;
    public final byte[] purchase;
    public final String yandex;

    static {
        C12984l c12984l = new C12984l();
        c12984l.vip = AbstractC3825l.vip("application/id3");
        mopub = new C5978l(c12984l);
        C12984l c12984l2 = new C12984l();
        c12984l2.vip = AbstractC3825l.vip("application/x-scte35");
        admob = new C5978l(c12984l2);
    }

    public C0733l(String str, String str2, long j, long j2, byte[] bArr) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = j;
        this.amazon = j2;
        this.purchase = bArr;
    }

    @Override // defpackage.InterfaceC1525l
    public final byte[] crashlytics() {
        if (yandex() != null) {
            return this.purchase;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0733l.class != obj.getClass()) {
            return false;
        }
        C0733l c0733l = (C0733l) obj;
        return this.crashlytics == c0733l.crashlytics && this.amazon == c0733l.amazon && this.yandex.equals(c0733l.yandex) && this.loadAd.equals(c0733l.loadAd) && Arrays.equals(this.purchase, c0733l.purchase);
    }

    public final int hashCode() {
        if (this.billing == 0) {
            int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(527, 31, this.yandex), 31, this.loadAd);
            long j = this.crashlytics;
            int i = (iAdvert + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.amazon;
            this.billing = Arrays.hashCode(this.purchase) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.billing;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.yandex + ", id=" + this.amazon + ", durationMs=" + this.crashlytics + ", value=" + this.loadAd;
    }

    @Override // defpackage.InterfaceC1525l
    public final C5978l yandex() {
        switch (this.yandex) {
            case "urn:scte:scte35:2014:bin":
                return admob;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return mopub;
            default:
                return null;
        }
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ void loadAd(C3117l c3117l) {
    }
}
