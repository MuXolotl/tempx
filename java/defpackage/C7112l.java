package defpackage;

/* JADX INFO: renamed from: lؚؚؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7112l implements InterfaceC7386l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f14892l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f14893l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f14894l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f14895l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f14896l;

    public C7112l(float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f14894l = f;
        this.f14893l = z;
        this.f14892l = z2;
        this.f14896l = z3;
        this.f14895l = z4;
    }

    @Override // defpackage.InterfaceC6848l
    public final C9902l admob(C9902l c9902l, float f, C4565l c4565l) {
        float f2 = f / 7.0f;
        float f3 = this.f14894l;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float f4 = f2 * f3;
        float fAmazon = AbstractC8576l.amazon(0.25f, 0.0f, 0.5f);
        float f5 = fAmazon * f;
        float f6 = (f - (4.0f * f4)) * fAmazon;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        boolean z = this.f14893l;
        long j = z ? jFloatToRawIntBits : 0L;
        boolean z2 = this.f14896l;
        long j2 = z2 ? jFloatToRawIntBits : 0L;
        boolean z3 = this.f14892l;
        long j3 = z3 ? jFloatToRawIntBits : 0L;
        boolean z4 = this.f14895l;
        AbstractC15560l.firebase(c9902l, new C3903l(0.0f, 0.0f, f, f, j, j2, z4 ? jFloatToRawIntBits : 0L, j3));
        float f7 = f - f4;
        long j4 = 0;
        long j5 = z ? jFloatToRawIntBits2 : 0L;
        long j6 = 0;
        if (z2) {
            j4 = jFloatToRawIntBits2;
        }
        long j7 = z3 ? jFloatToRawIntBits2 : 0L;
        if (z4) {
            j6 = jFloatToRawIntBits2;
        }
        AbstractC15560l.firebase(c9902l, new C3903l(f4, f4, f7, f7, j5, j4, j6, j7));
        return c9902l;
    }
}
