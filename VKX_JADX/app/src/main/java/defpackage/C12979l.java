package defpackage;

/* JADX INFO: renamed from: lّۥ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12979l extends AbstractC17187l {
    private static final C12979l zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        C12979l c12979l = new C12979l();
        zzf = c12979l;
        AbstractC17187l.mopub(C12979l.class, c12979l);
    }

    public static C17670l smaato() {
        return (C17670l) zzf.crashlytics();
    }

    public final /* synthetic */ void remoteconfig(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzb", "zzd", C11485l.f23082l, "zze"});
        }
        if (i2 == 3) {
            return new C12979l();
        }
        if (i2 == 4) {
            return new C17670l(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final /* synthetic */ void vip(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }
}
