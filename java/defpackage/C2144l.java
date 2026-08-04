package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓ۟ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2144l implements InterfaceC7637l {
    public final Object crashlytics;
    public final /* synthetic */ int loadAd = 1;

    public C2144l(C16412l c16412l, Function0 function0) {
        this.crashlytics = new C2278l(c16412l, new C9429l(1, function0));
    }

    public final InterfaceC7637l admob() {
        return smaato() instanceof C2144l ? ((C2144l) smaato()).admob() : smaato();
    }

    @Override // defpackage.InterfaceC7637l
    public final Set amazon() {
        return smaato().amazon();
    }

    @Override // defpackage.InterfaceC7637l
    public Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        switch (this.loadAd) {
            case 1:
                return AbstractC14905l.crashlytics(firebase(c3498l, enumC11300l), C12844l.f25262l);
            default:
                return firebase(c3498l, enumC11300l);
        }
    }

    @Override // defpackage.InterfaceC7637l
    public Collection crashlytics(C18186l c18186l, Function1 function1) {
        switch (this.loadAd) {
            case 1:
                Collection collectionSubs = subs(c18186l, function1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionSubs) {
                    if (((InterfaceC8371l) obj) instanceof InterfaceC11661l) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return AbstractC16901l.m4232new(AbstractC14905l.crashlytics(arrayList, C12844l.f25257l), arrayList2);
            default:
                return subs(c18186l, function1);
        }
    }

    public final Collection firebase(C3498l c3498l, EnumC11300l enumC11300l) {
        return smaato().billing(c3498l, enumC11300l);
    }

    public final Collection isPro(C3498l c3498l, EnumC11300l enumC11300l) {
        return smaato().yandex(c3498l, enumC11300l);
    }

    @Override // defpackage.InterfaceC7637l
    public final Set loadAd() {
        return smaato().loadAd();
    }

    @Override // defpackage.InterfaceC7637l
    public final Set mopub() {
        return smaato().mopub();
    }

    @Override // defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        return smaato().purchase(c3498l, enumC11300l);
    }

    public final InterfaceC7637l smaato() {
        switch (this.loadAd) {
            case 0:
                return (InterfaceC7637l) ((C2278l) this.crashlytics).invoke();
            default:
                return (InterfaceC7637l) this.crashlytics;
        }
    }

    public final Collection subs(C18186l c18186l, Function1 function1) {
        return smaato().crashlytics(c18186l, function1);
    }

    @Override // defpackage.InterfaceC7637l
    public Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        switch (this.loadAd) {
            case 1:
                return AbstractC14905l.crashlytics(isPro(c3498l, enumC11300l), C12844l.f25279l);
            default:
                return isPro(c3498l, enumC11300l);
        }
    }

    public C2144l(InterfaceC7637l interfaceC7637l) {
        this.crashlytics = interfaceC7637l;
    }
}
