package defpackage;

/* JADX INFO: renamed from: lٕۗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15880l extends AbstractC15603l implements InterfaceC16189l {
    private static final C15880l zzb;
    private int zzd;
    private C3495l zzf;
    private AbstractC1096l zze = AbstractC1096l.f3033l;
    private int zzg = 1;
    private float zzh = 0.75f;
    private boolean zzi = true;

    static {
        C15880l c15880l = new C15880l();
        zzb = c15880l;
        AbstractC15603l.admob(C15880l.class, c15880l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C15880l();
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
