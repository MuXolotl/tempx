package defpackage;

/* JADX INFO: renamed from: lؔۦۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3057l extends AbstractC17187l {
    private static final C3057l zzm;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private int zzk;
    private boolean zzl;

    static {
        C3057l c3057l = new C3057l();
        zzm = c3057l;
        AbstractC17187l.mopub(C3057l.class, c3057l);
    }

    public static C10222l smaato() {
        return (C10222l) zzm.crashlytics();
    }

    public final /* synthetic */ void adcel(String str) {
        str.getClass();
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void ads(String str) {
        str.getClass();
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void metrica(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void remoteconfig(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void startapp(String str) {
        str.getClass();
        this.zzb |= 8;
        this.zzg = str;
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C4687l(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C15617l.f30497l, "zzl"});
        }
        if (i2 == 3) {
            return new C3057l();
        }
        if (i2 == 4) {
            return new C10222l(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }

    public final /* synthetic */ void subscription(int i) {
        this.zzk = i - 1;
        this.zzb |= 128;
    }

    public final /* synthetic */ void vip(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }
}
