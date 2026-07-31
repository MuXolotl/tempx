package defpackage;

/* JADX INFO: renamed from: lٌ۠ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9105l extends AbstractC13399l implements InterfaceC0974l {
    private static final C9105l DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    static {
        C9105l c9105l = new C9105l();
        DEFAULT_INSTANCE = c9105l;
        AbstractC13399l.license(C9105l.class, c9105l);
    }

    public static C3044l applovin() {
        return (C3044l) DEFAULT_INSTANCE.admob();
    }

    public static C9105l appmetrica(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C9105l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static void isVip(C9105l c9105l, int i) {
        c9105l.keySize_ = i;
    }

    public final int premium() {
        return this.version_;
    }

    public final int signatures() {
        return this.keySize_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
        }
        if (iInmobi == 3) {
            return new C9105l();
        }
        if (iInmobi == 4) {
            return new C3044l(DEFAULT_INSTANCE);
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
        synchronized (C9105l.class) {
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
