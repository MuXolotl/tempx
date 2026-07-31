package defpackage;

/* JADX INFO: renamed from: lؑۥٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0701l extends AbstractC0288l {
    private static final C0701l zzg;
    private static volatile InterfaceC1400l zzh;
    private int zzb;
    private C15138l zze;
    private C12065l zzf;

    static {
        C0701l c0701l = new C0701l();
        zzg = c0701l;
        AbstractC0288l.metrica(C0701l.class, c0701l);
    }

    public static C0701l license(byte[] bArr, C11337l c11337l) {
        return (C0701l) AbstractC0288l.purchase(zzg, bArr, c11337l);
    }

    public static C6253l pro() {
        return (C6253l) zzg.isPro();
    }

    public final C12065l Signature() {
        C12065l c12065l = this.zzf;
        return c12065l == null ? C12065l.tapsense() : c12065l;
    }

    public final /* synthetic */ void ad(C15138l c15138l) {
        this.zze = c15138l;
        this.zzb |= 1;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C0701l();
        }
        if (i2 == 4) {
            return new C6253l(zzg);
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
        synchronized (C0701l.class) {
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

    public final C15138l tapsense() {
        C15138l c15138l = this.zze;
        return c15138l == null ? C15138l.m3937synchronized() : c15138l;
    }
}
