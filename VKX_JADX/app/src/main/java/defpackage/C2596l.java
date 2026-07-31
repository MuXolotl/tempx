package defpackage;

/* JADX INFO: renamed from: lْؔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2596l extends AbstractC13399l implements InterfaceC0974l {
    private static final C2596l DEFAULT_INSTANCE;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int SALT_SIZE_FIELD_NUMBER = 1;
    private int saltSize_;

    static {
        C2596l c2596l = new C2596l();
        DEFAULT_INSTANCE = c2596l;
        AbstractC13399l.license(C2596l.class, c2596l);
    }

    public static C10591l applovin() {
        return (C10591l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C2596l c2596l, int i) {
        c2596l.saltSize_ = i;
    }

    public static C2596l signatures() {
        return DEFAULT_INSTANCE;
    }

    public final int premium() {
        return this.saltSize_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"saltSize_"});
        }
        if (iInmobi == 3) {
            return new C2596l();
        }
        if (iInmobi == 4) {
            return new C10591l(DEFAULT_INSTANCE);
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
        synchronized (C2596l.class) {
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
