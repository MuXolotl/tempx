package defpackage;

/* JADX INFO: renamed from: lؔٔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2619l extends AbstractC13399l implements InterfaceC0974l {
    public static final int AEAD_DEM_FIELD_NUMBER = 2;
    private static final C2619l DEFAULT_INSTANCE;
    private static volatile InterfaceC14781l PARSER;
    private C13608l aeadDem_;
    private int bitField0_;

    static {
        C2619l c2619l = new C2619l();
        DEFAULT_INSTANCE = c2619l;
        AbstractC13399l.license(C2619l.class, c2619l);
    }

    public static C5982l applovin() {
        return (C5982l) DEFAULT_INSTANCE.admob();
    }

    public static void isVip(C2619l c2619l, C13608l c13608l) {
        c2619l.getClass();
        c2619l.aeadDem_ = c13608l;
        c2619l.bitField0_ |= 1;
    }

    public static C2619l premium() {
        return DEFAULT_INSTANCE;
    }

    public final C13608l signatures() {
        C13608l c13608l = this.aeadDem_;
        return c13608l == null ? C13608l.applovin() : c13608l;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "aeadDem_"});
        }
        if (iInmobi == 3) {
            return new C2619l();
        }
        if (iInmobi == 4) {
            return new C5982l(DEFAULT_INSTANCE);
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
        synchronized (C2619l.class) {
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
