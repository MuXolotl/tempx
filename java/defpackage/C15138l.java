package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٔۙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15138l extends AbstractC0288l {
    private static final InterfaceC18099l zzl = new C10819l(25);
    private static final C15138l zzq;
    private static volatile InterfaceC1400l zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private InterfaceC9971l zzi;
    private InterfaceC9971l zzj;
    private InterfaceC8722l zzk;
    private C3902l zzm;
    private boolean zzn;
    private boolean zzo;
    private C17345l zzp;
    private AbstractC15619l zze = AbstractC15619l.f30516l;
    private String zzg = "";

    static {
        C15138l c15138l = new C15138l();
        zzq = c15138l;
        AbstractC0288l.metrica(C15138l.class, c15138l);
    }

    public C15138l() {
        C8624l c8624l = C8624l.f17771l;
        this.zzi = c8624l;
        this.zzj = c8624l;
        this.zzk = C12405l.f24498l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C6283l m3936package() {
        return (C6283l) zzq.isPro();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static C15138l m3937synchronized() {
        return zzq;
    }

    public final AbstractC15619l Signature() {
        return this.zze;
    }

    public final long ad() {
        return this.zzh;
    }

    public final InterfaceC9971l advert() {
        return this.zzi;
    }

    public final C3902l applovin() {
        C3902l c3902l = this.zzm;
        return c3902l == null ? C3902l.license() : c3902l;
    }

    public final boolean appmetrica() {
        return this.zzn;
    }

    public final boolean inmobi() {
        return this.zzo;
    }

    public final InterfaceC9971l isVip() {
        return this.zzj;
    }

    public final boolean license() {
        return this.zzf;
    }

    public final boolean premium() {
        return (this.zzb & 16) != 0;
    }

    public final String pro() {
        return this.zzg;
    }

    public final List signatures() {
        return new C7459l(this.zzk, zzl);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final /* synthetic */ void m3938strictfp(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C1037l.loadAd, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new C15138l();
        }
        if (i2 == 4) {
            return new C6283l(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzr;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C15138l.class) {
            try {
                c4194l = zzr;
                if (c4194l == null) {
                    c4194l = new C4194l(zzq);
                    zzr = c4194l;
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

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C17345l m3939throws() {
        C17345l c17345l = this.zzp;
        return c17345l == null ? C17345l.Signature() : c17345l;
    }
}
