package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC12994l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC2200l;
import defpackage.InterfaceC15749l;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Response;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class Catalog2Response {
    public final List Signature;
    public final List ad;
    public final List adcel;
    public final List admob;
    public final List ads;
    public final List advert;
    public final Catalog2Replacements amazon;
    public final List applovin;
    public final List appmetrica;
    public final List billing;
    public final Catalog2Block crashlytics;
    public final List firebase;
    public final List isPro;
    public final List isVip;
    public final List license;
    public final Catalog2Section loadAd;
    public final List metrica;
    public final List mopub;
    public final List premium;
    public final List pro;
    public final List purchase;
    public final List remoteconfig;
    public final List signatures;
    public final List smaato;
    public final List startapp;
    public final List subs;
    public final List subscription;
    public final List tapsense;
    public final List vip;
    public final Catalog2Root yandex;

    public /* synthetic */ Catalog2Response(Catalog2Root catalog2Root, Catalog2Section catalog2Section, Catalog2Block catalog2Block, Catalog2Replacements catalog2Replacements, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, int i) {
        this((i & 1) != 0 ? null : catalog2Root, (i & 2) != 0 ? null : catalog2Section, (i & 4) != 0 ? null : catalog2Block, (i & 8) != 0 ? null : catalog2Replacements, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : list4, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : list5, (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : list6, (i & 1024) != 0 ? null : list7, (i & 2048) != 0 ? null : list8, (i & 4096) != 0 ? null : list9, (i & 8192) != 0 ? null : list10, (i & 16384) != 0 ? null : list11, (i & 32768) != 0 ? null : list12, (i & 65536) != 0 ? null : list13, (i & 131072) != 0 ? null : list14, (i & 262144) != 0 ? null : list15, (i & 524288) != 0 ? null : list16, (i & 1048576) != 0 ? null : list17, (i & 2097152) != 0 ? null : list18, (i & 4194304) != 0 ? null : list19, (i & 8388608) != 0 ? null : list20, (i & 16777216) != 0 ? null : list21, (i & 33554432) != 0 ? null : list22, (i & 67108864) != 0 ? null : list23, (i & 134217728) != 0 ? null : list24, (i & 268435456) != 0 ? null : list25, (i & 536870912) != 0 ? null : list26);
    }

    public final LinkedHashMap yandex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = this.purchase;
        if (list != null) {
            int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
            if (iFirebase < 16) {
                iFirebase = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iFirebase);
            for (Object obj : list) {
                linkedHashMap2.put(String.valueOf(((VKProfile) obj).yandex), obj);
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        List list2 = this.billing;
        if (list2 != null) {
            int iFirebase2 = AbstractC2200l.firebase(AbstractC14055l.billing(list2, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iFirebase2 >= 16 ? iFirebase2 : 16);
            for (Object obj2 : list2) {
                linkedHashMap3.put(String.valueOf(-((VKProfile) obj2).yandex), obj2);
            }
            linkedHashMap.putAll(linkedHashMap3);
        }
        return linkedHashMap;
    }

    public Catalog2Response(Catalog2Root catalog2Root, Catalog2Section catalog2Section, Catalog2Block catalog2Block, Catalog2Replacements catalog2Replacements, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26) {
        this.yandex = catalog2Root;
        this.loadAd = catalog2Section;
        this.crashlytics = catalog2Block;
        this.amazon = catalog2Replacements;
        this.purchase = list;
        this.billing = list2;
        this.mopub = list3;
        this.admob = list4;
        this.subs = list5;
        this.isPro = list6;
        this.firebase = list7;
        this.smaato = list8;
        this.remoteconfig = list9;
        this.vip = list10;
        this.metrica = list11;
        this.startapp = list12;
        this.adcel = list13;
        this.ads = list14;
        this.subscription = list15;
        this.tapsense = list16;
        this.Signature = list17;
        this.license = list18;
        this.pro = list19;
        this.ad = list20;
        this.advert = list21;
        this.isVip = list22;
        this.signatures = list23;
        this.premium = list24;
        this.applovin = list25;
        this.appmetrica = list26;
    }
}
