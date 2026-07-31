package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lُٕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11208l extends AbstractC12946l {
    private static final C11208l DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 3;
    public static final int LAMBDA_FIELD_NUMBER = 4;
    public static final int MY_PACKAGE_REPLACED_FIELD_NUMBER = 6;
    public static final int OPTIONS_CHANGED_FIELD_NUMBER = 2;
    private static volatile InterfaceC6634l PARSER = null;
    public static final int RUN_CALLBACK_FIELD_NUMBER = 5;
    public static final int UPDATE_FIELD_NUMBER = 1;
    private int requestCase_ = 0;
    private Object request_;

    static {
        C11208l c11208l = new C11208l();
        DEFAULT_INSTANCE = c11208l;
        AbstractC12946l.firebase(C11208l.class, c11208l);
    }

    public static void adcel(C11208l c11208l, C16296l c16296l) {
        c11208l.getClass();
        c11208l.request_ = c16296l;
        c11208l.requestCase_ = 4;
    }

    public static void ads(C11208l c11208l, C13285l c13285l) {
        c11208l.getClass();
        c11208l.request_ = c13285l;
        c11208l.requestCase_ = 5;
    }

    public static C14354l inmobi() {
        return (C14354l) DEFAULT_INSTANCE.crashlytics();
    }

    public static void metrica(C11208l c11208l, C12935l c12935l) {
        c11208l.getClass();
        c11208l.request_ = c12935l;
        c11208l.requestCase_ = 2;
    }

    public static void startapp(C11208l c11208l, C2318l c2318l) {
        c11208l.getClass();
        c11208l.request_ = c2318l;
        c11208l.requestCase_ = 3;
    }

    public static void subscription(C11208l c11208l, C12807l c12807l) {
        c11208l.getClass();
        c11208l.request_ = c12807l;
        c11208l.requestCase_ = 6;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C11208l m3052throws(byte[] bArr) throws C0803l {
        AbstractC12946l abstractC12946l = DEFAULT_INSTANCE;
        int length = bArr.length;
        C1466l c1466lYandex = C1466l.yandex();
        if (length != 0) {
            AbstractC12946l abstractC12946lIsPro = abstractC12946l.isPro();
            try {
                C10738l c10738l = C10738l.crashlytics;
                c10738l.getClass();
                InterfaceC9608l interfaceC9608lYandex = c10738l.yandex(abstractC12946lIsPro.getClass());
                C16292l c16292l = new C16292l();
                c1466lYandex.getClass();
                interfaceC9608lYandex.admob(abstractC12946lIsPro, bArr, 0, length, c16292l);
                interfaceC9608lYandex.loadAd(abstractC12946lIsPro);
                abstractC12946l = abstractC12946lIsPro;
            } catch (IndexOutOfBoundsException unused) {
                throw C0803l.mopub();
            } catch (C0803l e) {
                if (e.f2425l) {
                    throw new C0803l(e.getMessage(), e);
                }
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof C0803l) {
                    throw ((C0803l) e2.getCause());
                }
                throw new C0803l(e2.getMessage(), e2);
            } catch (C8491l e3) {
                throw new C0803l(e3.getMessage());
            }
        }
        if (abstractC12946l == null || AbstractC12946l.mopub(abstractC12946l, true)) {
            return (C11208l) abstractC12946l;
        }
        throw new C0803l(new C8491l().getMessage());
    }

    public static void vip(C11208l c11208l, C12057l c12057l) {
        c11208l.getClass();
        c11208l.request_ = c12057l;
        c11208l.requestCase_ = 1;
    }

    public final C16296l Signature() {
        return this.requestCase_ == 4 ? (C16296l) this.request_ : C16296l.subscription();
    }

    public final C12057l ad() {
        return this.requestCase_ == 1 ? (C12057l) this.request_ : C12057l.adcel();
    }

    public final boolean advert() {
        return this.requestCase_ == 3;
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
                return new C15293l(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"request_", "requestCase_", C12057l.class, C12935l.class, C2318l.class, C16296l.class, C13285l.class, C12807l.class});
            case 3:
                return new C11208l();
            case 4:
                return new C14354l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6634l interfaceC6634l = PARSER;
                if (interfaceC6634l != null) {
                    return interfaceC6634l;
                }
                synchronized (C11208l.class) {
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

    public final boolean applovin() {
        return this.requestCase_ == 5;
    }

    public final boolean appmetrica() {
        return this.requestCase_ == 1;
    }

    public final boolean isVip() {
        return this.requestCase_ == 4;
    }

    public final C12935l license() {
        return this.requestCase_ == 2 ? (C12935l) this.request_ : C12935l.subscription();
    }

    public final boolean premium() {
        return this.requestCase_ == 2;
    }

    public final C13285l pro() {
        return this.requestCase_ == 5 ? (C13285l) this.request_ : C13285l.subscription();
    }

    public final boolean signatures() {
        return this.requestCase_ == 6;
    }

    public final C2318l tapsense() {
        return this.requestCase_ == 3 ? (C2318l) this.request_ : C2318l.adcel();
    }
}
