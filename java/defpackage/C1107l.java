package defpackage;

/* JADX INFO: renamed from: lؒٗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1107l extends AbstractC13399l implements InterfaceC0974l {
    private static final C1107l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC15257l keyValue_ = AbstractC15257l.f29847l;
    private C2596l params_;
    private int version_;

    static {
        C1107l c1107l = new C1107l();
        DEFAULT_INSTANCE = c1107l;
        AbstractC13399l.license(C1107l.class, c1107l);
    }

    public static C11005l inmobi() {
        return (C11005l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C1107l c1107l, C14809l c14809l) {
        c1107l.getClass();
        c1107l.keyValue_ = c14809l;
    }

    public static void signatures(C1107l c1107l, C2596l c2596l) {
        c1107l.getClass();
        c1107l.params_ = c2596l;
        c1107l.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C1107l m816throws(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C1107l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public final C2596l applovin() {
        C2596l c2596l = this.params_;
        return c2596l == null ? C2596l.signatures() : c2596l;
    }

    public final int appmetrica() {
        return this.version_;
    }

    public final AbstractC15257l premium() {
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
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (iInmobi == 3) {
            return new C1107l();
        }
        if (iInmobi == 4) {
            return new C11005l(DEFAULT_INSTANCE);
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
        synchronized (C1107l.class) {
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
