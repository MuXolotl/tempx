package defpackage;

/* JADX INFO: renamed from: lٍٞۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9721l extends AbstractC8760l {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C9721l DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC1265l PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C9721l c9721l = new C9721l();
        DEFAULT_INSTANCE = c9721l;
        AbstractC8760l.isPro(C9721l.class, c9721l);
    }

    public static void adcel(C9721l c9721l, C4966l c4966l) {
        c9721l.getClass();
        c9721l.valueCase_ = 8;
        c9721l.value_ = c4966l;
    }

    public static void ads(C9721l c9721l, boolean z) {
        c9721l.valueCase_ = 1;
        c9721l.value_ = Boolean.valueOf(z);
    }

    public static C18479l inmobi() {
        return (C18479l) ((AbstractC17315l) DEFAULT_INSTANCE.loadAd(5));
    }

    public static void metrica(C9721l c9721l, C12790l c12790l) {
        c9721l.getClass();
        c9721l.value_ = c12790l;
        c9721l.valueCase_ = 6;
    }

    public static C9721l pro() {
        return DEFAULT_INSTANCE;
    }

    public static void remoteconfig(C9721l c9721l, long j) {
        c9721l.valueCase_ = 4;
        c9721l.value_ = Long.valueOf(j);
    }

    public static void startapp(C9721l c9721l, double d) {
        c9721l.valueCase_ = 7;
        c9721l.value_ = Double.valueOf(d);
    }

    public static void subscription(C9721l c9721l, float f) {
        c9721l.valueCase_ = 2;
        c9721l.value_ = Float.valueOf(f);
    }

    public static void tapsense(C9721l c9721l, int i) {
        c9721l.valueCase_ = 3;
        c9721l.value_ = Integer.valueOf(i);
    }

    public static void vip(C9721l c9721l, String str) {
        c9721l.getClass();
        c9721l.valueCase_ = 5;
        c9721l.value_ = str;
    }

    public final boolean Signature() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double ad() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float advert() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final C12790l applovin() {
        return this.valueCase_ == 6 ? (C12790l) this.value_ : C12790l.vip();
    }

    public final int appmetrica() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final int isVip() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final C4966l license() {
        return this.valueCase_ == 8 ? (C4966l) this.value_ : C4966l.f10110l;
    }

    @Override // defpackage.AbstractC8760l
    public final Object loadAd(int i) {
        InterfaceC1265l c10511l;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return (byte) 1;
        }
        if (iInmobi == 2) {
            return new C13673l(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C12790l.class});
        }
        if (iInmobi == 3) {
            return new C9721l();
        }
        if (iInmobi == 4) {
            return new C18479l(DEFAULT_INSTANCE);
        }
        if (iInmobi == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iInmobi != 6) {
            throw null;
        }
        InterfaceC1265l interfaceC1265l = PARSER;
        if (interfaceC1265l != null) {
            return interfaceC1265l;
        }
        synchronized (C9721l.class) {
            try {
                c10511l = PARSER;
                if (c10511l == null) {
                    c10511l = new C10511l();
                    PARSER = c10511l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10511l;
    }

    public final String premium() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final long signatures() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
