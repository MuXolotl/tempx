package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌؓۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1727l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C1682l f4121l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f4122l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f4123l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1727l(C1682l c1682l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f4122l = i;
        this.f4121l = c1682l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f4122l;
        C1682l c1682l = this.f4121l;
        C3278l c3278l = (C3278l) this.f4123l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                List list = c3278l.f7017l;
                HashSet hashSet = new HashSet();
                ArrayList<C1682l> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (hashSet.add(((C1682l) obj2).f4048l)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                boolean z = false;
                for (C1682l c1682l2 : arrayList) {
                    if (AbstractC8576l.yandex(c1682l2.f4048l, c1682l.f4048l)) {
                        z = true;
                        c1682l2 = c1682l;
                    }
                    arrayList2.add(c1682l2);
                }
                if (!z) {
                    arrayList2 = AbstractC16901l.m4218final(c1682l, arrayList2);
                }
                return C3278l.loadAd(c3278l, false, null, arrayList2, false, 251);
            default:
                AbstractC2829l.crashlytics(obj);
                boolean zYandex = AbstractC8576l.yandex(c1682l.f4048l, c3278l.f7018l);
                List list2 = c3278l.f7017l;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!AbstractC8576l.yandex(((C1682l) obj3).f4048l, c1682l.f4048l)) {
                        arrayList3.add(obj3);
                    }
                }
                return C3278l.loadAd(c3278l, false, zYandex ? "" : c3278l.f7018l, arrayList3, false, 249);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f4122l) {
            case 0:
                C1727l c1727l = new C1727l(this.f4121l, interfaceC14029l, 0);
                c1727l.f4123l = obj;
                return c1727l;
            default:
                C1727l c1727l2 = new C1727l(this.f4121l, interfaceC14029l, 1);
                c1727l2.f4123l = obj;
                return c1727l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3278l c3278l = (C3278l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f4122l) {
            case 0:
                break;
        }
        return ((C1727l) ads(interfaceC14029l, c3278l)).Signature(Unit.INSTANCE);
    }
}
