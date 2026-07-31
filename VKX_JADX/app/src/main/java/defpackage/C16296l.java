package defpackage;

/* JADX INFO: renamed from: lٍٖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16296l extends AbstractC12946l {
    public static final int ACTIONKEY_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    private static final C16296l DEFAULT_INSTANCE;
    private static volatile InterfaceC6634l PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = "";
    private String actionKey_ = "";

    static {
        C16296l c16296l = new C16296l();
        DEFAULT_INSTANCE = c16296l;
        AbstractC12946l.firebase(C16296l.class, c16296l);
    }

    public static C6919l Signature() {
        return (C6919l) DEFAULT_INSTANCE.crashlytics();
    }

    public static void metrica(C16296l c16296l, int i) {
        c16296l.appWidgetId_ = i;
    }

    public static void startapp(C16296l c16296l, String str) {
        c16296l.getClass();
        c16296l.actionKey_ = str;
    }

    public static C16296l subscription() {
        return DEFAULT_INSTANCE;
    }

    public static void vip(C16296l c16296l, String str) {
        c16296l.getClass();
        str.getClass();
        c16296l.receiver_ = str;
    }

    public final String adcel() {
        return this.actionKey_;
    }

    public final int ads() {
        return this.appWidgetId_;
    }

    @Override // defpackage.AbstractC12946l
    public final Object amazon(int i) {
        InterfaceC6634l c1219l;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C15293l(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"receiver_", "appWidgetId_", "actionKey_"});
            case 3:
                return new C16296l();
            case 4:
                return new C6919l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6634l interfaceC6634l = PARSER;
                if (interfaceC6634l != null) {
                    return interfaceC6634l;
                }
                synchronized (C16296l.class) {
                    try {
                        c1219l = PARSER;
                        if (c1219l == null) {
                            c1219l = new C1219l();
                            PARSER = c1219l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1219l;
            default:
                C3010l.mopub();
                return null;
        }
    }

    public final String tapsense() {
        return this.receiver_;
    }
}
