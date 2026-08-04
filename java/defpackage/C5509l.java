package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lؘؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5509l extends AbstractC6799l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f11774l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10170l f11775l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2278l f11776l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5509l(C11296l c11296l) {
        this.f11775l = c11296l;
        C7644l c7644l = c11296l.f22763l;
        super((C16412l) ((C0511l) c7644l.f15738l).yandex);
        C16412l c16412l = (C16412l) ((C0511l) c7644l.f15738l).yandex;
        C6014l c6014l = new C6014l(c11296l, 6);
        c16412l.getClass();
        this.f11776l = new C2278l(c16412l, c6014l);
    }

    @Override // defpackage.AbstractC12465l
    public final C1461l amazon() {
        switch (this.f11774l) {
            case 0:
                return C1461l.f3652l;
            default:
                return ((C7757l) ((C18174l) this.f11775l).f35596l.f20463l).remoteconfig;
        }
    }

    @Override // defpackage.InterfaceC1925l
    public final List getParameters() {
        switch (this.f11774l) {
            case 0:
                break;
        }
        return (List) this.f11776l.invoke();
    }

    @Override // defpackage.AbstractC6799l
    /* JADX INFO: renamed from: isPro */
    public final InterfaceC17477l pro() {
        int i = this.f11774l;
        AbstractC10170l abstractC10170l = this.f11775l;
        switch (i) {
            case 0:
                return (C11296l) abstractC10170l;
            default:
                return (C18174l) abstractC10170l;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:104:0x0249  */
    /* JADX WARN: Code duplicated, block: B:107:0x0256  */
    /* JADX WARN: Code duplicated, block: B:110:0x026f A[LOOP:1: B:108:0x0269->B:110:0x026f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x028a  */
    /* JADX WARN: Code duplicated, block: B:115:0x028f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:58:0x0109  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0202  */
    /* JADX WARN: Code duplicated, block: B:90:0x0210  */
    /* JADX WARN: Code duplicated, block: B:93:0x0219  */
    /* JADX WARN: Code duplicated, block: B:94:0x021e  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0083, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v29 */
    @Override // defpackage.AbstractC12465l
    public final Collection loadAd() throws C12948l {
        String strLoadAd;
        C2312l c2312lYandex;
        ?? arrayList;
        String str;
        C2312l c2312l;
        C2312l c2312l2;
        ArrayList arrayList2;
        AbstractC15211l abstractC15211lAdcel;
        int i;
        InterfaceC17477l interfaceC17477l;
        AbstractC18041l abstractC18041lAdmob;
        ArrayList arrayList3;
        Iterator it;
        AbstractC18041l abstractC18041l;
        AbstractC18041l abstractC18041lSubs;
        InterfaceC1925l interfaceC1925lMo1339native;
        InterfaceC1925l interfaceC1925lMo1339native2;
        int i2 = this.f11774l;
        AbstractC10170l abstractC10170l = this.f11775l;
        switch (i2) {
            case 0:
                C11296l c11296l = (C11296l) abstractC10170l;
                C6582l c6582l = c11296l.f22762l;
                C7644l c7644l = c11296l.f22763l;
                List listFirebase = AbstractC7310l.firebase(c6582l, (C14965l) c7644l.f15740l);
                ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(listFirebase, 10));
                Iterator it2 = listFirebase.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((C15615l) c7644l.f15736l).premium((C18128l) it2.next()));
                }
                ArrayList arrayListM4232new = AbstractC16901l.m4232new(arrayList4, ((InterfaceC9630l) ((C0511l) c7644l.f15738l).remoteconfig).crashlytics(c11296l));
                ArrayList<C8153l> arrayList5 = new ArrayList();
                Iterator it3 = arrayListM4232new.iterator();
                while (it3.hasNext()) {
                    InterfaceC15234l interfaceC15234lPro = ((AbstractC18041l) it3.next()).mo1339native().pro();
                    C8153l c8153l = interfaceC15234lPro instanceof C8153l ? (C8153l) interfaceC15234lPro : null;
                    if (c8153l != null) {
                        arrayList5.add(c8153l);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    InterfaceC9407l interfaceC9407l = (InterfaceC9407l) ((C0511l) c7644l.f15738l).admob;
                    ArrayList arrayList6 = new ArrayList(AbstractC14055l.billing(arrayList5, 10));
                    for (C8153l c8153l2 : arrayList5) {
                        C3624l c3624lBilling = AbstractC3759l.billing(c8153l2);
                        if (c3624lBilling == null || (c2312lYandex = c3624lBilling.yandex()) == null || (strLoadAd = c2312lYandex.yandex.yandex) == null) {
                            strLoadAd = c8153l2.getName().loadAd();
                        }
                        arrayList6.add(strLoadAd);
                    }
                    interfaceC9407l.mo1227continue(c11296l, arrayList6);
                }
                return AbstractC16901l.m4213const(arrayListM4232new);
            default:
                C18174l c18174l = (C18174l) abstractC10170l;
                C10038l c10038l = c18174l.f35596l;
                Class cls = c18174l.f35592l.yandex;
                boolean zYandex = AbstractC8576l.yandex(cls, Object.class);
                C2580l c2580l = C2580l.f5619l;
                if (zYandex) {
                    arrayList = c2580l;
                } else {
                    C4384l c4384l = new C4384l(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    c4384l.loadAd(genericSuperclass != null ? genericSuperclass : Object.class);
                    c4384l.crashlytics(cls.getGenericInterfaces());
                    ArrayList arrayList7 = c4384l.yandex;
                    List listRemoteconfig = AbstractC14055l.remoteconfig(arrayList7.toArray(new Type[arrayList7.size()]));
                    arrayList = new ArrayList(AbstractC14055l.billing(listRemoteconfig, 10));
                    Iterator it4 = listRemoteconfig.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(new C5637l((Type) it4.next()));
                    }
                }
                ArrayList arrayList8 = new ArrayList(arrayList.size());
                ArrayList arrayList9 = new ArrayList(0);
                InterfaceC1910l interfaceC1910lLoadAd = c18174l.f35590l.loadAd(AbstractC6830l.startapp);
                int i3 = 1;
                if (interfaceC1910lLoadAd != null) {
                    Object objM4224instanceof = AbstractC16901l.m4224instanceof(interfaceC1910lLoadAd.admob().values());
                    C7391l c7391l = objM4224instanceof instanceof C7391l ? (C7391l) objM4224instanceof : null;
                    if (c7391l != null && (str = (String) c7391l.yandex) != null) {
                        int length = str.length();
                        int i4 = 1;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                char cCharAt = str.charAt(i5);
                                int iInmobi = AbstractC5020l.inmobi(i4);
                                if (iInmobi == 0) {
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        i4 = 2;
                                        i5++;
                                    }
                                } else if (iInmobi != 1) {
                                    if (iInmobi != 2) {
                                        C18725l.billing();
                                        return null;
                                    }
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        i4 = 2;
                                        i5++;
                                    }
                                } else {
                                    if (cCharAt == '.') {
                                        i4 = 3;
                                    } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                    }
                                    i5++;
                                }
                            } else {
                                c2312l = i4 != 3 ? new C2312l(str) : null;
                            }
                        }
                    }
                }
                if (c2312l != null) {
                    C16781l c16781l = c2312l.yandex;
                    if (c16781l.crashlytics() || !c16781l.admob(AbstractC3974l.isPro)) {
                        c2312l = null;
                    }
                } else {
                    c2312l = null;
                }
                if (c2312l == null) {
                    LinkedHashMap linkedHashMap = AbstractC4997l.yandex;
                    c2312l2 = (C2312l) AbstractC4997l.loadAd.get(AbstractC3759l.mopub(c18174l));
                    if (c2312l2 == null) {
                        abstractC15211lAdcel = null;
                    }
                    for (C5637l c5637l : arrayList) {
                        AbstractC18041l abstractC18041lM4556this = ((C18449l) c10038l.f20465l).m4556this(c5637l, AbstractC1135l.purchase(i3, false, null, 7));
                        C9912l c9912l = ((C7757l) c10038l.f20463l).ads;
                        c9912l.getClass();
                        int i6 = i3;
                        abstractC18041l = abstractC18041lM4556this;
                        abstractC18041lSubs = c9912l.subs(new C4619l((InterfaceC2853l) null, false, c10038l, EnumC7061l.TYPE_USE, true), abstractC18041l, c2580l, null, false);
                        if (abstractC18041lSubs != null) {
                            abstractC18041l = abstractC18041lSubs;
                        }
                        if (abstractC18041l.mo1339native().pro() instanceof C8153l) {
                            arrayList9.add(c5637l);
                        }
                        interfaceC1925lMo1339native = abstractC18041l.mo1339native();
                        if (abstractC15211lAdcel != null) {
                            interfaceC1925lMo1339native2 = abstractC15211lAdcel.mo1339native();
                        } else {
                            interfaceC1925lMo1339native2 = null;
                        }
                        if (!AbstractC8576l.yandex(interfaceC1925lMo1339native, interfaceC1925lMo1339native2) && !AbstractC16860l.ad(abstractC18041l)) {
                            arrayList8.add(abstractC18041l);
                        }
                        i3 = i6;
                    }
                    i = i3;
                    interfaceC17477l = c18174l.f35599l;
                    if (interfaceC17477l != null) {
                        abstractC18041lAdmob = new C2201l(AbstractC8532l.amazon(interfaceC17477l, c18174l)).admob(i, interfaceC17477l.ad());
                    } else {
                        abstractC18041lAdmob = null;
                    }
                    AbstractC3324l.crashlytics(arrayList8, abstractC18041lAdmob);
                    AbstractC3324l.crashlytics(arrayList8, abstractC15211lAdcel);
                    if (!arrayList9.isEmpty()) {
                        InterfaceC9407l interfaceC9407l2 = ((C7757l) c10038l.f20463l).billing;
                        arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList9, 10));
                        it = arrayList9.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((C5637l) ((InterfaceC8657l) it.next())).yandex.toString());
                        }
                        interfaceC9407l2.mo1227continue(c18174l, arrayList3);
                    }
                    return !arrayList8.isEmpty() ? AbstractC16901l.m4213const(arrayList8) : Collections.singletonList(((C7757l) c10038l.f20463l).metrica.subs().purchase());
                }
                c2312l2 = c2312l;
                InterfaceC11865l interfaceC11865l = ((C7757l) c10038l.f20463l).metrica;
                int i7 = AbstractC3759l.yandex;
                C16781l c16781l2 = c2312l2.yandex;
                c16781l2.crashlytics();
                InterfaceC15234l interfaceC15234lPurchase = interfaceC11865l.mo2270l(c2312l2.loadAd()).f21347l.purchase(c16781l2.mopub(), EnumC11300l.f22775l);
                InterfaceC17477l interfaceC17477l2 = interfaceC15234lPurchase instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPurchase : null;
                if (interfaceC17477l2 != null) {
                    int size = interfaceC17477l2.metrica().getParameters().size();
                    List parameters = c18174l.f35593l.getParameters();
                    int size2 = parameters.size();
                    if (size2 == size) {
                        arrayList2 = new ArrayList(AbstractC14055l.billing(parameters, 10));
                        Iterator it5 = parameters.iterator();
                        while (it5.hasNext()) {
                            arrayList2.add(new C10636l(1, ((InterfaceC16902l) it5.next()).ad()));
                        }
                    } else if (size2 == 1 && size > 1 && c2312l == null) {
                        C10636l c10636l = new C10636l(1, ((InterfaceC16902l) AbstractC16901l.m4208abstract(parameters)).ad());
                        C8934l c8934l = new C8934l(1, size, 1);
                        ArrayList arrayList10 = new ArrayList(AbstractC14055l.billing(c8934l, 10));
                        Iterator it6 = c8934l.iterator();
                        while (true) {
                            C16991l c16991l = (C16991l) it6;
                            if (c16991l.f33123l) {
                                c16991l.nextInt();
                                arrayList10.add(c10636l);
                            } else {
                                arrayList2 = arrayList10;
                            }
                        }
                    } else {
                        abstractC15211lAdcel = null;
                    }
                    C16017l.f31395l.getClass();
                    abstractC15211lAdcel = AbstractC3605l.adcel(C16017l.f31394l, interfaceC17477l2, arrayList2);
                } else {
                    abstractC15211lAdcel = null;
                }
                while (r15.hasNext()) {
                    AbstractC18041l abstractC18041lM4556this2 = ((C18449l) c10038l.f20465l).m4556this(c5637l, AbstractC1135l.purchase(i3, false, null, 7));
                    C9912l c9912l2 = ((C7757l) c10038l.f20463l).ads;
                    c9912l2.getClass();
                    int i8 = i3;
                    abstractC18041l = abstractC18041lM4556this2;
                    abstractC18041lSubs = c9912l2.subs(new C4619l((InterfaceC2853l) null, false, c10038l, EnumC7061l.TYPE_USE, true), abstractC18041l, c2580l, null, false);
                    if (abstractC18041lSubs != null) {
                        abstractC18041l = abstractC18041lSubs;
                    }
                    if (abstractC18041l.mo1339native().pro() instanceof C8153l) {
                        arrayList9.add(c5637l);
                    }
                    interfaceC1925lMo1339native = abstractC18041l.mo1339native();
                    if (abstractC15211lAdcel != null) {
                        interfaceC1925lMo1339native2 = abstractC15211lAdcel.mo1339native();
                    } else {
                        interfaceC1925lMo1339native2 = null;
                    }
                    if (!AbstractC8576l.yandex(interfaceC1925lMo1339native, interfaceC1925lMo1339native2)) {
                        arrayList8.add(abstractC18041l);
                    }
                    i3 = i8;
                }
                i = i3;
                interfaceC17477l = c18174l.f35599l;
                if (interfaceC17477l != null) {
                    abstractC18041lAdmob = new C2201l(AbstractC8532l.amazon(interfaceC17477l, c18174l)).admob(i, interfaceC17477l.ad());
                } else {
                    abstractC18041lAdmob = null;
                }
                AbstractC3324l.crashlytics(arrayList8, abstractC18041lAdmob);
                AbstractC3324l.crashlytics(arrayList8, abstractC15211lAdcel);
                if (!arrayList9.isEmpty()) {
                    InterfaceC9407l interfaceC9407l3 = ((C7757l) c10038l.f20463l).billing;
                    arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList9, 10));
                    it = arrayList9.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((C5637l) ((InterfaceC8657l) it.next())).yandex.toString());
                    }
                    interfaceC9407l3.mo1227continue(c18174l, arrayList3);
                }
                if (!arrayList8.isEmpty()) {
                }
        }
    }

    @Override // defpackage.InterfaceC1925l
    public final boolean premium() {
        switch (this.f11774l) {
        }
        return true;
    }

    @Override // defpackage.AbstractC6799l, defpackage.InterfaceC1925l
    public final InterfaceC15234l pro() {
        int i = this.f11774l;
        AbstractC10170l abstractC10170l = this.f11775l;
        switch (i) {
            case 0:
                return (C11296l) abstractC10170l;
            default:
                return (C18174l) abstractC10170l;
        }
    }

    public final String toString() {
        int i = this.f11774l;
        AbstractC10170l abstractC10170l = this.f11775l;
        switch (i) {
            case 0:
                return ((C11296l) abstractC10170l).getName().f7384l;
            default:
                return ((C18174l) abstractC10170l).getName().loadAd();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5509l(C18174l c18174l) {
        this.f11775l = c18174l;
        C10038l c10038l = c18174l.f35596l;
        super(((C7757l) c10038l.f20463l).yandex);
        C16412l c16412l = ((C7757l) c10038l.f20463l).yandex;
        C5145l c5145l = new C5145l(c18174l, 2);
        c16412l.getClass();
        this.f11776l = new C2278l(c16412l, c5145l);
    }
}
