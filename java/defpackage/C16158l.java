package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٌٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16158l extends AbstractC5534l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C16765l f31650l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C10038l f31651l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16158l(C10038l c10038l, C16765l c16765l, int i, InterfaceC10233l interfaceC10233l) {
        C7757l c7757l = (C7757l) c10038l.f20463l;
        super(c7757l.yandex, interfaceC10233l, new C12544l(c10038l, c16765l, false), C3498l.purchase(c16765l.yandex.getName()), 1, false, i, c7757l.remoteconfig);
        this.f31651l = c10038l;
        this.f31650l = c16765l;
    }

    @Override // defpackage.AbstractC15719l
    /* JADX INFO: renamed from: lؖٙؖ */
    public final List mo3513l() {
        Type[] bounds = this.f31650l.yandex.getBounds();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C5637l(type));
        }
        C5637l c5637l = (C5637l) AbstractC16901l.m4236public(arrayList);
        Collection collection = arrayList;
        if (AbstractC8576l.yandex(c5637l != null ? c5637l.yandex : null, Object.class)) {
            collection = C2580l.f5619l;
        }
        boolean zIsEmpty = collection.isEmpty();
        C10038l c10038l = this.f31651l;
        if (zIsEmpty) {
            return Collections.singletonList(AbstractC3605l.subs(((C7757l) c10038l.f20463l).metrica.subs().purchase(), ((C7757l) c10038l.f20463l).metrica.subs().metrica()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C18449l) c10038l.f20465l).m4556this((C5637l) it.next(), AbstractC1135l.purchase(2, false, this, 3)));
        }
        return arrayList2;
    }

    @Override // defpackage.AbstractC15719l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final List mo4107l(List list) {
        C16158l c16158l;
        C9912l c9912l;
        AbstractC18041l abstractC18041l;
        AbstractC18041l abstractC18041lSubs;
        C10038l c10038l = this.f31651l;
        C9912l c9912l2 = ((C7757l) c10038l.f20463l).ads;
        c9912l2.getClass();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC18041l abstractC18041l2 = (AbstractC18041l) it.next();
            if (AbstractC12008l.crashlytics(abstractC18041l2, C12844l.f25273l, null)) {
                c16158l = this;
                c9912l = c9912l2;
                abstractC18041l = abstractC18041l2;
            } else {
                c16158l = this;
                c9912l = c9912l2;
                abstractC18041l = abstractC18041l2;
                abstractC18041lSubs = c9912l.subs(new C4619l((InterfaceC2853l) c16158l, false, c10038l, EnumC7061l.TYPE_PARAMETER_BOUNDS, false), abstractC18041l, C2580l.f5619l, null, false);
                if (abstractC18041lSubs == null) {
                }
                arrayList.add(abstractC18041lSubs);
                this = c16158l;
                c9912l2 = c9912l;
            }
            abstractC18041lSubs = abstractC18041l;
            arrayList.add(abstractC18041lSubs);
            this = c16158l;
            c9912l2 = c9912l;
        }
        return arrayList;
    }
}
