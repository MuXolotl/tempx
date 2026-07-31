package defpackage;

/* JADX INFO: renamed from: lّۧٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13011l extends AbstractC13399l implements InterfaceC0974l {
    private static final C13011l DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER;
    private String keyUri_ = "";

    static {
        C13011l c13011l = new C13011l();
        DEFAULT_INSTANCE = c13011l;
        AbstractC13399l.license(C13011l.class, c13011l);
    }

    public static C5692l applovin() {
        return (C5692l) DEFAULT_INSTANCE.admob();
    }

    public static C13011l appmetrica(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C13011l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static void isVip(C13011l c13011l, String str) {
        c13011l.getClass();
        str.getClass();
        c13011l.keyUri_ = str;
    }

    public static C13011l signatures() {
        return DEFAULT_INSTANCE;
    }

    public final String premium() {
        return this.keyUri_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
        }
        if (iInmobi == 3) {
            return new C13011l();
        }
        if (iInmobi == 4) {
            return new C5692l(DEFAULT_INSTANCE);
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
        synchronized (C13011l.class) {
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
