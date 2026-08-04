package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4927l {
    public static final C9138l[] loadAd;
    public static final C9138l yandex;

    static {
        C9138l c9138l = new C9138l(-1, 7L, "moduleinstall", true);
        yandex = c9138l;
        loadAd = new C9138l[]{c9138l};
    }

    public static ColorStateList admob(Context context, C12418l c12418l, int i) {
        int resourceId;
        ColorStateList colorStateListCrashlytics;
        TypedArray typedArray = (TypedArray) c12418l.f24518l;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListCrashlytics = AbstractC7720l.crashlytics(context, resourceId)) == null) ? c12418l.adcel(i) : colorStateListCrashlytics;
    }

    public static final InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l, long j, InterfaceC6347l interfaceC6347l) {
        return interfaceC17242l.premium(new C9016l(j, null, interfaceC6347l, 2));
    }

    public static final boolean billing(AbstractC8702l abstractC8702l) {
        return !AbstractC12008l.purchase(abstractC8702l.mo700else().mo818extends().yandex());
    }

    public static InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, AbstractC9544l abstractC9544l) {
        return interfaceC17242l.premium(new C9016l(0L, abstractC9544l, AbstractC16837l.yandex, 1));
    }

    public static Drawable firebase(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableLoadAd;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableLoadAd = AbstractC13273l.loadAd(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableLoadAd;
    }

    public static int isPro(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static final C12620l loadAd(Context context, int i) {
        return new C12620l(C14122l.loadAd(context, C14122l.amazon(i), null, AbstractC0653l.vip(i, "bug_wrk_"), PlaybackService.class));
    }

    public static final Object mopub(AbstractC8702l abstractC8702l) {
        return AbstractC7572l.purchase(abstractC8702l.mo700else());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    public static final AbstractC9640l purchase(AbstractC8702l abstractC8702l, boolean z, Field field) {
        InterfaceC10696l interfaceC10696lMo818extends = abstractC8702l.mo700else().mo818extends();
        InterfaceC8371l interfaceC8371lSignature = interfaceC10696lMo818extends.Signature();
        int i = 2;
        int i2 = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        if (AbstractC11125l.firebase(interfaceC8371lSignature)) {
            InterfaceC8371l interfaceC8371lSignature2 = interfaceC8371lSignature.Signature();
            if ((AbstractC11125l.smaato(interfaceC8371lSignature2, 2) || AbstractC11125l.smaato(interfaceC8371lSignature2, 5)) && (!(interfaceC10696lMo818extends instanceof C1689l) || !C11682l.amazon(((C1689l) interfaceC10696lMo818extends).f4064l))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (abstractC8702l.mo700else().mo818extends().getAnnotations().isPro(AbstractC5592l.yandex)) {
                        if (z) {
                        }
                    }
                    if (z) {
                        if (AbstractC7572l.admob(abstractC8702l)) {
                        }
                    }
                    if (AbstractC7572l.admob(abstractC8702l)) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (abstractC8702l.mo700else().mo818extends().getAnnotations().isPro(AbstractC5592l.yandex)) {
                return z ? new C8659l(field, b2 == true ? 1 : 0, i) : new C8784l(field, billing(abstractC8702l), b == true ? 1 : 0, i);
            }
            if (z) {
                return AbstractC7572l.admob(abstractC8702l) ? new C8811l(field, false) : new C8659l(field, z6 ? 1 : 0, z5 ? 1 : 0);
            }
            return AbstractC7572l.admob(abstractC8702l) ? new C13300l(field, billing(abstractC8702l), false) : new C8784l(field, billing(abstractC8702l), z4 ? 1 : 0, z3 ? 1 : 0);
        }
        if (z) {
            return AbstractC7572l.admob(abstractC8702l) ? new C10112l(field, mopub(abstractC8702l)) : new C8659l(field, z2, i2);
        }
        if (AbstractC7572l.admob(abstractC8702l)) {
            return new C6991l(field, billing(abstractC8702l), mopub(abstractC8702l));
        }
        return new C8784l(field, billing(abstractC8702l), z7 ? 1 : 0, b3 == true ? 1 : 0);
    }

    public static boolean smaato(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static ColorStateList subs(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListCrashlytics;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListCrashlytics = AbstractC7720l.crashlytics(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListCrashlytics;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0153  */
    public static final InterfaceC16148l yandex(AbstractC8702l abstractC8702l, boolean z) {
        C5061l c5061l;
        Method method;
        InterfaceC16148l c12056l;
        C6431l c6431l;
        InterfaceC16148l c5654l;
        Field fieldMetrica;
        C3498l c3498l;
        Method methodAmazon;
        InterfaceC17477l interfaceC17477l;
        if (AbstractC0601l.f2039l.amazon(abstractC8702l.mo700else().f5871l)) {
            return C10422l.yandex;
        }
        C3624l c3624l = AbstractC1653l.yandex;
        AbstractC2648l abstractC2648lLoadAd = AbstractC1653l.loadAd(abstractC8702l.mo700else().mo818extends());
        int i = 0;
        Class clsMetrica = null;
        if (abstractC2648lLoadAd instanceof C8632l) {
            C8632l c8632l = (C8632l) abstractC2648lLoadAd;
            InterfaceC3588l interfaceC3588l = c8632l.purchase;
            C10459l c10459l = c8632l.amazon;
            if (z) {
                if (c10459l.subs()) {
                    c6431l = c10459l.f21281l;
                } else {
                    c6431l = null;
                }
            } else if ((c10459l.f21279l & 8) == 8) {
                c6431l = c10459l.f21284l;
            } else {
                c6431l = null;
            }
            Method methodM655catch = c6431l != null ? abstractC8702l.mo700else().f5867l.m655catch(interfaceC3588l.getString(c6431l.f13452l), interfaceC3588l.getString(c6431l.f13456l)) : null;
            if (methodM655catch == null) {
                InterfaceC10696l interfaceC10696lMo818extends = abstractC8702l.mo700else().mo818extends();
                int i2 = AbstractC6245l.yandex;
                if (interfaceC10696lMo818extends.mo1479return() == null && interfaceC10696lMo818extends.mo1478l().isEmpty()) {
                    InterfaceC8371l interfaceC8371lSignature = interfaceC10696lMo818extends.Signature();
                    InterfaceC17477l interfaceC17477l2 = interfaceC8371lSignature instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC8371lSignature : null;
                    if (interfaceC17477l2 != null) {
                        int i3 = AbstractC3759l.yandex;
                        AbstractC5645l abstractC5645lMo753l = interfaceC17477l2.mo753l();
                        C6065l c6065l = abstractC5645lMo753l instanceof C6065l ? (C6065l) abstractC5645lMo753l : null;
                        if (c6065l != null) {
                            c3498l = c6065l.yandex;
                        } else {
                            c3498l = null;
                        }
                    } else {
                        c3498l = null;
                    }
                    if (AbstractC8576l.yandex(c3498l, interfaceC10696lMo818extends.getName()) && AbstractC8576l.yandex(abstractC8702l.mo700else().mo818extends().admob(), AbstractC6004l.amazon)) {
                        InterfaceC8371l interfaceC8371lSignature2 = abstractC8702l.mo700else().mo818extends().Signature();
                        if ((interfaceC8371lSignature2 instanceof InterfaceC17477l) && AbstractC6245l.yandex(interfaceC8371lSignature2) && (clsMetrica = AbstractC5592l.metrica((interfaceC17477l = (InterfaceC17477l) interfaceC8371lSignature2))) == null) {
                            StringBuilder sb = new StringBuilder("Class object for the class ");
                            sb.append(interfaceC17477l.getName());
                            C3624l c3624lBilling = AbstractC3759l.billing((InterfaceC15234l) interfaceC8371lSignature2);
                            sb.append(" cannot be found (classId=");
                            sb.append(c3624lBilling);
                            sb.append(')');
                            throw new C3150l(sb.toString());
                        }
                        if (clsMetrica == null || (methodAmazon = AbstractC13457l.amazon(clsMetrica, abstractC8702l.mo700else())) == null) {
                            throw new C3150l("Underlying property of inline class " + abstractC8702l.mo700else() + " should have a field");
                        }
                        c12056l = AbstractC7572l.admob(abstractC8702l) ? new C10709l(methodAmazon, mopub(abstractC8702l)) : new C1549l(methodAmazon);
                    } else {
                        fieldMetrica = abstractC8702l.mo700else().metrica();
                        if (fieldMetrica != null) {
                            C11467l.ads(abstractC8702l.mo700else(), "No accessors or field is found for property ");
                            return null;
                        }
                        c12056l = purchase(abstractC8702l, z, fieldMetrica);
                    }
                } else {
                    fieldMetrica = abstractC8702l.mo700else().metrica();
                    if (fieldMetrica != null) {
                        C11467l.ads(abstractC8702l.mo700else(), "No accessors or field is found for property ");
                        return null;
                    }
                    c12056l = purchase(abstractC8702l, z, fieldMetrica);
                }
            } else {
                if (!Modifier.isStatic(methodM655catch.getModifiers())) {
                    c5654l = AbstractC7572l.admob(abstractC8702l) ? new C12056l(methodM655catch, mopub(abstractC8702l)) : new C14041l(i, methodM655catch);
                } else if (abstractC8702l.mo700else().mo818extends().getAnnotations().isPro(AbstractC5592l.yandex)) {
                    c5654l = AbstractC7572l.admob(abstractC8702l) ? new C12503l(methodM655catch) : new C14041l(methodM655catch);
                } else {
                    c5654l = AbstractC7572l.admob(abstractC8702l) ? new C5654l(methodM655catch, false, mopub(abstractC8702l)) : new C14041l(2, methodM655catch);
                }
                c12056l = c5654l;
            }
        } else if (abstractC2648lLoadAd instanceof C1702l) {
            c12056l = purchase(abstractC8702l, z, ((C1702l) abstractC2648lLoadAd).loadAd);
        } else {
            if (!(abstractC2648lLoadAd instanceof C15753l)) {
                if (!(abstractC2648lLoadAd instanceof C18515l)) {
                    C18725l.billing();
                    return null;
                }
                if (z) {
                    c5061l = ((C18515l) abstractC2648lLoadAd).loadAd;
                } else {
                    c5061l = ((C18515l) abstractC2648lLoadAd).crashlytics;
                    if (c5061l == null) {
                        C11467l.ads(abstractC8702l.mo700else(), "No setter found for property ");
                        return null;
                    }
                }
                AbstractC0601l abstractC0601l = abstractC8702l.mo700else().f5867l;
                C0166l c0166l = c5061l.loadAd;
                Method methodM655catch2 = abstractC0601l.m655catch(c0166l.loadAd, c0166l.crashlytics);
                if (methodM655catch2 != null) {
                    Modifier.isStatic(methodM655catch2.getModifiers());
                    return AbstractC7572l.admob(abstractC8702l) ? new C12056l(methodM655catch2, mopub(abstractC8702l)) : new C14041l(i, methodM655catch2);
                }
                C11467l.ads(abstractC8702l.mo700else(), "No accessor found for property ");
                return null;
            }
            if (z) {
                method = ((C15753l) abstractC2648lLoadAd).loadAd;
            } else {
                C15753l c15753l = (C15753l) abstractC2648lLoadAd;
                method = c15753l.crashlytics;
                if (method == null) {
                    C11467l.ads(c15753l.loadAd, "No source found for setter of Java method property: ");
                    return null;
                }
            }
            c12056l = AbstractC7572l.admob(abstractC8702l) ? new C12056l(method, mopub(abstractC8702l)) : new C14041l(i, method);
        }
        return AbstractC13457l.loadAd(c12056l, abstractC8702l, C2580l.f5619l, false);
    }
}
