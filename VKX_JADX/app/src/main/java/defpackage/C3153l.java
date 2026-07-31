package defpackage;

/* JADX INFO: renamed from: lؕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3153l extends AbstractC0288l {
    private static final C3153l zzi;
    private static volatile InterfaceC1400l zzj;
    private int zzb;
    private C17590l zze;
    private C9070l zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C3153l c3153l = new C3153l();
        zzi = c3153l;
        AbstractC0288l.metrica(C3153l.class, c3153l);
    }

    public static C3153l premium() {
        return zzi;
    }

    public final C17590l Signature() {
        C17590l c17590l = this.zze;
        return c17590l == null ? C17590l.signatures() : c17590l;
    }

    public final boolean ad() {
        return (this.zzb & 4) != 0;
    }

    public final boolean advert() {
        return this.zzg;
    }

    public final /* synthetic */ void applovin(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    public final boolean isVip() {
        return (this.zzb & 8) != 0;
    }

    public final boolean license() {
        return (this.zzb & 2) != 0;
    }

    public final C9070l pro() {
        C9070l c9070l = this.zzf;
        return c9070l == null ? C9070l.applovin() : c9070l;
    }

    public final String signatures() {
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
            return new C15683l(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C3153l();
        }
        if (i2 == 4) {
            return new C13644l(zzi);
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
        synchronized (C3153l.class) {
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
