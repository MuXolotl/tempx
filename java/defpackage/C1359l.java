package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؒ۟ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C1359l {
    public static final C16361l Companion = new C16361l();
    public static final InterfaceC1220l[] firebase = {null, AbstractC9968l.crashlytics(2, new C8810l(4)), AbstractC9968l.crashlytics(2, new C8810l(5)), null, null, null, null, null, null, null};
    public final String admob;
    public final int amazon;
    public final String billing;
    public final EnumC1318l crashlytics;
    public final String isPro;
    public final EnumC1318l loadAd;
    public final String mopub;
    public final String purchase;
    public final int subs;
    public final String yandex;

    public /* synthetic */ C1359l(int i, String str, EnumC1318l enumC1318l, EnumC1318l enumC1318l2, int i2, String str2, String str3, String str4, String str5, int i3, String str6) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = enumC1318l;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = enumC1318l2;
        }
        if ((i & 8) == 0) {
            this.amazon = 120;
        } else {
            this.amazon = i2;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str2;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = str3;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = str4;
        }
        if ((i & 128) == 0) {
            this.admob = null;
        } else {
            this.admob = str5;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.subs = 0;
        } else {
            this.subs = i3;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.isPro = null;
        } else {
            this.isPro = str6;
        }
    }
}
