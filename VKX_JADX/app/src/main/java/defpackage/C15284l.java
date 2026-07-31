package defpackage;

import java.lang.annotation.Annotation;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔۤٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15284l extends AbstractC8028l {
    public static final /* synthetic */ int license = 0;
    public final C18028l Signature;
    public final C2278l adcel;
    public final C2278l ads;
    public final C12875l metrica;
    public final boolean startapp;
    public final C2278l subscription;
    public final C2278l tapsense;
    public final InterfaceC17477l vip;

    public C15284l(C10038l c10038l, InterfaceC17477l interfaceC17477l, C12875l c12875l, boolean z, C15284l c15284l) {
        super(c10038l, c15284l);
        this.vip = interfaceC17477l;
        this.metrica = c12875l;
        this.startapp = z;
        C16412l c16412l = ((C7757l) c10038l.f20463l).yandex;
        C11239l c11239l = new C11239l(this, c10038l, 2);
        c16412l.getClass();
        this.adcel = new C2278l(c16412l, c11239l);
        C15817l c15817l = new C15817l(this, 0);
        c16412l.getClass();
        this.ads = new C2278l(c16412l, c15817l);
        C8467l c8467l = new C8467l(c10038l, this);
        c16412l.getClass();
        this.subscription = new C2278l(c16412l, c8467l);
        C15817l c15817l2 = new C15817l(this, 1);
        c16412l.getClass();
        this.tapsense = new C2278l(c16412l, c15817l2);
        this.Signature = c16412l.crashlytics(new C3768l(this, c10038l, 13));
    }

    public static boolean appmetrica(InterfaceC4884l interfaceC4884l, InterfaceC4884l interfaceC4884l2) {
        return C14450l.crashlytics.vip(interfaceC4884l2, interfaceC4884l, true).loadAd() == 1 && !AbstractC6889l.amazon(interfaceC4884l2, interfaceC4884l);
    }

    public static boolean inmobi(C17134l c17134l, C17134l c17134l2) {
        int i = AbstractC1568l.smaato;
        if (AbstractC8576l.yandex(c17134l.getName().loadAd(), "removeAt") && AbstractC8576l.yandex(AbstractC17860l.crashlytics(c17134l), AbstractC8899l.mopub.purchase)) {
            c17134l2 = c17134l2.loadAd();
        }
        return appmetrica(c17134l2, c17134l);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static C17134l premium(C17134l c17134l) {
        C2312l c2312lSubs;
        C17538l c17538l = (C17538l) AbstractC16901l.m4212class(c17134l.mo1007finally());
        if (c17538l != null) {
            InterfaceC15234l interfaceC15234lPro = c17538l.yandex().mo1339native().pro();
            if (interfaceC15234lPro != null) {
                int i = AbstractC3759l.yandex;
                C16781l c16781lBilling = AbstractC11125l.billing(interfaceC15234lPro);
                if (!c16781lBilling.amazon()) {
                    c16781lBilling = null;
                }
                if (c16781lBilling != null) {
                    c2312lSubs = c16781lBilling.subs();
                } else {
                    c2312lSubs = null;
                }
            } else {
                c2312lSubs = null;
            }
            if (!AbstractC8576l.yandex(c2312lSubs, AbstractC3974l.mopub)) {
                c17538l = null;
            }
            if (c17538l != null) {
                C17134l c17134l2 = (C17134l) c17134l.mo1457l().yandex(AbstractC16901l.m4242synchronized(1, c17134l.mo1007finally())).tapsense(((AbstractC4946l) c17538l.yandex().inmobi().get(0)).loadAd()).build();
                if (c17134l2 != null) {
                    c17134l2.f20710l = true;
                }
                return c17134l2;
            }
        }
        return null;
    }

    public static C17134l signatures(C17134l c17134l, InterfaceC4884l interfaceC4884l, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return c17134l;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            C17134l c17134l2 = (C17134l) it.next();
            if (!AbstractC8576l.yandex(c17134l, c17134l2) && c17134l2.f20724l == null && appmetrica(c17134l2, interfaceC4884l)) {
                return (C17134l) c17134l.mo1457l().Signature().build();
            }
        }
        return c17134l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static C17134l m3950synchronized(InterfaceC10696l interfaceC10696l, Function1 function1) {
        C17134l c17134l;
        C17134l c17134l2;
        AbstractC18041l abstractC18041l;
        String strLoadAd = interfaceC10696l.getName().loadAd();
        Iterator it = ((Iterable) function1.invoke(C3498l.purchase("set".concat(AbstractC4792l.loadAd(strLoadAd) ? strLoadAd.substring(2) : AbstractC15901l.yandex(strLoadAd))))).iterator();
        do {
            c17134l = null;
            if (!it.hasNext()) {
                break;
            }
            C17134l c17134l3 = (C17134l) it.next();
            if (c17134l3.mo1007finally().size() == 1 && (abstractC18041l = (c17134l2 = c17134l3).f20715l) != null) {
                C3498l c3498l = AbstractC16860l.purchase;
                if (AbstractC16860l.appmetrica(abstractC18041l, AbstractC3333l.amazon) && InterfaceC17975l.yandex.yandex(((C17538l) AbstractC16901l.m4208abstract(c17134l2.mo1007finally())).yandex(), interfaceC10696l.yandex())) {
                    c17134l = c17134l3;
                }
            }
        } while (c17134l == null);
        return c17134l;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static C17134l m3951throws(InterfaceC10696l interfaceC10696l, String str, Function1 function1) {
        C17134l c17134l;
        Iterator it = ((Iterable) function1.invoke(C3498l.purchase(str))).iterator();
        do {
            c17134l = null;
            if (!it.hasNext()) {
                break;
            }
            C17134l c17134l2 = (C17134l) it.next();
            if (c17134l2.mo1007finally().size() == 0) {
                C5215l c5215l = InterfaceC17975l.yandex;
                AbstractC18041l abstractC18041l = c17134l2.f20715l;
                if (abstractC18041l == null ? false : c5215l.loadAd(abstractC18041l, interfaceC10696l.yandex())) {
                    c17134l = c17134l2;
                }
            }
        } while (c17134l == null);
        return c17134l;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ad(C3498l c3498l, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, Function1 function1) {
        C17134l c17134lSignatures;
        Object next;
        C17134l c17134l;
        C17134l c17134lSignatures2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            C17134l c17134l2 = (C17134l) it.next();
            C17134l c17134l3 = (C17134l) AbstractC11784l.crashlytics(c17134l2);
            C17134l c17134l4 = null;
            if (c17134l3 != null) {
                Iterator it2 = ((Collection) function1.invoke(C3498l.purchase(AbstractC11784l.loadAd(c17134l3)))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c17134lSignatures = null;
                        break;
                    }
                    InterfaceC17729l interfaceC17729lMo1457l = ((C17134l) it2.next()).mo1457l();
                    interfaceC17729lMo1457l.ad(c3498l);
                    interfaceC17729lMo1457l.applovin();
                    interfaceC17729lMo1457l.mopub();
                    C17134l c17134l5 = (C17134l) interfaceC17729lMo1457l.build();
                    if (inmobi(c17134l3, c17134l5)) {
                        c17134lSignatures = signatures(c17134l5, c17134l3, linkedHashSet);
                        break;
                    }
                }
            } else {
                c17134lSignatures = null;
                break;
            }
            AbstractC3324l.crashlytics(abstractSet, c17134lSignatures);
            InterfaceC4884l interfaceC4884lYandex = AbstractC12132l.yandex(c17134l2);
            if (interfaceC4884lYandex == 0) {
                c17134lSignatures2 = null;
            } else {
                Iterator it3 = ((Iterable) function1.invoke(((AbstractC2775l) interfaceC4884lYandex).getName())).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    C17134l c17134l6 = (C17134l) next;
                    if (AbstractC17860l.loadAd(c17134l6, 2).equals(AbstractC17860l.loadAd(interfaceC4884lYandex.mo864l(), 2)) && !appmetrica(c17134l6, interfaceC4884lYandex)) {
                        break;
                    }
                }
                C17134l c17134l7 = (C17134l) next;
                if (c17134l7 != null) {
                    InterfaceC17729l interfaceC17729lMo1457l2 = c17134l7.mo1457l();
                    List listMo1007finally = interfaceC4884lYandex.mo1007finally();
                    ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listMo1007finally, 10));
                    Iterator it4 = listMo1007finally.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((C17538l) it4.next()).yandex());
                    }
                    interfaceC17729lMo1457l2.yandex(AbstractC16947l.loadAd(arrayList, c17134l7.mo1007finally(), interfaceC4884lYandex));
                    interfaceC17729lMo1457l2.applovin();
                    interfaceC17729lMo1457l2.mopub();
                    interfaceC17729lMo1457l2.isPro();
                    c17134l = (C17134l) interfaceC17729lMo1457l2.build();
                } else {
                    c17134l = null;
                }
                if (c17134l == null) {
                    c17134lSignatures2 = null;
                } else {
                    if (!m3953native(c17134l)) {
                        c17134l = null;
                    }
                    if (c17134l != null) {
                        c17134lSignatures2 = signatures(c17134l, interfaceC4884lYandex, linkedHashSet);
                    } else {
                        c17134lSignatures2 = null;
                    }
                }
            }
            AbstractC3324l.crashlytics(abstractSet, c17134lSignatures2);
            if (c17134l2.firebase()) {
                Iterator it5 = ((Iterable) function1.invoke(c17134l2.getName())).iterator();
                while (it5.hasNext()) {
                    C17134l c17134lPremium = premium((C17134l) it5.next());
                    if (c17134lPremium == null || !appmetrica(c17134lPremium, c17134l2)) {
                        c17134lPremium = null;
                    }
                    if (c17134lPremium != null) {
                        c17134l4 = c17134lPremium;
                        break;
                    }
                }
            }
            AbstractC3324l.crashlytics(abstractSet, c17134l4);
        }
    }

    @Override // defpackage.AbstractC8028l
    public final InterfaceC8371l adcel() {
        return this.vip;
    }

    @Override // defpackage.AbstractC8028l
    public final Set admob(C18186l c18186l, Function1 function1) {
        return AbstractC9905l.mopub((Set) this.ads.invoke(), ((Map) this.tapsense.invoke()).keySet());
    }

    @Override // defpackage.AbstractC8028l
    public final boolean ads(C12113l c12113l) {
        if (this.metrica.yandex.isAnnotation()) {
            return false;
        }
        return m3953native(c12113l);
    }

    public final void advert(Set set, AbstractCollection abstractCollection, C4853l c4853l, Function1 function1) {
        C1710l c1710lRemoteconfig;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC10696l interfaceC10696l = (InterfaceC10696l) it.next();
            C16907l c16907l = null;
            if (applovin(interfaceC10696l, function1)) {
                C17134l c17134lM3954package = m3954package(interfaceC10696l, function1);
                C17134l c17134lM3950synchronized = interfaceC10696l.mo3250const() ? m3950synchronized(interfaceC10696l, function1) : null;
                if (c17134lM3950synchronized != null) {
                    c17134lM3950synchronized.startapp();
                    c17134lM3954package.startapp();
                }
                C17134l c17134l = c17134lM3954package;
                C16907l c16907l2 = new C16907l(this.vip, C2782l.f6058l, c17134l.startapp(), c17134l.admob(), c17134lM3950synchronized != null, interfaceC10696l.getName(), c17134lM3954package.billing(), null, 1, false, null);
                AbstractC18041l abstractC18041l = c17134lM3954package.f20715l;
                C7073l c7073lStartapp = startapp();
                C2580l c2580l = C2580l.f5619l;
                c16907l2.m3646l(abstractC18041l, c2580l, c7073lStartapp, null, c2580l);
                C11425l c11425lSmaato = AbstractC6689l.smaato(c16907l2, c17134lM3954package.getAnnotations(), false, c17134lM3954package.billing());
                c11425lSmaato.f8324l = c17134lM3954package;
                c11425lSmaato.m3086l(c16907l2.yandex());
                if (c17134lM3950synchronized != null) {
                    C17134l c17134l2 = c17134lM3950synchronized;
                    C17538l c17538l = (C17538l) AbstractC16901l.m4217extends(c17134l2.mo1007finally());
                    if (c17538l == null) {
                        C11983l.firebase(c17134lM3950synchronized, "No parameter found for ");
                        return;
                    } else {
                        c1710lRemoteconfig = AbstractC6689l.remoteconfig(c16907l2, c17134lM3950synchronized.getAnnotations(), c17538l.getAnnotations(), false, c17134l2.admob(), c17134lM3950synchronized.billing());
                        c1710lRemoteconfig.f8324l = c17134lM3950synchronized;
                    }
                } else {
                    c1710lRemoteconfig = null;
                }
                c16907l2.m3647l(c11425lSmaato, c1710lRemoteconfig, null, null);
                c16907l = c16907l2;
            }
            if (c16907l != null) {
                abstractCollection.add(c16907l);
                if (c4853l != null) {
                    c4853l.add(interfaceC10696l);
                    return;
                }
                return;
            }
        }
    }

    public final boolean applovin(InterfaceC10696l interfaceC10696l, Function1 function1) {
        if (AbstractC6710l.admob(interfaceC10696l)) {
            return false;
        }
        C17134l c17134lM3954package = m3954package(interfaceC10696l, function1);
        C17134l c17134lM3950synchronized = m3950synchronized(interfaceC10696l, function1);
        if (c17134lM3954package == null) {
            return false;
        }
        if (interfaceC10696l.mo3250const()) {
            return c17134lM3950synchronized != null && c17134lM3950synchronized.startapp() == c17134lM3954package.startapp();
        }
        return true;
    }

    @Override // defpackage.AbstractC8028l, defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        Object obj = this.loadAd.f20463l;
        return super.billing(c3498l, enumC11300l);
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final ArrayList m3952extends(C3498l c3498l) {
        LinkedHashSet linkedHashSetM3956strictfp = m3956strictfp(c3498l);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetM3956strictfp) {
            C17134l c17134l = (C17134l) obj;
            if (AbstractC11784l.crashlytics(c17134l) == null && AbstractC12132l.yandex(c17134l) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC8028l
    public final InterfaceC6063l firebase() {
        return new C6258l(this.metrica, C1490l.f3709l);
    }

    @Override // defpackage.AbstractC8028l
    public final void isPro(C3498l c3498l, ArrayList arrayList) {
        boolean zMopub = this.metrica.mopub();
        C10038l c10038l = this.loadAd;
        if (zMopub) {
            C2278l c2278l = this.purchase;
            if (((InterfaceC6063l) c2278l.invoke()).loadAd(c3498l) != null) {
                if (arrayList.isEmpty()) {
                    C8571l c8571lLoadAd = ((InterfaceC6063l) c2278l.invoke()).loadAd(c3498l);
                    C12544l c12544lBilling = AbstractC12081l.billing(c10038l, c8571lLoadAd);
                    C7757l c7757l = (C7757l) c10038l.f20463l;
                    C12113l c12113lM3357l = C12113l.m3357l(this.vip, c12544lBilling, c8571lLoadAd.crashlytics(), c7757l.isPro.startapp(c8571lLoadAd), true);
                    AbstractC18041l abstractC18041lM4556this = ((C18449l) c10038l.f20465l).m4556this(c8571lLoadAd.billing(), AbstractC1135l.purchase(2, false, null, 6));
                    C7073l c7073lStartapp = startapp();
                    C6561l c6561l = AbstractC6004l.purchase;
                    C2580l c2580l = C2580l.f5619l;
                    c12113lM3357l.mo3360l(null, c7073lStartapp, c2580l, c2580l, c2580l, abstractC18041lM4556this, 3, c6561l, null);
                    c12113lM3357l.f24090l = 1;
                    c7757l.mopub.getClass();
                    arrayList.add(c12113lM3357l);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((C17134l) it.next()).mo1007finally().isEmpty()) {
                        }
                    }
                    C8571l c8571lLoadAd2 = ((InterfaceC6063l) c2278l.invoke()).loadAd(c3498l);
                    C12544l c12544lBilling2 = AbstractC12081l.billing(c10038l, c8571lLoadAd2);
                    C7757l c7757l2 = (C7757l) c10038l.f20463l;
                    C12113l c12113lM3357l2 = C12113l.m3357l(this.vip, c12544lBilling2, c8571lLoadAd2.crashlytics(), c7757l2.isPro.startapp(c8571lLoadAd2), true);
                    AbstractC18041l abstractC18041lM4556this2 = ((C18449l) c10038l.f20465l).m4556this(c8571lLoadAd2.billing(), AbstractC1135l.purchase(2, false, null, 6));
                    C7073l c7073lStartapp2 = startapp();
                    C6561l c6561l2 = AbstractC6004l.purchase;
                    C2580l c2580l2 = C2580l.f5619l;
                    c12113lM3357l2.mo3360l(null, c7073lStartapp2, c2580l2, c2580l2, c2580l2, abstractC18041lM4556this2, 3, c6561l2, null);
                    c12113lM3357l2.f24090l = 1;
                    c7757l2.mopub.getClass();
                    arrayList.add(c12113lM3357l2);
                }
            }
        }
        ((C13772l) ((C7757l) c10038l.f20463l).ad).getClass();
    }

    public final Collection isVip() {
        boolean z = this.startapp;
        InterfaceC17477l interfaceC17477l = this.vip;
        if (z) {
            return interfaceC17477l.metrica().yandex();
        }
        ((C5215l) ((C7757l) this.loadAd.f20463l).Signature).getClass();
        return interfaceC17477l.metrica().yandex();
    }

    public final void license(ArrayList arrayList, C4142l c4142l, int i, C1734l c1734l, AbstractC18041l abstractC18041l, AbstractC18041l abstractC18041l2) {
        InterfaceC0808l c5652l;
        C3199l c3199l = C2782l.f6058l;
        C3498l c3498lCrashlytics = c1734l.crashlytics();
        if (abstractC18041l == null) {
            AbstractC12008l.yandex(2);
            throw null;
        }
        AbstractC14318l abstractC14318lMopub = AbstractC12008l.mopub(abstractC18041l, false);
        Object defaultValue = c1734l.yandex.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = AbstractC1845l.yandex;
            if (Enum.class.isAssignableFrom(cls)) {
                c5652l = new C15917l(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                c5652l = new C15808l(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                c5652l = new C12325l(null, (Object[]) defaultValue);
            } else {
                c5652l = defaultValue instanceof Class ? new C5652l(null, (Class) defaultValue) : new C13013l(null, defaultValue);
            }
        } else {
            c5652l = null;
        }
        arrayList.add(new C17538l(c4142l, null, i, c3199l, c3498lCrashlytics, abstractC14318lMopub, c5652l != null, false, false, abstractC18041l2 != null ? AbstractC12008l.mopub(abstractC18041l2, false) : null, ((C7757l) this.loadAd.f20463l).isPro.startapp(c1734l)));
    }

    @Override // defpackage.AbstractC8028l
    public final Set metrica() {
        if (this.metrica.yandex.isAnnotation()) {
            return loadAd();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC6063l) this.purchase.invoke()).billing());
        Iterator it = this.vip.metrica().yandex().iterator();
        while (it.hasNext()) {
            AbstractC3984l.license(linkedHashSet, ((AbstractC18041l) it.next()).mo1341public().mopub());
        }
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[LOOP:3: B:54:0x011b->B:113:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0170 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01af A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0155  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b5  */
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final boolean m3953native(C17134l c17134l) {
        Collection collectionVip;
        C17134l c17134l2;
        C3498l c3498l;
        C17134l c17134lPremium;
        LinkedHashSet<C17134l> linkedHashSetM3956strictfp;
        ArrayList<InterfaceC4884l> arrayList;
        Iterator it;
        InterfaceC4884l interfaceC4884lYandex;
        ArrayList arrayList2;
        C17134l c17134l3;
        Iterator it2;
        C3498l name = c17134l.getName();
        String strLoadAd = name.loadAd();
        C2312l c2312l = AbstractC4792l.yandex;
        if (AbstractC16648l.isVip(strLoadAd, "get", false) || AbstractC16648l.isVip(strLoadAd, "is", false)) {
            C3498l c3498lPurchase = AbstractC4918l.purchase(name, "get", null, 12);
            if (c3498lPurchase == null) {
                c3498lPurchase = AbstractC4918l.purchase(name, "is", null, 8);
            }
            collectionVip = AbstractC14055l.vip(c3498lPurchase);
        } else if (AbstractC16648l.isVip(strLoadAd, "set", false)) {
            collectionVip = AbstractC8669l.m2420volatile(new C3498l[]{AbstractC4918l.purchase(name, "set", null, 4), AbstractC4918l.purchase(name, "set", "is", 4)});
        } else {
            collectionVip = (List) AbstractC7147l.loadAd.get(name);
            if (collectionVip == null) {
                collectionVip = C2580l.f5619l;
            }
        }
        if (collectionVip.isEmpty()) {
            ArrayList arrayList3 = AbstractC8899l.yandex;
            c17134l2 = c17134l;
            c3498l = (C3498l) AbstractC8899l.firebase.get(c17134l2.getName());
            if (c3498l == null) {
                int i = AbstractC12132l.smaato;
                if (AbstractC8899l.purchase.contains(c17134l2.getName())) {
                    LinkedHashSet linkedHashSetM3956strictfp2 = m3956strictfp(c17134l2.getName());
                    arrayList = new ArrayList();
                    it = linkedHashSetM3956strictfp2.iterator();
                    while (it.hasNext()) {
                        interfaceC4884lYandex = AbstractC12132l.yandex((C17134l) it.next());
                        if (interfaceC4884lYandex != null) {
                            arrayList.add(interfaceC4884lYandex);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        for (InterfaceC4884l interfaceC4884l : arrayList) {
                            if (!AbstractC17860l.loadAd(c17134l, 2).equals(AbstractC17860l.loadAd(interfaceC4884l.mo864l(), 2)) && !appmetrica(c17134l, interfaceC4884l)) {
                                return false;
                            }
                        }
                    }
                }
                c17134lPremium = premium(c17134l);
                if (c17134lPremium != null) {
                    linkedHashSetM3956strictfp = m3956strictfp(c17134l2.getName());
                    if (!linkedHashSetM3956strictfp.isEmpty()) {
                        for (C17134l c17134l4 : linkedHashSetM3956strictfp) {
                            if (c17134l4.firebase() || !appmetrica(c17134lPremium, c17134l4)) {
                            }
                        }
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetM3956strictfp3 = m3956strictfp(c3498l);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetM3956strictfp3) {
                if (AbstractC11784l.crashlytics((C17134l) obj) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i2 = AbstractC12132l.smaato;
                if (AbstractC8899l.purchase.contains(c17134l2.getName())) {
                    LinkedHashSet linkedHashSetM3956strictfp4 = m3956strictfp(c17134l2.getName());
                    arrayList = new ArrayList();
                    it = linkedHashSetM3956strictfp4.iterator();
                    while (it.hasNext()) {
                        interfaceC4884lYandex = AbstractC12132l.yandex((C17134l) it.next());
                        if (interfaceC4884lYandex != null) {
                            arrayList.add(interfaceC4884lYandex);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        while (r1.hasNext()) {
                            if (!AbstractC17860l.loadAd(c17134l, 2).equals(AbstractC17860l.loadAd(interfaceC4884l.mo864l(), 2))) {
                            }
                        }
                    }
                }
                c17134lPremium = premium(c17134l);
                if (c17134lPremium != null) {
                    linkedHashSetM3956strictfp = m3956strictfp(c17134l2.getName());
                    if (!linkedHashSetM3956strictfp.isEmpty()) {
                        while (r10.hasNext()) {
                            if (c17134l4.firebase()) {
                            }
                        }
                    }
                }
                return true;
            }
            InterfaceC17729l interfaceC17729lMo1457l = c17134l.mo1457l();
            interfaceC17729lMo1457l.ad(c3498l);
            interfaceC17729lMo1457l.applovin();
            interfaceC17729lMo1457l.mopub();
            c17134l3 = (C17134l) interfaceC17729lMo1457l.build();
            if (arrayList2.isEmpty()) {
                int i3 = AbstractC12132l.smaato;
                if (AbstractC8899l.purchase.contains(c17134l2.getName())) {
                    LinkedHashSet linkedHashSetM3956strictfp5 = m3956strictfp(c17134l2.getName());
                    arrayList = new ArrayList();
                    it = linkedHashSetM3956strictfp5.iterator();
                    while (it.hasNext()) {
                        interfaceC4884lYandex = AbstractC12132l.yandex((C17134l) it.next());
                        if (interfaceC4884lYandex != null) {
                            arrayList.add(interfaceC4884lYandex);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        while (r1.hasNext()) {
                            if (!AbstractC17860l.loadAd(c17134l, 2).equals(AbstractC17860l.loadAd(interfaceC4884l.mo864l(), 2))) {
                            }
                        }
                    }
                }
                c17134lPremium = premium(c17134l);
                if (c17134lPremium != null) {
                    linkedHashSetM3956strictfp = m3956strictfp(c17134l2.getName());
                    if (!linkedHashSetM3956strictfp.isEmpty()) {
                        while (r10.hasNext()) {
                            if (c17134l4.firebase()) {
                            }
                        }
                    }
                }
                return true;
            }
            it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (inmobi((C17134l) it2.next(), c17134l3)) {
                }
            }
            int i4 = AbstractC12132l.smaato;
            if (AbstractC8899l.purchase.contains(c17134l2.getName())) {
                LinkedHashSet linkedHashSetM3956strictfp6 = m3956strictfp(c17134l2.getName());
                arrayList = new ArrayList();
                it = linkedHashSetM3956strictfp6.iterator();
                while (it.hasNext()) {
                    interfaceC4884lYandex = AbstractC12132l.yandex((C17134l) it.next());
                    if (interfaceC4884lYandex != null) {
                        arrayList.add(interfaceC4884lYandex);
                    }
                }
                if (!arrayList.isEmpty()) {
                    while (r1.hasNext()) {
                        if (!AbstractC17860l.loadAd(c17134l, 2).equals(AbstractC17860l.loadAd(interfaceC4884l.mo864l(), 2))) {
                        }
                    }
                }
            }
            c17134lPremium = premium(c17134l);
            if (c17134lPremium != null) {
                linkedHashSetM3956strictfp = m3956strictfp(c17134l2.getName());
                if (!linkedHashSetM3956strictfp.isEmpty()) {
                    while (r10.hasNext()) {
                        if (c17134l4.firebase()) {
                        }
                    }
                }
            }
            return true;
        }
        Iterator it3 = collectionVip.iterator();
        while (it3.hasNext()) {
            Set<InterfaceC10696l> setM3957volatile = m3957volatile((C3498l) it3.next());
            if (!(setM3957volatile instanceof Collection) || !setM3957volatile.isEmpty()) {
                for (InterfaceC10696l interfaceC10696l : setM3957volatile) {
                    if (!applovin(interfaceC10696l, new C3768l(c17134l, this, 14)) || (!interfaceC10696l.mo3250const() && AbstractC16648l.isVip(c17134l.getName().loadAd(), "set", false))) {
                    }
                }
            }
        }
        ArrayList arrayList4 = AbstractC8899l.yandex;
        c17134l2 = c17134l;
        c3498l = (C3498l) AbstractC8899l.firebase.get(c17134l2.getName());
        if (c3498l == null) {
            int i5 = AbstractC12132l.smaato;
            if (AbstractC8899l.purchase.contains(c17134l2.getName())) {
                LinkedHashSet linkedHashSetM3956strictfp7 = m3956strictfp(c17134l2.getName());
                arrayList = new ArrayList();
                it = linkedHashSetM3956strictfp7.iterator();
                while (it.hasNext()) {
                    interfaceC4884lYandex = AbstractC12132l.yandex((C17134l) it.next());
                    if (interfaceC4884lYandex != null) {
                        arrayList.add(interfaceC4884lYandex);
                    }
                }
                if (!arrayList.isEmpty()) {
                    while (r1.hasNext()) {
                        if (!AbstractC17860l.loadAd(c17134l, 2).equals(AbstractC17860l.loadAd(interfaceC4884l.mo864l(), 2))) {
                        }
                    }
                }
            }
            c17134lPremium = premium(c17134l);
            if (c17134lPremium != null) {
                linkedHashSetM3956strictfp = m3956strictfp(c17134l2.getName());
                if (!linkedHashSetM3956strictfp.isEmpty()) {
                    while (r10.hasNext()) {
                        if (c17134l4.firebase()) {
                        }
                    }
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetM3956strictfp8 = m3956strictfp(c3498l);
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
            if (AbstractC11784l.crashlytics((C17134l) obj) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i6 = AbstractC12132l.smaato;
            if (AbstractC8899l.purchase.contains(c17134l2.getName())) {
                LinkedHashSet linkedHashSetM3956strictfp9 = m3956strictfp(c17134l2.getName());
                arrayList = new ArrayList();
                it = linkedHashSetM3956strictfp9.iterator();
                while (it.hasNext()) {
                    interfaceC4884lYandex = AbstractC12132l.yandex((C17134l) it.next());
                    if (interfaceC4884lYandex != null) {
                        arrayList.add(interfaceC4884lYandex);
                    }
                }
                if (!arrayList.isEmpty()) {
                    while (r1.hasNext()) {
                        if (!AbstractC17860l.loadAd(c17134l, 2).equals(AbstractC17860l.loadAd(interfaceC4884l.mo864l(), 2))) {
                        }
                    }
                }
            }
            c17134lPremium = premium(c17134l);
            if (c17134lPremium != null) {
                linkedHashSetM3956strictfp = m3956strictfp(c17134l2.getName());
                if (!linkedHashSetM3956strictfp.isEmpty()) {
                    while (r10.hasNext()) {
                        if (c17134l4.firebase()) {
                        }
                    }
                }
            }
            return true;
        }
        InterfaceC17729l interfaceC17729lMo1457l2 = c17134l.mo1457l();
        interfaceC17729lMo1457l2.ad(c3498l);
        interfaceC17729lMo1457l2.applovin();
        interfaceC17729lMo1457l2.mopub();
        c17134l3 = (C17134l) interfaceC17729lMo1457l2.build();
        if (arrayList2.isEmpty()) {
            int i7 = AbstractC12132l.smaato;
            if (AbstractC8899l.purchase.contains(c17134l2.getName())) {
                LinkedHashSet linkedHashSetM3956strictfp10 = m3956strictfp(c17134l2.getName());
                arrayList = new ArrayList();
                it = linkedHashSetM3956strictfp10.iterator();
                while (it.hasNext()) {
                    interfaceC4884lYandex = AbstractC12132l.yandex((C17134l) it.next());
                    if (interfaceC4884lYandex != null) {
                        arrayList.add(interfaceC4884lYandex);
                    }
                }
                if (!arrayList.isEmpty()) {
                    while (r1.hasNext()) {
                        if (!AbstractC17860l.loadAd(c17134l, 2).equals(AbstractC17860l.loadAd(interfaceC4884l.mo864l(), 2))) {
                        }
                    }
                }
            }
            c17134lPremium = premium(c17134l);
            if (c17134lPremium != null) {
                linkedHashSetM3956strictfp = m3956strictfp(c17134l2.getName());
                if (!linkedHashSetM3956strictfp.isEmpty()) {
                    while (r10.hasNext()) {
                        if (c17134l4.firebase()) {
                        }
                    }
                }
            }
            return true;
        }
        it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (inmobi((C17134l) it2.next(), c17134l3)) {
            }
        }
        int i8 = AbstractC12132l.smaato;
        if (AbstractC8899l.purchase.contains(c17134l2.getName())) {
            LinkedHashSet linkedHashSetM3956strictfp11 = m3956strictfp(c17134l2.getName());
            arrayList = new ArrayList();
            it = linkedHashSetM3956strictfp11.iterator();
            while (it.hasNext()) {
                interfaceC4884lYandex = AbstractC12132l.yandex((C17134l) it.next());
                if (interfaceC4884lYandex != null) {
                    arrayList.add(interfaceC4884lYandex);
                }
            }
            if (!arrayList.isEmpty()) {
                while (r1.hasNext()) {
                    if (!AbstractC17860l.loadAd(c17134l, 2).equals(AbstractC17860l.loadAd(interfaceC4884l.mo864l(), 2))) {
                    }
                }
            }
        }
        c17134lPremium = premium(c17134l);
        if (c17134lPremium != null) {
            linkedHashSetM3956strictfp = m3956strictfp(c17134l2.getName());
            if (!linkedHashSetM3956strictfp.isEmpty()) {
                while (r10.hasNext()) {
                    if (c17134l4.firebase()) {
                    }
                }
            }
        }
        return true;
        return false;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C17134l m3954package(InterfaceC10696l interfaceC10696l, Function1 function1) {
        C3498l c3498l;
        C11425l c11425lCrashlytics = interfaceC10696l.crashlytics();
        String strLoadAd = null;
        C11425l c11425l = c11425lCrashlytics != null ? (C11425l) AbstractC11784l.crashlytics(c11425lCrashlytics) : null;
        if (c11425l != null) {
            AbstractC16860l.isVip(c11425l);
            InterfaceC0207l interfaceC0207lLoadAd = AbstractC3759l.loadAd(AbstractC3759l.subs(c11425l), C5818l.f12258l);
            if (interfaceC0207lLoadAd != null && (c3498l = (C3498l) AbstractC7147l.yandex.get(AbstractC3759l.mopub(interfaceC0207lLoadAd))) != null) {
                strLoadAd = c3498l.loadAd();
            }
        }
        return (strLoadAd == null || AbstractC11784l.amazon(this.vip, c11425l)) ? m3951throws(interfaceC10696l, AbstractC4792l.yandex(interfaceC10696l.getName().loadAd()), function1) : m3951throws(interfaceC10696l, strLoadAd, function1);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final ArrayList m3955private(C3498l c3498l) {
        Collection collectionCrashlytics = ((InterfaceC6063l) this.purchase.invoke()).crashlytics(c3498l);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(collectionCrashlytics, 10));
        Iterator it = collectionCrashlytics.iterator();
        while (it.hasNext()) {
            arrayList.add(tapsense((C1734l) it.next()));
        }
        return arrayList;
    }

    public final void pro(LinkedHashSet linkedHashSet, C3498l c3498l, ArrayList arrayList, boolean z) {
        C7757l c7757l = (C7757l) this.loadAd.f20463l;
        LinkedHashSet<C17134l> linkedHashSetSubs = AbstractC11621l.subs(c3498l, arrayList, linkedHashSet, this.vip, c7757l.billing, ((C5215l) c7757l.Signature).amazon);
        if (!z) {
            linkedHashSet.addAll(linkedHashSetSubs);
            return;
        }
        ArrayList arrayListM4232new = AbstractC16901l.m4232new(linkedHashSet, linkedHashSetSubs);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(linkedHashSetSubs, 10));
        for (C17134l c17134lSignatures : linkedHashSetSubs) {
            InterfaceC0207l interfaceC0207lCrashlytics = AbstractC11784l.crashlytics(c17134lSignatures);
            if (interfaceC0207lCrashlytics == null) {
                int i = AbstractC12132l.smaato;
                interfaceC0207lCrashlytics = !AbstractC8899l.purchase.contains(c17134lSignatures.getName()) ? null : AbstractC3759l.loadAd(c17134lSignatures, C12844l.f25259l);
            }
            C17134l c17134l = (C17134l) interfaceC0207lCrashlytics;
            if (c17134l != null) {
                c17134lSignatures = signatures(c17134lSignatures, c17134l, arrayListM4232new);
            }
            arrayList2.add(c17134lSignatures);
        }
        linkedHashSet.addAll(arrayList2);
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        C18028l c18028l;
        InterfaceC17477l interfaceC17477l;
        Object obj = this.loadAd.f20463l;
        C15284l c15284l = (C15284l) this.crashlytics;
        return (c15284l == null || (c18028l = c15284l.Signature) == null || (interfaceC17477l = (InterfaceC17477l) c18028l.invoke(c3498l)) == null) ? (InterfaceC15234l) this.Signature.invoke(c3498l) : interfaceC17477l;
    }

    @Override // defpackage.AbstractC8028l
    public final void remoteconfig(LinkedHashSet linkedHashSet, C3498l c3498l) {
        LinkedHashSet linkedHashSetM3956strictfp = m3956strictfp(c3498l);
        ArrayList arrayList = AbstractC8899l.yandex;
        if (!AbstractC8899l.isPro.contains(c3498l)) {
            int i = AbstractC12132l.smaato;
            if (!AbstractC8899l.purchase.contains(c3498l)) {
                if (!linkedHashSetM3956strictfp.isEmpty()) {
                    Iterator it = linkedHashSetM3956strictfp.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((InterfaceC4884l) it.next()).firebase()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetM3956strictfp) {
                    if (m3953native((C17134l) obj)) {
                        arrayList2.add(obj);
                    }
                }
                pro(linkedHashSet, c3498l, arrayList2, false);
                return;
            }
        }
        int i2 = C4853l.f9907l;
        C4853l c4853lCrashlytics = AbstractC11621l.crashlytics();
        LinkedHashSet linkedHashSetSubs = AbstractC11621l.subs(c3498l, linkedHashSetM3956strictfp, C2580l.f5619l, this.vip, InterfaceC9407l.license, ((C5215l) ((C7757l) this.loadAd.f20463l).Signature).amazon);
        int i3 = 0;
        int i4 = 0;
        ad(c3498l, linkedHashSet, linkedHashSetSubs, linkedHashSet, new C17847l(1, this, C15284l.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", i4, i3, 19));
        ad(c3498l, linkedHashSet, linkedHashSetSubs, c4853lCrashlytics, new C17847l(1, this, C15284l.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", i4, i3, 20));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetM3956strictfp) {
            if (m3953native((C17134l) obj2)) {
                arrayList3.add(obj2);
            }
        }
        pro(linkedHashSet, c3498l, AbstractC16901l.m4232new(arrayList3, c4853lCrashlytics), true);
    }

    @Override // defpackage.AbstractC8028l
    public final C7073l startapp() {
        InterfaceC17477l interfaceC17477l = this.vip;
        if (interfaceC17477l != null) {
            int i = AbstractC11125l.yandex;
            return interfaceC17477l.mo2892l();
        }
        AbstractC11125l.yandex(0);
        throw null;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final LinkedHashSet m3956strictfp(C3498l c3498l) {
        Collection collectionIsVip = isVip();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionIsVip.iterator();
        while (it.hasNext()) {
            AbstractC3984l.license(linkedHashSet, ((AbstractC18041l) it.next()).mo1341public().yandex(c3498l, EnumC11300l.f22778l));
        }
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC8028l
    public final Set subs(C18186l c18186l, C1490l c1490l) {
        Collection collectionYandex = this.vip.metrica().yandex();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionYandex.iterator();
        while (it.hasNext()) {
            AbstractC3984l.license(linkedHashSet, ((AbstractC18041l) it.next()).mo1341public().loadAd());
        }
        C2278l c2278l = this.purchase;
        linkedHashSet.addAll(((InterfaceC6063l) c2278l.invoke()).yandex());
        linkedHashSet.addAll(((InterfaceC6063l) c2278l.invoke()).purchase());
        linkedHashSet.addAll(admob(c18186l, c1490l));
        ((C13772l) ((C7757l) this.loadAd.f20463l).ad).getClass();
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC8028l
    public final C7978l subscription(ArrayList arrayList, AbstractC18041l abstractC18041l, List list) {
        ((C7757l) this.loadAd.f20463l).purchase.getClass();
        if (this.vip != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new C7978l(abstractC18041l, list, arrayList, list2);
            }
            C18073l.adcel("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"});
            return null;
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.AbstractC8028l
    public final String toString() {
        return "Lazy Java member scope for " + this.metrica.crashlytics();
    }

    @Override // defpackage.AbstractC8028l
    public final void vip(C3498l c3498l, ArrayList arrayList) {
        C3498l c3498l2;
        boolean zIsAnnotation = this.metrica.yandex.isAnnotation();
        C10038l c10038l = this.loadAd;
        if (zIsAnnotation) {
            c3498l2 = c3498l;
            C1734l c1734l = (C1734l) AbstractC16901l.m4224instanceof(((InterfaceC6063l) this.purchase.invoke()).crashlytics(c3498l2));
            if (c1734l != null) {
                C1734l c1734l2 = c1734l;
                C4099l c4099lM1488l = C4099l.m1488l(this.vip, AbstractC12081l.billing(c10038l, c1734l), AbstractC15901l.subs(c1734l2.purchase()), false, c1734l2.crashlytics(), ((C7757l) c10038l.f20463l).isPro.startapp(c1734l), false);
                C11425l c11425lBilling = AbstractC6689l.billing(c4099lM1488l, C2782l.f6058l);
                c4099lM1488l.m3647l(c11425lBilling, null, null, null);
                AbstractC18041l abstractC18041lSmaato = AbstractC8028l.smaato(c1734l, AbstractC14460l.purchase(c10038l, c4099lM1488l, c1734l, 0, (InterfaceC1220l) c10038l.f20466l));
                C7073l c7073lStartapp = startapp();
                C2580l c2580l = C2580l.f5619l;
                c4099lM1488l.m3646l(abstractC18041lSmaato, c2580l, c7073lStartapp, null, c2580l);
                c11425lBilling.f22991l = abstractC18041lSmaato;
                arrayList.add(c4099lM1488l);
            }
        } else {
            c3498l2 = c3498l;
        }
        Set setM3957volatile = m3957volatile(c3498l);
        if (setM3957volatile.isEmpty()) {
            return;
        }
        int i = C4853l.f9907l;
        C4853l c4853lCrashlytics = AbstractC11621l.crashlytics();
        C4853l c4853lCrashlytics2 = AbstractC11621l.crashlytics();
        advert(setM3957volatile, arrayList, c4853lCrashlytics, new C5850l(this, 0));
        advert(AbstractC9905l.purchase(setM3957volatile, c4853lCrashlytics), c4853lCrashlytics2, null, new C5850l(this, 1));
        LinkedHashSet linkedHashSetMopub = AbstractC9905l.mopub(setM3957volatile, c4853lCrashlytics2);
        C7757l c7757l = (C7757l) c10038l.f20463l;
        C3498l c3498l3 = c3498l2;
        arrayList.addAll(AbstractC11621l.subs(c3498l3, linkedHashSetMopub, arrayList, this.vip, c7757l.billing, ((C5215l) c7757l.Signature).amazon));
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final Set m3957volatile(C3498l c3498l) {
        Collection collectionIsVip = isVip();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionIsVip.iterator();
        while (it.hasNext()) {
            Collection collectionBilling = ((AbstractC18041l) it.next()).mo1341public().billing(c3498l, EnumC11300l.f22778l);
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(collectionBilling, 10));
            Iterator it2 = collectionBilling.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC10696l) it2.next());
            }
            AbstractC3984l.license(arrayList, arrayList2);
        }
        return AbstractC16901l.m4229l(arrayList);
    }

    @Override // defpackage.AbstractC8028l, defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        Object obj = this.loadAd.f20463l;
        return super.yandex(c3498l, enumC11300l);
    }
}
