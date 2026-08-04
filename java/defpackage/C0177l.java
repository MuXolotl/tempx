package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚؑ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0177l extends AbstractC5662l {
    public final InterfaceC7637l loadAd;

    public C0177l(InterfaceC7637l interfaceC7637l) {
        this.loadAd = interfaceC7637l;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set amazon() {
        return this.loadAd.amazon();
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        int i = C18186l.smaato & c18186l.loadAd;
        C18186l c18186l2 = i == 0 ? null : new C18186l(i, c18186l.yandex);
        if (c18186l2 == null) {
            return C2580l.f5619l;
        }
        Collection collectionCrashlytics = this.loadAd.crashlytics(c18186l2, function1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionCrashlytics) {
            if (obj instanceof InterfaceC10607l) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set loadAd() {
        return this.loadAd.loadAd();
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set mopub() {
        return this.loadAd.mopub();
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        InterfaceC15234l interfaceC15234lPurchase = this.loadAd.purchase(c3498l, enumC11300l);
        if (interfaceC15234lPurchase != null) {
            InterfaceC17477l interfaceC17477l = interfaceC15234lPurchase instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPurchase : null;
            if (interfaceC17477l != null) {
                return interfaceC17477l;
            }
            if (interfaceC15234lPurchase instanceof C9522l) {
                return (C9522l) interfaceC15234lPurchase;
            }
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.loadAd;
    }
}
