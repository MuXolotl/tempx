package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘؗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5468l extends AbstractC0288l {
    private static final C5468l zzw;
    private static volatile InterfaceC1400l zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private InterfaceC9971l zzh;
    private InterfaceC9971l zzi;
    private InterfaceC9971l zzj;
    private String zzk;
    private boolean zzl;
    private InterfaceC9971l zzm;
    private InterfaceC9971l zzn;
    private String zzo;
    private String zzp;
    private C15651l zzq;
    private C16473l zzr;
    private C16453l zzs;
    private C3402l zzt;
    private C0752l zzu;
    private InterfaceC8722l zzv;

    static {
        C5468l c5468l = new C5468l();
        zzw = c5468l;
        AbstractC0288l.metrica(C5468l.class, c5468l);
    }

    public C5468l() {
        C8624l c8624l = C8624l.f17771l;
        this.zzh = c8624l;
        this.zzi = c8624l;
        this.zzj = c8624l;
        this.zzk = "";
        this.zzm = c8624l;
        this.zzn = c8624l;
        this.zzo = "";
        this.zzp = "";
        this.zzv = C12405l.f24498l;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static C12380l m1781native() {
        return (C12380l) zzw.isPro();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static C5468l m1782private() {
        return zzw;
    }

    public final long Signature() {
        return this.zze;
    }

    public final InterfaceC9971l ad() {
        return this.zzh;
    }

    public final int advert() {
        return this.zzi.size();
    }

    public final int applovin() {
        return this.zzm.size();
    }

    public final InterfaceC9971l appmetrica() {
        return this.zzn;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m1783extends(int i, C6862l c6862l) {
        InterfaceC9971l interfaceC9971l = this.zzi;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzi = AbstractC9029l.subscription(interfaceC9971l);
        }
        this.zzi.set(i, c6862l);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m1784for() {
        this.zzj = C8624l.f17771l;
    }

    public final String inmobi() {
        return this.zzo;
    }

    public final C6862l isVip(int i) {
        return (C6862l) this.zzi.get(i);
    }

    public final boolean license() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C15651l m1785package() {
        C15651l c15651l = this.zzq;
        return c15651l == null ? C15651l.isVip() : c15651l;
    }

    public final InterfaceC9971l premium() {
        return this.zzm;
    }

    public final String pro() {
        return this.zzf;
    }

    public final List signatures() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final C16453l m1786strictfp() {
        C16453l c16453l = this.zzs;
        return c16453l == null ? C16453l.license() : c16453l;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", C0762l.class, "zzi", C6862l.class, "zzj", C11330l.class, "zzk", "zzl", "zzm", C9618l.class, "zzn", C2647l.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new C5468l();
        }
        if (i2 == 4) {
            return new C12380l(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzx;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C5468l.class) {
            try {
                c4194l = zzx;
                if (c4194l == null) {
                    c4194l = new C4194l(zzw);
                    zzx = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean m1787synchronized() {
        return (this.zzb & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0;
    }

    public final boolean tapsense() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m1788throw() {
        this.zzm = C8624l.f17771l;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m1789throws() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final InterfaceC8722l m1790volatile() {
        return this.zzv;
    }
}
