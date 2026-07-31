package defpackage;

/* JADX INFO: renamed from: lًۚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8252l extends AbstractC0288l {
    private static final C8252l zzk;
    private static volatile InterfaceC1400l zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C8252l c8252l = new C8252l();
        zzk = c8252l;
        AbstractC0288l.metrica(C8252l.class, c8252l);
    }

    public static C15985l inmobi() {
        return (C15985l) zzk.isPro();
    }

    public final long Signature() {
        return this.zze;
    }

    public final String ad() {
        return this.zzg;
    }

    public final boolean advert() {
        return (this.zzb & 8) != 0;
    }

    public final boolean applovin() {
        return (this.zzb & 32) != 0;
    }

    public final double appmetrica() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final /* synthetic */ void m2282extends() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    public final long isVip() {
        return this.zzh;
    }

    public final String license() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final /* synthetic */ void m2283native() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final /* synthetic */ void m2284package(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final float premium() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final /* synthetic */ void m2285private(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    public final boolean pro() {
        return (this.zzb & 4) != 0;
    }

    public final boolean signatures() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final /* synthetic */ void m2286strictfp() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C8252l();
        }
        if (i2 == 4) {
            return new C15985l(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzl;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C8252l.class) {
            try {
                c4194l = zzl;
                if (c4194l == null) {
                    c4194l = new C4194l(zzk);
                    zzl = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final /* synthetic */ void m2287synchronized(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final boolean tapsense() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final /* synthetic */ void m2288throws(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final /* synthetic */ void m2289volatile(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }
}
