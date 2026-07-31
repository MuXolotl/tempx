package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lًٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8009l {
    public static final HashMap amazon;
    public static final C6561l crashlytics;
    public static final C6561l loadAd;
    public static final C6561l yandex;

    static {
        C13429l c13429l = C13429l.f26346l;
        C6561l c6561l = new C6561l(c13429l, 9);
        yandex = c6561l;
        C13429l c13429l2 = C13429l.f26341l;
        C6561l c6561l2 = new C6561l(c13429l2, 10);
        loadAd = c6561l2;
        C13429l c13429l3 = C13429l.f26349l;
        C6561l c6561l3 = new C6561l(c13429l3, 11);
        crashlytics = c6561l3;
        HashMap map = new HashMap();
        amazon = map;
        map.put(c13429l, c6561l);
        map.put(c13429l2, c6561l2);
        map.put(c13429l3, c6561l3);
    }

    public static boolean crashlytics(InterfaceC10389l interfaceC10389l, InterfaceC8371l interfaceC8371l) {
        if (interfaceC10389l == null) {
            yandex(2);
            throw null;
        }
        if (interfaceC8371l == null) {
            yandex(3);
            throw null;
        }
        InterfaceC9921l interfaceC9921l = (InterfaceC9921l) AbstractC11125l.admob(interfaceC10389l, InterfaceC9921l.class, false);
        InterfaceC9921l interfaceC9921l2 = (InterfaceC9921l) AbstractC11125l.admob(interfaceC8371l, InterfaceC9921l.class, false);
        return (interfaceC9921l2 == null || interfaceC9921l == null || !((AbstractC3740l) interfaceC9921l).f7826l.equals(((AbstractC3740l) interfaceC9921l2).f7826l)) ? false : true;
    }

    public static boolean loadAd(InterfaceC16011l interfaceC16011l, InterfaceC10389l interfaceC10389l, InterfaceC8371l interfaceC8371l) {
        InterfaceC10389l interfaceC10389lAds;
        if (interfaceC8371l == null) {
            yandex(1);
            throw null;
        }
        if (interfaceC10389l instanceof InterfaceC0207l) {
            interfaceC10389lAds = AbstractC11125l.ads((InterfaceC0207l) interfaceC10389l);
        } else {
            int i = AbstractC11125l.yandex;
            interfaceC10389lAds = interfaceC10389l;
        }
        if (crashlytics(interfaceC10389lAds, interfaceC8371l)) {
            return true;
        }
        return AbstractC6004l.crashlytics.yandex(interfaceC16011l, interfaceC10389l, interfaceC8371l);
    }

    public static /* synthetic */ void yandex(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }
}
