package defpackage;

/* JADX INFO: renamed from: lؖٞۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4281l extends AbstractC0288l {
    private static final C4281l zzh;
    private static volatile InterfaceC1400l zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        C4281l c4281l = new C4281l();
        zzh = c4281l;
        AbstractC0288l.metrica(C4281l.class, c4281l);
    }

    public static C12390l isVip() {
        return (C12390l) zzh.isPro();
    }

    public static C4281l signatures() {
        return zzh;
    }

    public final long Signature() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final String ad() {
        return this.zze == 4 ? (String) this.zzf : "";
    }

    public final AbstractC15619l advert() {
        return this.zze == 5 ? (AbstractC15619l) this.zzf : AbstractC15619l.f30516l;
    }

    public final /* synthetic */ void applovin(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void appmetrica(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void inmobi(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    public final boolean license() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final /* synthetic */ void m1520package(C2530l c2530l) {
        c2530l.getClass();
        this.zze = 5;
        this.zzf = c2530l;
    }

    public final /* synthetic */ void premium(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final double pro() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new C4281l();
        }
        if (i2 == 4) {
            return new C12390l(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzi;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C4281l.class) {
            try {
                c4194l = zzi;
                if (c4194l == null) {
                    c4194l = new C4194l(zzh);
                    zzi = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final int m1521synchronized() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public final String tapsense() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final /* synthetic */ void m1522throws(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }
}
