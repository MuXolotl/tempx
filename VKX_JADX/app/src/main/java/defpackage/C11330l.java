package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lُۛٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11330l extends AbstractC0288l {
    private static final C11330l zzj;
    private static volatile InterfaceC1400l zzk;
    private int zzb;
    private int zze;
    private InterfaceC9971l zzf;
    private InterfaceC9971l zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        C11330l c11330l = new C11330l();
        zzj = c11330l;
        AbstractC0288l.metrica(C11330l.class, c11330l);
    }

    public C11330l() {
        C8624l c8624l = C8624l.f17771l;
        this.zzf = c8624l;
        this.zzg = c8624l;
    }

    public final int Signature() {
        return this.zze;
    }

    public final C16493l ad(int i) {
        return (C16493l) this.zzf.get(i);
    }

    public final InterfaceC9971l advert() {
        return this.zzg;
    }

    public final void applovin(int i, C9540l c9540l) {
        InterfaceC9971l interfaceC9971l = this.zzg;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzg = AbstractC9029l.subscription(interfaceC9971l);
        }
        this.zzg.set(i, c9540l);
    }

    public final int isVip() {
        return this.zzg.size();
    }

    public final List license() {
        return this.zzf;
    }

    public final void premium(int i, C16493l c16493l) {
        InterfaceC9971l interfaceC9971l = this.zzf;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzf = AbstractC9029l.subscription(interfaceC9971l);
        }
        this.zzf.set(i, c16493l);
    }

    public final int pro() {
        return this.zzf.size();
    }

    public final C9540l signatures(int i) {
        return (C9540l) this.zzg.get(i);
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", C16493l.class, "zzg", C9540l.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C11330l();
        }
        if (i2 == 4) {
            return new C18375l(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzk;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C11330l.class) {
            try {
                c4194l = zzk;
                if (c4194l == null) {
                    c4194l = new C4194l(zzj);
                    zzk = c4194l;
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
