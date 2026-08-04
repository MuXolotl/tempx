package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؚٖٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16245l {
    public static final C13315l loadAd;
    public static final C13315l yandex = AbstractC0532l.admob(0.0f, 0.0f, null, 7);

    static {
        C8896l c8896l = AbstractC11922l.yandex;
        loadAd = AbstractC0532l.admob(0.0f, 0.0f, new C14467l(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    public static final InterfaceC12244l crashlytics(Object obj, C0010l c0010l, InterfaceC1489l interfaceC1489l, Float f, String str, Function1 function1, C6956l c6956l, int i, int i2) {
        InterfaceC1489l c13315l;
        Float f2 = (i2 & 8) != 0 ? null : f;
        Object objM2132native = c6956l.m2132native();
        Object obj2 = C1867l.yandex;
        if (objM2132native == obj2) {
            objM2132native = AbstractC8020l.smaato(null);
            c6956l.m2147try(objM2132native);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
        Object objM2132native2 = c6956l.m2132native();
        if (objM2132native2 == obj2) {
            objM2132native2 = new C5616l(obj, c0010l, f2);
            c6956l.m2147try(objM2132native2);
        }
        C5616l c5616l = (C5616l) objM2132native2;
        Object objVip = AbstractC8020l.vip(function1, c6956l);
        if (f2 == null || !(interfaceC1489l instanceof C13315l)) {
            c13315l = interfaceC1489l;
        } else {
            C13315l c13315l2 = (C13315l) interfaceC1489l;
            if (AbstractC8576l.yandex(c13315l2.crashlytics, f2)) {
                c13315l = interfaceC1489l;
            } else {
                c13315l = new C13315l(c13315l2.yandex, c13315l2.loadAd, f2);
            }
        }
        Object objVip2 = AbstractC8020l.vip(c13315l, c6956l);
        Object objM2132native3 = c6956l.m2132native();
        int i3 = 6;
        if (objM2132native3 == obj2) {
            objM2132native3 = AbstractC12098l.yandex(-1, 0, null, 6);
            c6956l.m2147try(objM2132native3);
        }
        Object obj3 = (InterfaceC14592l) objM2132native3;
        boolean zAdmob = c6956l.admob(obj3) | ((((i & 14) ^ 6) > 4 && c6956l.admob(obj)) || (i & 6) == 4);
        Object objM2132native4 = c6956l.m2132native();
        if (zAdmob || objM2132native4 == obj2) {
            objM2132native4 = new Ctry(obj3, obj, i3);
            c6956l.m2147try(objM2132native4);
        }
        AbstractC12311l.billing((Function0) objM2132native4, c6956l);
        boolean zAdmob2 = c6956l.admob(obj3) | c6956l.admob(c5616l) | c6956l.billing(objVip2) | c6956l.billing(objVip);
        Object objM2132native5 = c6956l.m2132native();
        if (zAdmob2 || objM2132native5 == obj2) {
            Object c1914l = new C1914l(obj3, c5616l, objVip2, objVip, (InterfaceC14029l) null, 0);
            c6956l.m2147try(c1914l);
            objM2132native5 = c1914l;
        }
        AbstractC12311l.amazon(c6956l, obj3, (Function2) objM2132native5);
        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) interfaceC8714l.getValue();
        return interfaceC12244l == null ? c5616l.crashlytics : interfaceC12244l;
    }

    public static final InterfaceC12244l loadAd(float f, InterfaceC1489l interfaceC1489l, String str, Function1 function1, C6956l c6956l, int i, int i2) {
        int i3 = i2 & 2;
        C13315l c13315l = yandex;
        InterfaceC1489l interfaceC1489l2 = i3 != 0 ? c13315l : interfaceC1489l;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        Function1 function2 = (i2 & 16) != 0 ? null : function1;
        if (interfaceC1489l2 == c13315l) {
            c6956l.m2123default(1144115775);
            boolean z = (((i & 896) ^ 384) > 256 && c6956l.crashlytics(0.01f)) || (i & 384) == 256;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = AbstractC0532l.admob(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                c6956l.m2147try(objM2132native);
            }
            interfaceC1489l2 = (C13315l) objM2132native;
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(1144225701);
            c6956l.startapp(false);
        }
        int i4 = i << 3;
        return crashlytics(Float.valueOf(f), AbstractC3483l.purchase, interfaceC1489l2, null, str2, function2, c6956l, (i4 & 458752) | (i & 14) | (57344 & i4), 0);
    }

    public static final InterfaceC12244l yandex(float f, InterfaceC17807l interfaceC17807l, String str, C6956l c6956l, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC17807l = loadAd;
        }
        InterfaceC17807l interfaceC17807l2 = interfaceC17807l;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        return crashlytics(new C14467l(f), AbstractC3483l.mopub, interfaceC17807l2, null, str, null, c6956l, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
