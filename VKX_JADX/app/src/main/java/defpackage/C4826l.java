package defpackage;

/* JADX INFO: renamed from: lِؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4826l extends AbstractC13399l implements InterfaceC0974l {
    public static final int AEAD_FIELD_NUMBER = 3;
    private static final C4826l DEFAULT_INSTANCE;
    public static final int KDF_FIELD_NUMBER = 2;
    public static final int KEM_FIELD_NUMBER = 1;
    private static volatile InterfaceC14781l PARSER;
    private int aead_;
    private int kdf_;
    private int kem_;

    static {
        C4826l c4826l = new C4826l();
        DEFAULT_INSTANCE = c4826l;
        AbstractC13399l.license(C4826l.class, c4826l);
    }

    public static C4826l appmetrica() {
        return DEFAULT_INSTANCE;
    }

    public static void isVip(C4826l c4826l, EnumC11952l enumC11952l) {
        int i;
        c4826l.getClass();
        if (enumC11952l != EnumC11952l.UNRECOGNIZED) {
            i = enumC11952l.f23827l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c4826l.aead_ = i;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C12989l m1618package() {
        return (C12989l) DEFAULT_INSTANCE.admob();
    }

    public static void premium(C4826l c4826l, EnumC4659l enumC4659l) {
        int i;
        c4826l.getClass();
        if (enumC4659l != EnumC4659l.UNRECOGNIZED) {
            i = enumC4659l.f9496l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c4826l.kem_ = i;
    }

    public static void signatures(C4826l c4826l, EnumC2477l enumC2477l) {
        int i;
        c4826l.getClass();
        if (enumC2477l != EnumC2477l.UNRECOGNIZED) {
            i = enumC2477l.f5267l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c4826l.kdf_ = i;
    }

    public final EnumC11952l applovin() {
        EnumC11952l enumC11952l;
        int i = this.aead_;
        if (i == 0) {
            enumC11952l = EnumC11952l.AEAD_UNKNOWN;
        } else if (i == 1) {
            enumC11952l = EnumC11952l.AES_128_GCM;
        } else if (i != 2) {
            enumC11952l = i != 3 ? null : EnumC11952l.CHACHA20_POLY1305;
        } else {
            enumC11952l = EnumC11952l.AES_256_GCM;
        }
        return enumC11952l == null ? EnumC11952l.UNRECOGNIZED : enumC11952l;
    }

    public final EnumC2477l inmobi() {
        EnumC2477l enumC2477l;
        int i = this.kdf_;
        if (i == 0) {
            enumC2477l = EnumC2477l.KDF_UNKNOWN;
        } else if (i == 1) {
            enumC2477l = EnumC2477l.HKDF_SHA256;
        } else if (i != 2) {
            enumC2477l = i != 3 ? null : EnumC2477l.HKDF_SHA512;
        } else {
            enumC2477l = EnumC2477l.HKDF_SHA384;
        }
        return enumC2477l == null ? EnumC2477l.UNRECOGNIZED : enumC2477l;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"kem_", "kdf_", "aead_"});
        }
        if (iInmobi == 3) {
            return new C4826l();
        }
        if (iInmobi == 4) {
            return new C12989l(DEFAULT_INSTANCE);
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
        synchronized (C4826l.class) {
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
    public final EnumC4659l m1619throws() {
        EnumC4659l enumC4659l;
        switch (this.kem_) {
            case 0:
                enumC4659l = EnumC4659l.KEM_UNKNOWN;
                break;
            case 1:
                enumC4659l = EnumC4659l.DHKEM_X25519_HKDF_SHA256;
                break;
            case 2:
                enumC4659l = EnumC4659l.DHKEM_P256_HKDF_SHA256;
                break;
            case 3:
                enumC4659l = EnumC4659l.DHKEM_P384_HKDF_SHA384;
                break;
            case 4:
                enumC4659l = EnumC4659l.DHKEM_P521_HKDF_SHA512;
                break;
            case 5:
                enumC4659l = EnumC4659l.X_WING;
                break;
            case 6:
                enumC4659l = EnumC4659l.ML_KEM768;
                break;
            case 7:
                enumC4659l = EnumC4659l.ML_KEM1024;
                break;
            default:
                enumC4659l = null;
                break;
        }
        return enumC4659l == null ? EnumC4659l.UNRECOGNIZED : enumC4659l;
    }
}
