package defpackage;

/* JADX INFO: renamed from: lؙ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17590l extends AbstractC0288l {
    private static final C17590l zzi;
    private static volatile InterfaceC1400l zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private InterfaceC9971l zzh = C8624l.f17771l;

    static {
        C17590l c17590l = new C17590l();
        zzi = c17590l;
        AbstractC0288l.metrica(C17590l.class, c17590l);
    }

    public static C17590l signatures() {
        return zzi;
    }

    public final boolean Signature() {
        return (this.zzb & 2) != 0;
    }

    public final boolean ad() {
        return this.zzg;
    }

    public final InterfaceC9971l advert() {
        return this.zzh;
    }

    public final int isVip() {
        return this.zzh.size();
    }

    public final String license() {
        return this.zzf;
    }

    public final int premium() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final boolean pro() {
        return (this.zzb & 4) != 0;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", C1037l.amazon, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C17590l();
        }
        if (i2 == 4) {
            return new C7423l(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzj;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C17590l.class) {
            try {
                c4194l = zzj;
                if (c4194l == null) {
                    c4194l = new C4194l(zzi);
                    zzj = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    public final boolean tapsense() {
        return (this.zzb & 1) != 0;
    }
}
