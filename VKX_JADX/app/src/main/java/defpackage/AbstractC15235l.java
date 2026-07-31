package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15235l {
    public static final C15578l yandex = new C15578l(-275056414, false, new C7277l(24));
    public static final C15578l loadAd = new C15578l(-2118692124, false, new C7277l(25));
    public static final C15578l crashlytics = new C15578l(1149130371, false, new C7277l(26));
    public static final C15578l amazon = new C15578l(-513241590, false, new C7277l(27));
    public static final C15578l purchase = new C15578l(584076299, false, new C7277l(28));
    public static final C15578l billing = new C15578l(724869633, false, new C11891l(7));

    public static boolean amazon(String str) throws C9373l {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        yandex("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        yandex("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new C9373l("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(iEglGetError), AbstractC1186l.isVip(Integer.valueOf(iEglGetError)));
    }

    public static final C10824l crashlytics(C17385l c17385l, int i, long j, C7212l c7212l, long j2, EnumC7283l enumC7283l, InterfaceC6947l interfaceC6947l, C0086l c0086l, EnumC9931l enumC9931l, int i2, C16977l c16977l) {
        List list;
        Object objLoadAd = c7212l.loadAd(i);
        List list2 = (List) c16977l.loadAd(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listYandex = c17385l.yandex(i);
            int size = listYandex.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((InterfaceC6357l) listYandex.get(i3)).adcel(j));
            }
            c16977l.subs(i, arrayList);
            list = arrayList;
        }
        return new C10824l(i, i2, list, j2, objLoadAd, enumC7283l, interfaceC6947l, c0086l, enumC9931l);
    }

    public static final Object loadAd(InterfaceC2679l interfaceC2679l, String str, AbstractC0283l abstractC0283l) {
        Object objLoadAd = interfaceC2679l.loadAd(str, new C5562l(23), abstractC0283l);
        return objLoadAd == EnumC9342l.f19165l ? objLoadAd : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[PHI: r0
  0x00a5: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00a3, B:57:0x00a8, B:60:0x00ac, B:63:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object purchase(C6543l c6543l, int i, Function1 function1) {
        int i2;
        int i3;
        Object objInvoke;
        AbstractC14971l abstractC14971lLoadAd;
        C8604l c8604lM2022l;
        C18289l c18289l;
        if (!c6543l.f29454l.f29462l) {
            AbstractC0081l.crashlytics("visitAncestors called on an unattached node");
        }
        AbstractC14971l abstractC14971l = c6543l.f29454l.f29456l;
        C3654l c3654lMetrica = AbstractC5573l.metrica(c6543l);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            objInvoke = null;
            if (c3654lMetrica == null) {
                abstractC14971lLoadAd = null;
                break;
            }
            if ((((AbstractC14971l) c3654lMetrica.f7703l.mopub).f29457l & 1024) != 0) {
                while (abstractC14971l != null) {
                    if ((abstractC14971l.f29450l & 1024) != 0) {
                        abstractC14971lLoadAd = abstractC14971l;
                        C17893l c17893l = null;
                        while (abstractC14971lLoadAd != null) {
                            if (abstractC14971lLoadAd instanceof C6543l) {
                                break loop0;
                            }
                            if ((abstractC14971lLoadAd.f29450l & 1024) != 0 && (abstractC14971lLoadAd instanceof AbstractC11340l)) {
                                int i4 = 0;
                                for (AbstractC14971l abstractC14971l2 = ((AbstractC11340l) abstractC14971lLoadAd).f22875l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29460l) {
                                    if ((abstractC14971l2.f29450l & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            abstractC14971lLoadAd = abstractC14971l2;
                                        } else {
                                            if (c17893l == null) {
                                                c17893l = new C17893l(0, new AbstractC14971l[16]);
                                            }
                                            if (abstractC14971lLoadAd != null) {
                                                c17893l.crashlytics(abstractC14971lLoadAd);
                                                abstractC14971lLoadAd = null;
                                            }
                                            c17893l.crashlytics(abstractC14971l2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC14971lLoadAd = AbstractC5573l.loadAd(c17893l);
                        }
                    }
                    abstractC14971l = abstractC14971l.f29456l;
                }
            }
            c3654lMetrica = c3654lMetrica.license();
            abstractC14971l = (c3654lMetrica == null || (c18289l = c3654lMetrica.f7703l) == null) ? null : (C13924l) c18289l.billing;
        }
        C6543l c6543l2 = (C6543l) abstractC14971lLoadAd;
        if ((c6543l2 == null || !AbstractC8576l.yandex(c6543l2.m2022l(), c6543l.m2022l())) && (c8604lM2022l = c6543l.m2022l()) != null) {
            int i5 = 5;
            if (i == 5) {
                i3 = i5;
            } else {
                i5 = 6;
                if (i == 6) {
                    i3 = i5;
                } else {
                    i5 = 3;
                    if (i == 3) {
                        i3 = i5;
                    } else {
                        i5 = 4;
                        if (i == 4) {
                            i3 = i5;
                        } else if (i == 1) {
                            i3 = 2;
                        } else if (i != 2) {
                            C8339l.smaato("Unsupported direction for beyond bounds layout");
                        }
                    }
                }
            }
            if (c8604lM2022l.f17751l.yandex() <= 0 || !c8604lM2022l.f17751l.amazon() || !c8604lM2022l.f29462l) {
                return function1.invoke(C8604l.f17748l);
            }
            boolean zM2335l = c8604lM2022l.m2335l(i3);
            InterfaceC5793l interfaceC5793l = c8604lM2022l.f17751l;
            int iLoadAd = zM2335l ? interfaceC5793l.loadAd() : interfaceC5793l.purchase();
            C10700l c10700l = new C10700l();
            C5138l c5138l = c8604lM2022l.f17749l;
            c5138l.getClass();
            C17149l c17149l = new C17149l(iLoadAd, iLoadAd);
            ((C17893l) c5138l.f11181l).crashlytics(c17149l);
            c10700l.f21708l = c17149l;
            int iCrashlytics = c8604lM2022l.f17751l.crashlytics() * 2;
            int iYandex = c8604lM2022l.f17751l.yandex();
            if (iCrashlytics > iYandex) {
                iCrashlytics = iYandex;
            }
            while (objInvoke == null && c8604lM2022l.m2334l((C17149l) c10700l.f21708l, i3) && i2 < iCrashlytics) {
                C17149l c17149l2 = (C17149l) c10700l.f21708l;
                int i6 = c17149l2.yandex;
                int i7 = c17149l2.loadAd;
                if (c8604lM2022l.m2335l(i3)) {
                    i7++;
                } else {
                    i6--;
                }
                C5138l c5138l2 = c8604lM2022l.f17749l;
                c5138l2.getClass();
                C17149l c17149l3 = new C17149l(i6, i7);
                ((C17893l) c5138l2.f11181l).crashlytics(c17149l3);
                ((C17893l) c8604lM2022l.f17749l.f11181l).remoteconfig((C17149l) c10700l.f21708l);
                c10700l.f21708l = c17149l3;
                i2++;
                AbstractC5573l.metrica(c8604lM2022l).smaato();
                objInvoke = function1.invoke(new C2132l(c8604lM2022l, c10700l, i3));
            }
            ((C17893l) c8604lM2022l.f17749l.f11181l).remoteconfig((C17149l) c10700l.f21708l);
            AbstractC5573l.metrica(c8604lM2022l).smaato();
            return objInvoke;
        }
        return null;
    }

    public static void yandex(String str, boolean z) throws C9373l {
        if (z) {
            return;
        }
        C9258l c9258l = AbstractC1186l.f3181l;
        throw new C9373l(str, C13708l.f26763l);
    }
}
