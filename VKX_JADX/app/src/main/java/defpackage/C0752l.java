package defpackage;

/* JADX INFO: renamed from: lؚؒؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0752l extends AbstractC0288l {
    private static final C0752l zze;
    private static volatile InterfaceC1400l zzf;
    private InterfaceC9971l zzb = C8624l.f17771l;

    static {
        C0752l c0752l = new C0752l();
        zze = c0752l;
        AbstractC0288l.metrica(C0752l.class, c0752l);
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new C0752l();
        }
        if (i2 == 4) {
            return new C7423l(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzf;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C0752l.class) {
            try {
                c4194l = zzf;
                if (c4194l == null) {
                    c4194l = new C4194l(zze);
                    zzf = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }
}
