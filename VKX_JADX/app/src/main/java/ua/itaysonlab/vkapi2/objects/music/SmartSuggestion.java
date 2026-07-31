package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/SmartSuggestion;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class SmartSuggestion implements InterfaceC12360l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String purchase;
    public final String yandex;

    public SmartSuggestion(String str, String str2, String str3, String str4, String str5) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartSuggestion)) {
            return false;
        }
        SmartSuggestion smartSuggestion = (SmartSuggestion) obj;
        return AbstractC8576l.yandex(this.yandex, smartSuggestion.yandex) && AbstractC8576l.yandex(this.loadAd, smartSuggestion.loadAd) && AbstractC8576l.yandex(this.crashlytics, smartSuggestion.crashlytics) && AbstractC8576l.yandex(this.amazon, smartSuggestion.amazon) && AbstractC8576l.yandex(this.purchase, smartSuggestion.purchase);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId, reason: from getter */
    public final String getPurchase() {
        return this.purchase;
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
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmartSuggestion(title=");
        sb.append(this.yandex);
        sb.append(", subtitle=");
        sb.append(this.loadAd);
        sb.append(", type=");
        sb.append(this.crashlytics);
        sb.append(", context=");
        sb.append(this.amazon);
        sb.append(", id=");
        return AbstractC2812l.tapsense(sb, this.purchase, ')');
    }
}
