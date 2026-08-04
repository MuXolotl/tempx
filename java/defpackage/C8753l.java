package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8753l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC1388l f18016l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2312l f18017l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18018l = 0;

    public C8753l(C2312l c2312l, InterfaceC1388l interfaceC1388l) {
        this.f18017l = c2312l;
        this.f18016l = interfaceC1388l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC1388l interfaceC1388lRemoteconfig;
        switch (this.f18018l) {
            case 0:
                InterfaceC1388l interfaceC1388l = this.f18016l;
                C2312l c2312l = this.f18017l;
                C9959l c9959l = (C9959l) obj;
                List typeParameters = interfaceC1388l.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    C9243l c9243l = new C9243l(null, c9959l, ((AbstractC11726l) it.next()).crashlytics(), (AbstractC8576l.yandex(c2312l, AbstractC3333l.f7108volatile) || AbstractC8576l.yandex(c2312l, AbstractC3333l.f7102strictfp)) ? 3 : 1);
                    c9243l.f19009l = Collections.singletonList(AbstractC1806l.loadAd);
                    arrayList.add(c9243l);
                }
                return arrayList;
            default:
                C2312l c2312l2 = this.f18017l;
                InterfaceC1388l interfaceC1388l2 = this.f18016l;
                C9959l c9959l2 = (C9959l) obj;
                if (AbstractC8576l.yandex(c2312l2, AbstractC3333l.f7096native)) {
                    InterfaceC13012l interfaceC13012lLoadAd = AbstractC18202l.loadAd(Iterable.class, C0861l.crashlytics);
                    C2336l c2336l = AbstractC18202l.yandex;
                    interfaceC1388lRemoteconfig = ((AbstractC6786l) c2336l.amazon(interfaceC13012lLoadAd)).remoteconfig();
                    if (interfaceC1388lRemoteconfig == null) {
                        throw new C3150l(AbstractC0653l.metrica(c2336l, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC8576l.yandex(c2312l2, AbstractC3333l.f7099private)) {
                    InterfaceC13012l interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(Collection.class, C0861l.crashlytics);
                    C2336l c2336l2 = AbstractC18202l.yandex;
                    interfaceC1388lRemoteconfig = ((AbstractC6786l) c2336l2.amazon(interfaceC13012lLoadAd2)).remoteconfig();
                    if (interfaceC1388lRemoteconfig == null) {
                        throw new C3150l(AbstractC0653l.metrica(c2336l2, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC8576l.yandex(c2312l2, AbstractC3333l.f7091for)) {
                    InterfaceC13012l interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(Collection.class, C0861l.crashlytics);
                    C2336l c2336l3 = AbstractC18202l.yandex;
                    interfaceC1388lRemoteconfig = ((AbstractC6786l) c2336l3.amazon(interfaceC13012lLoadAd3)).remoteconfig();
                    if (interfaceC1388lRemoteconfig == null) {
                        throw new C3150l(AbstractC0653l.metrica(c2336l3, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC8576l.yandex(c2312l2, AbstractC3333l.f7088extends)) {
                    InterfaceC13012l interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(Iterator.class, C0861l.crashlytics);
                    C2336l c2336l4 = AbstractC18202l.yandex;
                    interfaceC1388lRemoteconfig = ((AbstractC6786l) c2336l4.amazon(interfaceC13012lLoadAd4)).remoteconfig();
                    if (interfaceC1388lRemoteconfig == null) {
                        throw new C3150l(AbstractC0653l.metrica(c2336l4, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    interfaceC1388lRemoteconfig = null;
                }
                List<AbstractC11726l> list = c9959l2.f20317l;
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
                for (AbstractC11726l abstractC11726l : list) {
                    C0861l c0861l = C0861l.crashlytics;
                    arrayList2.add(AbstractC12953l.smaato(AbstractC6427l.amazon(abstractC11726l, null, 7)));
                }
                ArrayList arrayListM2420volatile = AbstractC8669l.m2420volatile(new InterfaceC1388l[]{interfaceC1388l2, interfaceC1388lRemoteconfig});
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayListM2420volatile, 10));
                Iterator it2 = arrayListM2420volatile.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(AbstractC6427l.amazon((InterfaceC1388l) it2.next(), arrayList2, 6));
                }
                return arrayList3;
        }
    }

    public C8753l(InterfaceC1388l interfaceC1388l, C2312l c2312l) {
        this.f18016l = interfaceC1388l;
        this.f18017l = c2312l;
    }
}
