package defpackage;

/* JADX INFO: renamed from: lْؐۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13043l extends AbstractC13399l implements InterfaceC0974l {
    private static final C13043l DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER;
    private int bitField0_;
    private C4826l params_;

    static {
        C13043l c13043l = new C13043l();
        DEFAULT_INSTANCE = c13043l;
        AbstractC13399l.license(C13043l.class, c13043l);
    }

    public static C13043l applovin(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C13043l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static void isVip(C13043l c13043l, C4826l c4826l) {
        c13043l.getClass();
        c13043l.params_ = c4826l;
        c13043l.bitField0_ |= 1;
    }

    public static C17597l premium() {
        return (C17597l) DEFAULT_INSTANCE.admob();
    }

    public final C4826l signatures() {
        C4826l c4826l = this.params_;
        return c4826l == null ? C4826l.appmetrica() : c4826l;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "params_"});
        }
        if (iInmobi == 3) {
            return new C13043l();
        }
        if (iInmobi == 4) {
            return new C17597l(DEFAULT_INSTANCE);
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
        synchronized (C13043l.class) {
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
