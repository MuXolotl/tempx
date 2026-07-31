package defpackage;

/* JADX INFO: renamed from: l٘ٓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17910l extends AbstractC15603l implements InterfaceC16189l {
    private static final C17910l zzb;
    private InterfaceC14009l zzd = C2742l.f5945l;

    static {
        C17910l c17910l = new C17910l();
        zzb = c17910l;
        AbstractC15603l.admob(C17910l.class, c17910l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C17280l.class});
        }
        if (i2 == 3) {
            return new C17910l();
        }
        if (i2 == 4) {
            return new C15947l(1, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
