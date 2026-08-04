package ua.itaysonlab.vkapi2.objects.video;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/video/VKVideoFiles;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class VKVideoFiles {
    public final String admob;
    public final String amazon;
    public final String billing;
    public final String crashlytics;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final String yandex;

    public VKVideoFiles(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = str5;
        this.billing = str6;
        this.mopub = str7;
        this.admob = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKVideoFiles)) {
            return false;
        }
        VKVideoFiles vKVideoFiles = (VKVideoFiles) obj;
        return AbstractC8576l.yandex(this.yandex, vKVideoFiles.yandex) && AbstractC8576l.yandex(this.loadAd, vKVideoFiles.loadAd) && AbstractC8576l.yandex(this.crashlytics, vKVideoFiles.crashlytics) && AbstractC8576l.yandex(this.amazon, vKVideoFiles.amazon) && AbstractC8576l.yandex(this.purchase, vKVideoFiles.purchase) && AbstractC8576l.yandex(this.billing, vKVideoFiles.billing) && AbstractC8576l.yandex(this.mopub, vKVideoFiles.mopub) && AbstractC8576l.yandex(this.admob, vKVideoFiles.admob);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loadAd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.amazon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.purchase;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.billing;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mopub;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.admob;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKVideoFiles(mp4_240=");
        sb.append(this.yandex);
        sb.append(", mp4_360=");
        sb.append(this.loadAd);
        sb.append(", mp4_480=");
        sb.append(this.crashlytics);
        sb.append(", mp4_720=");
        sb.append(this.amazon);
        sb.append(", mp4_1080=");
        sb.append(this.purchase);
        sb.append(", mp4_1440=");
        sb.append(this.billing);
        sb.append(", mp4_2160=");
        sb.append(this.mopub);
        sb.append(", hls=");
        return AbstractC2812l.tapsense(sb, this.admob, ')');
    }
}
