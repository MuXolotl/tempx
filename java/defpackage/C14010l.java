package defpackage;

/* JADX INFO: renamed from: lؚٓۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14010l extends AbstractC15603l implements InterfaceC16189l {
    private static final C14010l zzb;
    private int zzd;
    private InterfaceC14009l zze = C2742l.f5945l;
    private C5085l zzf;
    private C16381l zzg;

    static {
        C14010l c14010l = new C14010l();
        zzb = c14010l;
        AbstractC15603l.admob(C14010l.class, c14010l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", C11137l.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C14010l();
        }
        if (i2 == 4) {
            return new C10667l(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
