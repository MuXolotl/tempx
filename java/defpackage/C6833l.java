package defpackage;

/* JADX INFO: renamed from: lؙٕۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6833l extends AbstractC13399l implements InterfaceC0974l {
    private static final C6833l DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C4826l params_;
    private AbstractC15257l publicKey_ = AbstractC15257l.f29847l;
    private int version_;

    static {
        C6833l c6833l = new C6833l();
        DEFAULT_INSTANCE = c6833l;
        AbstractC13399l.license(C6833l.class, c6833l);
    }

    public static C6833l applovin() {
        return DEFAULT_INSTANCE;
    }

    public static void isVip(C6833l c6833l, C4826l c4826l) {
        c6833l.getClass();
        c6833l.params_ = c4826l;
        c6833l.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C1488l m2075package() {
        return (C1488l) DEFAULT_INSTANCE.admob();
    }

    public static void premium(C6833l c6833l) {
        c6833l.version_ = 0;
    }

    public static void signatures(C6833l c6833l, C14809l c14809l) {
        c6833l.getClass();
        c6833l.publicKey_ = c14809l;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static InterfaceC14781l m2076strictfp() {
        return DEFAULT_INSTANCE.smaato();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static C6833l m2077synchronized(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C6833l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public final C4826l appmetrica() {
        C4826l c4826l = this.params_;
        return c4826l == null ? C4826l.appmetrica() : c4826l;
    }

    public final AbstractC15257l inmobi() {
        return this.publicKey_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "publicKey_"});
        }
        if (iInmobi == 3) {
            return new C6833l();
        }
        if (iInmobi == 4) {
            return new C1488l(DEFAULT_INSTANCE);
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
        synchronized (C6833l.class) {
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

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m2078throws() {
        return this.version_;
    }
}
