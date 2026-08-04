package defpackage;

/* JADX INFO: renamed from: lٜؔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2764l extends AbstractC15603l implements InterfaceC16189l {
    private static final C2764l zzb;
    private int zzd;
    private String zze = "";
    private int zzf = 1;
    private boolean zzg;
    private int zzh;

    static {
        C2764l c2764l = new C2764l();
        zzb = c2764l;
        AbstractC15603l.admob(C2764l.class, c2764l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", C8042l.subs, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2764l();
        }
        if (i2 == 4) {
            return new C15947l(19, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
