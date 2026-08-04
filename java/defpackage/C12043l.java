package defpackage;

/* JADX INFO: renamed from: lِۖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12043l extends AbstractC0288l {
    private static final C12043l zzl;
    private static volatile InterfaceC1400l zzm;
    private int zzb;
    private String zze = "";
    private AbstractC15619l zzf = AbstractC15619l.f30516l;
    private String zzg = "";
    private InterfaceC9971l zzh;
    private InterfaceC9971l zzi;
    private boolean zzj;
    private long zzk;

    static {
        C12043l c12043l = new C12043l();
        zzl = c12043l;
        AbstractC0288l.metrica(C12043l.class, c12043l);
    }

    public C12043l() {
        C8624l c8624l = C8624l.f17771l;
        this.zzh = c8624l;
        this.zzi = c8624l;
    }

    public static C17994l isVip() {
        return (C17994l) zzl.isPro();
    }

    public final boolean Signature() {
        return (this.zzb & 2) != 0;
    }

    public final InterfaceC9971l ad() {
        return this.zzh;
    }

    public final long advert() {
        return this.zzk;
    }

    public final /* synthetic */ void applovin(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void appmetrica(C4281l c4281l) {
        InterfaceC9971l interfaceC9971l = this.zzh;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzh = AbstractC9029l.subscription(interfaceC9971l);
        }
        this.zzh.add(c4281l);
    }

    public final void inmobi(String str) {
        str.getClass();
        InterfaceC9971l interfaceC9971l = this.zzi;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzi = AbstractC9029l.subscription(interfaceC9971l);
        }
        this.zzi.add(str);
    }

    public final AbstractC15619l license() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final /* synthetic */ void m3352package(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    public final /* synthetic */ void premium(C2530l c2530l) {
        c2530l.getClass();
        this.zzb |= 2;
        this.zzf = c2530l;
    }

    public final String pro() {
        return this.zzg;
    }

    public final /* synthetic */ void signatures(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", C4281l.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C12043l();
        }
        if (i2 == 4) {
            return new C17994l(zzl);
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
        synchronized (C12043l.class) {
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

    public final String tapsense() {
        return this.zze;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final /* synthetic */ void m3353throws(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }
}
