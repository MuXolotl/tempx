package defpackage;

/* JADX INFO: renamed from: lَۧۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10725l extends AbstractC0288l {
    private static final C10725l zzh;
    private static volatile InterfaceC1400l zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        C10725l c10725l = new C10725l();
        zzh = c10725l;
        AbstractC0288l.metrica(C10725l.class, c10725l);
    }

    public static C13679l isVip() {
        return (C13679l) zzh.isPro();
    }

    public final long Signature() {
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final String ad() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    public final AbstractC15619l advert() {
        return this.zze == 6 ? (AbstractC15619l) this.zzf : AbstractC15619l.f30516l;
    }

    public final /* synthetic */ void applovin(boolean z) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void appmetrica(double d) {
        this.zze = 4;
        this.zzf = Double.valueOf(d);
    }

    public final /* synthetic */ void inmobi(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    public final boolean license() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final int m2968package() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 5;
        }
        return 4;
    }

    public final /* synthetic */ void premium(long j) {
        this.zze = 2;
        this.zzf = Long.valueOf(j);
    }

    public final double pro() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final /* synthetic */ void signatures(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new C10725l();
        }
        if (i2 == 4) {
            return new C13679l(zzh);
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
        synchronized (C10725l.class) {
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

    public final String tapsense() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final /* synthetic */ void m2969throws(AbstractC15619l abstractC15619l) {
        abstractC15619l.getClass();
        this.zze = 6;
        this.zzf = abstractC15619l;
    }
}
