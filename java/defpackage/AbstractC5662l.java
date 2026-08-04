package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘْۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5662l implements InterfaceC7637l {
    @Override // defpackage.InterfaceC7637l
    public Set amazon() {
        return null;
    }

    @Override // defpackage.InterfaceC7637l
    public Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC7637l
    public Collection crashlytics(C18186l c18186l, Function1 function1) {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC7637l
    public Set loadAd() {
        Collection collectionCrashlytics = crashlytics(C18186l.startapp, C2100l.f4706l);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionCrashlytics) {
            if (obj instanceof C17134l) {
                linkedHashSet.add(((C17134l) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC7637l
    public Set mopub() {
        Collection collectionCrashlytics = crashlytics(C18186l.adcel, C2100l.f4706l);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionCrashlytics) {
            if (obj instanceof C17134l) {
                linkedHashSet.add(((C17134l) obj).getName());
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC7637l
    public InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        return null;
    }

    @Override // defpackage.InterfaceC7637l
    public Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        return C2580l.f5619l;
    }
}
