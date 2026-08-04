package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lًٖٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8031l extends AbstractC6799l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11012l f16720l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8031l(C11012l c11012l) {
        super(c11012l.f22189l);
        this.f16720l = c11012l;
    }

    @Override // defpackage.AbstractC12465l
    public final C1461l amazon() {
        return C1461l.f3652l;
    }

    @Override // defpackage.InterfaceC1925l
    public final List getParameters() {
        return this.f16720l.f22192l;
    }

    @Override // defpackage.AbstractC6799l
    /* JADX INFO: renamed from: isPro */
    public final InterfaceC17477l pro() {
        return this.f16720l;
    }

    @Override // defpackage.AbstractC12465l
    public final Collection loadAd() {
        List<C3624l> listRemoteconfig;
        C11012l c11012l = this.f16720l;
        int i = c11012l.f22187l;
        AbstractC1514l abstractC1514l = c11012l.f22186l;
        C1015l c1015l = C1015l.amazon;
        if (AbstractC8576l.yandex(abstractC1514l, c1015l)) {
            listRemoteconfig = Collections.singletonList(C11012l.f22185l);
        } else if (AbstractC8576l.yandex(abstractC1514l, C0097l.amazon)) {
            listRemoteconfig = AbstractC14055l.remoteconfig(C11012l.f22184l, new C3624l(AbstractC3974l.firebase, c1015l.yandex(i)));
        } else {
            C9392l c9392l = C9392l.amazon;
            if (AbstractC8576l.yandex(abstractC1514l, c9392l)) {
                listRemoteconfig = Collections.singletonList(C11012l.f22185l);
            } else {
                if (!AbstractC8576l.yandex(abstractC1514l, C4988l.amazon)) {
                    int i2 = AbstractC15919l.yandex;
                    C8339l.smaato("should not be called");
                    return null;
                }
                listRemoteconfig = AbstractC14055l.remoteconfig(C11012l.f22184l, new C3624l(AbstractC3974l.billing, c9392l.yandex(i)));
            }
        }
        InterfaceC11865l interfaceC11865lM1422l = ((AbstractC3740l) c11012l.f22191l).m1422l();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listRemoteconfig, 10));
        for (C3624l c3624l : listRemoteconfig) {
            InterfaceC17477l interfaceC17477lAmazon = AbstractC9033l.amazon(interfaceC11865lM1422l, c3624l);
            if (interfaceC17477lAmazon == null) {
                C11983l.isPro(c3624l, " not found", "Built-in class ");
                return null;
            }
            List listM4209break = AbstractC16901l.m4209break(interfaceC17477lAmazon.metrica().getParameters().size(), c11012l.f22192l);
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listM4209break, 10));
            Iterator it = listM4209break.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C10636l(((InterfaceC16902l) it.next()).ad()));
            }
            C16017l.f31395l.getClass();
            arrayList.add(AbstractC3605l.adcel(C16017l.f31394l, interfaceC17477lAmazon, arrayList2));
        }
        return AbstractC16901l.m4213const(arrayList);
    }

    @Override // defpackage.InterfaceC1925l
    public final boolean premium() {
        return true;
    }

    @Override // defpackage.AbstractC6799l, defpackage.InterfaceC1925l
    public final InterfaceC15234l pro() {
        return this.f16720l;
    }

    public final String toString() {
        return this.f16720l.toString();
    }
}
