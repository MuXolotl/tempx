package defpackage;

/* JADX INFO: renamed from: l٘ۛۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18208l extends AbstractC13399l implements InterfaceC0974l {
    private static final C18208l DEFAULT_INSTANCE;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int PRIVATE_KEY_FIELD_NUMBER = 3;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC15257l privateKey_ = AbstractC15257l.f29847l;
    private C6833l publicKey_;
    private int version_;

    static {
        C18208l c18208l = new C18208l();
        DEFAULT_INSTANCE = c18208l;
        AbstractC13399l.license(C18208l.class, c18208l);
    }

    public static void isVip(C18208l c18208l, C14809l c14809l) {
        c18208l.getClass();
        c18208l.privateKey_ = c14809l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C18208l m4499package(AbstractC15257l abstractC15257l, C7597l c7597l) {
        return (C18208l) AbstractC13399l.subscription(DEFAULT_INSTANCE, abstractC15257l, c7597l);
    }

    public static void premium(C18208l c18208l) {
        c18208l.version_ = 0;
    }

    public static void signatures(C18208l c18208l, C6833l c6833l) {
        c18208l.getClass();
        c18208l.publicKey_ = c6833l;
        c18208l.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static InterfaceC14781l m4500synchronized() {
        return DEFAULT_INSTANCE.smaato();
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C12949l m4501throws() {
        return (C12949l) DEFAULT_INSTANCE.admob();
    }

    public final AbstractC15257l applovin() {
        return this.privateKey_;
    }

    public final C6833l appmetrica() {
        C6833l c6833l = this.publicKey_;
        return c6833l == null ? C6833l.applovin() : c6833l;
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
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "privateKey_"});
        }
        if (iInmobi == 3) {
            return new C18208l();
        }
        if (iInmobi == 4) {
            return new C12949l(DEFAULT_INSTANCE);
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
        synchronized (C18208l.class) {
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
