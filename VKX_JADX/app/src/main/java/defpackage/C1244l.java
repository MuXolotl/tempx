package defpackage;

/* JADX INFO: renamed from: lٟؒۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1244l extends AbstractC13399l implements InterfaceC0974l {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final C1244l DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile InterfaceC14781l PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private AbstractC15257l hkdfSalt_ = AbstractC15257l.f29847l;

    static {
        C1244l c1244l = new C1244l();
        DEFAULT_INSTANCE = c1244l;
        AbstractC13399l.license(C1244l.class, c1244l);
    }

    public static C1244l appmetrica() {
        return DEFAULT_INSTANCE;
    }

    public static void isVip(C1244l c1244l, EnumC2916l enumC2916l) {
        int i;
        c1244l.getClass();
        if (enumC2916l != EnumC2916l.UNRECOGNIZED) {
            i = enumC2916l.f6349l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c1244l.curveType_ = i;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C12915l m854package() {
        return (C12915l) DEFAULT_INSTANCE.admob();
    }

    public static void premium(C1244l c1244l, C14809l c14809l) {
        c1244l.getClass();
        c1244l.hkdfSalt_ = c14809l;
    }

    public static void signatures(C1244l c1244l, EnumC7004l enumC7004l) {
        c1244l.getClass();
        c1244l.hkdfHashType_ = enumC7004l.loadAd();
    }

    public final EnumC2916l applovin() {
        EnumC2916l enumC2916l;
        int i = this.curveType_;
        if (i == 0) {
            enumC2916l = EnumC2916l.UNKNOWN_CURVE;
        } else if (i == 2) {
            enumC2916l = EnumC2916l.NIST_P256;
        } else if (i == 3) {
            enumC2916l = EnumC2916l.NIST_P384;
        } else if (i != 4) {
            enumC2916l = i != 5 ? null : EnumC2916l.CURVE25519;
        } else {
            enumC2916l = EnumC2916l.NIST_P521;
        }
        return enumC2916l == null ? EnumC2916l.UNRECOGNIZED : enumC2916l;
    }

    public final EnumC7004l inmobi() {
        EnumC7004l enumC7004lYandex = EnumC7004l.yandex(this.hkdfHashType_);
        return enumC7004lYandex == null ? EnumC7004l.UNRECOGNIZED : enumC7004lYandex;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
        }
        if (iInmobi == 3) {
            return new C1244l();
        }
        if (iInmobi == 4) {
            return new C12915l(DEFAULT_INSTANCE);
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
        synchronized (C1244l.class) {
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
    public final AbstractC15257l m855throws() {
        return this.hkdfSalt_;
    }
}
