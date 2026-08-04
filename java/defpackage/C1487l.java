package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؒۦ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1487l extends AbstractC0288l {
    private static final C1487l zze;
    private static volatile InterfaceC1400l zzf;
    private InterfaceC9971l zzb = C8624l.f17771l;

    static {
        C1487l c1487l = new C1487l();
        zze = c1487l;
        AbstractC0288l.metrica(C1487l.class, c1487l);
    }

    public static C8419l Signature() {
        return (C8419l) zze.isPro();
    }

    public static C1487l license() {
        return zze;
    }

    public final void pro(ArrayList arrayList) {
        InterfaceC9971l interfaceC9971l = this.zzb;
        if (!((AbstractC1277l) interfaceC9971l).f3328l) {
            this.zzb = AbstractC9029l.subscription(interfaceC9971l);
        }
        AbstractC12570l.amazon(arrayList, this.zzb);
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C3935l.class});
        }
        if (i2 == 3) {
            return new C1487l();
        }
        if (i2 == 4) {
            return new C8419l(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzf;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C1487l.class) {
            try {
                c4194l = zzf;
                if (c4194l == null) {
                    c4194l = new C4194l(zze);
                    zzf = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    public final List tapsense() {
        return this.zzb;
    }
}
