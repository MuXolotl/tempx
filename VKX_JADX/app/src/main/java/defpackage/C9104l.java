package defpackage;

/* JADX INFO: renamed from: lٌ۠ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9104l extends AbstractC13399l implements InterfaceC0974l {
    private static final C9104l DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER;
    private int bitField0_;
    private int keySize_;
    private C15586l params_;

    static {
        C9104l c9104l = new C9104l();
        DEFAULT_INSTANCE = c9104l;
        AbstractC13399l.license(C9104l.class, c9104l);
    }

    public static C7029l inmobi() {
        return (C7029l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C9104l c9104l, int i) {
        c9104l.keySize_ = i;
    }

    public static C9104l premium() {
        return DEFAULT_INSTANCE;
    }

    public static void signatures(C9104l c9104l, C15586l c15586l) {
        c9104l.getClass();
        c9104l.params_ = c15586l;
        c9104l.bitField0_ |= 1;
    }

    public final int applovin() {
        return this.keySize_;
    }

    public final C15586l appmetrica() {
        C15586l c15586l = this.params_;
        return c15586l == null ? C15586l.signatures() : c15586l;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
        }
        if (iInmobi == 3) {
            return new C9104l();
        }
        if (iInmobi == 4) {
            return new C7029l(DEFAULT_INSTANCE);
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
        synchronized (C9104l.class) {
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
