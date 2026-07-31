package defpackage;

/* JADX INFO: renamed from: lٖؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1216l extends AbstractC17187l {
    private static final C1216l zzi;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        C1216l c1216l = new C1216l();
        zzi = c1216l;
        AbstractC17187l.mopub(C1216l.class, c1216l);
    }

    public static C17369l smaato() {
        return (C17369l) zzi.crashlytics();
    }

    public final /* synthetic */ void adcel(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void metrica(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    public final /* synthetic */ void remoteconfig(int i) {
        this.zzb |= 2;
        this.zze = i;
    }

    public final /* synthetic */ void startapp(long j) {
        this.zzb |= 16;
        this.zzh = j;
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzi, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", C15718l.f30867l, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C1216l();
        }
        if (i2 == 4) {
            return new C17369l(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final /* synthetic */ void vip(int i) {
        this.zzb |= 4;
        this.zzf = i;
    }
}
