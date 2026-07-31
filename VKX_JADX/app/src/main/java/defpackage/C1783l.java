package defpackage;

/* JADX INFO: renamed from: lُؓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1783l extends AbstractC17187l {
    private static final C1783l zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C1783l c1783l = new C1783l();
        zzh = c1783l;
        AbstractC17187l.mopub(C1783l.class, c1783l);
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C4687l(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C6928l.f14503l, "zze", "zzf", C1083l.f2989l});
        }
        if (i2 == 3) {
            return new C1783l();
        }
        if (i2 == 4) {
            return new C8735l(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        this.zzg = abstractC17187l == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
