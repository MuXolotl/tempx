package defpackage;

/* JADX INFO: renamed from: lؖۥ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4504l extends AbstractC0288l {
    private static final C4504l zzg;
    private static volatile InterfaceC1400l zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        C4504l c4504l = new C4504l();
        zzg = c4504l;
        AbstractC0288l.metrica(C4504l.class, c4504l);
    }

    public final int Signature() {
        int iPurchase = AbstractC15450l.purchase(this.zzf);
        if (iPurchase == 0) {
            return 1;
        }
        return iPurchase;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            C1037l c1037l = C1037l.billing;
            return new C15683l(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", c1037l, "zzf", c1037l});
        }
        if (i2 == 3) {
            return new C4504l();
        }
        if (i2 == 4) {
            return new C7423l(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzh;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C4504l.class) {
            try {
                c4194l = zzh;
                if (c4194l == null) {
                    c4194l = new C4194l(zzg);
                    zzh = c4194l;
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
