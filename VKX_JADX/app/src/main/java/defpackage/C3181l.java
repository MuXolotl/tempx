package defpackage;

/* JADX INFO: renamed from: lؕؖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3181l extends AbstractC13399l implements InterfaceC0974l {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C3181l DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER;
    private C9104l aesCtrKeyFormat_;
    private int bitField0_;
    private C3236l hmacKeyFormat_;

    static {
        C3181l c3181l = new C3181l();
        DEFAULT_INSTANCE = c3181l;
        AbstractC13399l.license(C3181l.class, c3181l);
    }

    public static C7553l appmetrica() {
        return (C7553l) DEFAULT_INSTANCE.admob();
    }

    public static C3181l inmobi(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C3181l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static void isVip(C3181l c3181l, C9104l c9104l) {
        c3181l.getClass();
        c3181l.aesCtrKeyFormat_ = c9104l;
        c3181l.bitField0_ |= 1;
    }

    public static void signatures(C3181l c3181l, C3236l c3236l) {
        c3181l.getClass();
        c3181l.hmacKeyFormat_ = c3236l;
        c3181l.bitField0_ |= 2;
    }

    public final C3236l applovin() {
        C3236l c3236l = this.hmacKeyFormat_;
        return c3236l == null ? C3236l.premium() : c3236l;
    }

    public final C9104l premium() {
        C9104l c9104l = this.aesCtrKeyFormat_;
        return c9104l == null ? C9104l.premium() : c9104l;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
        }
        if (iInmobi == 3) {
            return new C3181l();
        }
        if (iInmobi == 4) {
            return new C7553l(DEFAULT_INSTANCE);
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
        synchronized (C3181l.class) {
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
