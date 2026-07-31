package defpackage;

import android.os.Bundle;

/* JADX INFO: renamed from: lٗۜ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17425l {
    public static final String admob;
    public static final String billing;
    public static final String mopub;
    public static final String purchase;
    public final boolean amazon;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final Bundle yandex;

    static {
        String str = AbstractC15323l.yandex;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
        mopub = Integer.toString(2, 36);
        admob = Integer.toString(3, 36);
    }

    public C17425l(Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.yandex = new Bundle(bundle);
        this.loadAd = z;
        this.crashlytics = z2;
        this.amazon = z3;
    }

    public static C17425l yandex(Bundle bundle) {
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle.getBundle(purchase));
        boolean z = bundle.getBoolean(billing, false);
        boolean z2 = bundle.getBoolean(mopub, false);
        boolean z3 = bundle.getBoolean(admob, false);
        if (bundleStartapp == null) {
            bundleStartapp = Bundle.EMPTY;
        }
        return new C17425l(bundleStartapp, z, z2, z3);
    }

    public final Bundle loadAd() {
        Bundle bundle = new Bundle();
        bundle.putBundle(purchase, this.yandex);
        bundle.putBoolean(billing, this.loadAd);
        bundle.putBoolean(mopub, this.crashlytics);
        bundle.putBoolean(admob, this.amazon);
        return bundle;
    }
}
