package defpackage;

/* JADX INFO: renamed from: lْْۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13658l extends AbstractC0288l {
    private static final C13658l zzh;
    private static volatile InterfaceC1400l zzi;
    private int zzb;
    private C3377l zzf;
    private String zze = "";
    private String zzg = "";

    static {
        C13658l c13658l = new C13658l();
        zzh = c13658l;
        AbstractC0288l.metrica(C13658l.class, c13658l);
    }

    public static C13265l Signature() {
        return (C13265l) zzh.isPro();
    }

    public final /* synthetic */ void ad(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void license(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void pro(C3377l c3377l) {
        this.zzf = c3377l;
        this.zzb |= 2;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C13658l();
        }
        if (i2 == 4) {
            return new C13265l(zzh);
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
        synchronized (C13658l.class) {
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
        return this.zze;
    }
}
