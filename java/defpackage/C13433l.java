package defpackage;

/* JADX INFO: renamed from: lْٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13433l extends AbstractC15603l implements InterfaceC16189l {
    private static final C13433l zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private C4235l zzj;
    private C4235l zzk;

    static {
        C13433l c13433l = new C13433l();
        zzb = c13433l;
        AbstractC15603l.admob(C13433l.class, c13433l);
    }

    public static C13433l startapp() {
        return zzb;
    }

    public final String Signature() {
        return this.zze;
    }

    public final String adcel() {
        return this.zzf;
    }

    public final String ads() {
        return this.zzg;
    }

    public final C4235l metrica() {
        C4235l c4235l = this.zzj;
        return c4235l == null ? C4235l.tapsense() : c4235l;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C13433l();
        }
        if (i2 == 4) {
            return new C10667l(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String subscription() {
        return this.zzh;
    }

    public final String tapsense() {
        return this.zzi;
    }

    public final C4235l vip() {
        C4235l c4235l = this.zzk;
        return c4235l == null ? C4235l.tapsense() : c4235l;
    }
}
