package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌَٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8694l implements InterfaceC1525l {
    public final byte[] admob;
    public final int amazon;
    public final int billing;
    public final String crashlytics;
    public final String loadAd;
    public final int mopub;
    public final int purchase;
    public final int yandex;

    public C8694l(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = i2;
        this.purchase = i3;
        this.billing = i4;
        this.mopub = i5;
        this.admob = bArr;
    }

    public static C8694l amazon(C13143l c13143l) {
        int iRemoteconfig = c13143l.remoteconfig();
        String strVip = AbstractC3825l.vip(c13143l.advert(c13143l.remoteconfig(), StandardCharsets.US_ASCII));
        String strAdvert = c13143l.advert(c13143l.remoteconfig(), StandardCharsets.UTF_8);
        int iRemoteconfig2 = c13143l.remoteconfig();
        int iRemoteconfig3 = c13143l.remoteconfig();
        int iRemoteconfig4 = c13143l.remoteconfig();
        int iRemoteconfig5 = c13143l.remoteconfig();
        int iRemoteconfig6 = c13143l.remoteconfig();
        byte[] bArr = new byte[iRemoteconfig6];
        c13143l.firebase(0, iRemoteconfig6, bArr);
        return new C8694l(iRemoteconfig, strVip, strAdvert, iRemoteconfig2, iRemoteconfig3, iRemoteconfig4, iRemoteconfig5, bArr);
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8694l.class != obj.getClass()) {
            return false;
        }
        C8694l c8694l = (C8694l) obj;
        return this.yandex == c8694l.yandex && this.loadAd.equals(c8694l.loadAd) && this.crashlytics.equals(c8694l.crashlytics) && this.amazon == c8694l.amazon && this.purchase == c8694l.purchase && this.billing == c8694l.billing && this.mopub == c8694l.mopub && Arrays.equals(this.admob, c8694l.admob);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.admob) + ((((((((AbstractC12589l.advert(AbstractC12589l.advert((527 + this.yandex) * 31, 31, this.loadAd), 31, this.crashlytics) + this.amazon) * 31) + this.purchase) * 31) + this.billing) * 31) + this.mopub) * 31);
    }

    @Override // defpackage.InterfaceC1525l
    public final void loadAd(C3117l c3117l) {
        c3117l.yandex(this.yandex, this.admob);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.loadAd + ", description=" + this.crashlytics;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }
}
