package defpackage;

import j$.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: lؘؔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5416l extends AbstractC8443l {
    public static final Set mopub;
    public final C10828l amazon;
    public final C0346l billing;
    public final C12247l crashlytics;
    public final C13114l loadAd;
    public final AbstractC3302l purchase;
    public final C15059l yandex;

    static {
        try {
            mopub = (Set) new C17132l(19).loadAd();
        } catch (Exception e) {
            C11467l.tapsense(e);
        }
    }

    public C5416l(C15059l c15059l, C13114l c13114l, C12247l c12247l, AbstractC3302l abstractC3302l, C10828l c10828l, C0346l c0346l) {
        this.yandex = c15059l;
        this.loadAd = c13114l;
        this.crashlytics = c12247l;
        this.purchase = abstractC3302l;
        this.amazon = c10828l;
        this.billing = c0346l;
    }

    public static C1424l loadAd() {
        C1424l c1424l = new C1424l();
        c1424l.f3603l = null;
        c1424l.f3602l = null;
        c1424l.f3601l = null;
        c1424l.f3605l = null;
        c1424l.f3604l = C10828l.f21887l;
        c1424l.f3606l = null;
        return c1424l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5416l)) {
            return false;
        }
        C5416l c5416l = (C5416l) obj;
        return Objects.equals(c5416l.yandex, this.yandex) && Objects.equals(c5416l.loadAd, this.loadAd) && Objects.equals(c5416l.crashlytics, this.crashlytics) && Objects.equals(c5416l.purchase, this.purchase) && Objects.equals(c5416l.amazon, this.amazon) && Objects.equals(c5416l.billing, this.billing);
    }

    public final int hashCode() {
        return Objects.hash(C5416l.class, this.yandex, this.loadAd, this.crashlytics, this.purchase, this.amazon, this.billing);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.yandex, this.loadAd, this.crashlytics, this.purchase, this.amazon, this.billing);
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.amazon != C10828l.f21887l;
    }
}
