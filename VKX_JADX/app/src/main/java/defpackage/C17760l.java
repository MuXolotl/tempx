package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: renamed from: lؚۣ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17760l extends AbstractC8760l {
    private static final C17760l DEFAULT_INSTANCE;
    private static volatile InterfaceC1265l PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C7394l preferences_ = C7394l.f15320l;

    static {
        C17760l c17760l = new C17760l();
        DEFAULT_INSTANCE = c17760l;
        AbstractC8760l.isPro(C17760l.class, c17760l);
    }

    public static C17348l metrica() {
        return (C17348l) ((AbstractC17315l) DEFAULT_INSTANCE.loadAd(5));
    }

    public static C7394l remoteconfig(C17760l c17760l) {
        C7394l c7394l = c17760l.preferences_;
        if (!c7394l.f15321l) {
            c17760l.preferences_ = c7394l.loadAd();
        }
        return c17760l.preferences_;
    }

    public static C17760l startapp(InputStream inputStream) {
        AbstractC9284l c3870l;
        C17760l c17760l = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = AbstractC4579l.loadAd;
            int length = bArr.length;
            c3870l = new C13690l(bArr, 0, length, false);
            try {
                c3870l.purchase(length);
            } catch (C5957l e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            c3870l = new C3870l(inputStream);
        }
        C5225l c5225lYandex = C5225l.yandex();
        AbstractC8760l abstractC8760lSubs = c17760l.subs();
        try {
            C16946l c16946l = C16946l.crashlytics;
            c16946l.getClass();
            InterfaceC5100l interfaceC5100lYandex = c16946l.yandex(abstractC8760lSubs.getClass());
            C12676l c12676l = (C12676l) c3870l.crashlytics;
            if (c12676l == null) {
                c12676l = new C12676l(c3870l);
            }
            interfaceC5100lYandex.mopub(abstractC8760lSubs, c12676l, c5225lYandex);
            interfaceC5100lYandex.loadAd(abstractC8760lSubs);
            if (AbstractC8760l.purchase(abstractC8760lSubs, true)) {
                return (C17760l) abstractC8760lSubs;
            }
            throw new C5957l(new C9599l().getMessage());
        } catch (C5957l e2) {
            if (e2.f12562l) {
                throw new C5957l(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C5957l) {
                throw ((C5957l) e3.getCause());
            }
            throw new C5957l(e3.getMessage(), e3);
        } catch (C9599l e4) {
            throw new C5957l(e4.getMessage());
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof C5957l) {
                throw ((C5957l) e5.getCause());
            }
            throw e5;
        }
    }

    @Override // defpackage.AbstractC8760l
    public final Object loadAd(int i) {
        InterfaceC1265l c10511l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C13673l(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC1371l.yandex});
        }
        if (iInmobi == 3) {
            return new C17760l();
        }
        if (iInmobi == 4) {
            return new C17348l(DEFAULT_INSTANCE);
        }
        if (iInmobi == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iInmobi != 6) {
            throw null;
        }
        InterfaceC1265l interfaceC1265l = PARSER;
        if (interfaceC1265l != null) {
            return interfaceC1265l;
        }
        synchronized (C17760l.class) {
            try {
                c10511l = PARSER;
                if (c10511l == null) {
                    c10511l = new C10511l();
                    PARSER = c10511l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10511l;
    }

    public final Map vip() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
