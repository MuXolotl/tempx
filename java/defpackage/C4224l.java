package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؖٚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4224l {
    public Function2 amazon;
    public C7661l billing;
    public C12317l crashlytics;
    public int loadAd;
    public C13660l mopub;
    public int purchase;
    public C6931l yandex;

    public C4224l(C6931l c6931l) {
        this.yandex = c6931l;
    }

    public final void amazon(boolean z) {
        int i = this.loadAd;
        this.loadAd = z ? i | 32 : i & (-33);
    }

    public final void crashlytics() {
        C6931l c6931l = this.yandex;
        if (c6931l != null) {
            c6931l.f14537l = true;
            c6931l.f14528l.metrica();
        }
        this.yandex = null;
        this.billing = null;
        this.mopub = null;
        this.amazon = null;
    }

    public final int loadAd(Object obj) {
        int iSubscription;
        C6931l c6931l = this.yandex;
        if (c6931l == null || (iSubscription = c6931l.subscription(this, obj)) == 0) {
            return 1;
        }
        return iSubscription;
    }

    public final boolean yandex() {
        if (this.yandex != null) {
            C12317l c12317l = this.crashlytics;
            if (c12317l != null ? c12317l.yandex() : false) {
                return true;
            }
        }
        return false;
    }
}
