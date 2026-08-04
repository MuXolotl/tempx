package defpackage;

/* JADX INFO: renamed from: lؙٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14728l extends AbstractC0288l {
    private static final C14728l zze;
    private static volatile InterfaceC1400l zzf;
    private C12643l zzb = C12643l.f24869l;

    static {
        C14728l c14728l = new C14728l();
        zze = c14728l;
        AbstractC0288l.metrica(C14728l.class, c14728l);
    }

    public static C14728l Signature() {
        return zze;
    }

    public final C12643l license() {
        C12643l c12643l = this.zzb;
        if (!c12643l.f24870l) {
            this.zzb = c12643l.yandex();
        }
        return this.zzb;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", AbstractC0027l.yandex});
        }
        if (i2 == 3) {
            return new C14728l();
        }
        if (i2 == 4) {
            return new C14827l(zze);
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
        synchronized (C14728l.class) {
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

    public final C15915l tapsense(String str, C15915l c15915l) {
        str.getClass();
        C15915l c15915l2 = (C15915l) this.zzb.get(str);
        return c15915l2 != null ? c15915l2 : c15915l;
    }
}
