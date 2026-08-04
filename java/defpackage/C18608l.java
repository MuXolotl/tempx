package defpackage;

import java.util.List;

/* JADX INFO: renamed from: l۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18608l extends AbstractC0288l {
    private static final C18608l zze;
    private static volatile InterfaceC1400l zzf;
    private InterfaceC9971l zzb = C8624l.f17771l;

    static {
        C18608l c18608l = new C18608l();
        zze = c18608l;
        AbstractC0288l.metrica(C18608l.class, c18608l);
    }

    public static C18608l Signature(byte[] bArr, C11337l c11337l) {
        return (C18608l) AbstractC0288l.purchase(zze, bArr, c11337l);
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
            return new C18608l();
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
        synchronized (C18608l.class) {
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

    public final List tapsense() {
        return this.zzb;
    }
}
