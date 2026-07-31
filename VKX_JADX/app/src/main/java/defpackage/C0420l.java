package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؑٚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0420l extends AbstractC0288l {
    private static final C0420l zzk;
    private static volatile InterfaceC1400l zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private InterfaceC9971l zzj = C8624l.f17771l;

    static {
        C0420l c0420l = new C0420l();
        zzk = c0420l;
        AbstractC0288l.metrica(C0420l.class, c0420l);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C1915l m520throws() {
        return (C1915l) zzk.isPro();
    }

    public final String Signature() {
        return this.zze;
    }

    public final boolean ad() {
        return (this.zzb & 4) != 0;
    }

    public final long advert() {
        return this.zzg;
    }

    public final double applovin() {
        return this.zzi;
    }

    public final InterfaceC9971l appmetrica() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m521catch() {
        this.zzj = C8624l.f17771l;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final /* synthetic */ void m522extends() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m523for(C0420l c0420l) {
        InterfaceC9971l interfaceC9971l = this.zzj;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzj = AbstractC9029l.subscription(interfaceC9971l);
        }
        this.zzj.add(c0420l);
    }

    public final int inmobi() {
        return this.zzj.size();
    }

    public final boolean isVip() {
        return (this.zzb & 8) != 0;
    }

    public final boolean license() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final /* synthetic */ void m524native() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final /* synthetic */ void m525package(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final boolean premium() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final /* synthetic */ void m526private(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final String pro() {
        return this.zzf;
    }

    public final float signatures() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final /* synthetic */ void m527strictfp() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C0420l.class});
        }
        if (i2 == 3) {
            return new C0420l();
        }
        if (i2 == 4) {
            return new C1915l(zzk);
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
        synchronized (C0420l.class) {
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

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final /* synthetic */ void m528synchronized(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final boolean tapsense() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m529throw(ArrayList arrayList) {
        InterfaceC9971l interfaceC9971l = this.zzj;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzj = AbstractC9029l.subscription(interfaceC9971l);
        }
        AbstractC12570l.amazon(arrayList, this.zzj);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final /* synthetic */ void m530volatile(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }
}
