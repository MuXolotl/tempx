package defpackage;

/* JADX INFO: renamed from: lِؚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11559l extends AbstractC13399l implements InterfaceC0974l {
    private static final C11559l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC15257l keyValue_ = AbstractC15257l.f29847l;
    private C0413l publicKey_;
    private int version_;

    static {
        C11559l c11559l = new C11559l();
        DEFAULT_INSTANCE = c11559l;
        AbstractC13399l.license(C11559l.class, c11559l);
    }

    public static void isVip(C11559l c11559l, C14809l c14809l) {
        c11559l.getClass();
        c11559l.keyValue_ = c14809l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C11559l m3131package(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C11559l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static void premium(C11559l c11559l) {
        c11559l.version_ = 0;
    }

    public static void signatures(C11559l c11559l, C0413l c0413l) {
        c11559l.getClass();
        c11559l.publicKey_ = c0413l;
        c11559l.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static InterfaceC14781l m3132synchronized() {
        return DEFAULT_INSTANCE.smaato();
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C7585l m3133throws() {
        return (C7585l) DEFAULT_INSTANCE.admob();
    }

    public final AbstractC15257l applovin() {
        return this.keyValue_;
    }

    public final C0413l appmetrica() {
        C0413l c0413l = this.publicKey_;
        return c0413l == null ? C0413l.appmetrica() : c0413l;
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
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "keyValue_"});
        }
        if (iInmobi == 3) {
            return new C11559l();
        }
        if (iInmobi == 4) {
            return new C7585l(DEFAULT_INSTANCE);
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
        synchronized (C11559l.class) {
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
