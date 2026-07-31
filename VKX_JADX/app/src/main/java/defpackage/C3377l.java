package defpackage;

/* JADX INFO: renamed from: lؘؕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3377l extends AbstractC0288l {
    private static final C3377l zzg;
    private static volatile InterfaceC1400l zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        C3377l c3377l = new C3377l();
        zzg = c3377l;
        AbstractC0288l.metrica(C3377l.class, c3377l);
    }

    public static C10620l tapsense() {
        return (C10620l) zzg.isPro();
    }

    public final /* synthetic */ void Signature(int i) {
        this.zze = i - 2;
        this.zzb |= 1;
    }

    public final /* synthetic */ void license(int i) {
        if (i == 1) {
            C8339l.metrica("Can't get the number of an unknown enum value.");
        } else {
            this.zzf = i - 2;
            this.zzb |= 2;
        }
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C3377l();
        }
        if (i2 == 4) {
            return new C10620l(zzg);
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
        synchronized (C3377l.class) {
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
}
