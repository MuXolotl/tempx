package defpackage;

/* JADX INFO: renamed from: lٗۗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17345l extends AbstractC0288l {
    private static final C17345l zzf;
    private static volatile InterfaceC1400l zzg;
    private int zzb;
    private boolean zze;

    static {
        C17345l c17345l = new C17345l();
        zzf = c17345l;
        AbstractC0288l.metrica(C17345l.class, c17345l);
    }

    public static C17345l Signature() {
        return zzf;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new C17345l();
        }
        if (i2 == 4) {
            return new C7423l(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzg;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C17345l.class) {
            try {
                c4194l = zzg;
                if (c4194l == null) {
                    c4194l = new C4194l(zzf);
                    zzg = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    public final boolean tapsense() {
        return this.zze;
    }
}
