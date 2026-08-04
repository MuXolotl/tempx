package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lؘؒ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0871l extends AbstractC0288l {
    private static final C0871l zzl;
    private static volatile InterfaceC1400l zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private InterfaceC9971l zzg = C8624l.f17771l;

    static {
        C0871l c0871l = new C0871l();
        zzl = c0871l;
        AbstractC0288l.metrica(C0871l.class, c0871l);
    }

    public static C0871l license(InputStream inputStream, C11337l c11337l) throws C9893l {
        C0871l c0871l = zzl;
        AbstractC9284l abstractC9284lM2630package = AbstractC9284l.m2630package(inputStream, 4096);
        AbstractC0288l abstractC0288lSubs = c0871l.subs();
        try {
            InterfaceC12940l interfaceC12940lYandex = C8307l.crashlytics.yandex(abstractC0288lSubs.getClass());
            C12676l c12676l = (C12676l) abstractC9284lM2630package.crashlytics;
            if (c12676l == null) {
                c12676l = new C12676l(abstractC9284lM2630package, (byte) 0);
            }
            interfaceC12940lYandex.admob(abstractC0288lSubs, c12676l, c11337l);
            interfaceC12940lYandex.loadAd(abstractC0288lSubs);
            AbstractC0288l.ads(abstractC0288lSubs);
            return (C0871l) abstractC0288lSubs;
        } catch (C1408l e) {
            throw e.yandex();
        } catch (C9893l e2) {
            if (e2.f20129l) {
                throw new C9893l(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C9893l) {
                throw ((C9893l) e3.getCause());
            }
            throw new C9893l(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C9893l) {
                throw ((C9893l) e4.getCause());
            }
            throw e4;
        }
    }

    public final boolean Signature() {
        return this.zzf;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", C1037l.loadAd, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new C0871l();
        }
        if (i2 == 4) {
            return new C7423l(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC1400l interfaceC1400l = zzm;
        if (interfaceC1400l != null) {
            return interfaceC1400l;
        }
        synchronized (C0871l.class) {
            try {
                c4194l = zzm;
                if (c4194l == null) {
                    c4194l = new C4194l(zzl);
                    zzm = c4194l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4194l;
    }

    public final String tapsense() {
        return this.zze;
    }
}
