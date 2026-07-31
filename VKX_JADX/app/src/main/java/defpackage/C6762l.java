package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؙۜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6762l extends AbstractC1440l {
    public final AbstractC1440l amazon;
    public final C6932l crashlytics;
    public final String loadAd;
    public final C17927l yandex;

    public C6762l(C17927l c17927l, String str, C6932l c6932l, AbstractC1440l abstractC1440l) {
        this.yandex = c17927l;
        this.loadAd = str;
        this.crashlytics = c6932l;
        this.amazon = abstractC1440l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6762l) {
            C6762l c6762l = (C6762l) obj;
            return c6762l.crashlytics == this.crashlytics && c6762l.amazon.equals(this.amazon) && c6762l.loadAd.equals(this.loadAd) && c6762l.yandex == this.yandex;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(C6762l.class, this.loadAd, this.crashlytics, this.amazon, this.yandex);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.crashlytics);
        return AbstractC9361l.advert(AbstractC14814l.license("LegacyKmsEnvelopeAead Parameters (kekUri: ", this.loadAd, ", dekParsingStrategy: ", strValueOf, ", dekParametersForNewKeys: "), String.valueOf(this.amazon), ", variant: ", String.valueOf(this.yandex), ")");
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.yandex != C17927l.mopub;
    }
}
