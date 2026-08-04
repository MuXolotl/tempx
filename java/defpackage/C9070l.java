package defpackage;

/* JADX INFO: renamed from: lٌۜۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9070l extends AbstractC0288l {
    private static final C9070l zzj;
    private static volatile InterfaceC1400l zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C9070l c9070l = new C9070l();
        zzj = c9070l;
        AbstractC0288l.metrica(C9070l.class, c9070l);
    }

    public static C9070l applovin() {
        return zzj;
    }

    public final boolean Signature() {
        return (this.zzb & 2) != 0;
    }

    public final String ad() {
        return this.zzg;
    }

    public final boolean advert() {
        return (this.zzb & 8) != 0;
    }

    public final int appmetrica() {
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

    public final String isVip() {
        return this.zzh;
    }

    public final boolean license() {
        return this.zzf;
    }

    public final String premium() {
        return this.zzi;
    }

    public final boolean pro() {
        return (this.zzb & 4) != 0;
    }

    public final boolean signatures() {
        return (this.zzb & 16) != 0;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", C1037l.crashlytics, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C9070l();
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
        synchronized (C9070l.class) {
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

    public final boolean tapsense() {
        return (this.zzb & 1) != 0;
    }
}
