package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/SilentCreds;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class SilentCreds {
    public final String admob;
    public final Integer amazon;
    public final String billing;
    public final String crashlytics;
    public final Integer firebase;
    public final String isPro;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final Integer subs;
    public final String yandex;

    public SilentCreds(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, Integer num2, String str8, Integer num3) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = num;
        this.purchase = str4;
        this.billing = str5;
        this.mopub = str6;
        this.admob = str7;
        this.subs = num2;
        this.isPro = str8;
        this.firebase = num3;
    }
}
