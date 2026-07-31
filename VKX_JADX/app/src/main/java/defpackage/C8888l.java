package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٌْٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8888l extends AbstractC0288l {
    private static final C8888l zzg;
    private static volatile InterfaceC1400l zzh;
    private int zzb;
    private int zze;
    private InterfaceC11831l zzf = C6514l.f13583l;

    static {
        C8888l c8888l = new C8888l();
        zzg = c8888l;
        AbstractC0288l.metrica(C8888l.class, c8888l);
    }

    public static C15077l advert() {
        return (C15077l) zzg.isPro();
    }

    public final int Signature() {
        return this.zze;
    }

    public final long ad(int i) {
        return ((C6514l) this.zzf).billing(i);
    }

    public final /* synthetic */ void isVip(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final List license() {
        return this.zzf;
    }

    public final int pro() {
        return ((C6514l) this.zzf).size();
    }

    public final void signatures(List list) {
        RandomAccess randomAccess = this.zzf;
        if (!((AbstractC1277l) randomAccess).f3328l) {
            C6514l c6514l = (C6514l) randomAccess;
            int i = c6514l.f13585l;
            this.zzf = c6514l.license(i + i);
        }
        AbstractC12570l.amazon(list, this.zzf);
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C8888l();
        }
        if (i2 == 4) {
            return new C15077l(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzh;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C8888l.class) {
            try {
                c4194l = zzh;
                if (c4194l == null) {
                    c4194l = new C4194l(zzg);
                    zzh = c4194l;
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
