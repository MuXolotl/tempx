package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٍ٘ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9618l extends AbstractC0288l {
    private static final C9618l zzg;
    private static volatile InterfaceC1400l zzh;
    private int zzb;
    private InterfaceC9971l zze = C8624l.f17771l;
    private C18326l zzf;

    static {
        C9618l c9618l = new C9618l();
        zzg = c9618l;
        AbstractC0288l.metrica(C9618l.class, c9618l);
    }

    public final C18326l Signature() {
        C18326l c18326l = this.zzf;
        return c18326l == null ? C18326l.license() : c18326l;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", C3683l.class, "zzf"});
        }
        if (i2 == 3) {
            return new C9618l();
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
        synchronized (C9618l.class) {
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

    public final List tapsense() {
        return this.zze;
    }
}
