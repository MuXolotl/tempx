package defpackage;

/* JADX INFO: renamed from: lّ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17880l extends AbstractC0288l {
    private static final C17880l zzh;
    private static volatile InterfaceC1400l zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C17880l c17880l = new C17880l();
        zzh = c17880l;
        AbstractC0288l.metrica(C17880l.class, c17880l);
    }

    public static C4323l Signature() {
        return (C4323l) zzh.isPro();
    }

    public static C17880l license() {
        return zzh;
    }

    public final int ad() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r2
  0x0017: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int advert() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        } else {
                            i = i3;
                        }
                    }
                } else {
                    i = i3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void isVip(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final void pro(int i) {
        this.zzf = AbstractC9029l.billing(i);
        this.zzb |= 2;
    }

    public final /* synthetic */ void signatures(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", C1037l.metrica, "zzf", C1037l.remoteconfig, "zzg", C1037l.vip});
        }
        if (i2 == 3) {
            return new C17880l();
        }
        if (i2 == 4) {
            return new C4323l(zzh);
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
        synchronized (C17880l.class) {
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

    public final int tapsense() {
        int iAmazon = AbstractC9029l.amazon(this.zzf);
        if (iAmazon == 0) {
            return 1;
        }
        return iAmazon;
    }
}
