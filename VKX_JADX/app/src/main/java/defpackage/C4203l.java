package defpackage;

/* JADX INFO: renamed from: lؖٙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4203l extends AbstractC15603l implements InterfaceC16189l {
    private static final C4203l zzb;
    private int zzd;
    private String zze = "";
    private AbstractC1096l zzf;
    private String zzg;
    private AbstractC1096l zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        C4203l c4203l = new C4203l();
        zzb = c4203l;
        AbstractC15603l.admob(C4203l.class, c4203l);
    }

    public C4203l() {
        C1700l c1700l = AbstractC1096l.f3033l;
        this.zzf = c1700l;
        this.zzg = "";
        this.zzh = c1700l;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static /* synthetic */ void metrica(C4203l c4203l, AbstractC1096l abstractC1096l) {
        abstractC1096l.getClass();
        c4203l.zzd |= 2;
        c4203l.zzf = abstractC1096l;
    }

    public static /* synthetic */ void startapp(C4203l c4203l, AbstractC1096l abstractC1096l) {
        abstractC1096l.getClass();
        c4203l.zzd |= 8;
        c4203l.zzh = abstractC1096l;
    }

    public static C7826l vip() {
        return (C7826l) zzb.amazon();
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new C4203l();
        }
        if (i2 == 4) {
            return new C7826l(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
