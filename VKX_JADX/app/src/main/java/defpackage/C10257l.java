package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lَِْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10257l extends AbstractC1440l {
    public final C11534l loadAd;
    public final String yandex;

    public C10257l(String str, C11534l c11534l) {
        this.yandex = str;
        this.loadAd = c11534l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10257l) {
            C10257l c10257l = (C10257l) obj;
            return c10257l.yandex.equals(this.yandex) && c10257l.loadAd == this.loadAd;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(C10257l.class, this.yandex, this.loadAd);
    }

    public final String toString() {
        return AbstractC14814l.ads("LegacyKmsAead Parameters (keyUri: ", this.yandex, ", variant: ", String.valueOf(this.loadAd), ")");
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.loadAd != C11534l.f23197l;
    }
}
