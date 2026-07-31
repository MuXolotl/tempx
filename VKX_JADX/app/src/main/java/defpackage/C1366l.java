package defpackage;

/* JADX INFO: renamed from: lؒ۟ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1366l extends AbstractC17187l {
    private static final C1366l zzg;
    private InterfaceC12239l zzb;
    private InterfaceC12239l zzd;
    private InterfaceC12239l zze;
    private InterfaceC12239l zzf;

    static {
        C1366l c1366l = new C1366l();
        zzg = c1366l;
        AbstractC17187l.mopub(C1366l.class, c1366l);
    }

    public C1366l() {
        C4650l c4650l = C4650l.f9468l;
        this.zzb = c4650l;
        this.zzd = c4650l;
        this.zze = c4650l;
        this.zzf = c4650l;
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zzb", C15495l.class, "zzd", C4028l.class, "zze", C15495l.class, "zzf", C4028l.class});
        }
        if (i2 == 3) {
            return new C1366l();
        }
        if (i2 == 4) {
            return new C9870l(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
