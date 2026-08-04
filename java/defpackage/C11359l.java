package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lُ۟ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C11359l {
    public static final C5362l Companion = new C5362l();
    public static final InterfaceC1220l[] billing = {null, null, null, AbstractC9968l.crashlytics(2, new C3321l(18)), AbstractC9968l.crashlytics(2, new C3321l(19))};
    public static final C11359l mopub;
    public final List amazon;
    public final boolean crashlytics;
    public final String loadAd;
    public final List purchase;
    public final String yandex;

    static {
        List listRemoteconfig = AbstractC14055l.remoteconfig(32, 63, 125, 250, 500, 1000, 2000, 4000, 8000, Integer.valueOf(AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE));
        Double dValueOf = Double.valueOf(0.0d);
        mopub = new C11359l("flat", "Flat", true, listRemoteconfig, AbstractC14055l.remoteconfig(dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf, dValueOf));
    }

    public /* synthetic */ C11359l(int i, String str, String str2, boolean z, List list, List list2) {
        if (27 != (i & 27)) {
            AbstractC11036l.isPro(i, 27, C16454l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        if ((i & 4) == 0) {
            this.crashlytics = false;
        } else {
            this.crashlytics = z;
        }
        this.amazon = list;
        this.purchase = list2;
    }

    public static C11359l yandex(C11359l c11359l, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = c11359l.yandex;
        }
        return new C11359l(str, str2, (i & 4) != 0 ? c11359l.crashlytics : false, c11359l.amazon, c11359l.purchase);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11359l)) {
            return false;
        }
        C11359l c11359l = (C11359l) obj;
        return AbstractC8576l.yandex(this.yandex, c11359l.yandex) && AbstractC8576l.yandex(this.loadAd, c11359l.loadAd) && this.crashlytics == c11359l.crashlytics && AbstractC8576l.yandex(this.amazon, c11359l.amazon) && AbstractC8576l.yandex(this.purchase, c11359l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + AbstractC14814l.admob((AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd) + (this.crashlytics ? 1231 : 1237)) * 31, 31, this.amazon);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DspStoredPreset(id=");
        sb.append(this.yandex);
        sb.append(", name=");
        sb.append(this.loadAd);
        sb.append(", default=");
        sb.append(this.crashlytics);
        sb.append(", bands=");
        sb.append(this.amazon);
        sb.append(", gains=");
        return AbstractC0653l.subscription(sb, this.purchase, ')');
    }

    public C11359l(String str, String str2, boolean z, List list, List list2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = z;
        this.amazon = list;
        this.purchase = list2;
    }
}
