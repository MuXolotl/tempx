package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l٘ؕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17677l extends AbstractC5662l {
    public final C2312l crashlytics;
    public final InterfaceC11865l loadAd;

    public C17677l(InterfaceC11865l interfaceC11865l, C2312l c2312l) {
        this.loadAd = interfaceC11865l;
        this.crashlytics = c2312l;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Set amazon() {
        return C5746l.f12138l;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        if (c18186l.yandex(C18186l.admob)) {
            C2312l c2312l = this.crashlytics;
            if (!c2312l.yandex.crashlytics() || !c18186l.yandex.contains(C17599l.yandex)) {
                InterfaceC11865l interfaceC11865l = this.loadAd;
                Collection collectionRemoteconfig = interfaceC11865l.remoteconfig(c2312l, function1);
                ArrayList arrayList = new ArrayList(collectionRemoteconfig.size());
                Iterator it = collectionRemoteconfig.iterator();
                while (it.hasNext()) {
                    C3498l c3498lMopub = ((C2312l) it.next()).yandex.mopub();
                    if (((Boolean) function1.invoke(c3498lMopub)).booleanValue()) {
                        C10486l c10486l = null;
                        if (!c3498lMopub.f7383l) {
                            C10486l c10486lMo2270l = interfaceC11865l.mo2270l(c2312l.yandex(c3498lMopub));
                            C2278l c2278l = c10486lMo2270l.f21346l;
                            InterfaceC13922l interfaceC13922l = C10486l.f21345l[1];
                            if (!((Boolean) c2278l.invoke()).booleanValue()) {
                                c10486l = c10486lMo2270l;
                            }
                        }
                        AbstractC3324l.crashlytics(arrayList, c10486l);
                    }
                }
                return arrayList;
            }
        }
        return C2580l.f5619l;
    }

    public final String toString() {
        return "subpackages of " + this.crashlytics + " from " + this.loadAd;
    }
}
