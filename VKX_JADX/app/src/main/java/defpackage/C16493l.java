package defpackage;

/* JADX INFO: renamed from: lؙٖٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16493l extends AbstractC0288l {
    private static final C16493l zzk;
    private static volatile InterfaceC1400l zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private C3153l zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C16493l c16493l = new C16493l();
        zzk = c16493l;
        AbstractC0288l.metrica(C16493l.class, c16493l);
    }

    public static C14364l premium() {
        return (C14364l) zzk.isPro();
    }

    public final int Signature() {
        return this.zze;
    }

    public final boolean ad() {
        return this.zzh;
    }

    public final boolean advert() {
        return this.zzi;
    }

    public final /* synthetic */ void applovin(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final boolean isVip() {
        return (this.zzb & 32) != 0;
    }

    public final String license() {
        return this.zzf;
    }

    public final C3153l pro() {
        C3153l c3153l = this.zzg;
        return c3153l == null ? C3153l.premium() : c3153l;
    }

    public final boolean signatures() {
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
            return new C15683l(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C16493l();
        }
        if (i2 == 4) {
            return new C14364l(zzk);
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
        synchronized (C16493l.class) {
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

    public final boolean tapsense() {
        return (this.zzb & 1) != 0;
    }
}
