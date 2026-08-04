package defpackage;

/* JADX INFO: renamed from: lؙۤۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6862l extends AbstractC0288l {
    private static final C6862l zzi;
    private static volatile InterfaceC1400l zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C6862l c6862l = new C6862l();
        zzi = c6862l;
        AbstractC0288l.metrica(C6862l.class, c6862l);
    }

    public final boolean Signature() {
        return (this.zzb & 2) != 0;
    }

    public final boolean ad() {
        return this.zzg;
    }

    public final boolean advert() {
        return (this.zzb & 8) != 0;
    }

    public final int isVip() {
        return this.zzh;
    }

    public final boolean license() {
        return this.zzf;
    }

    public final boolean pro() {
        return (this.zzb & 4) != 0;
    }

    public final /* synthetic */ void signatures(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C6862l();
        }
        if (i2 == 4) {
            return new C17399l(zzi);
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
        synchronized (C6862l.class) {
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

    public final String tapsense() {
        return this.zze;
    }
}
