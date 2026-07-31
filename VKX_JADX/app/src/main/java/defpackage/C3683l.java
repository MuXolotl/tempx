package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؕ۟ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3683l extends AbstractC0288l {
    private static final C3683l zzk;
    private static volatile InterfaceC1400l zzl;
    private int zzb;
    private int zze;
    private InterfaceC9971l zzf = C8624l.f17771l;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C3683l c3683l = new C3683l();
        zzk = c3683l;
        AbstractC0288l.metrica(C3683l.class, c3683l);
    }

    public final String Signature() {
        return this.zzg;
    }

    public final boolean ad() {
        return (this.zzb & 8) != 0;
    }

    public final boolean advert() {
        return this.zzi;
    }

    public final boolean isVip() {
        return (this.zzb & 16) != 0;
    }

    public final boolean license() {
        return (this.zzb & 4) != 0;
    }

    public final int premium() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final String pro() {
        return this.zzh;
    }

    public final double signatures() {
        return this.zzj;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", C1037l.startapp, "zzf", C3683l.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C3683l();
        }
        if (i2 == 4) {
            return new C7423l(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzl;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C3683l.class) {
            try {
                c4194l = zzl;
                if (c4194l == null) {
                    c4194l = new C4194l(zzk);
                    zzl = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    public final List tapsense() {
        return this.zzf;
    }
}
