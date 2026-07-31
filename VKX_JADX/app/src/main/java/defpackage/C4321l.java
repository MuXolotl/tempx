package defpackage;

/* JADX INFO: renamed from: lؖۖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4321l extends AbstractC13399l implements InterfaceC0974l {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C4321l DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C16626l aesCtrKey_;
    private int bitField0_;
    private C5469l hmacKey_;
    private int version_;

    static {
        C4321l c4321l = new C4321l();
        DEFAULT_INSTANCE = c4321l;
        AbstractC13399l.license(C4321l.class, c4321l);
    }

    public static C5237l inmobi() {
        return (C5237l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C4321l c4321l, C16626l c16626l) {
        c4321l.getClass();
        c4321l.aesCtrKey_ = c16626l;
        c4321l.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static InterfaceC14781l m1525package() {
        return DEFAULT_INSTANCE.smaato();
    }

    public static void signatures(C4321l c4321l, C5469l c5469l) {
        c4321l.getClass();
        c4321l.hmacKey_ = c5469l;
        c4321l.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C4321l m1526throws(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C4321l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public final C5469l applovin() {
        C5469l c5469l = this.hmacKey_;
        return c5469l == null ? C5469l.premium() : c5469l;
    }

    public final int appmetrica() {
        return this.version_;
    }

    public final C16626l premium() {
        C16626l c16626l = this.aesCtrKey_;
        return c16626l == null ? C16626l.premium() : c16626l;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
        }
        if (iInmobi == 3) {
            return new C4321l();
        }
        if (iInmobi == 4) {
            return new C5237l(DEFAULT_INSTANCE);
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
        synchronized (C4321l.class) {
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
