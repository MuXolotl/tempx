package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11784l {
    public static final C15578l yandex = new C15578l(297967481, false, new C13881l(10));

    public static final boolean amazon(InterfaceC17477l interfaceC17477l, InterfaceC0207l interfaceC0207l) {
        AbstractC15211l abstractC15211lAd = ((InterfaceC17477l) interfaceC0207l.Signature()).ad();
        for (InterfaceC17477l interfaceC17477lSubs = AbstractC11125l.subs(interfaceC17477l); interfaceC17477lSubs != null; interfaceC17477lSubs = AbstractC11125l.subs(interfaceC17477lSubs)) {
            if (!(interfaceC17477lSubs instanceof C18174l)) {
                AbstractC15211l abstractC15211lAd2 = interfaceC17477lSubs.ad();
                if (abstractC15211lAd2 == null) {
                    C18073l.adcel("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"});
                    return false;
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                AbstractC14318l abstractC14318lMopub = null;
                arrayDeque.add(new C6596l(abstractC15211lAd2, null));
                InterfaceC1925l interfaceC1925lMo1339native = abstractC15211lAd.mo1339native();
                while (!arrayDeque.isEmpty()) {
                    C6596l c6596l = (C6596l) arrayDeque.poll();
                    AbstractC18041l abstractC18041lBilling = c6596l.yandex;
                    InterfaceC1925l interfaceC1925lMo1339native2 = abstractC18041lBilling.mo1339native();
                    if (interfaceC1925lMo1339native2 == null) {
                        AbstractC10999l.yandex(3);
                        throw null;
                    }
                    if (interfaceC1925lMo1339native == null) {
                        AbstractC10999l.yandex(4);
                        throw null;
                    }
                    if (interfaceC1925lMo1339native2.equals(interfaceC1925lMo1339native)) {
                        boolean zMo1342throw = abstractC18041lBilling.mo1342throw();
                        for (C6596l c6596l2 = c6596l.loadAd; c6596l2 != null; c6596l2 = c6596l2.loadAd) {
                            AbstractC18041l abstractC18041l = c6596l2.yandex;
                            List listInmobi = abstractC18041l.inmobi();
                            C10819l c10819l = AbstractC1124l.loadAd;
                            if (listInmobi != null && listInmobi.isEmpty()) {
                                abstractC18041lBilling = new C2201l(c10819l.vip(abstractC18041l.mo1339native(), abstractC18041l.inmobi())).billing(1, abstractC18041lBilling);
                                break;
                            }
                            Iterator it = listInmobi.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    abstractC18041lBilling = new C2201l(c10819l.vip(abstractC18041l.mo1339native(), abstractC18041l.inmobi())).billing(1, abstractC18041lBilling);
                                    break;
                                }
                                if (((AbstractC4946l) it.next()).yandex() != 1) {
                                    abstractC18041lBilling = (AbstractC18041l) AbstractC2749l.yandex(new C2201l(AbstractC7310l.vip(c10819l.vip(abstractC18041l.mo1339native(), abstractC18041l.inmobi()))).billing(1, abstractC18041lBilling)).loadAd;
                                    break;
                                }
                            }
                            zMo1342throw = zMo1342throw || abstractC18041l.mo1342throw();
                        }
                        InterfaceC1925l interfaceC1925lMo1339native3 = abstractC18041lBilling.mo1339native();
                        if (interfaceC1925lMo1339native3 == null) {
                            AbstractC10999l.yandex(3);
                            throw null;
                        }
                        if (interfaceC1925lMo1339native3.equals(interfaceC1925lMo1339native)) {
                            abstractC14318lMopub = AbstractC12008l.mopub(abstractC18041lBilling, zMo1342throw);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + AbstractC2749l.crashlytics(interfaceC1925lMo1339native3) + ", \n\nsupertype: " + AbstractC2749l.crashlytics(interfaceC1925lMo1339native) + " \n" + interfaceC1925lMo1339native3.equals(interfaceC1925lMo1339native));
                    }
                    Iterator it2 = interfaceC1925lMo1339native2.yandex().iterator();
                    while (it2.hasNext()) {
                        arrayDeque.add(new C6596l((AbstractC18041l) it2.next(), c6596l));
                    }
                }
                if (abstractC14318lMopub != null) {
                    return !AbstractC16860l.isVip(interfaceC17477lSubs);
                }
            }
        }
        return false;
    }

    public static final InterfaceC0207l crashlytics(InterfaceC0207l interfaceC0207l) {
        if (!AbstractC8899l.isPro.contains(interfaceC0207l.getName()) && !AbstractC7147l.amazon.contains(AbstractC3759l.subs(interfaceC0207l).getName())) {
            return null;
        }
        if ((interfaceC0207l instanceof InterfaceC10696l) || (interfaceC0207l instanceof InterfaceC10138l)) {
            return AbstractC3759l.loadAd(interfaceC0207l, C12844l.f25277l);
        }
        if (interfaceC0207l instanceof C17134l) {
            return AbstractC3759l.loadAd(interfaceC0207l, C12844l.f25268l);
        }
        return null;
    }

    public static final String loadAd(InterfaceC4884l interfaceC4884l) {
        C3498l c3498l;
        InterfaceC0207l interfaceC0207lCrashlytics = AbstractC16860l.isVip(interfaceC4884l) ? crashlytics(interfaceC4884l) : null;
        if (interfaceC0207lCrashlytics != null) {
            InterfaceC0207l interfaceC0207lSubs = AbstractC3759l.subs(interfaceC0207lCrashlytics);
            if (interfaceC0207lSubs instanceof InterfaceC10696l) {
                AbstractC16860l.isVip(interfaceC0207lSubs);
                InterfaceC0207l interfaceC0207lLoadAd = AbstractC3759l.loadAd(AbstractC3759l.subs(interfaceC0207lSubs), C5818l.f12258l);
                if (interfaceC0207lLoadAd != null && (c3498l = (C3498l) AbstractC7147l.yandex.get(AbstractC3759l.mopub(interfaceC0207lLoadAd))) != null) {
                    return c3498l.loadAd();
                }
            } else if (interfaceC0207lSubs instanceof C17134l) {
                int i = AbstractC1568l.smaato;
                LinkedHashMap linkedHashMap = AbstractC8899l.subs;
                String strCrashlytics = AbstractC17860l.crashlytics((C17134l) interfaceC0207lSubs);
                C3498l c3498l2 = strCrashlytics == null ? null : (C3498l) linkedHashMap.get(strCrashlytics);
                if (c3498l2 != null) {
                    return c3498l2.loadAd();
                }
            }
        }
        return null;
    }

    public static final void purchase(InterfaceC1388l interfaceC1388l, String str) {
        String string;
        String str2 = "in the polymorphic scope of '" + interfaceC1388l.license() + '\'';
        if (str == null) {
            string = AbstractC14814l.smaato('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbLicense = AbstractC14814l.license("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            AbstractC9361l.appmetrica(sbLicense, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbLicense.append(interfaceC1388l.license());
            sbLicense.append("' has to be sealed and '@Serializable'.");
            string = sbLicense.toString();
        }
        throw new C14747l(string);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0055 A[RETURN] */
    public static double yandex(double d, double d2) {
        double dMopub = AbstractC15497l.mopub(d, d2);
        if (dMopub < 0.0d) {
            dMopub = 100.0d;
        }
        double dMax = Math.max(0.0d, AbstractC15497l.billing(d, d2));
        double dSubs = AbstractC15497l.subs(dMopub, d);
        double dSubs2 = AbstractC15497l.subs(dMax, d);
        if (Math.rint(d) >= 60.0d) {
            if (dSubs2 >= d2 || dSubs2 >= dSubs) {
                return dMax;
            }
            return dMopub;
        }
        boolean z = Math.abs(dSubs - dSubs2) < 0.1d && dSubs < d2 && dSubs2 < d2;
        if (dSubs >= d2 || dSubs >= dSubs2 || z) {
            return dMopub;
        }
        return dMax;
    }
}
