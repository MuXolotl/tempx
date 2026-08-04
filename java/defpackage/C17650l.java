package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ؓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17650l implements InterfaceC7637l {
    public HashMap amazon;
    public final C2201l crashlytics;
    public final InterfaceC7637l loadAd;
    public final C8688l purchase = new C8688l(new C8467l(12, this));

    public C17650l(InterfaceC7637l interfaceC7637l, C2201l c2201l) {
        this.loadAd = interfaceC7637l;
        this.crashlytics = new C2201l(AbstractC7310l.vip(c2201l.yandex));
    }

    public final InterfaceC8371l admob(InterfaceC8371l interfaceC8371l) {
        C2201l c2201l = this.crashlytics;
        if (c2201l.yandex.purchase()) {
            return interfaceC8371l;
        }
        if (this.amazon == null) {
            this.amazon = new HashMap();
        }
        HashMap map = this.amazon;
        Object objIsPro = map.get(interfaceC8371l);
        if (objIsPro == null) {
            if (!(interfaceC8371l instanceof InterfaceC10900l)) {
                C17132l.metrica(interfaceC8371l, "Unknown descriptor in scope: ");
                return null;
            }
            objIsPro = ((InterfaceC10900l) interfaceC8371l).isPro(c2201l);
            if (objIsPro == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC8371l + " substitution fails");
            }
            map.put(interfaceC8371l, objIsPro);
        }
        return (InterfaceC8371l) objIsPro;
    }

    @Override // defpackage.InterfaceC7637l
    public final Set amazon() {
        return this.loadAd.amazon();
    }

    @Override // defpackage.InterfaceC7637l
    public final Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        return subs(this.loadAd.billing(c3498l, enumC11300l));
    }

    @Override // defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        return (Collection) this.purchase.getValue();
    }

    @Override // defpackage.InterfaceC7637l
    public final Set loadAd() {
        return this.loadAd.loadAd();
    }

    @Override // defpackage.InterfaceC7637l
    public final Set mopub() {
        return this.loadAd.mopub();
    }

    @Override // defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        InterfaceC15234l interfaceC15234lPurchase = this.loadAd.purchase(c3498l, enumC11300l);
        if (interfaceC15234lPurchase != null) {
            return (InterfaceC15234l) admob(interfaceC15234lPurchase);
        }
        return null;
    }

    public final Collection subs(Collection collection) {
        if (this.crashlytics.yandex.purchase() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(admob((InterfaceC8371l) it.next()));
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC7637l
    public final Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        return subs(this.loadAd.yandex(c3498l, enumC11300l));
    }
}
