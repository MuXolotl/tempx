package defpackage;

/* JADX INFO: renamed from: lؙۡؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6812l extends AbstractC0288l {
    private static final C6812l zzi;
    private static volatile InterfaceC1400l zzj;
    private int zzb;
    private int zze;
    private C0450l zzf;
    private C0450l zzg;
    private boolean zzh;

    static {
        C6812l c6812l = new C6812l();
        zzi = c6812l;
        AbstractC0288l.metrica(C6812l.class, c6812l);
    }

    public static C16689l signatures() {
        return (C16689l) zzi.isPro();
    }

    public final int Signature() {
        return this.zze;
    }

    public final C0450l ad() {
        C0450l c0450l = this.zzg;
        return c0450l == null ? C0450l.applovin() : c0450l;
    }

    public final boolean advert() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void applovin(C0450l c0450l) {
        this.zzf = c0450l;
        this.zzb |= 2;
    }

    public final /* synthetic */ void appmetrica(C0450l c0450l) {
        this.zzg = c0450l;
        this.zzb |= 4;
    }

    public final /* synthetic */ void inmobi(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final boolean isVip() {
        return this.zzh;
    }

    public final C0450l license() {
        C0450l c0450l = this.zzf;
        return c0450l == null ? C0450l.applovin() : c0450l;
    }

    public final /* synthetic */ void premium(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final boolean pro() {
        return (this.zzb & 4) != 0;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C6812l();
        }
        if (i2 == 4) {
            return new C16689l(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzj;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C6812l.class) {
            try {
                c4194l = zzj;
                if (c4194l == null) {
                    c4194l = new C4194l(zzi);
                    zzj = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    public final boolean tapsense() {
        return (this.zzb & 1) != 0;
    }
}
