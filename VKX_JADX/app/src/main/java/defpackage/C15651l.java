package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15651l extends AbstractC0288l {
    private static final C15651l zzj;
    private static volatile InterfaceC1400l zzk;
    private int zzb;
    private InterfaceC9971l zze;
    private InterfaceC9971l zzf;
    private InterfaceC9971l zzg;
    private boolean zzh;
    private InterfaceC9971l zzi;

    static {
        C15651l c15651l = new C15651l();
        zzj = c15651l;
        AbstractC0288l.metrica(C15651l.class, c15651l);
    }

    public C15651l() {
        C8624l c8624l = C8624l.f17771l;
        this.zze = c8624l;
        this.zzf = c8624l;
        this.zzg = c8624l;
        this.zzi = c8624l;
    }

    public static C15651l isVip() {
        return zzj;
    }

    public final List Signature() {
        return this.zzf;
    }

    public final boolean ad() {
        return this.zzh;
    }

    public final InterfaceC9971l advert() {
        return this.zzi;
    }

    public final List license() {
        return this.zzg;
    }

    public final boolean pro() {
        return (this.zzb & 1) != 0;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", C14452l.class, "zzf", C4504l.class, "zzg", C1055l.class, "zzh", "zzi", C14452l.class});
        }
        if (i2 == 3) {
            return new C15651l();
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
        synchronized (C15651l.class) {
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

    public final List tapsense() {
        return this.zze;
    }
}
