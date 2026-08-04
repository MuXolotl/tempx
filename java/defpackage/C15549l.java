package defpackage;

/* JADX INFO: renamed from: lًٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15549l extends AbstractC0288l {
    private static final C15549l zzi;
    private static volatile InterfaceC1400l zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        C15549l c15549l = new C15549l();
        zzi = c15549l;
        AbstractC0288l.metrica(C15549l.class, c15549l);
    }

    public static C2551l tapsense() {
        return (C2551l) zzi.isPro();
    }

    public final /* synthetic */ void Signature(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void ad(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void license() {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void pro(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C15549l();
        }
        if (i2 == 4) {
            return new C2551l(zzi);
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
        synchronized (C15549l.class) {
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
}
