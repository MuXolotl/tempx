package defpackage;

/* JADX INFO: renamed from: lؘؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0874l extends AbstractC13399l implements InterfaceC0974l {
    private static final C0874l DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC14781l PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC15257l value_ = AbstractC15257l.f29847l;

    static {
        C0874l c0874l = new C0874l();
        DEFAULT_INSTANCE = c0874l;
        AbstractC13399l.license(C0874l.class, c0874l);
    }

    public static C0874l applovin() {
        return DEFAULT_INSTANCE;
    }

    public static void isVip(C0874l c0874l, EnumC17341l enumC17341l) {
        int i;
        c0874l.getClass();
        if (enumC17341l != EnumC17341l.UNRECOGNIZED) {
            i = enumC17341l.f33708l;
        } else {
            C8339l.metrica("Can't get the number of an unknown enum value.");
            i = 0;
        }
        c0874l.keyMaterialType_ = i;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C7341l m739package() {
        return (C7341l) DEFAULT_INSTANCE.admob();
    }

    public static void premium(C0874l c0874l, AbstractC15257l abstractC15257l) {
        c0874l.getClass();
        abstractC15257l.getClass();
        c0874l.value_ = abstractC15257l;
    }

    public static void signatures(C0874l c0874l, String str) {
        c0874l.getClass();
        str.getClass();
        c0874l.typeUrl_ = str;
    }

    public final EnumC17341l appmetrica() {
        EnumC17341l enumC17341l;
        int i = this.keyMaterialType_;
        if (i == 0) {
            enumC17341l = EnumC17341l.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            enumC17341l = EnumC17341l.SYMMETRIC;
        } else if (i == 2) {
            enumC17341l = EnumC17341l.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            enumC17341l = i != 4 ? null : EnumC17341l.REMOTE;
        } else {
            enumC17341l = EnumC17341l.ASYMMETRIC_PUBLIC;
        }
        return enumC17341l == null ? EnumC17341l.UNRECOGNIZED : enumC17341l;
    }

    public final String inmobi() {
        return this.typeUrl_;
    }

    @Override // defpackage.AbstractC13399l
    public final Object subs(int i) {
        InterfaceC14781l c6768l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C1861l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
        }
        if (iInmobi == 3) {
            return new C0874l();
        }
        if (iInmobi == 4) {
            return new C7341l(DEFAULT_INSTANCE);
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
        synchronized (C0874l.class) {
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
    public final AbstractC15257l m740throws() {
        return this.value_;
    }
}
