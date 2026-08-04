package ua.itaysonlab.itunesutil;

import defpackage.AbstractC12994l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/itunesutil/ItunesSearch$ItunesItem", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class ItunesSearch$ItunesItem {
    public static final ItunesSearch$ItunesItem remoteconfig = new ItunesSearch$ItunesItem(null, null, null, null, null, null, null, null, null, null, null, null, 4095);
    public final Integer admob;
    public final String amazon;
    public final Integer billing;
    public final String crashlytics;
    public final Integer firebase;
    public final Integer isPro;
    public final String loadAd;
    public final String mopub;
    public final String purchase;
    public final String smaato;
    public final Integer subs;
    public final String yandex;

    public /* synthetic */ ItunesSearch$ItunesItem(String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, Integer num3, Integer num4, Integer num5, String str7, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : num2, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : num3, (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : num4, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : str7);
    }

    public ItunesSearch$ItunesItem(String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, Integer num3, Integer num4, Integer num5, String str7) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = str5;
        this.billing = num;
        this.mopub = str6;
        this.admob = num2;
        this.subs = num3;
        this.isPro = num4;
        this.firebase = num5;
        this.smaato = str7;
    }
}
