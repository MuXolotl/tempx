package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lؒ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1112l extends AbstractC0061l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2343l f3045l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C4233l f3046l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C2343l f3047l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2343l f3048l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C2343l f3049l;

    public AbstractC1112l(C4233l c4233l) {
        this.f3046l = c4233l;
        AbstractC3124l.loadAd(null, new C6275l(this, 0));
        this.f3045l = AbstractC3124l.loadAd(null, new C6275l(this, 1));
        this.f3048l = AbstractC3124l.loadAd(null, new C6275l(this, 2));
        this.f3047l = AbstractC3124l.loadAd(null, new C6275l(this, 3));
        this.f3049l = AbstractC3124l.loadAd(null, new C6275l(this, 4));
    }

    @Override // defpackage.InterfaceC18672l
    public final List admob() {
        return (List) this.f3045l.invoke();
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public abstract InterfaceC0207l mo818extends();

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final int m819for() {
        C6561l c6561lAdmob = mo818extends().admob();
        C2312l c2312l = AbstractC5592l.yandex;
        if (c6561lAdmob.equals(AbstractC6004l.purchase)) {
            return 1;
        }
        if (c6561lAdmob.equals(AbstractC6004l.crashlytics)) {
            return 2;
        }
        if (c6561lAdmob.equals(AbstractC6004l.amazon)) {
            return 3;
        }
        return (c6561lAdmob.equals(AbstractC6004l.yandex) || c6561lAdmob.equals(AbstractC6004l.loadAd)) ? 4 : 0;
    }

    @Override // defpackage.InterfaceC6902l
    public final List getParameters() {
        return (List) this.f3048l.invoke();
    }

    @Override // defpackage.InterfaceC6902l
    public final List getTypeParameters() {
        return (List) this.f3049l.invoke();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public abstract C5380l mo820private();

    @Override // defpackage.InterfaceC6902l
    public final InterfaceC13012l smaato() {
        return (InterfaceC13012l) this.f3047l.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final ArrayList m821synchronized(boolean z) {
        int i;
        C8195l c8195l;
        Collection collection;
        InterfaceC0207l interfaceC0207lMo818extends = mo818extends();
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        if (z) {
            C7073l c7073lBilling = AbstractC5592l.billing(this);
            if (c7073lBilling != null) {
                arrayList.add(new C2070l(this, arrayList.size(), 1, new C13581l(c7073lBilling, 0)));
            }
            if (interfaceC0207lMo818extends instanceof C4799l) {
                C4799l c4799l = (C4799l) interfaceC0207lMo818extends;
                c8195l = new C8195l(c4799l.f9848l, c4799l.f9847l.f27369l);
            } else if (interfaceC0207lMo818extends instanceof C1689l) {
                C1689l c1689l = (C1689l) interfaceC0207lMo818extends;
                c8195l = new C8195l(c1689l.f4065l, c1689l.f4064l.f25729l);
            } else if (interfaceC0207lMo818extends instanceof InterfaceC10138l) {
                InterfaceC10696l interfaceC10696lM1477l = ((AbstractC4042l) ((InterfaceC10138l) interfaceC0207lMo818extends)).m1477l();
                C1689l c1689l2 = interfaceC10696lM1477l instanceof C1689l ? (C1689l) interfaceC10696lM1477l : null;
                if (c1689l2 != null) {
                    c8195l = new C8195l(c1689l2.f4065l, c1689l2.f4064l.f25729l);
                } else {
                    c8195l = null;
                }
            } else {
                c8195l = null;
            }
            if (c8195l == null) {
                collection = C2580l.f5619l;
            } else {
                InterfaceC3588l interfaceC3588l = (InterfaceC3588l) c8195l.f17098l;
                List list = (List) c8195l.f17097l;
                List listMo1478l = interfaceC0207lMo818extends.mo1478l();
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listMo1478l, 10));
                int i3 = 0;
                for (Object obj : listMo1478l) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC14055l.subscription();
                        throw null;
                    }
                    C7073l c7073l = (C7073l) obj;
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new C17538l(interfaceC0207lMo818extends, null, i3, c7073l.getAnnotations(), C3498l.amazon(interfaceC3588l.getString(((C18426l) list.get(i3)).f35989l)), c7073l.yandex(), false, false, false, null, InterfaceC5706l.f12087l));
                    i2 = i2;
                    arrayList2 = arrayList3;
                    i3 = i4;
                    interfaceC3588l = interfaceC3588l;
                    list = list;
                }
                collection = arrayList2;
            }
            i = i2;
            int size = collection.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(new C2070l(this, arrayList.size(), 2, new C13998l(collection, i5, i)));
            }
            C7073l c7073lMo1479return = interfaceC0207lMo818extends.mo1479return();
            if (c7073lMo1479return != null) {
                arrayList.add(new C2070l(this, arrayList.size(), 3, new C13581l(c7073lMo1479return, i)));
            }
        } else {
            i = 1;
        }
        int size2 = interfaceC0207lMo818extends.mo1007finally().size();
        for (int i6 = 0; i6 < size2; i6++) {
            arrayList.add(new C2070l(this, arrayList.size(), 4, new C13998l(interfaceC0207lMo818extends, i6, 2)));
        }
        if (AbstractC7572l.mopub(this) && (interfaceC0207lMo818extends instanceof InterfaceC8731l) && arrayList.size() > i) {
            AbstractC3826l.Signature(new C13617l(19), arrayList);
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public abstract AbstractC1112l mo822throw(C4233l c4233l);

    @Override // defpackage.InterfaceC6902l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final boolean mo823volatile() {
        int iStartapp = this.f3046l.crashlytics;
        if (iStartapp == 0) {
            iStartapp = mo818extends().startapp();
        }
        return iStartapp == 4;
    }
}
