package ua.itaysonlab.vkapi2.objects.video;

import defpackage.AbstractC12589l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/video/VKVideo;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class VKVideo implements InterfaceC12360l {
    public final VKVideoFiles admob;
    public final Integer amazon;
    public final List billing;
    public final String crashlytics;
    public final int firebase;
    public final List isPro;
    public final Long loadAd;
    public final Long mopub;
    public final Integer purchase;
    public final String smaato;
    public final List subs;
    public final int yandex;

    public VKVideo(int i, Long l, String str, Integer num, Integer num2, List list, Long l2, VKVideoFiles vKVideoFiles, List list2, List list3, int i2, String str2) {
        this.yandex = i;
        this.loadAd = l;
        this.crashlytics = str;
        this.amazon = num;
        this.purchase = num2;
        this.billing = list;
        this.mopub = l2;
        this.admob = vKVideoFiles;
        this.subs = list2;
        this.isPro = list3;
        this.firebase = i2;
        this.smaato = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKVideo)) {
            return false;
        }
        VKVideo vKVideo = (VKVideo) obj;
        return this.yandex == vKVideo.yandex && AbstractC8576l.yandex(this.loadAd, vKVideo.loadAd) && AbstractC8576l.yandex(this.crashlytics, vKVideo.crashlytics) && AbstractC8576l.yandex(this.amazon, vKVideo.amazon) && AbstractC8576l.yandex(this.purchase, vKVideo.purchase) && AbstractC8576l.yandex(this.billing, vKVideo.billing) && AbstractC8576l.yandex(this.mopub, vKVideo.mopub) && AbstractC8576l.yandex(this.admob, vKVideo.admob) && AbstractC8576l.yandex(this.subs, vKVideo.subs) && AbstractC8576l.yandex(this.isPro, vKVideo.isPro) && this.firebase == vKVideo.firebase && AbstractC8576l.yandex(this.smaato, vKVideo.smaato);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getYandex() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.loadAd);
        sb.append('_');
        sb.append(this.yandex);
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        Long l = this.loadAd;
        int iAdvert = AbstractC12589l.advert((i + (l == null ? 0 : l.hashCode())) * 31, 31, this.crashlytics);
        Integer num = this.amazon;
        int iHashCode = (iAdvert + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.purchase;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.billing;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.mopub;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        VKVideoFiles vKVideoFiles = this.admob;
        int iHashCode5 = (iHashCode4 + (vKVideoFiles == null ? 0 : vKVideoFiles.hashCode())) * 31;
        List list2 = this.subs;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.isPro;
        int iHashCode7 = (((iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.firebase) * 31;
        String str = this.smaato;
        return iHashCode7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKVideo(id=");
        sb.append(this.yandex);
        sb.append(", owner_id=");
        sb.append(this.loadAd);
        sb.append(", title=");
        sb.append(this.crashlytics);
        sb.append(", width=");
        sb.append(this.amazon);
        sb.append(", height=");
        sb.append(this.purchase);
        sb.append(", image=");
        sb.append(this.billing);
        sb.append(", user_id=");
        sb.append(this.mopub);
        sb.append(", files=");
        sb.append(this.admob);
        sb.append(", main_artists=");
        sb.append(this.subs);
        sb.append(", genres=");
        sb.append(this.isPro);
        sb.append(", duration=");
        sb.append(this.firebase);
        sb.append(", direct_url=");
        return AbstractC2812l.tapsense(sb, this.smaato, ')');
    }
}
