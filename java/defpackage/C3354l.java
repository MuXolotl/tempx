package defpackage;

/* JADX INFO: renamed from: lّْؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3354l extends AbstractC14165l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final long f7148l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final float f7149l = 0.25f;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long f7150l = 9205357640488583168L;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C0534l f7151l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC14165l f7152l;

    public C3354l(C3408l c3408l, long j, long j2) {
        this.f7152l = c3408l;
        this.f7148l = j;
        this.f7151l = new C0534l(j2, 5);
    }

    @Override // defpackage.AbstractC14165l
    public final void isPro(InterfaceC13349l interfaceC13349l) {
        AbstractC9361l.metrica(interfaceC13349l, this.f7148l, 0L, 0L, 0.0f, null, null, 0, 126);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
        float f = this.f7149l;
        float f2 = fIntBitsToFloat * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) * f;
        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(f2, fIntBitsToFloat2);
        try {
            AbstractC14165l abstractC14165l = this.f7152l;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32)) - (f2 * 2.0f);
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L)) - (2.0f * fIntBitsToFloat2);
            AbstractC14165l.admob(abstractC14165l, interfaceC13349l, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat4))), this.f7151l, 2);
        } finally {
            ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-f2, -fIntBitsToFloat2);
        }
    }

    @Override // defpackage.AbstractC14165l
    public final long subs() {
        return this.f7150l;
    }
}
