package defpackage;

/* JADX INFO: renamed from: lُّٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12534l implements InterfaceC6848l {
    @Override // defpackage.InterfaceC6848l
    public final C9902l admob(C9902l c9902l, float f, C4565l c4565l) {
        float fAmazon = AbstractC8576l.amazon(1.0f, 0.0f, 1.0f) * f;
        float f2 = (f - fAmazon) / 2.0f;
        AbstractC15560l.isPro(c9902l, AbstractC7470l.isPro((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(fAmazon)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fAmazon)))));
        return c9902l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12534l.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }
}
