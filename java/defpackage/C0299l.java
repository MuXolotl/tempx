package defpackage;

/* JADX INFO: renamed from: lْؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0299l extends AbstractC0288l {
    private static final C0299l zzl;
    private static volatile InterfaceC1400l zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C0299l c0299l = new C0299l();
        zzl = c0299l;
        AbstractC0288l.metrica(C0299l.class, c0299l);
    }

    public static C0299l premium() {
        return zzl;
    }

    public static C1467l signatures() {
        return (C1467l) zzl.isPro();
    }

    public final boolean Signature() {
        return this.zzf;
    }

    public final boolean ad() {
        return this.zzi;
    }

    public final boolean advert() {
        return this.zzj;
    }

    public final /* synthetic */ void applovin(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final /* synthetic */ void appmetrica(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    public final /* synthetic */ void inmobi(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    public final boolean isVip() {
        return this.zzk;
    }

    public final boolean license() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final /* synthetic */ void m419package(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    public final boolean pro() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final /* synthetic */ void m420strictfp(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C0299l();
        }
        if (i2 == 4) {
            return new C1467l(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzm;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C0299l.class) {
            try {
                c4194l = zzm;
                if (c4194l == null) {
                    c4194l = new C4194l(zzl);
                    zzm = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final /* synthetic */ void m421synchronized(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    public final boolean tapsense() {
        return this.zze;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final /* synthetic */ void m422throws(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }
}
