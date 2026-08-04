package defpackage;

/* JADX INFO: renamed from: lؚٚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7339l extends AbstractC15603l implements InterfaceC16189l {
    private static final C7339l zzb;
    private int zzd;
    private int zze;
    private int zzf = 100;
    private int zzg;

    static {
        C7339l c7339l = new C7339l();
        zzb = c7339l;
        AbstractC15603l.admob(C7339l.class, c7339l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", C8042l.ad, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C7339l();
        }
        if (i2 == 4) {
            return new C15947l(28, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
