package defpackage;

/* JADX INFO: renamed from: lَؑۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0229l extends AbstractC17187l {
    private static final C0229l zzh;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C0229l c0229l = new C0229l();
        zzh = c0229l;
        AbstractC17187l.mopub(C0229l.class, c0229l);
    }

    public static C18458l smaato() {
        return (C18458l) zzh.crashlytics();
    }

    public final /* synthetic */ void metrica(int i) {
        this.zzb |= 8;
        this.zzg = i;
    }

    public final /* synthetic */ void remoteconfig(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    public final /* synthetic */ void startapp(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", C6168l.f12990l, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C0229l();
        }
        if (i2 == 4) {
            return new C18458l(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final /* synthetic */ void vip(int i) {
        this.zzb |= 4;
        this.zzf = i;
    }
}
