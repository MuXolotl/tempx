package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lٜؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4194l implements InterfaceC1400l {
    public final AbstractC0288l yandex;

    static {
        C11337l c11337l = C11337l.yandex;
        int i = AbstractC5004l.yandex;
    }

    public C4194l(AbstractC0288l abstractC0288l) {
        this.yandex = abstractC0288l;
    }

    public final AbstractC0288l yandex(InputStream inputStream, C11337l c11337l) throws C9893l {
        AbstractC9284l abstractC9284lM2630package = AbstractC9284l.m2630package(inputStream, 4096);
        int i = AbstractC0288l.zzd;
        AbstractC0288l abstractC0288lSubs = this.yandex.subs();
        try {
            InterfaceC12940l interfaceC12940lYandex = C8307l.crashlytics.yandex(abstractC0288lSubs.getClass());
            C12676l c12676l = (C12676l) abstractC9284lM2630package.crashlytics;
            if (c12676l == null) {
                c12676l = new C12676l(abstractC9284lM2630package, (byte) 0);
            }
            interfaceC12940lYandex.admob(abstractC0288lSubs, c12676l, c11337l);
            interfaceC12940lYandex.loadAd(abstractC0288lSubs);
            abstractC9284lM2630package.mo1085private(0);
            if (AbstractC0288l.adcel(abstractC0288lSubs, true)) {
                return abstractC0288lSubs;
            }
            throw new C1408l().yandex();
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
}
