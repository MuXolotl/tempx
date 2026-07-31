package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؓٔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1841l extends AbstractC0288l {
    private static final C1841l zzm;
    private static volatile InterfaceC1400l zzn;
    private int zzb;
    private InterfaceC9971l zze = C8624l.f17771l;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        C1841l c1841l = new C1841l();
        zzm = c1841l;
        AbstractC0288l.metrica(C1841l.class, c1841l);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static C13135l m1049volatile() {
        return (C13135l) zzm.isPro();
    }

    public final void Signature() {
        InterfaceC9971l interfaceC9971l = this.zze;
        if (((AbstractC1277l) interfaceC9971l).f3328l) {
            return;
        }
        this.zze = AbstractC9029l.subscription(interfaceC9971l);
    }

    public final C0420l ad(int i) {
        return (C0420l) this.zze.get(i);
    }

    public final String advert() {
        return this.zzf;
    }

    public final long applovin() {
        return this.zzh;
    }

    public final boolean appmetrica() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final /* synthetic */ void m1050case(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final /* synthetic */ void m1051catch(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final /* synthetic */ void m1052continue(long j) {
        this.zzb |= 32;
        this.zzk = j;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final /* synthetic */ void m1053else(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final /* synthetic */ void m1054extends(Iterable iterable) {
        Signature();
        AbstractC12570l.amazon(iterable, this.zze);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m1055for() {
        this.zze = C8624l.f17771l;
    }

    public final int inmobi() {
        return this.zzi;
    }

    public final boolean isVip() {
        return (this.zzb & 2) != 0;
    }

    public final List license() {
        return this.zze;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final /* synthetic */ void m1056native(int i, C0420l c0420l) {
        Signature();
        this.zze.set(i, c0420l);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final long m1057package() {
        return this.zzk;
    }

    public final boolean premium() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final /* synthetic */ void m1058private(C0420l c0420l) {
        c0420l.getClass();
        Signature();
        this.zze.add(c0420l);
    }

    public final int pro() {
        return this.zze.size();
    }

    public final long signatures() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final long m1059strictfp() {
        return this.zzl;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", C0420l.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C1841l();
        }
        if (i2 == 4) {
            return new C13135l(zzm);
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
        synchronized (C1841l.class) {
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

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final /* synthetic */ void m1060switch(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean m1061synchronized() {
        return (this.zzb & 64) != 0;
    }

    public final /* synthetic */ void tapsense(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final /* synthetic */ void m1062throw(int i) {
        Signature();
        this.zze.remove(i);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m1063throws() {
        return (this.zzb & 32) != 0;
    }
}
