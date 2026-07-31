package defpackage;

/* JADX INFO: renamed from: lٍِۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9493l extends AbstractC13399l implements InterfaceC0974l {
    private static final C9493l DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER;
    private int bitField0_;
    private C2619l demParams_;
    private int ecPointFormat_;
    private C1244l kemParams_;

    static {
        C9493l c9493l = new C9493l();
        DEFAULT_INSTANCE = c9493l;
        AbstractC13399l.license(C9493l.class, c9493l);
    }

    public static C9493l applovin() {
        return DEFAULT_INSTANCE;
    }

    public static void isVip(C9493l c9493l, C2619l c2619l) {
        c9493l.getClass();
        c9493l.demParams_ = c2619l;
        c9493l.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C3598l m2664package() {
        return (C3598l) DEFAULT_INSTANCE.admob();
    }

    public static void premium(C9493l c9493l, C1244l c1244l) {
        c9493l.getClass();
        c9493l.kemParams_ = c1244l;
        c9493l.bitField0_ |= 1;
    }

    public static void signatures(C9493l c9493l, EnumC13513l enumC13513l) {
        int i;
        c9493l.getClass();
        if (enumC13513l != EnumC13513l.UNRECOGNIZED) {
            i = enumC13513l.f26533l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c9493l.ecPointFormat_ = i;
    }

    public final C2619l appmetrica() {
        C2619l c2619l = this.demParams_;
        return c2619l == null ? C2619l.premium() : c2619l;
    }

    public final EnumC13513l inmobi() {
        EnumC13513l enumC13513l;
        int i = this.ecPointFormat_;
        if (i == 0) {
            enumC13513l = EnumC13513l.UNKNOWN_FORMAT;
        } else if (i == 1) {
            enumC13513l = EnumC13513l.UNCOMPRESSED;
        } else if (i != 2) {
            enumC13513l = i != 3 ? null : EnumC13513l.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        } else {
            enumC13513l = EnumC13513l.COMPRESSED;
        }
        return enumC13513l == null ? EnumC13513l.UNRECOGNIZED : enumC13513l;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "kemParams_", "demParams_", "ecPointFormat_"});
        }
        if (iInmobi == 3) {
            return new C9493l();
        }
        if (iInmobi == 4) {
            return new C3598l(DEFAULT_INSTANCE);
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
        synchronized (C9493l.class) {
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

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C1244l m2665throws() {
        C1244l c1244l = this.kemParams_;
        return c1244l == null ? C1244l.appmetrica() : c1244l;
    }
}
