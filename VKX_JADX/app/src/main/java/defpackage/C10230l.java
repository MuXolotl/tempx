package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lَِؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10230l implements InterfaceC8917l {
    public final float[] loadAd;
    public final float[] yandex;

    public C10230l(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C8339l.metrica("Array lengths must match and be nonzero");
            throw null;
        }
        this.yandex = fArr;
        this.loadAd = fArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10230l)) {
            return false;
        }
        C10230l c10230l = (C10230l) obj;
        return Arrays.equals(this.yandex, c10230l.yandex) && Arrays.equals(this.loadAd, c10230l.loadAd);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.loadAd) + (Arrays.hashCode(this.yandex) * 31);
    }

    @Override // defpackage.InterfaceC8917l
    public final float loadAd(float f) {
        return C6096l.yandex(f, this.yandex, this.loadAd);
    }

    public final String toString() {
        return AbstractC14814l.ads("FontScaleConverter{fromSpValues=", Arrays.toString(this.yandex), ", toDpValues=", Arrays.toString(this.loadAd), "}");
    }

    @Override // defpackage.InterfaceC8917l
    public final float yandex(float f) {
        return C6096l.yandex(f, this.loadAd, this.yandex);
    }
}
