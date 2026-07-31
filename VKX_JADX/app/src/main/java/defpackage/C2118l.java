package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؓۛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2118l extends AbstractC10453l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f4751l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C7502l f4752l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayList f4753l;

    public C2118l(String str, ArrayList arrayList, List list, C7502l c7502l) {
        super(str);
        this.f4751l = new ArrayList();
        this.f4752l = c7502l;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f4751l.add(((InterfaceC2167l) it.next()).mopub());
            }
        }
        this.f4753l = new ArrayList(list);
    }

    @Override // defpackage.AbstractC10453l, defpackage.InterfaceC2167l
    public final InterfaceC2167l metrica() {
        return new C2118l(this);
    }

    @Override // defpackage.AbstractC10453l
    public final InterfaceC2167l yandex(C7502l c7502l, List list) {
        C10910l c10910l;
        C7502l c7502lIsPro = this.f4752l.isPro();
        C17516l c17516l = (C17516l) c7502lIsPro.f15510l;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4751l;
            int size = arrayList.size();
            c10910l = InterfaceC2167l.f4805l;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                c7502lIsPro.remoteconfig((String) arrayList.get(i), ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) list.get(i)));
            } else {
                c7502lIsPro.remoteconfig((String) arrayList.get(i), c10910l);
            }
            i++;
        }
        for (InterfaceC2167l interfaceC2167l : this.f4753l) {
            InterfaceC2167l interfaceC2167lPurchase = c17516l.purchase(c7502lIsPro, interfaceC2167l);
            if (interfaceC2167lPurchase instanceof C15537l) {
                interfaceC2167lPurchase = c17516l.purchase(c7502lIsPro, interfaceC2167l);
            }
            if (interfaceC2167lPurchase instanceof C11926l) {
                return ((C11926l) interfaceC2167lPurchase).f23780l;
            }
        }
        return c10910l;
    }

    public C2118l(C2118l c2118l) {
        super(c2118l.f21269l);
        ArrayList arrayList = new ArrayList(c2118l.f4751l.size());
        this.f4751l = arrayList;
        arrayList.addAll(c2118l.f4751l);
        ArrayList arrayList2 = new ArrayList(c2118l.f4753l.size());
        this.f4753l = arrayList2;
        arrayList2.addAll(c2118l.f4753l);
        this.f4752l = c2118l.f4752l;
    }
}
