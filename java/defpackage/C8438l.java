package defpackage;

/* JADX INFO: renamed from: lًۧۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8438l extends AbstractC13399l implements InterfaceC0974l {
    private static final C8438l DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private C2596l params_;
    private int version_;

    static {
        C8438l c8438l = new C8438l();
        DEFAULT_INSTANCE = c8438l;
        AbstractC13399l.license(C8438l.class, c8438l);
    }

    public static C7952l applovin() {
        return (C7952l) DEFAULT_INSTANCE.admob();
    }

    public static C8438l appmetrica(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C8438l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static void isVip(C8438l c8438l, C2596l c2596l) {
        c8438l.getClass();
        c8438l.params_ = c2596l;
        c8438l.bitField0_ |= 1;
    }

    public final int premium() {
        return this.version_;
    }

    public final C2596l signatures() {
        C2596l c2596l = this.params_;
        return c2596l == null ? C2596l.signatures() : c2596l;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
        }
        if (iInmobi == 3) {
            return new C8438l();
        }
        if (iInmobi == 4) {
            return new C7952l(DEFAULT_INSTANCE);
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
        synchronized (C8438l.class) {
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
