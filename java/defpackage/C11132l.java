package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُٙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11132l implements InterfaceC7637l {
    public static final /* synthetic */ InterfaceC13922l[] billing = {new C0544l(C11132l.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    public final C7676l amazon;
    public final C16760l crashlytics;
    public final C10038l loadAd;
    public final C2278l purchase;

    public C11132l(C10038l c10038l, C1553l c1553l, C16760l c16760l) {
        this.loadAd = c10038l;
        this.crashlytics = c16760l;
        this.amazon = new C7676l(c10038l, c1553l, c16760l);
        C16412l c16412l = ((C7757l) c10038l.f20463l).yandex;
        C7646l c7646l = new C7646l(26, this);
        c16412l.getClass();
        this.purchase = new C2278l(c16412l, c7646l);
    }

    public final InterfaceC7637l[] admob() {
        InterfaceC13922l interfaceC13922l = billing[0];
        return (InterfaceC7637l[]) this.purchase.invoke();
    }

    @Override // defpackage.InterfaceC7637l
    public final Set amazon() {
        InterfaceC7637l[] interfaceC7637lArrAdmob = admob();
        HashSet hashSetLoadAd = AbstractC17780l.loadAd(interfaceC7637lArrAdmob.length == 0 ? C2580l.f5619l : new C14297l(0, interfaceC7637lArrAdmob));
        if (hashSetLoadAd == null) {
            return null;
        }
        hashSetLoadAd.addAll(this.amazon.amazon());
        return hashSetLoadAd;
    }

    @Override // defpackage.InterfaceC7637l
    public final Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        String str = this.crashlytics.f7826l.yandex.yandex;
        c3498l.loadAd();
        InterfaceC7637l[] interfaceC7637lArrAdmob = admob();
        this.amazon.getClass();
        Collection collectionAmazon = C2580l.f5619l;
        for (InterfaceC7637l interfaceC7637l : interfaceC7637lArrAdmob) {
            collectionAmazon = AbstractC4654l.amazon(collectionAmazon, interfaceC7637l.billing(c3498l, enumC11300l));
        }
        return collectionAmazon == null ? C5746l.f12138l : collectionAmazon;
    }

    @Override // defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        InterfaceC7637l[] interfaceC7637lArrAdmob = admob();
        Collection collectionCrashlytics = this.amazon.crashlytics(c18186l, function1);
        for (InterfaceC7637l interfaceC7637l : interfaceC7637lArrAdmob) {
            collectionCrashlytics = AbstractC4654l.amazon(collectionCrashlytics, interfaceC7637l.crashlytics(c18186l, function1));
        }
        return collectionCrashlytics == null ? C5746l.f12138l : collectionCrashlytics;
    }

    @Override // defpackage.InterfaceC7637l
    public final Set loadAd() {
        InterfaceC7637l[] interfaceC7637lArrAdmob = admob();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7637l interfaceC7637l : interfaceC7637lArrAdmob) {
            AbstractC3984l.license(linkedHashSet, interfaceC7637l.loadAd());
        }
        linkedHashSet.addAll(this.amazon.loadAd());
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC7637l
    public final Set mopub() {
        InterfaceC7637l[] interfaceC7637lArrAdmob = admob();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7637l interfaceC7637l : interfaceC7637lArrAdmob) {
            AbstractC3984l.license(linkedHashSet, interfaceC7637l.mopub());
        }
        linkedHashSet.addAll(this.amazon.mopub());
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        String str = this.crashlytics.f7826l.yandex.yandex;
        c3498l.loadAd();
        InterfaceC15234l interfaceC15234l = null;
        InterfaceC17477l interfaceC17477lLicense = this.amazon.license(c3498l, null);
        if (interfaceC17477lLicense != null) {
            return interfaceC17477lLicense;
        }
        for (InterfaceC7637l interfaceC7637l : admob()) {
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
        return "scope for " + this.crashlytics;
    }

    @Override // defpackage.InterfaceC7637l
    public final Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        String str = this.crashlytics.f7826l.yandex.yandex;
        c3498l.loadAd();
        InterfaceC7637l[] interfaceC7637lArrAdmob = admob();
        Collection collectionYandex = this.amazon.yandex(c3498l, enumC11300l);
        for (InterfaceC7637l interfaceC7637l : interfaceC7637lArrAdmob) {
            collectionYandex = AbstractC4654l.amazon(collectionYandex, interfaceC7637l.yandex(c3498l, enumC11300l));
        }
        return collectionYandex == null ? C5746l.f12138l : collectionYandex;
    }
}
