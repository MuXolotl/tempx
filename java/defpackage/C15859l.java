package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕۖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15859l extends AbstractC2842l {
    public final C2278l admob;
    public final /* synthetic */ C11296l isPro;
    public final C14945l mopub;
    public final C2278l subs;

    public C15859l(C11296l c11296l, C14945l c14945l) {
        this.isPro = c11296l;
        C7644l c7644l = c11296l.f22763l;
        C6582l c6582l = c11296l.f22762l;
        List list = c6582l.f13782l;
        List list2 = c6582l.f13799l;
        List list3 = c6582l.f13781l;
        List list4 = c6582l.f13796l;
        InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c7644l.f15737l;
        C0511l c0511l = (C0511l) c7644l.f15738l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC18719l.firebase(interfaceC3588l, ((Number) it.next()).intValue()));
        }
        super(c7644l, list, list2, list3, new C12426l(0, arrayList));
        this.mopub = c14945l;
        C16412l c16412l = (C16412l) c0511l.yandex;
        C15306l c15306l = new C15306l(this, 0);
        c16412l.getClass();
        this.admob = new C2278l(c16412l, c15306l);
        C16412l c16412l2 = (C16412l) c0511l.yandex;
        C15306l c15306l2 = new C15306l(this, 1);
        c16412l2.getClass();
        this.subs = new C2278l(c16412l2, c15306l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // defpackage.AbstractC2842l
    public final void admob(ArrayList arrayList) {
        ?? arrayList2;
        C12014l c12014l = this.isPro.f22757l;
        if (c12014l != null) {
            Set setKeySet = ((LinkedHashMap) c12014l.f23941l).keySet();
            arrayList2 = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                InterfaceC17477l interfaceC17477l = (InterfaceC17477l) ((C18028l) c12014l.f23940l).invoke((C3498l) it.next());
                if (interfaceC17477l != null) {
                    arrayList2.add(interfaceC17477l);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = C2580l.f5619l;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // defpackage.AbstractC2842l
    public final boolean ads(C4799l c4799l) {
        return ((InterfaceC10240l) ((C0511l) this.loadAd.f15738l).vip).loadAd(this.isPro, c4799l);
    }

    @Override // defpackage.AbstractC2842l, defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        Object obj = this.loadAd.f15738l;
        return super.billing(c3498l, enumC11300l);
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        return (Collection) this.admob.invoke();
    }

    @Override // defpackage.AbstractC2842l
    public final void firebase(C3498l c3498l, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.subs.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC18041l) it.next()).mo1341public().billing(c3498l, EnumC11300l.f22773l));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C5215l) ((InterfaceC11175l) ((C0511l) this.loadAd.f15738l).startapp)).amazon.admob(c3498l, arrayList2, arrayList3, this.isPro, new C4575l(arrayList, 0));
    }

    @Override // defpackage.AbstractC2842l
    public final void isPro(C3498l c3498l, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.subs.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC18041l) it.next()).mo1341public().yandex(c3498l, EnumC11300l.f22773l));
        }
        C7644l c7644l = this.loadAd;
        arrayList.addAll(((InterfaceC9630l) ((C0511l) c7644l.f15738l).remoteconfig).amazon(c3498l, this.isPro));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C5215l) ((InterfaceC11175l) ((C0511l) c7644l.f15738l).startapp)).amazon.admob(c3498l, arrayList2, arrayList3, this.isPro, new C4575l(arrayList, 0));
    }

    @Override // defpackage.AbstractC2842l
    public final Set metrica() {
        C11296l c11296l = this.isPro;
        List listYandex = c11296l.f22767l.yandex();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            AbstractC3984l.license(linkedHashSet, ((AbstractC18041l) it.next()).mo1341public().loadAd());
        }
        linkedHashSet.addAll(((InterfaceC9630l) ((C0511l) this.loadAd.f15738l).remoteconfig).Signature(c11296l));
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC2842l, defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        InterfaceC17477l interfaceC17477l;
        Object obj = this.loadAd.f15738l;
        C12014l c12014l = this.isPro.f22757l;
        return (c12014l == null || (interfaceC17477l = (InterfaceC17477l) ((C18028l) c12014l.f23940l).invoke(c3498l)) == null) ? super.purchase(c3498l, enumC11300l) : interfaceC17477l;
    }

    @Override // defpackage.AbstractC2842l
    public final C3624l smaato(C3498l c3498l) {
        return this.isPro.f22756l.amazon(c3498l);
    }

    @Override // defpackage.AbstractC2842l
    public final Set startapp() {
        List listYandex = this.isPro.f22767l.yandex();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            AbstractC3984l.license(linkedHashSet, ((AbstractC18041l) it.next()).mo1341public().mopub());
        }
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC2842l
    public final Set vip() {
        List listYandex = this.isPro.f22767l.yandex();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            Set setAmazon = ((AbstractC18041l) it.next()).mo1341public().amazon();
            if (setAmazon == null) {
                return null;
            }
            AbstractC3984l.license(linkedHashSet, setAmazon);
        }
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC2842l, defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        Object obj = this.loadAd.f15738l;
        return super.yandex(c3498l, enumC11300l);
    }
}
