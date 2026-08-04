package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑؖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0116l implements InterfaceC7637l {
    public final InterfaceC7637l[] crashlytics;
    public final String loadAd;

    public C0116l(String str, InterfaceC7637l[] interfaceC7637lArr) {
        this.loadAd = str;
        this.crashlytics = interfaceC7637lArr;
    }

    @Override // defpackage.InterfaceC7637l
    public final Set amazon() {
        InterfaceC7637l[] interfaceC7637lArr = this.crashlytics;
        return AbstractC17780l.loadAd(interfaceC7637lArr.length == 0 ? C2580l.f5619l : new C14297l(0, interfaceC7637lArr));
    }

    @Override // defpackage.InterfaceC7637l
    public final Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        InterfaceC7637l[] interfaceC7637lArr = this.crashlytics;
        int length = interfaceC7637lArr.length;
        if (length == 0) {
            return C2580l.f5619l;
        }
        if (length == 1) {
            return interfaceC7637lArr[0].billing(c3498l, enumC11300l);
        }
        Collection collectionAmazon = null;
        for (InterfaceC7637l interfaceC7637l : interfaceC7637lArr) {
            collectionAmazon = AbstractC4654l.amazon(collectionAmazon, interfaceC7637l.billing(c3498l, enumC11300l));
        }
        return collectionAmazon == null ? C5746l.f12138l : collectionAmazon;
    }

    @Override // defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        InterfaceC7637l[] interfaceC7637lArr = this.crashlytics;
        int length = interfaceC7637lArr.length;
        if (length == 0) {
            return C2580l.f5619l;
        }
        if (length == 1) {
            return interfaceC7637lArr[0].crashlytics(c18186l, function1);
        }
        Collection collectionAmazon = null;
        for (InterfaceC7637l interfaceC7637l : interfaceC7637lArr) {
            collectionAmazon = AbstractC4654l.amazon(collectionAmazon, interfaceC7637l.crashlytics(c18186l, function1));
        }
        return collectionAmazon == null ? C5746l.f12138l : collectionAmazon;
    }

    @Override // defpackage.InterfaceC7637l
    public final Set loadAd() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7637l interfaceC7637l : this.crashlytics) {
            AbstractC3984l.license(linkedHashSet, interfaceC7637l.loadAd());
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC7637l
    public final Set mopub() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7637l interfaceC7637l : this.crashlytics) {
            AbstractC3984l.license(linkedHashSet, interfaceC7637l.mopub());
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        InterfaceC15234l interfaceC15234l = null;
        for (InterfaceC7637l interfaceC7637l : this.crashlytics) {
            InterfaceC15234l interfaceC15234lPurchase = interfaceC7637l.purchase(c3498l, enumC11300l);
            if (interfaceC15234lPurchase != null) {
                if (!(interfaceC15234lPurchase instanceof InterfaceC10607l) || !((InterfaceC5436l) interfaceC15234lPurchase).mo750case()) {
                    return interfaceC15234lPurchase;
                }
                if (interfaceC15234l == null) {
                    interfaceC15234l = interfaceC15234lPurchase;
                }
            }
        }
        return interfaceC15234l;
    }

    public final String toString() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC7637l
    public final Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        InterfaceC7637l[] interfaceC7637lArr = this.crashlytics;
        int length = interfaceC7637lArr.length;
        if (length == 0) {
            return C2580l.f5619l;
        }
        if (length == 1) {
            return interfaceC7637lArr[0].yandex(c3498l, enumC11300l);
        }
        Collection collectionAmazon = null;
        for (InterfaceC7637l interfaceC7637l : interfaceC7637lArr) {
            collectionAmazon = AbstractC4654l.amazon(collectionAmazon, interfaceC7637l.yandex(c3498l, enumC11300l));
        }
        return collectionAmazon == null ? C5746l.f12138l : collectionAmazon;
    }
}
