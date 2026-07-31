package defpackage;

/* JADX INFO: renamed from: lَؙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3236l extends AbstractC13399l implements InterfaceC0974l {
    private static final C3236l DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int keySize_;
    private C16152l params_;
    private int version_;

    static {
        C3236l c3236l = new C3236l();
        DEFAULT_INSTANCE = c3236l;
        AbstractC13399l.license(C3236l.class, c3236l);
    }

    public static void isVip(C3236l c3236l, int i) {
        c3236l.keySize_ = i;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C3236l m1300package(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C3236l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static C3236l premium() {
        return DEFAULT_INSTANCE;
    }

    public static void signatures(C3236l c3236l, C16152l c16152l) {
        c3236l.getClass();
        c3236l.params_ = c16152l;
        c3236l.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C9520l m1301throws() {
        return (C9520l) DEFAULT_INSTANCE.admob();
    }

    public final int applovin() {
        return this.keySize_;
    }

    public final C16152l appmetrica() {
        C16152l c16152l = this.params_;
        return c16152l == null ? C16152l.premium() : c16152l;
    }

    public final int inmobi() {
        return this.version_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
        }
        if (iInmobi == 3) {
            return new C3236l();
        }
        if (iInmobi == 4) {
            return new C9520l(DEFAULT_INSTANCE);
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
        synchronized (C3236l.class) {
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
