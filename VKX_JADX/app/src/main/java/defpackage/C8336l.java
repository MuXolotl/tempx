package defpackage;

import android.graphics.RectF;

/* JADX INFO: renamed from: lًؚۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8336l implements InterfaceC6848l {
    @Override // defpackage.InterfaceC6848l
    public final C9902l admob(C9902l c9902l, float f, C4565l c4565l) {
        float fAmazon = AbstractC8576l.amazon(1.0f, 0.0f, 1.0f) * f;
        float f2 = (f - fAmazon) / 2.0f;
        C8896l c8896lIsPro = AbstractC7470l.isPro((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(fAmazon)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fAmazon))));
        if (c9902l.loadAd == null) {
            c9902l.loadAd = new RectF();
        }
        c9902l.loadAd.set(c8896lIsPro.yandex, c8896lIsPro.loadAd, c8896lIsPro.crashlytics, c8896lIsPro.amazon);
        c9902l.yandex.addOval(c9902l.loadAd, AbstractC3478l.loadAd(1));
        return c9902l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8336l.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }
}
