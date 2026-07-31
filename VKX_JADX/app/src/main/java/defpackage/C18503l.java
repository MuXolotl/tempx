package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lٟۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18503l {
    public static final String amazon;
    public static final String billing;
    public static final String purchase;
    public final Bundle crashlytics;
    public final String loadAd;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        amazon = Integer.toString(0, 36);
        purchase = Integer.toString(1, 36);
        billing = Integer.toString(2, 36);
    }

    public C18503l(String str, int i, Bundle bundle) {
        boolean z = true;
        if (i >= 0 && i != 1) {
            z = false;
        }
        AbstractC12442l.admob(z);
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = bundle;
    }

    public static C18503l yandex(Bundle bundle) {
        int i = bundle.getInt(amazon, 1000);
        String string = bundle.getString(purchase, "");
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle.getBundle(billing));
        if (bundleStartapp == null) {
            bundleStartapp = Bundle.EMPTY;
        }
        return new C18503l(string, i, bundleStartapp);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18503l)) {
            return false;
        }
        C18503l c18503l = (C18503l) obj;
        return this.yandex == c18503l.yandex && Objects.equals(this.loadAd, c18503l.loadAd);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.yandex), this.loadAd);
    }

    public final Bundle loadAd() {
        Bundle bundle = new Bundle();
        bundle.putInt(amazon, this.yandex);
        bundle.putString(purchase, this.loadAd);
        Bundle bundle2 = this.crashlytics;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(billing, bundle2);
        }
        return bundle;
    }

    public C18503l(int i) {
        this("no error message provided", i, Bundle.EMPTY);
    }
}
