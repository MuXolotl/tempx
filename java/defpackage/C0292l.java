package defpackage;

/* JADX INFO: renamed from: lْؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0292l implements InterfaceC6848l {
    @Override // defpackage.InterfaceC6848l
    public final C9902l admob(C9902l c9902l, float f, C4565l c4565l) {
        boolean z = c4565l.mopub;
        boolean z2 = c4565l.purchase;
        boolean z3 = c4565l.crashlytics;
        boolean z4 = c4565l.amazon;
        float fAmazon = AbstractC8576l.amazon(0.5f, 0.0f, 0.5f) * f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fAmazon)) << 32) | (((long) Float.floatToRawIntBits(fAmazon)) & 4294967295L);
        AbstractC15560l.firebase(c9902l, new C3903l(0.0f, 0.0f, f, f, (z4 || z3) ? 0L : jFloatToRawIntBits, (z4 || z2) ? 0L : jFloatToRawIntBits, (z || z2) ? 0L : jFloatToRawIntBits, (z || z3) ? 0L : jFloatToRawIntBits));
        return c9902l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0292l.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(0.5f) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231) * 31) + 1231;
    }
}
