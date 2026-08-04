package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: renamed from: lؘّٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12417l {
    public static final String admob;
    public static final C13708l amazon = AbstractC1186l.isVip(40010);
    public static final String billing;
    public static final String mopub;
    public static final C13708l purchase;
    public final Bundle crashlytics;
    public final String loadAd;
    public final int yandex;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        AbstractC13743l.yandex(7, objArr);
        purchase = AbstractC1186l.vip(7, objArr);
        String str = AbstractC15323l.yandex;
        billing = Integer.toString(0, 36);
        mopub = Integer.toString(1, 36);
        admob = Integer.toString(2, 36);
    }

    public C12417l(int i) {
        AbstractC12442l.subs(i != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.yandex = i;
        this.loadAd = "";
        this.crashlytics = Bundle.EMPTY;
    }

    public static C12417l yandex(Bundle bundle) {
        int i = bundle.getInt(billing, 0);
        if (i != 0) {
            return new C12417l(i);
        }
        String string = bundle.getString(mopub);
        string.getClass();
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle.getBundle(admob));
        if (bundleStartapp == null) {
            bundleStartapp = Bundle.EMPTY;
        }
        return new C12417l(string, bundleStartapp);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12417l)) {
            return false;
        }
        C12417l c12417l = (C12417l) obj;
        return this.yandex == c12417l.yandex && TextUtils.equals(this.loadAd, c12417l.loadAd);
    }

    public final int hashCode() {
        return Objects.hash(this.loadAd, Integer.valueOf(this.yandex));
    }

    public final Bundle loadAd() {
        Bundle bundle = new Bundle();
        bundle.putInt(billing, this.yandex);
        bundle.putString(mopub, this.loadAd);
        bundle.putBundle(admob, this.crashlytics);
        return bundle;
    }

    public C12417l(String str, Bundle bundle) {
        this.yandex = 0;
        str.getClass();
        this.loadAd = str;
        bundle.getClass();
        this.crashlytics = new Bundle(bundle);
    }
}
