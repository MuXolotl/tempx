package defpackage;

/* JADX INFO: renamed from: lِٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14150l extends AbstractC13399l implements InterfaceC0974l {
    private static final C14150l DEFAULT_INSTANCE;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        C14150l c14150l = new C14150l();
        DEFAULT_INSTANCE = c14150l;
        AbstractC13399l.license(C14150l.class, c14150l);
    }

    public static C11087l applovin() {
        return (C11087l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C14150l c14150l, int i) {
        c14150l.tagSize_ = i;
    }

    public static C14150l signatures() {
        return DEFAULT_INSTANCE;
    }

    public final int premium() {
        return this.tagSize_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
        }
        if (iInmobi == 3) {
            return new C14150l();
        }
        if (iInmobi == 4) {
            return new C11087l(DEFAULT_INSTANCE);
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
        synchronized (C14150l.class) {
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
