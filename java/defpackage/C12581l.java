package defpackage;

/* JADX INFO: renamed from: lّْۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12581l extends AbstractC15603l implements InterfaceC16189l {
    private static final C12581l zzb;
    private int zzd;
    private C10195l zze;
    private InterfaceC14009l zzh;
    private InterfaceC14009l zzi;
    private InterfaceC14009l zzj;
    private InterfaceC14009l zzk;
    private String zzl;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        C12581l c12581l = new C12581l();
        zzb = c12581l;
        AbstractC15603l.admob(C12581l.class, c12581l);
    }

    public C12581l() {
        C2742l c2742l = C2742l.f5945l;
        this.zzh = c2742l;
        this.zzi = c2742l;
        this.zzj = c2742l;
        this.zzk = c2742l;
        this.zzl = "";
    }

    public static C12581l metrica() {
        return zzb;
    }

    public final InterfaceC14009l Signature() {
        return this.zzj;
    }

    public final String adcel() {
        return this.zzg;
    }

    public final InterfaceC14009l ads() {
        return this.zzk;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C17171l.class, "zzi", C8601l.class, "zzj", "zzk", C11009l.class, "zzl"});
        }
        if (i2 == 3) {
            return new C12581l();
        }
        if (i2 == 4) {
            return new C10667l(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzm = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String startapp() {
        return this.zzf;
    }

    public final InterfaceC14009l subscription() {
        return this.zzi;
    }

    public final InterfaceC14009l tapsense() {
        return this.zzh;
    }

    public final C10195l vip() {
        C10195l c10195l = this.zze;
        return c10195l == null ? C10195l.vip() : c10195l;
    }
}
