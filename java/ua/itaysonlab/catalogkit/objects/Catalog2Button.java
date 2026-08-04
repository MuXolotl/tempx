package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC8576l;
import defpackage.C2336l;
import defpackage.C2580l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Button;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class Catalog2Button implements InterfaceC12360l {
    public final List adcel;
    public final String admob;
    public final String amazon;
    public final String billing;
    public final Long crashlytics;
    public final String firebase;
    public final String isPro;
    public final String loadAd;
    public final String metrica;
    public final String mopub;
    public final String purchase;
    public final String remoteconfig;
    public final Boolean smaato;
    public final List startapp;
    public final List subs;
    public final Integer vip;
    public final Catalog2ButtonAction yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Catalog2Button(Catalog2ButtonAction catalog2ButtonAction, String str, Long l, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, Boolean bool, String str9, Integer num, String str10, List list2, List list3, int i) {
        String str11 = (i & 2) != 0 ? null : str;
        Long l2 = (i & 4) != 0 ? null : l;
        String str12 = (i & 8) != 0 ? null : str2;
        String str13 = (i & 16) != 0 ? null : str3;
        String str14 = (i & 32) != 0 ? null : str4;
        String str15 = (i & 64) != 0 ? null : str5;
        String str16 = (i & 128) != 0 ? null : str6;
        List list4 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : list;
        String str17 = (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : str7;
        String str18 = (i & 1024) != 0 ? null : str8;
        Boolean bool2 = (i & 2048) != 0 ? null : bool;
        String str19 = (i & 4096) != 0 ? null : str9;
        Integer num2 = (i & 8192) != 0 ? null : num;
        String str20 = (i & 16384) != 0 ? null : str10;
        int i2 = 32768 & i;
        C2580l c2580l = C2580l.f5619l;
        this(catalog2ButtonAction, str11, l2, str12, str13, str14, str15, str16, list4, str17, str18, bool2, str19, num2, str20, i2 != 0 ? c2580l : list2, (i & 65536) != 0 ? c2580l : list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Button)) {
            return false;
        }
        Catalog2Button catalog2Button = (Catalog2Button) obj;
        return AbstractC8576l.yandex(this.yandex, catalog2Button.yandex) && AbstractC8576l.yandex(this.loadAd, catalog2Button.loadAd) && AbstractC8576l.yandex(this.crashlytics, catalog2Button.crashlytics) && AbstractC8576l.yandex(this.amazon, catalog2Button.amazon) && AbstractC8576l.yandex(this.purchase, catalog2Button.purchase) && AbstractC8576l.yandex(this.billing, catalog2Button.billing) && AbstractC8576l.yandex(this.mopub, catalog2Button.mopub) && AbstractC8576l.yandex(this.admob, catalog2Button.admob) && AbstractC8576l.yandex(this.subs, catalog2Button.subs) && AbstractC8576l.yandex(this.isPro, catalog2Button.isPro) && AbstractC8576l.yandex(this.firebase, catalog2Button.firebase) && AbstractC8576l.yandex(this.smaato, catalog2Button.smaato) && AbstractC8576l.yandex(this.remoteconfig, catalog2Button.remoteconfig) && AbstractC8576l.yandex(this.vip, catalog2Button.vip) && AbstractC8576l.yandex(this.metrica, catalog2Button.metrica) && AbstractC8576l.yandex(this.startapp, catalog2Button.startapp) && AbstractC8576l.yandex(this.adcel, catalog2Button.adcel);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getYandex() {
        StringBuilder sb = new StringBuilder();
        C2336l c2336l = AbstractC18202l.yandex;
        String strBilling = c2336l.loadAd(Catalog2Button.class).billing();
        if (strBilling == null) {
            strBilling = c2336l.loadAd(Catalog2Button.class).license();
        }
        sb.append(strBilling);
        sb.append('_');
        int iHashCode = hashCode();
        AbstractC8576l.loadAd(36);
        sb.append(Integer.toString(iHashCode, 36));
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.amazon;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchase;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.billing;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mopub;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.admob;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.subs;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.isPro;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firebase;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.smaato;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.remoteconfig;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.vip;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.metrica;
        return this.adcel.hashCode() + AbstractC14814l.admob((iHashCode14 + (str10 != null ? str10.hashCode() : 0)) * 31, 31, this.startapp);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2Button(action=");
        sb.append(this.yandex);
        sb.append(", section_id=");
        sb.append(this.loadAd);
        sb.append(", owner_id=");
        sb.append(this.crashlytics);
        sb.append(", block_id=");
        sb.append(this.amazon);
        sb.append(", mix_id=");
        sb.append(this.purchase);
        sb.append(", mix_options=");
        sb.append(this.billing);
        sb.append(", id=");
        sb.append(this.mopub);
        sb.append(", entity_id=");
        sb.append(this.admob);
        sb.append(", options=");
        sb.append(this.subs);
        sb.append(", title=");
        sb.append(this.isPro);
        sb.append(", description=");
        sb.append(this.firebase);
        sb.append(", is_following=");
        sb.append(this.smaato);
        sb.append(", ref_layout_name=");
        sb.append(this.remoteconfig);
        sb.append(", ref_items_count=");
        sb.append(this.vip);
        sb.append(", ref_data_type=");
        sb.append(this.metrica);
        sb.append(", images=");
        sb.append(this.startapp);
        sb.append(", foreground_images=");
        return AbstractC0653l.subscription(sb, this.adcel, ')');
    }

    public Catalog2Button(Catalog2ButtonAction catalog2ButtonAction, String str, Long l, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, Boolean bool, String str9, Integer num, String str10, List list2, List list3) {
        this.yandex = catalog2ButtonAction;
        this.loadAd = str;
        this.crashlytics = l;
        this.amazon = str2;
        this.purchase = str3;
        this.billing = str4;
        this.mopub = str5;
        this.admob = str6;
        this.subs = list;
        this.isPro = str7;
        this.firebase = str8;
        this.smaato = bool;
        this.remoteconfig = str9;
        this.vip = num;
        this.metrica = str10;
        this.startapp = list2;
        this.adcel = list3;
    }
}
