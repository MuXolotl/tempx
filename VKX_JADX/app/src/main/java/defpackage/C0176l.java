package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lؚؑ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0176l {
    public static final String admob;
    public static final String firebase;
    public static final String isPro;
    public static final String mopub;
    public static final String smaato;
    public static final String subs;
    public final int amazon;
    public final int billing;
    public final String crashlytics;
    public final int loadAd;
    public final Bundle purchase;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        mopub = Integer.toString(0, 36);
        admob = Integer.toString(1, 36);
        subs = Integer.toString(2, 36);
        isPro = Integer.toString(3, 36);
        firebase = Integer.toString(4, 36);
        smaato = Integer.toString(5, 36);
    }

    public C0176l(String str, int i, Bundle bundle) {
        this(1010001300, 9, str, i, new Bundle(bundle), 0);
    }

    public static C0176l yandex(Bundle bundle) {
        int i = bundle.getInt(mopub, 0);
        int i2 = bundle.getInt(firebase, 0);
        String string = bundle.getString(admob);
        string.getClass();
        String str = subs;
        AbstractC12442l.admob(bundle.containsKey(str));
        int i3 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(isPro);
        int i4 = bundle.getInt(smaato, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new C0176l(i, i2, string, i3, bundle2, i4);
    }

    public final Bundle loadAd() {
        Bundle bundle = new Bundle();
        bundle.putInt(mopub, this.yandex);
        bundle.putString(admob, this.crashlytics);
        bundle.putInt(subs, this.amazon);
        bundle.putBundle(isPro, this.purchase);
        bundle.putInt(firebase, this.loadAd);
        bundle.putInt(smaato, this.billing);
        return bundle;
    }

    public C0176l(int i, int i2, String str, int i3, Bundle bundle, int i4) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = str;
        this.amazon = i3;
        this.purchase = bundle;
        this.billing = i4;
    }
}
