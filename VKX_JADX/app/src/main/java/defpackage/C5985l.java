package defpackage;

/* JADX INFO: renamed from: lؘۜۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5985l extends AbstractC15603l implements InterfaceC16189l {
    private static final C5985l zzb;
    private int zzd;
    private InterfaceC14009l zzf;
    private int zzg;
    private C16298l zzh;
    private C10683l zzi;
    private C7824l zzj;
    private int zzk;
    private InterfaceC14009l zzl;
    private byte zzm = 2;
    private int zze = 17;

    static {
        C5985l c5985l = new C5985l();
        zzb = c5985l;
        AbstractC15603l.admob(C5985l.class, c5985l);
    }

    public C5985l() {
        C2742l c2742l = C2742l.f5945l;
        this.zzf = c2742l;
        this.zzl = c2742l;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", C8042l.remoteconfig, "zzf", C7543l.class, "zzg", "zzh", "zzi", "zzk", "zzl", C1347l.class, "zzj"});
        }
        if (i2 == 3) {
            return new C5985l();
        }
        if (i2 == 4) {
            return new C15947l(13, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzm = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
