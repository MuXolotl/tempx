package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lِۗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12057l extends AbstractC12946l {
    public static final int APP_WIDGET_IDS_FIELD_NUMBER = 2;
    private static final C12057l DEFAULT_INSTANCE;
    private static volatile InterfaceC6634l PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetIdsMemoizedSerializedSize = -1;
    private String receiver_ = "";
    private InterfaceC5668l appWidgetIds_ = C2577l.f5611l;

    static {
        C12057l c12057l = new C12057l();
        DEFAULT_INSTANCE = c12057l;
        AbstractC12946l.firebase(C12057l.class, c12057l);
    }

    public static C12057l adcel() {
        return DEFAULT_INSTANCE;
    }

    public static void metrica(C12057l c12057l, List list) {
        RandomAccess randomAccess = c12057l.appWidgetIds_;
        if (!((AbstractC0853l) randomAccess).f2503l) {
            C2577l c2577l = (C2577l) randomAccess;
            int i = c2577l.f5612l;
            int i2 = i == 0 ? 10 : i * 2;
            if (i2 < i) {
                C11983l.crashlytics();
                return;
            }
            c12057l.appWidgetIds_ = new C2577l(Arrays.copyOf(c2577l.f5613l, i2), c2577l.f5612l, true);
        }
        AbstractC9446l.yandex(list, c12057l.appWidgetIds_);
    }

    public static C3130l subscription() {
        return (C3130l) DEFAULT_INSTANCE.crashlytics();
    }

    public static void vip(C12057l c12057l, String str) {
        c12057l.getClass();
        str.getClass();
        c12057l.receiver_ = str;
    }

    public final String ads() {
        return this.receiver_;
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
                return new C15293l(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002'", new Object[]{"receiver_", "appWidgetIds_"});
            case 3:
                return new C12057l();
            case 4:
                return new C3130l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6634l interfaceC6634l = PARSER;
                if (interfaceC6634l != null) {
                    return interfaceC6634l;
                }
                synchronized (C12057l.class) {
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

    public final InterfaceC5668l startapp() {
        return this.appWidgetIds_;
    }
}
