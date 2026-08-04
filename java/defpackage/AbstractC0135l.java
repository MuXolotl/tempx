package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: renamed from: lؘؑؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0135l {
    public static final Object yandex = new Object();
    public static final Object loadAd = new Object();
    public static final Object crashlytics = new Object();
    public static final Object amazon = new Object();
    public static final Object purchase = new Object();

    public static InterfaceC2167l admob(C3683l c3683l) {
        if (c3683l == null) {
            return InterfaceC2167l.f4805l;
        }
        int iPremium = c3683l.premium() - 1;
        if (iPremium == 1) {
            return c3683l.license() ? new C13997l(c3683l.pro()) : InterfaceC2167l.f4806l;
        }
        if (iPremium == 2) {
            return c3683l.isVip() ? new C14259l(Double.valueOf(c3683l.signatures())) : new C14259l(null);
        }
        if (iPremium == 3) {
            return c3683l.ad() ? new C18597l(Boolean.valueOf(c3683l.advert())) : new C18597l(null);
        }
        if (iPremium != 4) {
            C8339l.metrica("Unknown type found. Cannot convert entity");
            return null;
        }
        List listTapsense = c3683l.tapsense();
        ArrayList arrayList = new ArrayList();
        Iterator it = listTapsense.iterator();
        while (it.hasNext()) {
            arrayList.add(admob((C3683l) it.next()));
        }
        return new C15537l(c3683l.Signature(), arrayList);
    }

    public static final InterfaceC16588l amazon(Object obj, C13975l c13975l) {
        if (obj == null) {
            return AbstractC7303l.crashlytics(C0194l.yandex);
        }
        if (obj instanceof List) {
            return new C0087l(crashlytics((Collection) obj, c13975l), 0);
        }
        if (obj instanceof Object[]) {
            Object objM2412private = AbstractC8669l.m2412private((Object[]) obj);
            return objM2412private != null ? amazon(objM2412private, c13975l) : new C0087l(C0194l.yandex, 0);
        }
        if (obj instanceof Set) {
            return new C0087l(crashlytics((Collection) obj, c13975l), 2);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return new C0185l(crashlytics(map.keySet(), c13975l), crashlytics(map.values(), c13975l), 1);
        }
        Class<?> cls = obj.getClass();
        C2336l c2336l = AbstractC18202l.yandex;
        c2336l.loadAd(cls);
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(obj.getClass());
        InterfaceC16588l interfaceC16588lBilling = AbstractC7280l.billing(interfaceC1388lLoadAd);
        if (interfaceC16588lBilling != null) {
            return interfaceC16588lBilling;
        }
        AbstractC16164l.isPro(interfaceC1388lLoadAd);
        throw null;
    }

    public static AbstractC2426l billing(AbstractC2426l abstractC2426l) {
        AbstractC2426l abstractC2426lAmazon = abstractC2426l;
        for (int i = 1; i < abstractC2426l.smaato(); i++) {
            abstractC2426lAmazon = abstractC2426lAmazon.license().amazon(abstractC2426l);
        }
        return abstractC2426lAmazon;
    }

    public static final InterfaceC16588l crashlytics(Collection collection, C13975l c13975l) {
        Collection collection2 = collection;
        ArrayList arrayListM4239strictfp = AbstractC16901l.m4239strictfp(collection2);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListM4239strictfp, 10));
        Iterator it = arrayListM4239strictfp.iterator();
        while (it.hasNext()) {
            arrayList.add(amazon(it.next(), c13975l));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((InterfaceC16588l) obj).purchase().yandex())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((InterfaceC16588l) it2.next()).purchase().yandex());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        InterfaceC16588l interfaceC16588l = (InterfaceC16588l) AbstractC16901l.m4236public(arrayList2);
        if (interfaceC16588l == null) {
            interfaceC16588l = C0194l.yandex;
        }
        if (!interfaceC16588l.purchase().crashlytics() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                    return AbstractC7303l.crashlytics(interfaceC16588l);
                }
            }
        }
        return interfaceC16588l;
    }

    public static AbstractC8859l loadAd(AbstractC11918l abstractC11918l, byte[] bArr) {
        AbstractC2426l abstractC2426lStartapp;
        AbstractC2426l abstractC2426lIsPro = abstractC11918l.isPro(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        AbstractC2426l abstractC2426lIsPro2 = abstractC11918l.isPro(new BigInteger(1, bArr));
        if (!billing(abstractC2426lIsPro2).equals(abstractC11918l.loadAd)) {
            abstractC2426lIsPro2 = abstractC2426lIsPro2.purchase();
        }
        if (abstractC2426lIsPro2.metrica()) {
            abstractC2426lStartapp = abstractC11918l.crashlytics.Signature();
        } else {
            AbstractC2426l abstractC2426lAmazon = abstractC2426lIsPro2.license().remoteconfig().startapp(abstractC11918l.crashlytics).amazon(abstractC11918l.loadAd).amazon(abstractC2426lIsPro2);
            if (!abstractC2426lAmazon.metrica()) {
                AbstractC2426l abstractC2426lIsPro3 = abstractC11918l.isPro(InterfaceC11695l.metrica);
                Random random = new Random();
                int iSmaato = abstractC2426lAmazon.smaato();
                while (true) {
                    AbstractC2426l abstractC2426lIsPro4 = abstractC11918l.isPro(new BigInteger(iSmaato, random));
                    AbstractC2426l abstractC2426lAmazon2 = abstractC2426lAmazon;
                    AbstractC2426l abstractC2426lAmazon3 = abstractC2426lIsPro3;
                    for (int i = 1; i <= iSmaato - 1; i++) {
                        AbstractC2426l abstractC2426lLicense = abstractC2426lAmazon2.license();
                        abstractC2426lAmazon3 = abstractC2426lAmazon3.license().amazon(abstractC2426lLicense.startapp(abstractC2426lIsPro4));
                        abstractC2426lAmazon2 = abstractC2426lLicense.amazon(abstractC2426lAmazon);
                    }
                    if (!abstractC2426lAmazon2.metrica()) {
                        abstractC2426lAmazon = null;
                        break;
                    }
                    if (!abstractC2426lAmazon3.license().amazon(abstractC2426lAmazon3).metrica()) {
                        abstractC2426lAmazon = abstractC2426lAmazon3;
                        break;
                    }
                }
            }
            if (abstractC2426lAmazon != null) {
                if (!billing(abstractC2426lAmazon).equals(abstractC2426lIsPro)) {
                    abstractC2426lAmazon = abstractC2426lAmazon.purchase();
                }
                abstractC2426lStartapp = abstractC2426lIsPro2.startapp(abstractC2426lAmazon);
            } else {
                abstractC2426lStartapp = null;
            }
        }
        if (abstractC2426lStartapp != null) {
            return abstractC11918l.tapsense(abstractC2426lIsPro2.signatures(), abstractC2426lStartapp.signatures());
        }
        C8339l.metrica("Invalid point compression");
        return null;
    }

    public static InterfaceC2167l mopub(Object obj) {
        if (obj == null) {
            return InterfaceC2167l.f4800l;
        }
        if (obj instanceof String) {
            return new C13997l((String) obj);
        }
        if (obj instanceof Double) {
            return new C14259l((Double) obj);
        }
        if (obj instanceof Long) {
            return new C14259l(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C14259l(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C18597l((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                C8339l.metrica("Invalid value type");
                return null;
            }
            C5181l c5181l = new C5181l();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c5181l.ad(c5181l.Signature(), mopub(it.next()));
            }
            return c5181l;
        }
        C10303l c10303l = new C10303l();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC2167l interfaceC2167lMopub = mopub(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c10303l.firebase((String) string, interfaceC2167lMopub);
            }
        }
        return c10303l;
    }

    public static final InterfaceC16588l purchase(C13975l c13975l, C11310l c11310l) throws IOException {
        InterfaceC16588l interfaceC16588lLoadAd;
        InterfaceC1388l interfaceC1388l = c11310l.yandex;
        InterfaceC13012l interfaceC13012l = c11310l.loadAd;
        int i = 1;
        if (interfaceC13012l != null) {
            if (interfaceC13012l.mo1617throws().isEmpty()) {
                interfaceC16588lLoadAd = null;
            } else {
                interfaceC16588lLoadAd = AbstractC17332l.loadAd(c13975l, interfaceC13012l, false);
                if (interfaceC16588lLoadAd == null) {
                    List listMo1617throws = interfaceC13012l.mo1617throws();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listMo1617throws.iterator();
                    while (it.hasNext()) {
                        try {
                            InterfaceC13012l interfaceC13012l2 = ((C0861l) it.next()).loadAd;
                            if (interfaceC13012l2 == null || AbstractC17332l.loadAd(c13975l, interfaceC13012l2, false) != null) {
                                interfaceC13012l2 = null;
                            }
                            if (interfaceC13012l2 != null) {
                                arrayList.add(interfaceC13012l2);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        String strM4210case = AbstractC16901l.m4210case(arrayList, null, null, null, new C1698l(i), 31);
                        C8195l c8195l = arrayList.size() == 1 ? new C8195l("", "is") : new C8195l("s", "are");
                        String str = (String) c8195l.f17098l;
                        String str2 = (String) c8195l.f17097l;
                        throw new C14747l("Serializer for type argument" + str + ' ' + strM4210case + ' ' + str2 + " not found for '" + interfaceC1388l.license() + "'. Ensure that the listed type" + str + ' ' + str2 + " marked as '@Serializable'.");
                    }
                    interfaceC16588lLoadAd = null;
                }
            }
            if (interfaceC16588lLoadAd != null) {
                return interfaceC16588lLoadAd;
            }
        }
        InterfaceC16588l interfaceC16588lBilling = AbstractC7280l.billing(interfaceC1388l);
        if (interfaceC16588lBilling == null) {
            AbstractC16164l.isPro(interfaceC1388l);
            throw null;
        }
        if (interfaceC13012l != null && interfaceC13012l.Signature()) {
            interfaceC16588lBilling = AbstractC7303l.crashlytics(interfaceC16588lBilling);
        }
        return interfaceC16588lBilling;
    }

    public static C12648l yandex(Object obj, String str) {
        AbstractC1051l.isPro(obj, "Listener must not be null");
        AbstractC1051l.mopub(str, "Listener type must not be empty");
        return new C12648l(obj, str);
    }
}
