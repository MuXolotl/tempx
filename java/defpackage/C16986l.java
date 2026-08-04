package defpackage;

/* JADX INFO: renamed from: lًٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16986l extends AbstractC0288l {
    private static final C16986l zzg;
    private static volatile InterfaceC1400l zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        C16986l c16986l = new C16986l();
        zzg = c16986l;
        AbstractC0288l.metrica(C16986l.class, c16986l);
    }

    public static C0145l ad() {
        return (C0145l) zzg.isPro();
    }

    public final int Signature() {
        return this.zze;
    }

    public final /* synthetic */ void advert(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void isVip(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final boolean license() {
        return (this.zzb & 2) != 0;
    }

    public final long pro() {
        return this.zzf;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C16986l();
        }
        if (i2 == 4) {
            return new C0145l(zzg);
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
        synchronized (C16986l.class) {
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

    public final boolean tapsense() {
        return (this.zzb & 1) != 0;
    }
}
