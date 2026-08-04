package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lؕؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3152l extends AbstractC12946l {
    private static final C3152l DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile InterfaceC6634l PARSER;
    private InterfaceC10996l layout_ = C17756l.f34579l;
    private int nextIndex_;

    static {
        C3152l c3152l = new C3152l();
        DEFAULT_INSTANCE = c3152l;
        AbstractC12946l.firebase(C3152l.class, c3152l);
    }

    public static C3152l adcel() {
        return DEFAULT_INSTANCE;
    }

    public static void metrica(C3152l c3152l) {
        c3152l.getClass();
        c3152l.layout_ = C17756l.f34579l;
    }

    public static void startapp(C3152l c3152l, int i) {
        c3152l.nextIndex_ = i;
    }

    public static C3152l tapsense(InputStream inputStream) throws C0803l {
        AbstractC15029l c1752l;
        C3152l c3152l = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = AbstractC6320l.loadAd;
            int length = bArr.length;
            c1752l = new C12416l(bArr, 0, length, false);
            try {
                c1752l.ads(length);
            } catch (C0803l e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            c1752l = new C1752l(inputStream);
        }
        C1466l c1466lYandex = C1466l.yandex();
        AbstractC12946l abstractC12946lIsPro = c3152l.isPro();
        try {
            C10738l c10738l = C10738l.crashlytics;
            c10738l.getClass();
            InterfaceC9608l interfaceC9608lYandex = c10738l.yandex(abstractC12946lIsPro.getClass());
            C12676l c12676l = (C12676l) c1752l.f29554l;
            if (c12676l == null) {
                c12676l = new C12676l(c1752l);
            }
            interfaceC9608lYandex.isPro(abstractC12946lIsPro, c12676l, c1466lYandex);
            interfaceC9608lYandex.loadAd(abstractC12946lIsPro);
            if (AbstractC12946l.mopub(abstractC12946lIsPro, true)) {
                return (C3152l) abstractC12946lIsPro;
            }
            throw new C0803l(new C8491l().getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C0803l) {
                throw ((C0803l) e2.getCause());
            }
            throw e2;
        } catch (C0803l e3) {
            if (e3.f2425l) {
                throw new C0803l(e3.getMessage(), e3);
            }
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C0803l) {
                throw ((C0803l) e4.getCause());
            }
            throw new C0803l(e4.getMessage(), e4);
        } catch (C8491l e5) {
            throw new C0803l(e5.getMessage());
        }
    }

    public static void vip(C3152l c3152l, C13782l c13782l) {
        c3152l.getClass();
        InterfaceC10996l interfaceC10996l = c3152l.layout_;
        if (!((AbstractC0853l) interfaceC10996l).f2503l) {
            int size = interfaceC10996l.size();
            c3152l.layout_ = interfaceC10996l.yandex(size == 0 ? 10 : size * 2);
        }
        c3152l.layout_.add(c13782l);
    }

    public final InterfaceC10996l ads() {
        return this.layout_;
    }

    @Override // defpackage.AbstractC12946l
    public final Object amazon(int i) {
        InterfaceC6634l c1219l;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C15293l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", C13782l.class, "nextIndex_"});
            case 3:
                return new C3152l();
            case 4:
                return new C16886l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6634l interfaceC6634l = PARSER;
                if (interfaceC6634l != null) {
                    return interfaceC6634l;
                }
                synchronized (C3152l.class) {
                    try {
                        c1219l = PARSER;
                        if (c1219l == null) {
                            c1219l = new C1219l();
                            PARSER = c1219l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1219l;
            default:
                C3010l.mopub();
                return null;
        }
    }

    public final int subscription() {
        return this.nextIndex_;
    }
}
