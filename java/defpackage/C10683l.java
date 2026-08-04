package defpackage;

/* JADX INFO: renamed from: lَُۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10683l extends AbstractC15603l implements InterfaceC16189l {
    private static final C10683l zzb;
    private int zzd;
    private C7824l zzj;
    private byte zzk = 2;
    private InterfaceC0250l zze = C14363l.f28110l;
    private InterfaceC9596l zzf = C14217l.f27817l;
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        C10683l c10683l = new C10683l();
        zzb = c10683l;
        AbstractC15603l.admob(C10683l.class, c10683l);
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C10683l();
        }
        if (i2 == 4) {
            return new C10667l(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
