package defpackage;

/* JADX INFO: renamed from: lؙٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16453l extends AbstractC0288l {
    private static final C16453l zzj;
    private static volatile InterfaceC1400l zzk;
    private int zzb;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        C16453l c16453l = new C16453l();
        zzj = c16453l;
        AbstractC0288l.metrica(C16453l.class, c16453l);
    }

    public static C16453l license() {
        return zzj;
    }

    public final String Signature() {
        return this.zzi;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C16453l();
        }
        if (i2 == 4) {
            return new C7423l(zzj);
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
        synchronized (C16453l.class) {
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

    public final int tapsense() {
        return this.zzh;
    }
}
