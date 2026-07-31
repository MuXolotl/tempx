package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lْؒٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1024l extends C17134l {
    public C1024l(InterfaceC8371l interfaceC8371l, C1024l c1024l, int i, boolean z) {
        super(interfaceC8371l, c1024l, C2782l.f6058l, AbstractC2526l.mopub, i, InterfaceC5706l.f12087l);
        this.f20730l = true;
        this.f20710l = z;
        this.f20733l = false;
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC4884l
    /* JADX INFO: renamed from: interface */
    public final boolean mo679interface() {
        return false;
    }

    @Override // defpackage.C17134l, defpackage.AbstractC10175l
    /* JADX INFO: renamed from: lؖٔؓ */
    public final AbstractC10175l mo680l(int i, InterfaceC3841l interfaceC3841l, InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        return new C1024l(interfaceC8371l, (C1024l) interfaceC4884l, i, this.f20710l);
    }

    @Override // defpackage.AbstractC10175l
    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final AbstractC10175l mo768l(C18220l c18220l) {
        C3498l c3498l;
        C1024l c1024l = (C1024l) super.mo768l(c18220l);
        if (c1024l == null) {
            return null;
        }
        List listMo1007finally = c1024l.mo1007finally();
        if (listMo1007finally.isEmpty()) {
            return c1024l;
        }
        Iterator it = listMo1007finally.iterator();
        while (it.hasNext()) {
            if (AbstractC10000l.purchase(((C17538l) it.next()).yandex()) != null) {
                List listMo1007finally2 = c1024l.mo1007finally();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listMo1007finally2, 10));
                Iterator it2 = listMo1007finally2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(AbstractC10000l.purchase(((C17538l) it2.next()).yandex()));
                }
                int size = c1024l.mo1007finally().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    ArrayList<C8195l> arrayListM4226l = AbstractC16901l.m4226l(c1024l.mo1007finally(), arrayList);
                    if (arrayListM4226l.isEmpty()) {
                        return c1024l;
                    }
                    for (C8195l c8195l : arrayListM4226l) {
                        if (!AbstractC8576l.yandex((C3498l) c8195l.f17098l, ((C17538l) c8195l.f17097l).getName())) {
                        }
                    }
                    return c1024l;
                }
                List<C17538l> listMo1007finally3 = c1024l.mo1007finally();
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listMo1007finally3, 10));
                for (C17538l c17538l : listMo1007finally3) {
                    C3498l name = c17538l.getName();
                    int i = c17538l.f34146l;
                    int i2 = i - size;
                    if (i2 >= 0 && (c3498l = (C3498l) arrayList.get(i2)) != null) {
                        name = c3498l;
                    }
                    arrayList2.add(c17538l.mo645l(c1024l, name, i));
                }
                C18220l c18220lM2898l = c1024l.m2898l(C2201l.loadAd);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((C3498l) it3.next()) == null) {
                        }
                    }
                    z = false;
                }
                c18220lM2898l.f35667l = Boolean.valueOf(z);
                c18220lM2898l.f35670l = arrayList2;
                c18220lM2898l.f35682l = c1024l.loadAd();
                return super.mo768l(c18220lM2898l);
            }
        }
        return c1024l;
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC4884l
    public final boolean purchase() {
        return false;
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC5436l
    public final boolean vip() {
        return false;
    }
}
