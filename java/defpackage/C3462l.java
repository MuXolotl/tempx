package defpackage;

/* JADX INFO: renamed from: lؕٙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3462l extends AbstractC13399l implements InterfaceC0974l {
    private static final C3462l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC15257l keyValue_ = AbstractC15257l.f29847l;
    private C12173l params_;
    private int version_;

    static {
        C3462l c3462l = new C3462l();
        DEFAULT_INSTANCE = c3462l;
        AbstractC13399l.license(C3462l.class, c3462l);
    }

    public static C18665l inmobi() {
        return (C18665l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C3462l c3462l, C14809l c14809l) {
        c3462l.getClass();
        c3462l.keyValue_ = c14809l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static InterfaceC14781l m1344package() {
        return DEFAULT_INSTANCE.smaato();
    }

    public static void signatures(C3462l c3462l, C12173l c12173l) {
        c3462l.getClass();
        c3462l.params_ = c12173l;
        c3462l.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C3462l m1345throws(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C3462l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public final C12173l applovin() {
        C12173l c12173l = this.params_;
        return c12173l == null ? C12173l.signatures() : c12173l;
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
            return new C3462l();
        }
        if (iInmobi == 4) {
            return new C18665l(DEFAULT_INSTANCE);
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
        synchronized (C3462l.class) {
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
