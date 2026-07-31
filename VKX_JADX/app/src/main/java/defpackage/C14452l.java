package defpackage;

/* JADX INFO: renamed from: lٓ۟۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14452l extends AbstractC0288l {
    private static final C14452l zzh;
    private static volatile InterfaceC1400l zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C14452l c14452l = new C14452l();
        zzh = c14452l;
        AbstractC0288l.metrica(C14452l.class, c14452l);
    }

    public final int Signature() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int license() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", C1037l.billing, "zzf", C1037l.purchase, "zzg", C1037l.mopub});
        }
        if (i2 == 3) {
            return new C14452l();
        }
        if (i2 == 4) {
            return new C7423l(zzh);
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
        synchronized (C14452l.class) {
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
        int iPurchase = AbstractC15450l.purchase(this.zze);
        if (iPurchase == 0) {
            return 1;
        }
        return iPurchase;
    }
}
