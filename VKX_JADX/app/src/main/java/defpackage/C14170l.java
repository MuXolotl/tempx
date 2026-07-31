package defpackage;

/* JADX INFO: renamed from: lٕٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14170l extends AbstractC17187l {
    private static final C14170l zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private InterfaceC12239l zzf;
    private InterfaceC12239l zzg;
    private boolean zzh;

    static {
        C14170l c14170l = new C14170l();
        zzi = c14170l;
        AbstractC17187l.mopub(C14170l.class, c14170l);
    }

    public C14170l() {
        C4650l c4650l = C4650l.f9468l;
        this.zzf = c4650l;
        this.zzg = c4650l;
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005ဇ\u0002", new Object[]{"zzb", "zzd", C17334l.f33643l, "zze", "zzf", C3650l.class, "zzg", C3628l.class, "zzh"});
        }
        if (i2 == 3) {
            return new C14170l();
        }
        if (i2 == 4) {
            return new C8391l(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
