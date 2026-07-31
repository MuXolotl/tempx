package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: renamed from: lؗۛ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5159l {
    public static final String admob;
    public static final String billing;
    public static final String mopub;
    public static final String purchase;
    public final C18503l amazon;
    public final long crashlytics;
    public final Bundle loadAd;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
        mopub = Integer.toString(2, 36);
        admob = Integer.toString(3, 36);
    }

    public C5159l(int i, Bundle bundle, long j, C18503l c18503l) {
        AbstractC12442l.admob(c18503l == null || i < 0);
        this.yandex = i;
        this.loadAd = new Bundle(bundle);
        this.crashlytics = j;
        if (c18503l == null && i < 0) {
            c18503l = new C18503l(i);
        }
        this.amazon = c18503l;
    }

    public static C5159l yandex(Bundle bundle) {
        C18503l c18503l;
        int i = bundle.getInt(purchase, -1);
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle.getBundle(billing));
        long j = bundle.getLong(mopub, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(admob);
        if (bundle2 != null) {
            c18503l = C18503l.yandex(bundle2);
        } else {
            c18503l = i != 0 ? new C18503l(i) : null;
        }
        C18503l c18503l2 = c18503l;
        if (bundleStartapp == null) {
            bundleStartapp = Bundle.EMPTY;
        }
        return new C5159l(i, bundleStartapp, j, c18503l2);
    }

    public final Bundle loadAd() {
        Bundle bundle = new Bundle();
        bundle.putInt(purchase, this.yandex);
        bundle.putBundle(billing, this.loadAd);
        bundle.putLong(mopub, this.crashlytics);
        C18503l c18503l = this.amazon;
        if (c18503l != null) {
            bundle.putBundle(admob, c18503l.loadAd());
        }
        return bundle;
    }

    public C5159l(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), null);
    }

    public C5159l(int i) {
        this(i, Bundle.EMPTY);
    }
}
