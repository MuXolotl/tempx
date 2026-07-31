package defpackage;

/* JADX INFO: renamed from: lِؚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12065l extends AbstractC0288l {
    private static final C12065l zzo;
    private static volatile InterfaceC1400l zzp;
    private int zzb;
    private boolean zzf;
    private InterfaceC9971l zzh;
    private InterfaceC9971l zzi;
    private InterfaceC8722l zzj;
    private C3902l zzk;
    private boolean zzl;
    private boolean zzm;
    private C17345l zzn;
    private AbstractC15619l zze = AbstractC15619l.f30516l;
    private String zzg = "";

    static {
        C12065l c12065l = new C12065l();
        zzo = c12065l;
        AbstractC0288l.metrica(C12065l.class, c12065l);
    }

    public C12065l() {
        C8624l c8624l = C8624l.f17771l;
        this.zzh = c8624l;
        this.zzi = c8624l;
        this.zzj = C12405l.f24498l;
    }

    public static C12065l tapsense() {
        return zzo;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C1037l.loadAd, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new C12065l();
        }
        if (i2 == 4) {
            return new C7423l(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzp;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C12065l.class) {
            try {
                c4194l = zzp;
                if (c4194l == null) {
                    c4194l = new C4194l(zzo);
                    zzp = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }
}
