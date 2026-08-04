package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؘؘؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5518l {
    public static final C15578l yandex = new C15578l(1337264171, false, new C5407l(27));
    public static final C15578l loadAd = new C15578l(-67927507, false, new C0263l(2));
    public static final C15578l crashlytics = new C15578l(-801005646, false, new C12496l(7));
    public static final C15578l amazon = new C15578l(-1503601485, false, new C12496l(8));
    public static final C15578l purchase = new C15578l(1495480407, false, new C7277l(29));
    public static final C15578l billing = new C15578l(-273991207, false, new C12496l(0));
    public static final C15578l mopub = new C15578l(-2043462821, false, new C12496l(1));
    public static final C15578l admob = new C15578l(-1466756561, false, new C12496l(2));
    public static final C15578l subs = new C15578l(599837166, false, new C12496l(3));
    public static final C15578l isPro = new C15578l(-144357626, false, new C5407l(28));
    public static final C15578l firebase = new C15578l(-672946105, false, new C5407l(29));
    public static final C15578l smaato = new C15578l(377329820, false, new C12496l(4));
    public static final C15578l remoteconfig = new C15578l(1429479807, false, new C0263l(0));
    public static final C15578l vip = new C15578l(729986334, false, new C12496l(5));
    public static final C15578l metrica = new C15578l(1782136321, false, new C0263l(1));
    public static final C15578l startapp = new C15578l(1082642848, false, new C12496l(6));

    public static final int isPro(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static final long loadAd(AbstractC13264l abstractC13264l) {
        return AbstractC5573l.subscription(((C13765l) abstractC13264l.amazon.f32505l).admob() * abstractC13264l.vip()) + (((long) ((C15308l) abstractC13264l.amazon.f32506l).admob()) * ((long) abstractC13264l.vip()));
    }

    public static Object subs(AbstractC5518l abstractC5518l, Context context, int i, AbstractC0283l abstractC0283l) {
        abstractC5518l.getClass();
        AtomicBoolean atomicBoolean = AbstractC11854l.yandex;
        if (Build.VERSION.SDK_INT >= 29 && AbstractC11854l.yandex.get()) {
            AbstractC11880l.crashlytics();
        }
        Object objAmazon = abstractC5518l.amazon(context, new C3445l(i), null, new C15678l(4, null, 0), abstractC0283l);
        return objAmazon == EnumC9342l.f19165l ? objAmazon : Unit.INSTANCE;
    }

    public static final long yandex(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = C1723l.crashlytics;
        return jFloatToRawIntBits;
    }

    public Object admob(Context context, C3445l c3445l, AbstractC0283l abstractC0283l) {
        if (!(c3445l instanceof C3445l) || AbstractC13743l.mopub(c3445l)) {
            C8339l.metrica("Invalid Glance ID");
            return null;
        }
        Object objSubs = subs(this, context, c3445l.yandex, abstractC0283l);
        return objSubs == EnumC9342l.f19165l ? objSubs : Unit.INSTANCE;
    }

    public Object amazon(Context context, C3445l c3445l, Bundle bundle, Function4 function4, AbstractC0283l abstractC0283l) {
        C3702l c3702l = AbstractC1585l.yandex;
        C16193l c16193l = new C16193l(context, c3445l, this, bundle, function4, null);
        c3702l.getClass();
        return C3702l.yandex(c3702l, c16193l, abstractC0283l);
    }

    public abstract C15656l billing();

    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca A[DONT_INVERT, PHI: r10 r11
  0x00ca: PHI (r10v15 android.content.Context) = (r10v11 android.content.Context), (r10v17 android.content.Context) binds: [B:31:0x00b1, B:36:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r11v12 lؕ٘ؑ) = (r11v8 lؕ٘ؑ), (r11v13 lؕ٘ؑ) binds: [B:31:0x00b1, B:36:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x0102  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b A[DONT_INVERT, PHI: r11 r12
  0x011b: PHI (r11v14 android.content.Context) = (r11v5 android.content.Context), (r11v15 android.content.Context) binds: [B:50:0x0100, B:55:0x0119] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r12v17 lؕ٘ؑ) = (r12v6 lؕ٘ؑ), (r12v18 lؕ٘ؑ) binds: [B:50:0x0100, B:55:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    /* JADX WARN: Code duplicated, block: B:87:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a0 A[DONT_INVERT, PHI: r10 r12
  0x01a0: PHI (r10v19 android.content.Context) = (r10v10 android.content.Context), (r10v21 android.content.Context) binds: [B:83:0x0188, B:88:0x019f] A[DONT_GENERATE, DONT_INLINE]
  0x01a0: PHI (r12v14 lؕ٘ؑ) = (r12v7 lؕ٘ؑ), (r12v15 lؕ٘ؑ) binds: [B:83:0x0188, B:88:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a2  */
    public Object crashlytics(Context context, int i, AbstractC0283l abstractC0283l) throws Throwable {
        C1034l c1034l;
        C3445l c3445l;
        Context context2;
        int i2;
        int i3;
        C3445l c3445l2;
        C3445l c3445l3;
        Throwable th;
        C15656l c15656lBilling;
        C18188l c18188l;
        String strCrashlytics;
        Context context3;
        C3445l c3445l4;
        C15656l c15656lBilling2;
        C18188l c18188l2;
        String strCrashlytics2;
        C3445l c3445l5;
        C15656l c15656lBilling3;
        C18188l c18188l3;
        String strCrashlytics3;
        C3445l c3445l6;
        StringBuilder sb;
        if (abstractC0283l instanceof C1034l) {
            c1034l = (C1034l) abstractC0283l;
            int i4 = c1034l.f2870l;
            if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1034l.f2870l = i4 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1034l = new C1034l(this, abstractC0283l);
            }
        } else {
            c1034l = new C1034l(this, abstractC0283l);
        }
        Object obj = c1034l.f2869l;
        int i5 = c1034l.f2870l;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i5) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                c3445l = new C3445l(i);
                C3702l c3702l = AbstractC1585l.yandex;
                C18731l c18731l = new C18731l(c3445l, interfaceC14029l, 29);
                c1034l.f2872l = context;
                c1034l.f2871l = c3445l;
                c1034l.f2868l = i;
                c1034l.f2870l = 1;
                c3702l.getClass();
                if (C3702l.yandex(c3702l, c18731l, c1034l) != enumC9342l) {
                    try {
                        c1034l.f2872l = context;
                        c1034l.f2871l = c3445l;
                        c1034l.f2868l = i;
                        c1034l.f2870l = 2;
                        if (Unit.INSTANCE != enumC9342l) {
                            C3445l c3445l7 = c3445l;
                            i3 = i;
                            c3445l2 = c3445l7;
                            c15656lBilling3 = billing();
                            if (c15656lBilling3 != null) {
                                c18188l3 = C18188l.yandex;
                                strCrashlytics3 = AbstractC13743l.crashlytics(i3);
                                c1034l.f2872l = context;
                                c1034l.f2871l = c3445l2;
                                c1034l.f2870l = 3;
                                if (c18188l3.yandex(context, c15656lBilling3, strCrashlytics3, c1034l) != enumC9342l) {
                                    c3445l6 = c3445l2;
                                    c3445l2 = c3445l6;
                                    if (c3445l2 != null && !AbstractC13743l.mopub(c3445l2)) {
                                        try {
                                            AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l2.yandex)).delete();
                                        } catch (Exception e) {
                                            e = e;
                                            sb = new StringBuilder("Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id ");
                                            sb.append(c3445l2);
                                            Log.d("GlanceAppWidget", sb.toString(), e);
                                        }
                                    }
                                }
                                break;
                            } else {
                                if (c3445l2 != null) {
                                    AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l2.yandex)).delete();
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (CancellationException unused) {
                        c15656lBilling2 = billing();
                        if (c15656lBilling2 != null) {
                            c18188l2 = C18188l.yandex;
                            strCrashlytics2 = AbstractC13743l.crashlytics(i);
                            c1034l.f2872l = context;
                            c1034l.f2871l = c3445l;
                            c1034l.f2870l = 4;
                            if (c18188l2.yandex(context, c15656lBilling2, strCrashlytics2, c1034l) != enumC9342l) {
                                c3445l5 = c3445l;
                                c3445l = c3445l5;
                                if (c3445l != null) {
                                    try {
                                        AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l.yandex)).delete();
                                    } catch (Exception e2) {
                                        e = e2;
                                        sb = new StringBuilder("Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id ");
                                        sb.append(c3445l);
                                        Log.d("GlanceAppWidget", sb.toString(), e);
                                    }
                                }
                            }
                            break;
                        } else {
                            if (c3445l != null) {
                                AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l.yandex)).delete();
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        int i6 = i;
                        context2 = context;
                        i2 = i6;
                        try {
                            Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th);
                            c15656lBilling = billing();
                            if (c15656lBilling != null) {
                                c18188l = C18188l.yandex;
                                strCrashlytics = AbstractC13743l.crashlytics(i2);
                                c1034l.f2872l = context2;
                                c1034l.f2871l = c3445l;
                                c1034l.f2870l = 5;
                                if (c18188l.yandex(context2, c15656lBilling, strCrashlytics, c1034l) != enumC9342l) {
                                    context3 = context2;
                                    c3445l4 = c3445l;
                                    c3445l = c3445l4;
                                    context2 = context3;
                                    if (c3445l != null) {
                                        try {
                                            AbstractC2632l.amazon(context2, AbstractC16422l.billing(c3445l.yandex)).delete();
                                        } catch (Exception e3) {
                                            e = e3;
                                            sb = new StringBuilder("Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id ");
                                            sb.append(c3445l);
                                            Log.d("GlanceAppWidget", sb.toString(), e);
                                        }
                                    }
                                }
                                break;
                            } else {
                                if (c3445l != null) {
                                    AbstractC2632l.amazon(context2, AbstractC16422l.billing(c3445l.yandex)).delete();
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            C15656l c15656lBilling4 = billing();
                            if (c15656lBilling4 != null) {
                                C18188l c18188l4 = C18188l.yandex;
                                String strCrashlytics4 = AbstractC13743l.crashlytics(i2);
                                c1034l.f2872l = context2;
                                c1034l.f2871l = c3445l;
                                c1034l.f2874l = th;
                                c1034l.f2870l = 6;
                                if (c18188l4.yandex(context2, c15656lBilling4, strCrashlytics4, c1034l) != enumC9342l) {
                                    c3445l3 = c3445l;
                                    th = th;
                                    th = th;
                                    c3445l = c3445l3;
                                }
                            }
                            if (c3445l != null) {
                                try {
                                    AbstractC2632l.amazon(context2, AbstractC16422l.billing(c3445l.yandex)).delete();
                                } catch (Exception e4) {
                                    Log.d("GlanceAppWidget", "Could not delete LayoutConfiguration dataStoreFile when cleaning upold appwidget id " + c3445l, e4);
                                }
                                break;
                            }
                            throw th;
                        }
                    }
                }
                return enumC9342l;
            case 1:
                i = c1034l.f2868l;
                C3445l c3445l8 = c1034l.f2871l;
                Context context4 = c1034l.f2872l;
                AbstractC2829l.crashlytics(obj);
                c3445l = c3445l8;
                context = context4;
                c1034l.f2872l = context;
                c1034l.f2871l = c3445l;
                c1034l.f2868l = i;
                c1034l.f2870l = 2;
                if (Unit.INSTANCE != enumC9342l) {
                    C3445l c3445l9 = c3445l;
                    i3 = i;
                    c3445l2 = c3445l9;
                    c15656lBilling3 = billing();
                    if (c15656lBilling3 != null) {
                        c18188l3 = C18188l.yandex;
                        strCrashlytics3 = AbstractC13743l.crashlytics(i3);
                        c1034l.f2872l = context;
                        c1034l.f2871l = c3445l2;
                        c1034l.f2870l = 3;
                        if (c18188l3.yandex(context, c15656lBilling3, strCrashlytics3, c1034l) != enumC9342l) {
                            c3445l6 = c3445l2;
                            c3445l2 = c3445l6;
                            if (c3445l2 != null) {
                                AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l2.yandex)).delete();
                            }
                        }
                        break;
                    } else {
                        if (c3445l2 != null) {
                            AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l2.yandex)).delete();
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                }
                return enumC9342l;
            case 2:
                i2 = c1034l.f2868l;
                c3445l2 = c1034l.f2871l;
                Context context5 = c1034l.f2872l;
                try {
                    AbstractC2829l.crashlytics(obj);
                    i3 = i2;
                    context = context5;
                    c15656lBilling3 = billing();
                    if (c15656lBilling3 != null) {
                        c18188l3 = C18188l.yandex;
                        strCrashlytics3 = AbstractC13743l.crashlytics(i3);
                        c1034l.f2872l = context;
                        c1034l.f2871l = c3445l2;
                        c1034l.f2870l = 3;
                        if (c18188l3.yandex(context, c15656lBilling3, strCrashlytics3, c1034l) != enumC9342l) {
                            c3445l6 = c3445l2;
                            c3445l2 = c3445l6;
                            if (c3445l2 != null) {
                                AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l2.yandex)).delete();
                            }
                            break;
                        }
                        return enumC9342l;
                    }
                    if (c3445l2 != null) {
                        AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l2.yandex)).delete();
                    }
                    break;
                } catch (CancellationException unused2) {
                    c3445l = c3445l2;
                    i = i2;
                    context = context5;
                    c15656lBilling2 = billing();
                    if (c15656lBilling2 != null) {
                        c18188l2 = C18188l.yandex;
                        strCrashlytics2 = AbstractC13743l.crashlytics(i);
                        c1034l.f2872l = context;
                        c1034l.f2871l = c3445l;
                        c1034l.f2870l = 4;
                        if (c18188l2.yandex(context, c15656lBilling2, strCrashlytics2, c1034l) != enumC9342l) {
                            c3445l5 = c3445l;
                            c3445l = c3445l5;
                            if (c3445l != null) {
                                AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l.yandex)).delete();
                            }
                        }
                        break;
                    } else {
                        if (c3445l != null) {
                            AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l.yandex)).delete();
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    c3445l = c3445l2;
                    context2 = context5;
                    th = th4;
                    Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th);
                    c15656lBilling = billing();
                    if (c15656lBilling != null) {
                        c18188l = C18188l.yandex;
                        strCrashlytics = AbstractC13743l.crashlytics(i2);
                        c1034l.f2872l = context2;
                        c1034l.f2871l = c3445l;
                        c1034l.f2870l = 5;
                        if (c18188l.yandex(context2, c15656lBilling, strCrashlytics, c1034l) != enumC9342l) {
                            context3 = context2;
                            c3445l4 = c3445l;
                            c3445l = c3445l4;
                            context2 = context3;
                            if (c3445l != null) {
                                AbstractC2632l.amazon(context2, AbstractC16422l.billing(c3445l.yandex)).delete();
                            }
                        }
                        break;
                    } else {
                        if (c3445l != null) {
                            AbstractC2632l.amazon(context2, AbstractC16422l.billing(c3445l.yandex)).delete();
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 3:
                c3445l6 = c1034l.f2871l;
                context = c1034l.f2872l;
                AbstractC2829l.crashlytics(obj);
                c3445l2 = c3445l6;
                if (c3445l2 != null) {
                    AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l2.yandex)).delete();
                    break;
                }
                return Unit.INSTANCE;
            case 4:
                c3445l5 = c1034l.f2871l;
                context = c1034l.f2872l;
                AbstractC2829l.crashlytics(obj);
                c3445l = c3445l5;
                if (c3445l != null && !AbstractC13743l.mopub(c3445l)) {
                    AbstractC2632l.amazon(context, AbstractC16422l.billing(c3445l.yandex)).delete();
                    break;
                }
                return Unit.INSTANCE;
            case 5:
                c3445l4 = c1034l.f2871l;
                context3 = c1034l.f2872l;
                AbstractC2829l.crashlytics(obj);
                c3445l = c3445l4;
                context2 = context3;
                if (c3445l != null && !AbstractC13743l.mopub(c3445l)) {
                    AbstractC2632l.amazon(context2, AbstractC16422l.billing(c3445l.yandex)).delete();
                    break;
                }
                return Unit.INSTANCE;
            case 6:
                th = c1034l.f2874l;
                c3445l3 = c1034l.f2871l;
                context2 = c1034l.f2872l;
                AbstractC2829l.crashlytics(obj);
                th = th;
                c3445l = c3445l3;
                if (c3445l != null && !AbstractC13743l.mopub(c3445l)) {
                    AbstractC2632l.amazon(context2, AbstractC16422l.billing(c3445l.yandex)).delete();
                    break;
                }
                throw th;
            default:
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public abstract void mopub(Context context, C3445l c3445l, AbstractC0283l abstractC0283l);

    public abstract InterfaceC18579l purchase();
}
