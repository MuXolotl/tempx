package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٕؓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15409l extends AbstractC10453l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f30110l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C8570l f30111l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f30112l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15409l(C8570l c8570l, boolean z, boolean z2) {
        super("log");
        this.f30111l = c8570l;
        this.f30110l = z;
        this.f30112l = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // defpackage.AbstractC10453l
    public final InterfaceC2167l yandex(C7502l c7502l, List list) {
        int i;
        int i2;
        String strMopub;
        ArrayList arrayList;
        AbstractC13831l.billing(1, "log", list);
        int size = list.size();
        C10910l c10910l = InterfaceC2167l.f4805l;
        C8570l c8570l = this.f30111l;
        if (size == 1) {
            ((C18675l) c8570l.f17681l).isPro(3, ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) list.get(0)).mopub(), Collections.EMPTY_LIST, this.f30110l, this.f30112l);
            return c10910l;
        }
        InterfaceC2167l interfaceC2167l = (InterfaceC2167l) list.get(0);
        C17516l c17516l = (C17516l) c7502l.f15510l;
        C17516l c17516l2 = (C17516l) c7502l.f15510l;
        int iFirebase = AbstractC13831l.firebase(c17516l.purchase(c7502l, interfaceC2167l).remoteconfig().doubleValue());
        if (iFirebase != 2) {
            i = 3;
            if (iFirebase == 3) {
                i2 = 1;
            } else if (iFirebase == 5) {
                i2 = 5;
            } else if (iFirebase == 6) {
                i2 = 2;
            }
            strMopub = c17516l2.purchase(c7502l, (InterfaceC2167l) list.get(1)).mopub();
            if (list.size() == 2) {
                ((C18675l) c8570l.f17681l).isPro(i2, strMopub, Collections.EMPTY_LIST, this.f30110l, this.f30112l);
                return c10910l;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(c17516l2.purchase(c7502l, (InterfaceC2167l) list.get(i3)).mopub());
            }
            ((C18675l) c8570l.f17681l).isPro(i2, strMopub, arrayList, this.f30110l, this.f30112l);
            return c10910l;
        }
        i = 4;
        i2 = i;
        strMopub = c17516l2.purchase(c7502l, (InterfaceC2167l) list.get(1)).mopub();
        if (list.size() == 2) {
            ((C18675l) c8570l.f17681l).isPro(i2, strMopub, Collections.EMPTY_LIST, this.f30110l, this.f30112l);
            return c10910l;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(c17516l2.purchase(c7502l, (InterfaceC2167l) list.get(i3)).mopub());
        }
        ((C18675l) c8570l.f17681l).isPro(i2, strMopub, arrayList, this.f30110l, this.f30112l);
        return c10910l;
    }
}
