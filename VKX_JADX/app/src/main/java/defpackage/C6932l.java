package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lؙۨۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6932l {
    public static final C6932l admob;
    public static final C6932l amazon;
    public static final C6932l billing;
    public static final C6932l crashlytics;
    public static final C6932l firebase;
    public static final C6932l isPro;
    public static final C6932l mopub;
    public static final C6932l purchase;
    public static volatile C15333l remoteconfig;
    public static final Object smaato = new Object();
    public static final C6932l subs;
    public final String loadAd;
    public final /* synthetic */ int yandex;

    static {
        int i = 0;
        crashlytics = new C6932l("TINK", i);
        amazon = new C6932l("CRUNCHY", i);
        purchase = new C6932l("NO_PREFIX", i);
        int i2 = 1;
        billing = new C6932l("ASSUME_AES_GCM", i2);
        mopub = new C6932l("ASSUME_XCHACHA20POLY1305", i2);
        admob = new C6932l("ASSUME_CHACHA20POLY1305", i2);
        subs = new C6932l("ASSUME_AES_CTR_HMAC", i2);
        isPro = new C6932l("ASSUME_AES_EAX", i2);
        firebase = new C6932l("ASSUME_AES_GCM_SIV", i2);
    }

    public C6932l(Context context, C0871l c0871l) {
        this.yandex = 2;
        this.loadAd = c0871l.Signature() ? AbstractC8554l.loadAd(context, c0871l.tapsense()) : c0871l.tapsense();
    }

    public String toString() {
        int i = this.yandex;
        String str = this.loadAd;
        switch (i) {
            case 0:
            case 1:
                return str;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C6932l(String str, int i) {
        this.yandex = i;
        this.loadAd = str;
    }
}
