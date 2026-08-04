package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lٍؚۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7162l implements InterfaceC15984l {
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C7162l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // defpackage.InterfaceC15984l
    public final void onError(Throwable th) {
        switch (this.yandex) {
            case 0:
                C2112l c2112l = (C2112l) this.loadAd;
                if (c2112l.smaato.get()) {
                    AbstractC5088l.amazon("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
                    C15855l c15855l = c2112l.admob;
                    if (c15855l != null) {
                        c15855l.mopub();
                    }
                    break;
                }
                break;
            case 1:
                AbstractC5088l.amazon("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
                break;
            default:
                AbstractC5088l.Signature("VideoCapture", "Receive onError from StreamState observer", th);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [lؙٟۥ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [lّؔۜ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC15984l
    public final void yandex(Object obj) {
        C2112l c2112l;
        ?? r2;
        C2974l c2974l;
        C6921l c6921l;
        ?? arrayList;
        switch (this.yandex) {
            case 0:
                List list = (List) obj;
                if (!((C2112l) this.loadAd).smaato.get() || (r2 = (c2112l = (C2112l) this.loadAd).billing) == 0 || (c2974l = c2112l.mopub) == null || (c6921l = c2112l.subs) == null) {
                    return;
                }
                if (list != null) {
                    arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C12130l) it.next()).yandex());
                    }
                } else {
                    arrayList = C2580l.f5619l;
                }
                if (r2 instanceof C6655l) {
                    try {
                        List list2 = ((C2112l) this.loadAd).firebase;
                        Iterable iterableM4213const = r2.isPro.get() ? C2580l.f5619l : AbstractC16901l.m4213const(r2.yandex(arrayList));
                        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(iterableM4213const, 10));
                        Iterator it2 = iterableM4213const.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(C12371l.crashlytics((String) it2.next(), null, null));
                        }
                        Set setPurchase = AbstractC9905l.purchase(AbstractC16901l.m4229l(list2), AbstractC16901l.m4229l(arrayList2));
                        if (!setPurchase.isEmpty() && c6921l.smaato(c2974l.amazon(), setPurchase)) {
                            AbstractC5088l.tapsense("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                            return;
                        }
                    } catch (Exception e) {
                        AbstractC5088l.Signature("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e);
                    }
                }
                try {
                    r2.amazon(arrayList);
                    Set setLoadAd = r2.loadAd();
                    ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(setLoadAd, 10));
                    Iterator it3 = setLoadAd.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(C12371l.crashlytics((String) it3.next(), null, null));
                    }
                    if (arrayList3.equals(((C2112l) this.loadAd).firebase)) {
                        return;
                    }
                    C2112l c2112l2 = (C2112l) this.loadAd;
                    List listM4213const = AbstractC16901l.m4213const(c2112l2.firebase);
                    if (arrayList3.equals(listM4213const)) {
                        return;
                    }
                    synchronized (c2112l2.amazon) {
                        try {
                            if (c2112l2.purchase != null) {
                                AbstractC5088l.yandex("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                                c2112l2.purchase.cancel(false);
                                c2112l2.purchase = null;
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Set setM4229l = AbstractC16901l.m4229l(listM4213const);
                    Set setM4229l2 = AbstractC16901l.m4229l(arrayList3);
                    Set setPurchase2 = AbstractC9905l.purchase(setM4229l2, setM4229l);
                    Set setPurchase3 = AbstractC9905l.purchase(setM4229l, setM4229l2);
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((C12130l) it4.next()).yandex());
                    }
                    try {
                        Iterator it5 = setPurchase3.iterator();
                        while (it5.hasNext()) {
                            c2112l2.amazon(((C12130l) it5.next()).yandex());
                        }
                        C2974l c2974l2 = c2112l2.mopub;
                        if (c2974l2 != null) {
                            AbstractC5088l.yandex("CameraPresencePrvdr", "Updating CameraRepository...");
                            c2974l2.yandex(arrayList5);
                            arrayList4.add(c2974l2);
                            AbstractC5088l.yandex("CameraPresencePrvdr", "CameraRepository updated successfully.");
                        }
                        if (!c2112l2.remoteconfig.isEmpty()) {
                            AbstractC5088l.yandex("CameraPresencePrvdr", "Updating " + c2112l2.remoteconfig.size() + " dependent listeners...");
                            for (InterfaceC9289l interfaceC9289l : c2112l2.remoteconfig) {
                                interfaceC9289l.yandex(arrayList5);
                                arrayList4.add(interfaceC9289l);
                            }
                        }
                        c2112l2.firebase = arrayList3;
                        Iterator it6 = setPurchase2.iterator();
                        while (it6.hasNext()) {
                            c2112l2.loadAd(((C12130l) it6.next()).yandex());
                        }
                        c2112l2.crashlytics(setPurchase2, setPurchase3);
                        return;
                    } catch (Exception e2) {
                        AbstractC5088l.amazon("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e2);
                        ArrayList arrayList6 = new ArrayList(AbstractC14055l.billing(listM4213const, 10));
                        Iterator it7 = listM4213const.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(((C12130l) it7.next()).yandex());
                        }
                        Iterator it8 = new C3862l(arrayList4).iterator();
                        while (true) {
                            C8772l c8772l = (C8772l) it8;
                            if (!((ListIterator) c8772l.f18067l).hasPrevious()) {
                                Iterator it9 = setPurchase3.iterator();
                                while (it9.hasNext()) {
                                    c2112l2.loadAd(((C12130l) it9.next()).yandex());
                                }
                                Iterator it10 = setPurchase2.iterator();
                                while (it10.hasNext()) {
                                    c2112l2.amazon(((C12130l) it10.next()).yandex());
                                }
                                return;
                            }
                            InterfaceC9289l interfaceC9289l2 = (InterfaceC9289l) ((ListIterator) c8772l.f18067l).previous();
                            try {
                                interfaceC9289l2.yandex(arrayList6);
                            } catch (Exception e3) {
                                AbstractC5088l.amazon("CameraPresencePrvdr", "Failed to rollback listener: " + interfaceC9289l2, e3);
                            }
                        }
                    }
                } catch (Exception e4) {
                    AbstractC5088l.Signature("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e4);
                    return;
                }
                break;
            case 1:
                ((InterfaceC13241l) this.loadAd).accept(obj);
                return;
            default:
                C13629l c13629l = (C13629l) obj;
                C10418l c10418l = (C10418l) this.loadAd;
                if (c13629l == null) {
                    C8339l.metrica("StreamInfo can't be null");
                    return;
                }
                int i = c13629l.yandex;
                if (c10418l.advert == 3) {
                    return;
                }
                AbstractC5088l.yandex("VideoCapture", "Stream info update: old: " + c10418l.Signature + " new: " + c13629l);
                C13629l c13629l2 = c10418l.Signature;
                c10418l.Signature = c13629l;
                C5464l c5464l = c10418l.subs;
                c5464l.getClass();
                int i2 = c13629l2.yandex;
                Set set = C13629l.amazon;
                if (!set.contains(Integer.valueOf(i2)) && !set.contains(Integer.valueOf(i)) && i2 != i) {
                    c10418l.m2918else();
                    return;
                }
                int i3 = c13629l2.yandex;
                if ((i3 != -1 && i == -1) || (i3 == -1 && i != -1)) {
                    c10418l.m2925volatile(c10418l.license, c13629l, c5464l);
                    Object[] objArr = {c10418l.license.crashlytics()};
                    ArrayList arrayList7 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList7.add(obj2);
                    c10418l.m2081throws(DesugarCollections.unmodifiableList(arrayList7));
                    c10418l.adcel();
                    return;
                }
                if (c13629l2.loadAd != c13629l.loadAd) {
                    c10418l.m2925volatile(c10418l.license, c13629l, c5464l);
                    Object[] objArr2 = {c10418l.license.crashlytics()};
                    ArrayList arrayList8 = new ArrayList(1);
                    Object obj3 = objArr2[0];
                    Objects.requireNonNull(obj3);
                    arrayList8.add(obj3);
                    c10418l.m2081throws(DesugarCollections.unmodifiableList(arrayList8));
                    Iterator it11 = c10418l.yandex.iterator();
                    while (it11.hasNext()) {
                        ((InterfaceC8927l) it11.next()).mopub(c10418l);
                    }
                    return;
                }
                return;
        }
    }
}
