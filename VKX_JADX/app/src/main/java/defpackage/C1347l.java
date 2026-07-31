package defpackage;

/* JADX INFO: renamed from: lؒۜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1347l extends AbstractC15603l implements InterfaceC16189l {
    private static final C1347l zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C1347l c1347l = new C1347l();
        zzb = c1347l;
        AbstractC15603l.admob(C1347l.class, c1347l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C1347l();
        }
        if (i2 == 4) {
            return new C15947l(6, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
