package defpackage;

/* JADX INFO: renamed from: lٖۚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16626l extends AbstractC13399l implements InterfaceC0974l {
    private static final C16626l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC15257l keyValue_ = AbstractC15257l.f29847l;
    private C15586l params_;
    private int version_;

    static {
        C16626l c16626l = new C16626l();
        DEFAULT_INSTANCE = c16626l;
        AbstractC13399l.license(C16626l.class, c16626l);
    }

    public static void isVip(C16626l c16626l, C14809l c14809l) {
        c16626l.getClass();
        c16626l.keyValue_ = c14809l;
    }

    public static C16626l premium() {
        return DEFAULT_INSTANCE;
    }

    public static void signatures(C16626l c16626l, C15586l c15586l) {
        c16626l.getClass();
        c16626l.params_ = c15586l;
        c16626l.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C13889l m4189throws() {
        return (C13889l) DEFAULT_INSTANCE.admob();
    }

    public final AbstractC15257l applovin() {
        return this.keyValue_;
    }

    public final C15586l appmetrica() {
        C15586l c15586l = this.params_;
        return c15586l == null ? C15586l.signatures() : c15586l;
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
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
        }
        if (iInmobi == 3) {
            return new C16626l();
        }
        if (iInmobi == 4) {
            return new C13889l(DEFAULT_INSTANCE);
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
        synchronized (C16626l.class) {
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
