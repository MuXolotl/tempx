package defpackage;

/* JADX INFO: renamed from: lْٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15643l extends AbstractC0288l {
    private static final C15643l zzj;
    private static volatile InterfaceC1400l zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private AbstractC15619l zzf = AbstractC15619l.f30516l;
    private String zzg = "";
    private InterfaceC9971l zzi = C8624l.f17771l;

    static {
        C15643l c15643l = new C15643l();
        zzj = c15643l;
        AbstractC0288l.metrica(C15643l.class, c15643l);
    }

    public static C2115l isVip() {
        return (C2115l) zzj.isPro();
    }

    public static C15643l signatures() {
        return zzj;
    }

    public final AbstractC15619l Signature() {
        return this.zzf;
    }

    public final InterfaceC9971l ad() {
        return this.zzi;
    }

    public final int advert() {
        return this.zzi.size();
    }

    public final /* synthetic */ void applovin(AbstractC15619l abstractC15619l) {
        abstractC15619l.getClass();
        this.zzb |= 2;
        this.zzf = abstractC15619l;
    }

    public final /* synthetic */ void appmetrica(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void inmobi(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final String license() {
        return this.zzg;
    }

    public final /* synthetic */ void premium(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final long pro() {
        return this.zzh;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", C10725l.class});
        }
        if (i2 == 3) {
            return new C15643l();
        }
        if (i2 == 4) {
            return new C2115l(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzk;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C15643l.class) {
            try {
                c4194l = zzk;
                if (c4194l == null) {
                    c4194l = new C4194l(zzj);
                    zzk = c4194l;
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
    public final void m4098throws(C10725l c10725l) {
        InterfaceC9971l interfaceC9971l = this.zzi;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzi = AbstractC9029l.subscription(interfaceC9971l);
        }
        this.zzi.add(c10725l);
    }
}
