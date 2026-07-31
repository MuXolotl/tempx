package defpackage;

/* JADX INFO: renamed from: lٌؔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2744l extends AbstractC13399l implements InterfaceC0974l {
    private static final C2744l DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER;
    private int bitField0_;
    private int keySize_;
    private C12173l params_;

    static {
        C2744l c2744l = new C2744l();
        DEFAULT_INSTANCE = c2744l;
        AbstractC13399l.license(C2744l.class, c2744l);
    }

    public static C6685l appmetrica() {
        return (C6685l) DEFAULT_INSTANCE.admob();
    }

    public static C2744l inmobi(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C2744l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static void isVip(C2744l c2744l, int i) {
        c2744l.keySize_ = i;
    }

    public static void signatures(C2744l c2744l, C12173l c12173l) {
        c2744l.getClass();
        c2744l.params_ = c12173l;
        c2744l.bitField0_ |= 1;
    }

    public final C12173l applovin() {
        C12173l c12173l = this.params_;
        return c12173l == null ? C12173l.signatures() : c12173l;
    }

    public final int premium() {
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
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
        }
        if (iInmobi == 3) {
            return new C2744l();
        }
        if (iInmobi == 4) {
            return new C6685l(DEFAULT_INSTANCE);
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
        synchronized (C2744l.class) {
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
