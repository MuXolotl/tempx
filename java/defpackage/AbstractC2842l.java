package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍؔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2842l extends AbstractC5662l {
    public static final /* synthetic */ InterfaceC13922l[] billing = {new C0544l(AbstractC2842l.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0), new C0544l(AbstractC2842l.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};
    public final C2278l amazon;
    public final C16924l crashlytics;
    public final C7644l loadAd;
    public final C9004l purchase;

    public AbstractC2842l(C7644l c7644l, List list, List list2, List list3, Function0 function0) {
        this.loadAd = c7644l;
        C0511l c0511l = (C0511l) c7644l.f15738l;
        ((C17334l) c0511l.crashlytics).getClass();
        this.crashlytics = new C16924l(this, list, list2, list3);
        C16412l c16412l = (C16412l) c0511l.yandex;
        C9429l c9429l = new C9429l(0, function0);
        c16412l.getClass();
        this.amazon = new C2278l(c16412l, c9429l);
        C7646l c7646l = new C7646l(16, this);
        c16412l.getClass();
        this.purchase = new C9004l(c16412l, c7646l);
    }

    public boolean adcel(C3498l c3498l) {
        return remoteconfig().contains(c3498l);
    }

    public abstract void admob(ArrayList arrayList);

    public boolean ads(C4799l c4799l) {
        return true;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set amazon() {
        InterfaceC13922l interfaceC13922l = billing[1];
        return (Set) this.purchase.invoke();
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        C16924l c16924l = this.crashlytics;
        C2278l c2278l = c16924l.admob;
        InterfaceC13922l interfaceC13922l = C16924l.isPro[1];
        return !((Set) c2278l.invoke()).contains(c3498l) ? C2580l.f5619l : (Collection) c16924l.purchase.invoke(c3498l);
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set loadAd() {
        C2278l c2278l = this.crashlytics.mopub;
        InterfaceC13922l interfaceC13922l = C16924l.isPro[0];
        return (Set) c2278l.invoke();
    }

    public abstract Set metrica();

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set mopub() {
        C2278l c2278l = this.crashlytics.admob;
        InterfaceC13922l interfaceC13922l = C16924l.isPro[1];
        return (Set) c2278l.invoke();
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        if (adcel(c3498l)) {
            return (InterfaceC17477l) ((C1683l) ((C0511l) this.loadAd.f15738l).subscription).loadAd.invoke(new C16518l(smaato(c3498l), null));
        }
        C16924l c16924l = this.crashlytics;
        if (c16924l.crashlytics.keySet().contains(c3498l)) {
            return (C9522l) c16924l.billing.invoke(c3498l);
        }
        return null;
    }

    public final Set remoteconfig() {
        InterfaceC13922l interfaceC13922l = billing[0];
        return (Set) this.amazon.invoke();
    }

    public abstract C3624l smaato(C3498l c3498l);

    public abstract Set startapp();

    public final List subs(C18186l c18186l, Function1 function1) {
        ArrayList arrayList = new ArrayList(0);
        if (c18186l.yandex(C18186l.billing)) {
            admob(arrayList);
        }
        C16924l c16924l = this.crashlytics;
        c16924l.getClass();
        C2278l c2278l = c16924l.mopub;
        C2278l c2278l2 = c16924l.admob;
        C13617l c13617l = C13617l.f26649l;
        boolean zYandex = c18186l.yandex(C18186l.isPro);
        C2580l c2580l = C2580l.f5619l;
        if (zYandex) {
            InterfaceC13922l interfaceC13922l = C16924l.isPro[1];
            Set<C3498l> set = (Set) c2278l2.invoke();
            ArrayList arrayList2 = new ArrayList();
            for (C3498l c3498l : set) {
                if (((Boolean) function1.invoke(c3498l)).booleanValue()) {
                    InterfaceC13922l interfaceC13922l2 = C16924l.isPro[1];
                    arrayList2.addAll(!((Set) c2278l2.invoke()).contains(c3498l) ? c2580l : (Collection) c16924l.purchase.invoke(c3498l));
                }
            }
            AbstractC3826l.Signature(c13617l, arrayList2);
            arrayList.addAll(arrayList2);
        }
        if (c18186l.yandex(C18186l.subs)) {
            InterfaceC13922l interfaceC13922l3 = C16924l.isPro[0];
            Set<C3498l> set2 = (Set) c2278l.invoke();
            ArrayList arrayList3 = new ArrayList();
            for (C3498l c3498l2 : set2) {
                if (((Boolean) function1.invoke(c3498l2)).booleanValue()) {
                    InterfaceC13922l interfaceC13922l4 = C16924l.isPro[0];
                    arrayList3.addAll(!((Set) c2278l.invoke()).contains(c3498l2) ? c2580l : (Collection) c16924l.amazon.invoke(c3498l2));
                }
            }
            AbstractC3826l.Signature(c13617l, arrayList3);
            arrayList.addAll(arrayList3);
        }
        if (c18186l.yandex(C18186l.smaato)) {
            for (C3498l c3498l3 : remoteconfig()) {
                if (((Boolean) function1.invoke(c3498l3)).booleanValue()) {
                    AbstractC3324l.crashlytics(arrayList, (InterfaceC17477l) ((C1683l) ((C0511l) this.loadAd.f15738l).subscription).loadAd.invoke(new C16518l(smaato(c3498l3), null)));
                }
            }
        }
        if (c18186l.yandex(C18186l.mopub)) {
            for (C3498l c3498l4 : c16924l.crashlytics.keySet()) {
                if (((Boolean) function1.invoke(c3498l4)).booleanValue()) {
                    AbstractC3324l.crashlytics(arrayList, (C9522l) c16924l.billing.invoke(c3498l4));
                }
            }
        }
        return AbstractC3324l.amazon(arrayList);
    }

    public abstract Set vip();

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        C16924l c16924l = this.crashlytics;
        C2278l c2278l = c16924l.mopub;
        InterfaceC13922l interfaceC13922l = C16924l.isPro[0];
        return !((Set) c2278l.invoke()).contains(c3498l) ? C2580l.f5619l : (Collection) c16924l.amazon.invoke(c3498l);
    }

    public void firebase(C3498l c3498l, ArrayList arrayList) {
    }

    public void isPro(C3498l c3498l, ArrayList arrayList) {
    }
}
