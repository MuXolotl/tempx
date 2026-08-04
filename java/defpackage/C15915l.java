package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٕٟۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15915l extends AbstractC0288l {
    private static final C15915l zzg;
    private static volatile InterfaceC1400l zzh;
    private int zzb;
    private InterfaceC9971l zze = C8624l.f17771l;
    private String zzf = "";

    static {
        C15915l c15915l = new C15915l();
        zzg = c15915l;
        AbstractC0288l.metrica(C15915l.class, c15915l);
    }

    public static C15915l Signature() {
        return zzg;
    }

    public final void license(String str) {
        InterfaceC9971l interfaceC9971l = this.zze;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zze = AbstractC9029l.subscription(interfaceC9971l);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void pro(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C15915l();
        }
        if (i2 == 4) {
            return new C8200l(zzg);
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
        synchronized (C15915l.class) {
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

    public final List tapsense() {
        return this.zze;
    }
}
