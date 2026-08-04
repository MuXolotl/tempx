package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: lؘٖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16131l {
    public static final C2351l yandex = new C2351l(17);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class admob(InterfaceC1388l interfaceC1388l) {
        Class clsMo1730private = ((InterfaceC13937l) interfaceC1388l).mo1730private();
        if (clsMo1730private.isPrimitive()) {
            return clsMo1730private;
        }
        String name = clsMo1730private.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final Object amazon(C7644l c7644l, String str, AbstractC0283l abstractC0283l) {
        C17464l c17464l = new C17464l("ecosystem.sendOtpPush", C1461l.f3650l);
        c17464l.yandex("sid", str);
        c17464l.yandex("flow_type", "tg_flow");
        c17464l.yandex("sak_version", "1.142");
        return c7644l.billing(c17464l, abstractC0283l);
    }

    public static final InterfaceC1388l billing(Annotation annotation) {
        return AbstractC18202l.yandex.loadAd(annotation.annotationType());
    }

    public static final Object crashlytics(C7644l c7644l, String str, AbstractC0283l abstractC0283l) {
        C17464l c17464l = new C17464l("ecosystem.sendOtpEmail", C7472l.f15454l);
        c17464l.yandex("sid", str);
        c17464l.yandex("flow_type", "tg_flow");
        c17464l.yandex("sak_version", "1.142");
        return c7644l.billing(c17464l, abstractC0283l);
    }

    public static final Object loadAd(C7644l c7644l, String str, AbstractC0283l abstractC0283l) {
        C17464l c17464l = new C17464l("ecosystem.sendOtpCallReset", C6928l.f14506l);
        c17464l.yandex("sid", str);
        c17464l.yandex("flow_type", "tg_flow");
        c17464l.yandex("sak_version", "1.142");
        return c7644l.billing(c17464l, abstractC0283l);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class mopub(InterfaceC1388l interfaceC1388l) {
        Class clsMo1730private = ((InterfaceC13937l) interfaceC1388l).mo1730private();
        if (clsMo1730private.isPrimitive()) {
            String name = clsMo1730private.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo1730private;
    }

    public static final Object purchase(C7644l c7644l, String str, AbstractC0283l abstractC0283l) {
        C17464l c17464l = new C17464l("ecosystem.sendOtpSms", C17334l.f33650l);
        c17464l.yandex("sid", str);
        c17464l.yandex("flow_type", "tg_flow");
        c17464l.yandex("sak_version", "1.142");
        return c7644l.billing(c17464l, abstractC0283l);
    }

    public static final Class subs(ClassLoader classLoader, String str) {
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static C5425l yandex(boolean z, C13772l c13772l, C13231l c13231l, int i) {
        if ((i & 4) != 0) {
            c13772l = C13772l.f26883l;
        }
        C13772l c13772l2 = c13772l;
        if ((i & 8) != 0) {
            c13231l = C13231l.purchase;
        }
        return new C5425l(z, true, true, c13772l2, c13231l, C14945l.amazon);
    }
}
