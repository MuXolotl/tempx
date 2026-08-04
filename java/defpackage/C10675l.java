package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: lَۣۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10675l extends AbstractC0288l {
    private static final C10675l zzj;
    private static volatile InterfaceC1400l zzk;
    private int zzb;
    private long zzh;
    private C12643l zzi = C12643l.f24869l;
    private String zze = "";
    private AbstractC15619l zzf = AbstractC15619l.f30516l;
    private String zzg = "";

    static {
        C10675l c10675l = new C10675l();
        zzj = c10675l;
        AbstractC0288l.metrica(C10675l.class, c10675l);
    }

    public static C10675l isVip(AbstractC9284l abstractC9284l, C11337l c11337l) throws C9893l {
        AbstractC0288l abstractC0288lSubs = zzj.subs();
        try {
            InterfaceC12940l interfaceC12940lYandex = C8307l.crashlytics.yandex(abstractC0288lSubs.getClass());
            C12676l c12676l = (C12676l) abstractC9284l.crashlytics;
            if (c12676l == null) {
                c12676l = new C12676l(abstractC9284l, (byte) 0);
            }
            interfaceC12940lYandex.admob(abstractC0288lSubs, c12676l, c11337l);
            interfaceC12940lYandex.loadAd(abstractC0288lSubs);
            AbstractC0288l.ads(abstractC0288lSubs);
            return (C10675l) abstractC0288lSubs;
        } catch (C9893l e) {
            if (e.f20129l) {
                throw new C9893l(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C9893l) {
                throw ((C9893l) e2.getCause());
            }
            throw new C9893l(e2.getMessage(), e2);
        } catch (C1408l e3) {
            throw e3.yandex();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C9893l) {
                throw ((C9893l) e4.getCause());
            }
            throw e4;
        }
    }

    public static C10675l signatures() {
        return zzj;
    }

    public final AbstractC15619l Signature() {
        return this.zzf;
    }

    public final int ad() {
        return this.zzi.size();
    }

    public final Map advert() {
        return DesugarCollections.unmodifiableMap(this.zzi);
    }

    public final String license() {
        return this.zzg;
    }

    public final long pro() {
        return this.zzh;
    }

    @Override // defpackage.AbstractC0288l
    public final Object subscription(int i) {
        InterfaceC1400l c4194l;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C15683l(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", AbstractC2524l.yandex});
        }
        if (i2 == 3) {
            return new C10675l();
        }
        if (i2 == 4) {
            return new C7423l(zzj);
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
        synchronized (C10675l.class) {
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

    public final String tapsense() {
        return this.zze;
    }
}
