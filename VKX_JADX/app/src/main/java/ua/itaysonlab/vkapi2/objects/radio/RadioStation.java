package ua.itaysonlab.vkapi2.objects.radio;

import defpackage.AbstractC0653l;
import defpackage.AbstractC10999l;
import defpackage.AbstractC12589l;
import defpackage.AbstractC18643l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.C10019l;
import defpackage.C10291l;
import defpackage.InterfaceC0042l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC14029l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC9764l;
import kotlin.Metadata;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/radio/RadioStation;", "Llۡۨ;", "Llُّؔ;", "Llؑؒٝ;", "Llٍۗ۠;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class RadioStation extends AbstractC18643l implements InterfaceC12360l, InterfaceC0042l, InterfaceC9764l {
    public final String admob;
    public final String amazon;
    public boolean billing;
    public final String crashlytics;
    public final String loadAd;
    public final boolean mopub;
    public final String purchase;
    public final int yandex;

    public RadioStation(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = str4;
        this.billing = z;
        this.mopub = z2;
        this.admob = str5;
    }

    @Override // defpackage.AbstractC18643l
    public final C10019l adcel() {
        return new C10019l("vk_radio", String.valueOf(this.yandex), this.admob);
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: ads, reason: from getter */
    public final String getLoadAd() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC0042l
    public final boolean billing() {
        return true;
    }

    @Override // defpackage.InterfaceC9764l
    public final void crashlytics(boolean z) {
        this.billing = z;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        InterfaceC14029l interfaceC14029l = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, null, 0, new C10291l(z, this, interfaceC14029l, 5), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioStation)) {
            return false;
        }
        RadioStation radioStation = (RadioStation) obj;
        return this.yandex == radioStation.yandex && AbstractC8576l.yandex(this.loadAd, radioStation.loadAd) && AbstractC8576l.yandex(this.crashlytics, radioStation.crashlytics) && AbstractC8576l.yandex(this.amazon, radioStation.amazon) && AbstractC8576l.yandex(this.purchase, radioStation.purchase) && this.billing == radioStation.billing && this.mopub == radioStation.mopub && AbstractC8576l.yandex(this.admob, radioStation.admob);
    }

    @Override // defpackage.AbstractC18643l
    public final /* bridge */ /* synthetic */ String firebase() {
        return null;
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getPurchase() {
        return String.valueOf(this.yandex);
    }

    public final int hashCode() {
        return this.admob.hashCode() + ((((AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon), 31, this.purchase) + (this.billing ? 1231 : 1237)) * 31) + (this.mopub ? 1231 : 1237)) * 31);
    }

    @Override // defpackage.InterfaceC9764l
    /* JADX INFO: renamed from: isPro, reason: from getter */
    public final boolean getBilling() {
        return this.billing;
    }

    @Override // defpackage.InterfaceC0042l
    public final boolean loadAd() {
        return AbstractC0653l.purchase(this);
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: metrica */
    public final String getYandex() {
        return "vk_radio_" + this.yandex;
    }

    @Override // defpackage.InterfaceC0042l
    public final int purchase() {
        return 3;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: remoteconfig, reason: from getter */
    public final String getAmazon() {
        return this.amazon;
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: smaato */
    public final String getYandex() {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return vKXApplication.getString(R.string.op_radio_station);
    }

    @Override // defpackage.AbstractC18643l
    public final String subscription() {
        return "vk_radio";
    }

    @Override // defpackage.AbstractC18643l
    public final String tapsense() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RadioStation(id=");
        sb.append(this.yandex);
        sb.append(", name=");
        sb.append(this.loadAd);
        sb.append(", logo_url=");
        sb.append(this.crashlytics);
        sb.append(", logo_png_url=");
        sb.append(this.amazon);
        sb.append(", background_color=");
        sb.append(this.purchase);
        sb.append(", is_followed=");
        sb.append(this.billing);
        sb.append(", is_enabled=");
        sb.append(this.mopub);
        sb.append(", stream_url=");
        return AbstractC2812l.tapsense(sb, this.admob, ')');
    }

    @Override // defpackage.AbstractC18643l
    public final int vip() {
        return 0;
    }
}
