package defpackage;

import android.content.Context;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lِؓؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1788l {
    public static volatile C7972l loadAd;
    public static volatile C3797l yandex;

    public static void admob(InterfaceC6060l interfaceC6060l, Annotation annotation) {
        Class clsMo1730private = ((InterfaceC13937l) AbstractC16131l.billing(annotation)).mo1730private();
        InterfaceC14209l interfaceC14209lBilling = interfaceC6060l.billing(AbstractC1845l.yandex(clsMo1730private), new C7155l(annotation));
        if (interfaceC14209lBilling != null) {
            subs(interfaceC14209lBilling, annotation, clsMo1730private);
        }
    }

    public static final C18427l amazon(C18010l c18010l, String str) {
        Object c18435l;
        try {
            AbstractC9914l abstractC9914l = (AbstractC9914l) c18010l.get(str);
            if (abstractC9914l != null) {
                C11474l c11474l = AbstractC8358l.yandex;
                c18435l = abstractC9914l instanceof C18427l ? (C18427l) abstractC9914l : null;
                if (c18435l == null) {
                    AbstractC8358l.crashlytics(abstractC9914l, "JsonArray");
                    throw null;
                }
            } else {
                c18435l = null;
            }
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        return (C18427l) (c18435l instanceof C18435l ? null : c18435l);
    }

    public static final AbstractC18121l billing(C18010l c18010l, String str) {
        Object c18435l;
        try {
            AbstractC9914l abstractC9914l = (AbstractC9914l) c18010l.get(str);
            c18435l = abstractC9914l != null ? AbstractC8358l.admob(abstractC9914l) : null;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        return (AbstractC18121l) (c18435l instanceof C18435l ? null : c18435l);
    }

    public static boolean crashlytics(InterfaceC0207l interfaceC0207l) {
        if (!AbstractC7147l.amazon.contains(interfaceC0207l.getName())) {
            return false;
        }
        if (AbstractC16901l.inmobi(AbstractC7147l.crashlytics, AbstractC3759l.crashlytics(interfaceC0207l)) && interfaceC0207l.mo1007finally().isEmpty()) {
            return true;
        }
        if (!AbstractC16860l.isVip(interfaceC0207l)) {
            return false;
        }
        Collection collectionLicense = interfaceC0207l.license();
        if (collectionLicense.isEmpty()) {
            return false;
        }
        Iterator it = collectionLicense.iterator();
        while (it.hasNext()) {
            if (crashlytics((InterfaceC0207l) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final String isPro(C18010l c18010l, String str) {
        AbstractC18121l abstractC18121lBilling = billing(c18010l, str);
        if (abstractC18121lBilling != null) {
            return AbstractC8358l.purchase(abstractC18121lBilling);
        }
        return null;
    }

    public static C14700l loadAd(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            C3624l c3624lYandex = AbstractC1845l.yandex(cls);
            String str = C4632l.yandex;
            C3624l c3624lMopub = C4632l.mopub(c3624lYandex.yandex());
            if (c3624lMopub != null) {
                c3624lYandex = c3624lMopub;
            }
            return new C14700l(c3624lYandex, i);
        }
        if (cls.equals(Void.TYPE)) {
            C2312l c2312lSubs = AbstractC3333l.amazon.subs();
            return new C14700l(new C3624l(c2312lSubs.loadAd(), c2312lSubs.yandex.mopub()), i);
        }
        EnumC15893l enumC15893lCrashlytics = EnumC17708l.loadAd(cls.getName()).crashlytics();
        if (i > 0) {
            C2312l c2312l = (C2312l) enumC15893lCrashlytics.f31172l.getValue();
            return new C14700l(new C3624l(c2312l.loadAd(), c2312l.yandex.mopub()), i - 1);
        }
        C2312l c2312l2 = (C2312l) enumC15893lCrashlytics.f31169l.getValue();
        return new C14700l(new C3624l(c2312l2.loadAd(), c2312l2.yandex.mopub()), i);
    }

    public static C7972l mopub(Context context) {
        C7972l c7972l;
        Context applicationContext = context.getApplicationContext();
        C7972l c7972l2 = loadAd;
        if (c7972l2 != null) {
            return c7972l2;
        }
        synchronized (C7972l.class) {
            try {
                c7972l = loadAd;
                if (c7972l == null) {
                    c7972l = new C7972l(0, new C6012l(applicationContext));
                    loadAd = c7972l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7972l;
    }

    public static final C18010l purchase(C18010l c18010l, String str) {
        Object c18435l;
        try {
            AbstractC9914l abstractC9914l = (AbstractC9914l) c18010l.get(str);
            c18435l = abstractC9914l != null ? AbstractC8358l.mopub(abstractC9914l) : null;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        return (C18010l) (c18435l instanceof C18435l ? null : c18435l);
    }

    public static void subs(InterfaceC14209l interfaceC14209l, Annotation annotation, Class cls) {
        for (Method method : cls.getDeclaredMethods()) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                C3498l c3498lPurchase = C3498l.purchase(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    interfaceC14209l.mo1666l(c3498lPurchase, loadAd((Class) objInvoke));
                } else if (AbstractC18694l.yandex.contains(enclosingClass)) {
                    interfaceC14209l.mo1665l(c3498lPurchase, objInvoke);
                } else {
                    List list = AbstractC1845l.yandex;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        interfaceC14209l.mo1664l(c3498lPurchase, AbstractC1845l.yandex(enclosingClass), C3498l.purchase(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class cls2 = (Class) AbstractC8669l.m2401default(enclosingClass.getInterfaces());
                        InterfaceC14209l interfaceC14209lMo1668l = interfaceC14209l.mo1668l(AbstractC1845l.yandex(cls2), c3498lPurchase);
                        if (interfaceC14209lMo1668l != null) {
                            subs(interfaceC14209lMo1668l, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        InterfaceC12997l interfaceC12997lMo1667l = interfaceC14209l.mo1667l(c3498lPurchase);
                        if (interfaceC12997lMo1667l != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                C3624l c3624lYandex = AbstractC1845l.yandex(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    interfaceC12997lMo1667l.license(c3624lYandex, C3498l.purchase(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    interfaceC12997lMo1667l.mo2856private(loadAd((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    InterfaceC14209l interfaceC14209lPurchase = interfaceC12997lMo1667l.purchase(AbstractC1845l.yandex(componentType));
                                    if (interfaceC14209lPurchase != null) {
                                        subs(interfaceC14209lPurchase, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    interfaceC12997lMo1667l.tapsense(obj4);
                                }
                            }
                            interfaceC12997lMo1667l.mo2836abstract();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC14209l.mo1662abstract();
    }

    public static final Object yandex(C7644l c7644l, String str, int i, AbstractC0283l abstractC0283l) {
        C17464l c17464l = new C17464l("audioBooks.setProgress", C15617l.f30513l);
        c17464l.yandex("chapter_id", str);
        c17464l.loadAd(i, "time_from_start");
        return c7644l.billing(c17464l, abstractC0283l);
    }
}
