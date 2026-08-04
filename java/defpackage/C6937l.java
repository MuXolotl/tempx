package defpackage;

/* JADX INFO: renamed from: lؘؚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6937l extends AbstractC13399l implements InterfaceC0974l {
    private static final C6937l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC15257l keyValue_ = AbstractC15257l.f29847l;
    private int version_;

    static {
        C6937l c6937l = new C6937l();
        DEFAULT_INSTANCE = c6937l;
        AbstractC13399l.license(C6937l.class, c6937l);
    }

    public static C1175l applovin() {
        return (C1175l) DEFAULT_INSTANCE.admob();
    }

    public static C6937l appmetrica(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C6937l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static InterfaceC14781l inmobi() {
        return DEFAULT_INSTANCE.smaato();
    }

    public static void isVip(C6937l c6937l, C14809l c14809l) {
        c6937l.getClass();
        c6937l.keyValue_ = c14809l;
    }

    public final int premium() {
        return this.version_;
    }

    public final AbstractC15257l signatures() {
        return this.keyValue_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
        }
        if (iInmobi == 3) {
            return new C6937l();
        }
        if (iInmobi == 4) {
            return new C1175l(DEFAULT_INSTANCE);
        }
        if (iInmobi == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iInmobi != 6) {
            throw null;
        }
        InterfaceC14781l interfaceC14781l = PARSER;
        if (interfaceC14781l != null) {
            return interfaceC14781l;
        }
        synchronized (C6937l.class) {
            try {
                c6768l = PARSER;
                if (c6768l == null) {
                    c6768l = new C6768l();
                    PARSER = c6768l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6768l;
    }
}
