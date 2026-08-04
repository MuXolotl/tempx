package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؙؒٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6194l extends AbstractC0288l {
    private static final C6194l zzi;
    private static volatile InterfaceC1400l zzj;
    private int zzb;
    private InterfaceC9971l zze = C8624l.f17771l;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        C6194l c6194l = new C6194l();
        zzi = c6194l;
        AbstractC0288l.metrica(C6194l.class, c6194l);
    }

    public static C8208l premium(C6194l c6194l) {
        AbstractC10050l abstractC10050lIsPro = zzi.isPro();
        abstractC10050lIsPro.purchase(c6194l);
        return (C8208l) abstractC10050lIsPro;
    }

    public static C8208l signatures() {
        return (C8208l) zzi.isPro();
    }

    public final int Signature() {
        return this.zze.size();
    }

    public final String ad() {
        return this.zzf;
    }

    public final boolean advert() {
        return (this.zzb & 2) != 0;
    }

    public final /* synthetic */ void applovin(int i, C9030l c9030l) {
        m1965strictfp();
        this.zze.set(i, c9030l);
    }

    public final /* synthetic */ void appmetrica(C9030l c9030l) {
        m1965strictfp();
        this.zze.add(c9030l);
    }

    public final /* synthetic */ void inmobi(ArrayList arrayList) {
        m1965strictfp();
        AbstractC12570l.amazon(arrayList, this.zze);
    }

    public final String isVip() {
        return this.zzg;
    }

    public final C9030l license(int i) {
        return (C9030l) this.zze.get(i);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final /* synthetic */ void m1964package(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final boolean pro() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m1965strictfp() {
        InterfaceC9971l interfaceC9971l = this.zze;
        if (((AbstractC1277l) interfaceC9971l).f3328l) {
            return;
        }
        this.zze = AbstractC9029l.subscription(interfaceC9971l);
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", C9030l.class, "zzf", "zzg", "zzh", C1037l.firebase});
        }
        if (i2 == 3) {
            return new C6194l();
        }
        if (i2 == 4) {
            return new C8208l(zzi);
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
        synchronized (C6194l.class) {
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

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final /* synthetic */ void m1966synchronized(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final List tapsense() {
        return this.zze;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m1967throws() {
        this.zze = C8624l.f17771l;
    }
}
