package defpackage;

/* JADX INFO: renamed from: lٌٔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14764l extends AbstractC15603l implements InterfaceC16189l {
    private static final C14764l zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        C14764l c14764l = new C14764l();
        zzb = c14764l;
        AbstractC15603l.admob(C14764l.class, c14764l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", C8042l.isPro, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C14764l();
        }
        if (i2 == 4) {
            return new C15947l(20, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
