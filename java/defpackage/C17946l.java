package defpackage;

/* JADX INFO: renamed from: lٕ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17946l extends AbstractC17187l {
    private static final C17946l zzd;
    private InterfaceC12239l zzb = C4650l.f9468l;

    static {
        C17946l c17946l = new C17946l();
        zzd = c17946l;
        AbstractC17187l.mopub(C17946l.class, c17946l);
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C17678l.class});
        }
        if (i2 == 3) {
            return new C17946l();
        }
        if (i2 == 4) {
            return new C9870l(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
