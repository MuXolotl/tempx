package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٌۧ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9211l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Set f18953l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f18954l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f18955l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9211l(Set set, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f18954l = i;
        this.f18953l = set;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f18954l;
        Set set = this.f18953l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C16221l c16221l = (C16221l) this.f18955l;
                Set set2 = (Set) c16221l.crashlytics(C12183l.mopub);
                if (set2 == null) {
                    return c16221l;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set2) {
                    if (!set.contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return c16221l;
                }
                C16221l c16221lPurchase = c16221l.purchase();
                c16221lPurchase.amazon(C12183l.mopub, AbstractC9905l.purchase(set2, arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C16033l c16033lLoadAd = C3067l.loadAd(C12183l.amazon, (String) it.next());
                    c16221lPurchase.loadAd();
                    c16221lPurchase.yandex.remove(c16033lLoadAd);
                }
                return c16221lPurchase.billing();
            default:
                C16221l c16221l2 = (C16221l) this.f18955l;
                AbstractC2829l.crashlytics(obj);
                Set setKeySet = c16221l2.yandex().keySet();
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(setKeySet, 10));
                Iterator it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C16033l) it2.next()).yandex);
                }
                boolean z = true;
                if (set != AbstractC13430l.yandex) {
                    Set set3 = set;
                    if ((set3 instanceof Collection) && set3.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it3 = set3.iterator();
                        while (it3.hasNext()) {
                            if (!arrayList2.contains((String) it3.next())) {
                            }
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f18954l;
        Set set = this.f18953l;
        switch (i) {
            case 0:
                C9211l c9211l = new C9211l(set, interfaceC14029l, 0);
                c9211l.f18955l = obj;
                return c9211l;
            default:
                C9211l c9211l2 = new C9211l(set, interfaceC14029l, 1);
                c9211l2.f18955l = obj;
                return c9211l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C16221l c16221l = (C16221l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f18954l) {
            case 0:
                break;
        }
        return ((C9211l) ads(interfaceC14029l, c16221l)).Signature(Unit.INSTANCE);
    }
}
