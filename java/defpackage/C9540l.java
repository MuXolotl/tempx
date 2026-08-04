package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٍٓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9540l extends AbstractC0288l {
    private static final C9540l zzm;
    private static volatile InterfaceC1400l zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private InterfaceC9971l zzg = C8624l.f17771l;
    private boolean zzh;
    private C9070l zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C9540l c9540l = new C9540l();
        zzm = c9540l;
        AbstractC0288l.metrica(C9540l.class, c9540l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C6122l m2679throws() {
        return (C6122l) zzm.isPro();
    }

    public final int Signature() {
        return this.zze;
    }

    public final int ad() {
        return this.zzg.size();
    }

    public final C3153l advert(int i) {
        return (C3153l) this.zzg.get(i);
    }

    public final boolean applovin() {
        return this.zzk;
    }

    public final boolean appmetrica() {
        return (this.zzb & 64) != 0;
    }

    public final boolean inmobi() {
        return this.zzl;
    }

    public final boolean isVip() {
        return (this.zzb & 8) != 0;
    }

    public final String license() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final /* synthetic */ void m2680package(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final boolean premium() {
        return this.zzj;
    }

    public final List pro() {
        return this.zzg;
    }

    public final C9070l signatures() {
        C9070l c9070l = this.zzi;
        return c9070l == null ? C9070l.applovin() : c9070l;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", C3153l.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C9540l();
        }
        if (i2 == 4) {
            return new C6122l(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzn;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C9540l.class) {
            try {
                c4194l = zzn;
                if (c4194l == null) {
                    c4194l = new C4194l(zzm);
                    zzn = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m2681synchronized(int i, C3153l c3153l) {
        InterfaceC9971l interfaceC9971l = this.zzg;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzg = AbstractC9029l.subscription(interfaceC9971l);
        }
        this.zzg.set(i, c3153l);
    }

    public final boolean tapsense() {
        return (this.zzb & 1) != 0;
    }
}
