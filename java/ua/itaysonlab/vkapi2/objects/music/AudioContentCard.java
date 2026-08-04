package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC12589l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC8576l;
import defpackage.EnumC12756l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioContentCard;", "Llُّؔ;", "lّٟٕ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioContentCard implements InterfaceC12360l {
    public final String amazon;
    public final String billing;
    public final List crashlytics;
    public final List loadAd;
    public final EnumC12756l mopub;
    public final String purchase;
    public final String yandex;

    public AudioContentCard(String str, List list, List list2, String str2, String str3, String str4, EnumC12756l enumC12756l) {
        this.yandex = str;
        this.loadAd = list;
        this.crashlytics = list2;
        this.amazon = str2;
        this.purchase = str3;
        this.billing = str4;
        this.mopub = enumC12756l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioContentCard)) {
            return false;
        }
        AudioContentCard audioContentCard = (AudioContentCard) obj;
        return AbstractC8576l.yandex(this.yandex, audioContentCard.yandex) && AbstractC8576l.yandex(this.loadAd, audioContentCard.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioContentCard.crashlytics) && AbstractC8576l.yandex(this.amazon, audioContentCard.amazon) && AbstractC8576l.yandex(this.purchase, audioContentCard.purchase) && AbstractC8576l.yandex(this.billing, audioContentCard.billing) && this.mopub == audioContentCard.mopub;
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getYandex() {
        return this.billing + '_' + this.purchase;
    }

    public final int hashCode() {
        String str = this.yandex;
        int iAdmob = AbstractC14814l.admob(AbstractC14814l.admob((str == null ? 0 : str.hashCode()) * 31, 31, this.loadAd), 31, this.crashlytics);
        String str2 = this.amazon;
        return this.mopub.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert((iAdmob + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.purchase), 31, this.billing);
    }

    public final String toString() {
        return "AudioContentCard(editorAnnotation=" + this.yandex + ", editorBackgroundImage=" + this.loadAd + ", editorGradientImage=" + this.crashlytics + ", editorTag=" + this.amazon + ", entityId=" + this.purchase + ", entityOwnerId=" + this.billing + ", entityType=" + this.mopub + ')';
    }
}
