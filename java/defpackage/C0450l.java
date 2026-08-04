package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٜٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0450l extends AbstractC0288l {
    private static final C0450l zzh;
    private static volatile InterfaceC1400l zzi;
    private InterfaceC11831l zzb;
    private InterfaceC11831l zze;
    private InterfaceC9971l zzf;
    private InterfaceC9971l zzg;

    static {
        C0450l c0450l = new C0450l();
        zzh = c0450l;
        AbstractC0288l.metrica(C0450l.class, c0450l);
    }

    public C0450l() {
        C6514l c6514l = C6514l.f13583l;
        this.zzb = c6514l;
        this.zze = c6514l;
        C8624l c8624l = C8624l.f17771l;
        this.zzf = c8624l;
        this.zzg = c8624l;
    }

    public static C0450l applovin() {
        return zzh;
    }

    public static C3269l premium() {
        return (C3269l) zzh.isPro();
    }

    public final int Signature() {
        return ((C6514l) this.zzb).size();
    }

    public final InterfaceC9971l ad() {
        return this.zzf;
    }

    public final int advert() {
        return this.zzf.size();
    }

    public final void appmetrica(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((AbstractC1277l) randomAccess).f3328l) {
            C6514l c6514l = (C6514l) randomAccess;
            int i = c6514l.f13585l;
            this.zzb = c6514l.license(i + i);
        }
        AbstractC12570l.amazon(iterable, this.zzb);
    }

    public final void inmobi() {
        this.zzb = C6514l.f13583l;
    }

    public final InterfaceC9971l isVip() {
        return this.zzg;
    }

    public final List license() {
        return this.zze;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m541native() {
        this.zzg = C8624l.f17771l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m542package() {
        this.zze = C6514l.f13583l;
    }

    public final int pro() {
        return ((C6514l) this.zze).size();
    }

    public final int signatures() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m543strictfp() {
        this.zzf = C8624l.f17771l;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", C16986l.class, "zzg", C8888l.class});
        }
        if (i2 == 3) {
            return new C0450l();
        }
        if (i2 == 4) {
            return new C3269l(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzi;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C0450l.class) {
            try {
                c4194l = zzi;
                if (c4194l == null) {
                    c4194l = new C4194l(zzh);
                    zzi = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m544synchronized(ArrayList arrayList) {
        InterfaceC9971l interfaceC9971l = this.zzf;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzf = AbstractC9029l.subscription(interfaceC9971l);
        }
        AbstractC12570l.amazon(arrayList, this.zzf);
    }

    public final List tapsense() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m545throws(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((AbstractC1277l) randomAccess).f3328l) {
            C6514l c6514l = (C6514l) randomAccess;
            int i = c6514l.f13585l;
            this.zze = c6514l.license(i + i);
        }
        AbstractC12570l.amazon(list, this.zze);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m546volatile(Iterable iterable) {
        InterfaceC9971l interfaceC9971l = this.zzg;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzg = AbstractC9029l.subscription(interfaceC9971l);
        }
        AbstractC12570l.amazon(iterable, this.zzg);
    }
}
