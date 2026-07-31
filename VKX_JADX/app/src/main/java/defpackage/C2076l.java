package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: lؓۙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2076l extends C2336l {
    public static AbstractC0601l metrica(AbstractC13674l abstractC13674l) {
        InterfaceC9191l interfaceC9191lPremium = abstractC13674l.premium();
        return interfaceC9191lPremium instanceof AbstractC0601l ? (AbstractC0601l) interfaceC9191lPremium : C8575l.f17692l;
    }

    @Override // defpackage.C2336l
    public final InterfaceC1835l admob(C0544l c0544l) {
        AbstractC0601l abstractC0601lMetrica = metrica(c0544l);
        String str = c0544l.f26700l;
        return !AbstractC0367l.yandex ? new C7938l(new C17749l(abstractC0601lMetrica, c0544l, str, 10)) : new C15060l(abstractC0601lMetrica, c0544l.f26701l, str, c0544l.f26698l);
    }

    @Override // defpackage.C2336l
    public final InterfaceC13012l amazon(InterfaceC13012l interfaceC13012l) {
        String strBilling;
        if (!AbstractC0367l.yandex) {
            C13267l c13267l = (C13267l) interfaceC13012l;
            InterfaceC1122l interfaceC1122l = c13267l.f26049l;
            InterfaceC1388l interfaceC1388l = interfaceC1122l instanceof InterfaceC1388l ? (InterfaceC1388l) interfaceC1122l : null;
            if (interfaceC1388l == null || (strBilling = interfaceC1388l.billing()) == null) {
                C11467l.Signature(interfaceC13012l, "Non-class type cannot be a mutable collection type: ");
                return null;
            }
            String str = C4632l.yandex;
            C2312l c2312lSubs = C4632l.subs(new C16781l(strBilling));
            if (c2312lSubs != null) {
                return new C13267l(c13267l.f26049l, c13267l.f26046l, c13267l.f26052l, c13267l.f26051l, c13267l.f26054l, c13267l.f26047l, c13267l.f26048l, c13267l.f26053l, AbstractC15788l.amazon(c2312lSubs, (InterfaceC1388l) interfaceC1122l), null);
            }
            C1759l.ads(interfaceC13012l, "Not a readonly collection: ");
            return null;
        }
        AbstractC18041l abstractC18041l = ((C5380l) interfaceC13012l).f11513l;
        if (!(abstractC18041l instanceof AbstractC15211l)) {
            C8936l.smaato(interfaceC13012l, "Non-simple type cannot be a mutable collection type: ");
            return null;
        }
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        InterfaceC17477l interfaceC17477l = interfaceC15234lPro instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro : null;
        if (interfaceC17477l == null) {
            C1759l.ads(interfaceC13012l, "Non-class type cannot be a mutable collection type: ");
            return null;
        }
        AbstractC15211l abstractC15211l = (AbstractC15211l) abstractC18041l;
        String str2 = C4632l.yandex;
        int i = AbstractC3759l.yandex;
        C2312l c2312lSubs2 = C4632l.subs(AbstractC11125l.billing(interfaceC17477l));
        if (c2312lSubs2 != null) {
            return new C5380l(AbstractC3605l.ads(abstractC15211l.mo1340package(), AbstractC3759l.purchase(interfaceC17477l).isPro(c2312lSubs2).metrica(), abstractC15211l.inmobi(), abstractC15211l.mo1342throw()));
        }
        C1759l.ads(interfaceC17477l, "Not a readonly collection: ");
        return null;
    }

    @Override // defpackage.C2336l
    public final InterfaceC2463l billing(C0114l c0114l) {
        AbstractC0601l abstractC0601lMetrica = metrica(c0114l);
        String str = c0114l.f26700l;
        return !AbstractC0367l.yandex ? new C4306l(new C17749l(abstractC0601lMetrica, c0114l, str, 11)) : new C12022l(abstractC0601lMetrica, c0114l.f26701l, str, c0114l.f26698l);
    }

    @Override // defpackage.C2336l
    public final InterfaceC9191l crashlytics(Class cls) {
        return (InterfaceC9191l) AbstractC1749l.loadAd.premium(cls);
    }

    @Override // defpackage.C2336l
    public final String firebase(AbstractC16915l abstractC16915l) {
        return isPro(abstractC16915l);
    }

    @Override // defpackage.C2336l
    public final String isPro(InterfaceC18660l interfaceC18660l) throws IOException {
        Metadata metadata = (Metadata) interfaceC18660l.getClass().getAnnotation(Metadata.class);
        C15015l c15015l = null;
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                C8195l c8195lMopub = C11682l.mopub(strArrD1, metadata.d2());
                C2962l c2962l = (C2962l) c8195lMopub.f17098l;
                C14036l c14036l = (C14036l) c8195lMopub.f17097l;
                c15015l = new C15015l(C8575l.f17692l, (C17134l) AbstractC5592l.purchase(interfaceC18660l.getClass(), C12006l.f23926l, c14036l, c2962l, new C14965l(c14036l.f27367l), new C4995l(metadata.mv(), (metadata.xi() & 8) != 0), C5964l.f12573l));
            }
        }
        if (c15015l == null) {
            return super.isPro(interfaceC18660l);
        }
        StringBuilder sb = new StringBuilder();
        AbstractC9707l abstractC9707lPurchase = AbstractC0825l.purchase(c15015l);
        if (abstractC9707lPurchase != null) {
            sb.append(C8565l.tapsense(abstractC9707lPurchase.mo1109synchronized(), false));
            sb.append(".");
        }
        AbstractC16901l.m4216else(AbstractC0825l.mopub(c15015l), sb, ", ", "(", ")", C1490l.f3718l, 48);
        sb.append(" -> ");
        sb.append(C8565l.tapsense(c15015l.smaato(), false));
        return sb.toString();
    }

    @Override // defpackage.C2336l
    public final InterfaceC1388l loadAd(Class cls) {
        return (C5160l) AbstractC1749l.yandex.premium(cls);
    }

    @Override // defpackage.C2336l
    public final InterfaceC2901l mopub(C0059l c0059l) {
        AbstractC0601l abstractC0601lMetrica = metrica(c0059l);
        String str = c0059l.f26700l;
        return !AbstractC0367l.yandex ? new C13259l(new C17749l(str, abstractC0601lMetrica, c0059l, 8)) : new C2000l(abstractC0601lMetrica, c0059l.f26701l, str, c0059l.f26698l);
    }

    @Override // defpackage.C2336l
    public final InterfaceC5465l purchase(C18200l c18200l) {
        AbstractC0601l abstractC0601lMetrica = metrica(c18200l);
        String str = c18200l.f26700l;
        return !AbstractC0367l.yandex ? new C10445l(new C17749l(str, abstractC0601lMetrica, c18200l, 9)) : new C5262l(abstractC0601lMetrica, c18200l.f26701l, str, c18200l.f26698l);
    }

    @Override // defpackage.C2336l
    public final InterfaceC13012l remoteconfig(InterfaceC1122l interfaceC1122l, List list, boolean z) {
        if (!(interfaceC1122l instanceof InterfaceC13937l)) {
            return AbstractC6427l.purchase(interfaceC1122l, list, z, Collections.EMPTY_LIST, null);
        }
        Class clsMo1730private = ((InterfaceC13937l) interfaceC1122l).mo1730private();
        C3797l c3797l = AbstractC1749l.yandex;
        if (list.isEmpty()) {
            return z ? (InterfaceC13012l) AbstractC1749l.amazon.premium(clsMo1730private) : (InterfaceC13012l) AbstractC1749l.crashlytics.premium(clsMo1730private);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC1749l.purchase.premium(clsMo1730private);
        C8195l c8195l = new C8195l(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(c8195l);
        if (obj == null) {
            AbstractC6786l abstractC6786lPurchase = AbstractC6427l.purchase((C5160l) AbstractC1749l.yandex.premium(clsMo1730private), list, z, C2580l.f5619l, null);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c8195l, abstractC6786lPurchase);
            obj = objPutIfAbsent == null ? abstractC6786lPurchase : objPutIfAbsent;
        }
        return (InterfaceC13012l) obj;
    }

    @Override // defpackage.C2336l
    public final InterfaceC7547l subs(C7953l c7953l) {
        return new C15041l(metrica(c7953l), c7953l.f26701l, c7953l.f26700l);
    }

    @Override // defpackage.C2336l
    public final AbstractC11726l vip(InterfaceC1388l interfaceC1388l) {
        List<AbstractC11726l> typeParameters;
        if (AbstractC2812l.advert(interfaceC1388l)) {
            typeParameters = interfaceC1388l.getTypeParameters();
        } else {
            if (!(interfaceC1388l instanceof InterfaceC6902l)) {
                C1759l.ads(interfaceC1388l, "Type parameter container must be a class or a callable: ");
                return null;
            }
            typeParameters = ((InterfaceC6902l) interfaceC1388l).getTypeParameters();
        }
        for (AbstractC11726l abstractC11726l : typeParameters) {
            if (abstractC11726l.crashlytics().equals("PluginConfigT")) {
                return abstractC11726l;
            }
        }
        C1759l.ads(interfaceC1388l, "Type parameter PluginConfigT is not found in container: ");
        return null;
    }

    @Override // defpackage.C2336l
    public final InterfaceC5059l yandex(C1538l c1538l) throws IOException {
        AbstractC0601l abstractC0601lMetrica = metrica(c1538l);
        Object obj = c1538l.f26698l;
        String str = c1538l.f26701l;
        String str2 = c1538l.f26700l;
        if (!AbstractC0367l.yandex) {
            if (str.equals("<init>")) {
                if (abstractC0601lMetrica instanceof C5160l) {
                    C5160l c5160l = (C5160l) abstractC0601lMetrica;
                    if (c5160l.f11212l.getAnnotation(Metadata.class) != null) {
                        C9095l c9095lM1729instanceof = c5160l.m1729instanceof();
                        Iterable iterable = c9095lM1729instanceof != null ? c9095lM1729instanceof.admob : null;
                        C2580l c2580l = C2580l.f5619l;
                        if (iterable == null) {
                            iterable = c2580l;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (String.valueOf(AbstractC10565l.billing((C4675l) obj2).yandex).equals(str2)) {
                                arrayList.add(obj2);
                            }
                        }
                        if (arrayList.size() == 1) {
                            return new C13981l(abstractC0601lMetrica, str2, obj, (C4675l) AbstractC16901l.m4208abstract(arrayList));
                        }
                        C9095l c9095lM1729instanceof2 = c5160l.m1729instanceof();
                        ArrayList arrayList2 = c9095lM1729instanceof2 != null ? c9095lM1729instanceof2.admob : null;
                        String strM4210case = AbstractC16901l.m4210case(arrayList2 == null ? c2580l : arrayList2, "\n", null, null, C1490l.f3723l, 30);
                        StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
                        sb.append(str2);
                        sb.append(") not resolved in ");
                        sb.append(abstractC0601lMetrica);
                        sb.append(':');
                        sb.append(strM4210case.length() == 0 ? " no constructors found" : " several matching constructors found:\n".concat(strM4210case));
                        throw new C3150l(sb.toString());
                    }
                }
            } else if (abstractC0601lMetrica instanceof C9539l) {
                C9539l c9539l = (C9539l) abstractC0601lMetrica;
                ArrayList arrayListM2678new = c9539l.m2678new();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayListM2678new) {
                    C4454l c4454l = (C4454l) obj3;
                    if (AbstractC8576l.yandex(c4454l.loadAd, str) && String.valueOf(AbstractC10565l.mopub(c4454l).yandex).equals(str2)) {
                        arrayList3.add(obj3);
                    }
                }
                if (arrayList3.size() == 1) {
                    return new C8975l(abstractC0601lMetrica, str2, obj, (C4454l) AbstractC16901l.m4208abstract(arrayList3));
                }
                String strM4210case2 = AbstractC16901l.m4210case(c9539l.m2678new(), "\n", null, null, C1490l.f3708l, 30);
                StringBuilder sbLicense = AbstractC14814l.license("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbLicense.append(abstractC0601lMetrica);
                sbLicense.append(':');
                sbLicense.append(strM4210case2.length() == 0 ? " no members found" : " several matching members found:\n".concat(strM4210case2));
                throw new C3150l(sbLicense.toString());
            }
        }
        return new C15015l(abstractC0601lMetrica, str, str2, null, c1538l.f26698l, C4233l.subs);
    }

    @Override // defpackage.C2336l
    public final void smaato(AbstractC11726l abstractC11726l, List list) {
    }
}
