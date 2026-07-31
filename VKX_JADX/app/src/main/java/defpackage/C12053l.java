package defpackage;

/* JADX INFO: renamed from: lِٟۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12053l extends AbstractC13399l implements InterfaceC0974l {
    private static final C12053l DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C13011l params_;
    private int version_;

    static {
        C12053l c12053l = new C12053l();
        DEFAULT_INSTANCE = c12053l;
        AbstractC13399l.license(C12053l.class, c12053l);
    }

    public static C15057l applovin() {
        return (C15057l) DEFAULT_INSTANCE.admob();
    }

    public static C12053l appmetrica(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C12053l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static InterfaceC14781l inmobi() {
        return DEFAULT_INSTANCE.smaato();
    }

    public static void isVip(C12053l c12053l, C13011l c13011l) {
        c12053l.getClass();
        c12053l.params_ = c13011l;
        c12053l.bitField0_ |= 1;
    }

    public final int premium() {
        return this.version_;
    }

    public final C13011l signatures() {
        C13011l c13011l = this.params_;
        return c13011l == null ? C13011l.signatures() : c13011l;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (iInmobi == 3) {
            return new C12053l();
        }
        if (iInmobi == 4) {
            return new C15057l(DEFAULT_INSTANCE);
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
        synchronized (C12053l.class) {
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
