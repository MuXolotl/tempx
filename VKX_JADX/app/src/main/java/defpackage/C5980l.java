package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘۜ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5980l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C9539l f12626l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C11400l f12627l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12628l;

    public C5980l(C9539l c9539l, C11400l c11400l) {
        this.f12628l = 0;
        this.f12626l = c9539l;
        this.f12627l = c11400l;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x0162  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        C11128l c11128l;
        AbstractC6242l c12955l;
        int i = this.f12628l;
        C9539l c9539l = this.f12626l;
        C11400l c11400l = this.f12627l;
        switch (i) {
            case 0:
                Class cls = c9539l.f19443l;
                boolean z = AbstractC0367l.crashlytics;
                Iterable iterableM2415super = C2580l.f5619l;
                if (!z) {
                    C2343l c2343l = c11400l.purchase;
                    InterfaceC13922l interfaceC13922l = C11400l.admob[1];
                    InterfaceC7637l interfaceC7637l = (InterfaceC7637l) c2343l.invoke();
                    if (interfaceC7637l instanceof C12181l) {
                        iterableM2415super = Collections.singletonList(interfaceC7637l);
                    } else if (interfaceC7637l instanceof C0116l) {
                        iterableM2415super = AbstractC8669l.m2415super(((C0116l) interfaceC7637l).crashlytics);
                    }
                    ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterableM2415super, 10));
                    Iterator it = iterableM2415super.iterator();
                    while (it.hasNext()) {
                        C12181l c12181l = (C12181l) ((InterfaceC7637l) it.next());
                        arrayList.add(AbstractC9966l.pro(c12181l.admob, (InterfaceC3588l) c12181l.loadAd.f15737l, false, 6));
                    }
                    return arrayList;
                }
                Metadata metadata = (Metadata) cls.getAnnotation(Metadata.class);
                AbstractC8238l abstractC8238lCrashlytics = metadata != null ? AbstractC14566l.crashlytics(metadata) : null;
                if (abstractC8238lCrashlytics instanceof C2408l) {
                    return Collections.singletonList(((C2408l) abstractC8238lCrashlytics).yandex);
                }
                if (abstractC8238lCrashlytics instanceof C18370l) {
                    return Collections.singletonList(((C18370l) abstractC8238lCrashlytics).yandex);
                }
                if (!(abstractC8238lCrashlytics instanceof C2395l)) {
                    return iterableM2415super;
                }
                List list = ((C2395l) abstractC8238lCrashlytics).yandex;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC3984l.license(arrayList2, (List) ((C11400l) ((C9539l) ((InterfaceC9191l) AbstractC1749l.loadAd.premium(cls.getClassLoader().loadClass(((String) it2.next()).replace('/', '.'))))).f19442l.getValue()).crashlytics.getValue());
                }
                return arrayList2;
            case 1:
                C2343l c2343l2 = c11400l.amazon;
                InterfaceC13922l interfaceC13922l2 = C11400l.admob[0];
                C5222l c5222l = (C5222l) c2343l2.invoke();
                if (c5222l != null) {
                    C11906l c11906l = c5222l.loadAd;
                    str = (String) c11906l.admob;
                    if (((EnumC4474l) c11906l.crashlytics) != EnumC4474l.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return c9539l.f19443l.getClassLoader().loadClass(str.replace('/', '.'));
            default:
                if (AbstractC0367l.yandex) {
                    C5772l c5772l = new C5772l(c9539l, 1);
                    C2343l c2343l3 = c11400l.purchase;
                    InterfaceC13922l interfaceC13922l3 = C11400l.admob[1];
                    Collection<InterfaceC8371l> collectionLoadAd = AbstractC6968l.loadAd((InterfaceC7637l) c2343l3.invoke(), null, 3);
                    ArrayList arrayList3 = new ArrayList();
                    for (InterfaceC8371l interfaceC8371l : collectionLoadAd) {
                        AbstractC1112l abstractC1112l = interfaceC8371l instanceof InterfaceC0207l ? (AbstractC1112l) interfaceC8371l.mo1008import(c5772l, Unit.INSTANCE) : null;
                        if (abstractC1112l != null) {
                            arrayList3.add(abstractC1112l);
                        }
                    }
                    return AbstractC16901l.m4213const(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (C1571l c1571l : (List) c11400l.crashlytics.getValue()) {
                    Iterator it3 = c1571l.loadAd.iterator();
                    while (true) {
                        boolean zHasNext = it3.hasNext();
                        c11128l = C11128l.f22339l;
                        if (zHasNext) {
                            C6084l c6084l = (C6084l) it3.next();
                            String str2 = c6084l.loadAd;
                            byte b = c6084l.admob.isEmpty() ? c6084l.billing != null ? (byte) 1 : (byte) 0 : (byte) -1;
                            String strLoadAd = AbstractC10392l.loadAd(c6084l, c9539l);
                            if (strLoadAd == null) {
                                throw new C3150l(AbstractC14814l.startapp("No field or getter signature for property: ", str2));
                            }
                            C13698l c13698l = AbstractC15547l.startapp;
                            InterfaceC13922l interfaceC13922l4 = AbstractC15547l.yandex[36];
                            if (c13698l.m3679package(c6084l)) {
                                if (b == -1) {
                                    c12955l = new C12955l(c9539l, strLoadAd, c6084l);
                                } else if (b == 0) {
                                    c12955l = new C8814l(c9539l, strLoadAd, c11128l, c6084l);
                                } else if (b != 1) {
                                    c12955l = null;
                                } else {
                                    c12955l = new C4458l(c9539l, strLoadAd, c11128l, c6084l);
                                }
                            } else if (b == -1) {
                                c12955l = new C4615l(c9539l, strLoadAd, c6084l);
                            } else if (b == 0) {
                                c12955l = new C8786l(c9539l, strLoadAd, c11128l, c6084l);
                            } else if (b != 1) {
                                c12955l = null;
                            } else {
                                c12955l = new C3436l(c9539l, strLoadAd, c11128l, c6084l);
                            }
                            if (c12955l == null) {
                                StringBuilder sbLicense = AbstractC14814l.license("Unsupported property: name=", str2, " signature=", strLoadAd, " container=");
                                sbLicense.append(c9539l);
                                throw new C3150l(sbLicense.toString());
                            }
                            arrayList4.add(c12955l);
                        }
                    }
                    for (C4454l c4454l : c1571l.yandex) {
                        C1559l c1559l = AbstractC10565l.mopub(c4454l).yandex;
                        if (c1559l == null) {
                            C11467l.ads(c4454l.loadAd, "No signature for function: ");
                            return null;
                        }
                        arrayList4.add(new C8975l(c9539l, c1559l.toString(), c11128l, c4454l));
                    }
                }
                return AbstractC16901l.m4213const(arrayList4);
        }
    }

    public /* synthetic */ C5980l(C11400l c11400l, C9539l c9539l, int i) {
        this.f12628l = i;
        this.f12627l = c11400l;
        this.f12626l = c9539l;
    }
}
