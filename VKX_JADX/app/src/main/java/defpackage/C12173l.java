package defpackage;

/* JADX INFO: renamed from: lِۣ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12173l extends AbstractC13399l implements InterfaceC0974l {
    private static final C12173l DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER;
    private int ivSize_;

    static {
        C12173l c12173l = new C12173l();
        DEFAULT_INSTANCE = c12173l;
        AbstractC13399l.license(C12173l.class, c12173l);
    }

    public static C18378l applovin() {
        return (C18378l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C12173l c12173l, int i) {
        c12173l.ivSize_ = i;
    }

    public static C12173l signatures() {
        return DEFAULT_INSTANCE;
    }

    public final int premium() {
        return this.ivSize_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
        }
        if (iInmobi == 3) {
            return new C12173l();
        }
        if (iInmobi == 4) {
            return new C18378l(DEFAULT_INSTANCE);
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
        synchronized (C12173l.class) {
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
