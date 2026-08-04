package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lُٟۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11232l extends AbstractC8443l {
    public final C9676l amazon;
    public final C2204l crashlytics;
    public final C6636l loadAd;
    public final C15026l yandex;

    public C11232l(C15026l c15026l, C6636l c6636l, C2204l c2204l, C9676l c9676l) {
        this.yandex = c15026l;
        this.loadAd = c6636l;
        this.crashlytics = c2204l;
        this.amazon = c9676l;
    }

    public static C12014l loadAd() {
        C12014l c12014l = new C12014l(15, false);
        c12014l.f23941l = null;
        c12014l.f23940l = null;
        c12014l.f23944l = null;
        c12014l.f23943l = C9676l.f19755l;
        return c12014l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11232l)) {
            return false;
        }
        C11232l c11232l = (C11232l) obj;
        return this.yandex == c11232l.yandex && this.loadAd == c11232l.loadAd && this.crashlytics == c11232l.crashlytics && this.amazon == c11232l.amazon;
    }

    public final int hashCode() {
        return Objects.hash(C11232l.class, this.yandex, this.loadAd, this.crashlytics, this.amazon);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.amazon);
        String strValueOf2 = String.valueOf(this.yandex);
        return AbstractC9361l.advert(AbstractC14814l.license("HPKE Parameters (Variant: ", strValueOf, ", KemId: ", strValueOf2, ", KdfId: "), String.valueOf(this.loadAd), ", AeadId: ", String.valueOf(this.crashlytics), ")");
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.amazon != C9676l.f19755l;
    }
}
