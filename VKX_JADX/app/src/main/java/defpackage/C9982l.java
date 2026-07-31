package defpackage;

/* JADX INFO: renamed from: lٍۨٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9982l extends AbstractC13399l implements InterfaceC0974l {
    private static final C9982l DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER;
    private int bitField0_;
    private C13608l dekTemplate_;
    private String kekUri_ = "";

    static {
        C9982l c9982l = new C9982l();
        DEFAULT_INSTANCE = c9982l;
        AbstractC13399l.license(C9982l.class, c9982l);
    }

    public static C6798l inmobi() {
        return (C6798l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C9982l c9982l, C13608l c13608l) {
        c9982l.getClass();
        c13608l.getClass();
        c9982l.dekTemplate_ = c13608l;
        c9982l.bitField0_ |= 1;
    }

    public static C9982l premium() {
        return DEFAULT_INSTANCE;
    }

    public static void signatures(C9982l c9982l, String str) {
        c9982l.getClass();
        str.getClass();
        c9982l.kekUri_ = str;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C9982l m2824throws(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C9982l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public final C13608l applovin() {
        C13608l c13608l = this.dekTemplate_;
        return c13608l == null ? C13608l.applovin() : c13608l;
    }

    public final String appmetrica() {
        return this.kekUri_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
        }
        if (iInmobi == 3) {
            return new C9982l();
        }
        if (iInmobi == 4) {
            return new C6798l(DEFAULT_INSTANCE);
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
        synchronized (C9982l.class) {
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
