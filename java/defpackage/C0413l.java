package defpackage;

/* JADX INFO: renamed from: lٕؑٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0413l extends AbstractC13399l implements InterfaceC0974l {
    private static final C0413l DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private int bitField0_;
    private C9493l params_;
    private int version_;
    private AbstractC15257l x_;
    private AbstractC15257l y_;

    static {
        C0413l c0413l = new C0413l();
        DEFAULT_INSTANCE = c0413l;
        AbstractC13399l.license(C0413l.class, c0413l);
    }

    public C0413l() {
        C14809l c14809l = AbstractC15257l.f29847l;
        this.x_ = c14809l;
        this.y_ = c14809l;
    }

    public static void applovin(C0413l c0413l, AbstractC15257l abstractC15257l) {
        c0413l.getClass();
        abstractC15257l.getClass();
        c0413l.y_ = abstractC15257l;
    }

    public static C0413l appmetrica() {
        return DEFAULT_INSTANCE;
    }

    public static void isVip(C0413l c0413l, C9493l c9493l) {
        c0413l.getClass();
        c0413l.params_ = c9493l;
        c0413l.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static InterfaceC14781l m514native() {
        return DEFAULT_INSTANCE.smaato();
    }

    public static void premium(C0413l c0413l, C14809l c14809l) {
        c0413l.getClass();
        c0413l.x_ = c14809l;
    }

    public static void signatures(C0413l c0413l) {
        c0413l.version_ = 0;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static C6508l m515strictfp() {
        return (C6508l) DEFAULT_INSTANCE.admob();
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static C0413l m516volatile(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C0413l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public final C9493l inmobi() {
        C9493l c9493l = this.params_;
        return c9493l == null ? C9493l.applovin() : c9493l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final AbstractC15257l m517package() {
        return this.x_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
        }
        if (iInmobi == 3) {
            return new C0413l();
        }
        if (iInmobi == 4) {
            return new C6508l(DEFAULT_INSTANCE);
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
        synchronized (C0413l.class) {
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

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final AbstractC15257l m518synchronized() {
        return this.y_;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final int m519throws() {
        return this.version_;
    }
}
