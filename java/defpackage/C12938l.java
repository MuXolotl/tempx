package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lّۢ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12938l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC2711l f25392l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25393l;

    public /* synthetic */ C12938l(AbstractC2711l abstractC2711l, int i) {
        this.f25393l = i;
        this.f25392l = abstractC2711l;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0171  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01be  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        C15249l c15249lMo2966l;
        boolean zIsPro;
        Class<?> enclosingClass;
        int i = this.f25393l;
        boolean z = true;
        AbstractC2711l abstractC2711l = this.f25392l;
        switch (i) {
            case 0:
                C3624l c3624l = AbstractC1653l.yandex;
                InterfaceC10696l interfaceC10696lMo818extends = abstractC2711l.mo818extends();
                AbstractC0601l abstractC0601l = abstractC2711l.f5867l;
                AbstractC2648l abstractC2648lLoadAd = AbstractC1653l.loadAd(interfaceC10696lMo818extends);
                if (!(abstractC2648lLoadAd instanceof C8632l)) {
                    if (abstractC2648lLoadAd instanceof C1702l) {
                        return ((C1702l) abstractC2648lLoadAd).loadAd;
                    }
                    if ((abstractC2648lLoadAd instanceof C15753l) || (abstractC2648lLoadAd instanceof C18515l)) {
                        return null;
                    }
                    C18725l.billing();
                    return null;
                }
                C8632l c8632l = (C8632l) abstractC2648lLoadAd;
                C13146l c13146l = c8632l.crashlytics;
                InterfaceC10696l interfaceC10696l = c8632l.loadAd;
                C3429l c3429l = C11682l.yandex;
                C10728l c10728lLoadAd = C11682l.loadAd(c13146l, c8632l.purchase, c8632l.billing, true);
                if (c10728lLoadAd == null) {
                    return null;
                }
                if (interfaceC10696l.mo367while() != 2) {
                    InterfaceC8371l interfaceC8371lSignature = interfaceC10696l.Signature();
                    if (interfaceC8371lSignature == null) {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                    }
                    if (AbstractC11125l.firebase(interfaceC8371lSignature)) {
                        InterfaceC8371l interfaceC8371lSignature2 = interfaceC8371lSignature.Signature();
                        if (AbstractC11125l.smaato(interfaceC8371lSignature2, 1) || AbstractC11125l.smaato(interfaceC8371lSignature2, 3)) {
                            InterfaceC17477l interfaceC17477l = (InterfaceC17477l) interfaceC8371lSignature;
                            LinkedHashSet linkedHashSet = AbstractC9530l.yandex;
                            if (AbstractC11125l.firebase(interfaceC17477l)) {
                                LinkedHashSet linkedHashSet2 = AbstractC9530l.yandex;
                                C3624l c3624lBilling = AbstractC3759l.billing(interfaceC17477l);
                                if (AbstractC16901l.inmobi(linkedHashSet2, c3624lBilling != null ? c3624lBilling.purchase() : null)) {
                                    if (AbstractC11125l.firebase(interfaceC10696l.Signature())) {
                                        c15249lMo2966l = interfaceC10696l.mo2966l();
                                        if (c15249lMo2966l == null && c15249lMo2966l.getAnnotations().isPro(AbstractC4792l.yandex)) {
                                            zIsPro = true;
                                        } else {
                                            zIsPro = interfaceC10696l.getAnnotations().isPro(AbstractC4792l.yandex);
                                        }
                                        if (!zIsPro) {
                                            z = false;
                                        }
                                    } else {
                                        z = false;
                                    }
                                }
                            }
                        } else if (AbstractC11125l.firebase(interfaceC10696l.Signature())) {
                            z = false;
                        } else {
                            c15249lMo2966l = interfaceC10696l.mo2966l();
                            if (c15249lMo2966l == null) {
                                zIsPro = interfaceC10696l.getAnnotations().isPro(AbstractC4792l.yandex);
                            } else {
                                zIsPro = interfaceC10696l.getAnnotations().isPro(AbstractC4792l.yandex);
                            }
                            if (!zIsPro) {
                                z = false;
                            }
                        }
                    } else if (AbstractC11125l.firebase(interfaceC10696l.Signature())) {
                        z = false;
                    } else {
                        c15249lMo2966l = interfaceC10696l.mo2966l();
                        if (c15249lMo2966l == null) {
                            zIsPro = interfaceC10696l.getAnnotations().isPro(AbstractC4792l.yandex);
                        } else {
                            zIsPro = interfaceC10696l.getAnnotations().isPro(AbstractC4792l.yandex);
                        }
                        if (!zIsPro) {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                if (z || C11682l.amazon(c13146l)) {
                    enclosingClass = abstractC0601l.mo1730private().getEnclosingClass();
                } else {
                    InterfaceC8371l interfaceC8371lSignature3 = interfaceC10696l.Signature();
                    enclosingClass = interfaceC8371lSignature3 instanceof InterfaceC17477l ? AbstractC5592l.metrica((InterfaceC17477l) interfaceC8371lSignature3) : abstractC0601l.mo1730private();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(c10728lLoadAd.loadAd);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            case 1:
                AbstractC0601l abstractC0601l2 = abstractC2711l.f5867l;
                String str = abstractC2711l.f5868l;
                String str2 = abstractC2711l.f5871l;
                abstractC0601l2.getClass();
                C0711l c0711lCrashlytics = AbstractC0601l.f2039l.crashlytics(str2);
                if (c0711lCrashlytics != null) {
                    String str3 = (String) ((C8892l) c0711lCrashlytics.yandex()).get(1);
                    InterfaceC10696l interfaceC10696lMo657continue = abstractC0601l2.mo657continue(Integer.parseInt(str3));
                    if (interfaceC10696lMo657continue != null) {
                        return interfaceC10696lMo657continue;
                    }
                    StringBuilder sbIsVip = AbstractC5020l.isVip("Local property #", str3, " not found in ");
                    sbIsVip.append(abstractC0601l2.mo1730private());
                    throw new C3150l(sbIsVip.toString());
                }
                Collection collectionMo661static = abstractC0601l2.mo661static(C3498l.purchase(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionMo661static) {
                    if (AbstractC8576l.yandex(AbstractC1653l.loadAd((InterfaceC10696l) obj).loadAd(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbLicense = AbstractC14814l.license("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                    sbLicense.append(abstractC0601l2);
                    throw new C3150l(sbLicense.toString());
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC10696l) AbstractC16901l.m4208abstract(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    C6561l c6561lAdmob = ((InterfaceC10696l) obj2).admob();
                    Object arrayList2 = linkedHashMap.get(c6561lAdmob);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(c6561lAdmob, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap(new C13617l(29));
                treeMap.putAll(linkedHashMap);
                List list = (List) AbstractC16901l.m4241switch(treeMap.values());
                if (list.size() == 1) {
                    return (InterfaceC10696l) AbstractC16901l.m4231native(list);
                }
                String strM4210case = AbstractC16901l.m4210case(abstractC0601l2.mo661static(C3498l.purchase(str)), "\n", null, null, C1490l.f3715l, 30);
                StringBuilder sbLicense2 = AbstractC14814l.license("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbLicense2.append(abstractC0601l2);
                sbLicense2.append(':');
                sbLicense2.append(strM4210case.length() == 0 ? " no members found" : "\n".concat(strM4210case));
                throw new C3150l(sbLicense2.toString());
            default:
                return abstractC2711l.isPro().smaato();
        }
    }
}
