package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙؚۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7676l extends AbstractC8168l {
    public final C18028l adcel;
    public final C16760l metrica;
    public final C9004l startapp;
    public final C1553l vip;

    public C7676l(C10038l c10038l, C1553l c1553l, C16760l c16760l) {
        super(c10038l, null);
        this.vip = c1553l;
        this.metrica = c16760l;
        C16412l c16412l = ((C7757l) c10038l.f20463l).yandex;
        C11239l c11239l = new C11239l(c10038l, this, 4);
        c16412l.getClass();
        this.startapp = new C9004l(c16412l, c11239l);
        this.adcel = c16412l.crashlytics(new C3768l(this, c10038l, 15));
    }

    @Override // defpackage.AbstractC8028l
    public final InterfaceC8371l adcel() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC8028l
    public final Set admob(C18186l c18186l, Function1 function1) {
        if (!c18186l.yandex(C18186l.purchase)) {
            return C5746l.f12138l;
        }
        Set set = (Set) this.startapp.invoke();
        if (set == null) {
            this.vip.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(C3498l.purchase((String) it.next()));
        }
        return hashSet;
    }

    @Override // defpackage.AbstractC8028l, defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        return C2580l.f5619l;
    }

    @Override // defpackage.AbstractC8028l, defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        if (!c18186l.yandex(C18186l.smaato | C18186l.purchase)) {
            return C2580l.f5619l;
        }
        Iterable iterable = (Iterable) this.amazon.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC8371l interfaceC8371l = (InterfaceC8371l) obj;
            if ((interfaceC8371l instanceof InterfaceC17477l) && ((Boolean) function1.invoke(((InterfaceC17477l) interfaceC8371l).getName())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC8028l
    public final InterfaceC6063l firebase() {
        return C5411l.yandex;
    }

    public final InterfaceC17477l license(C3498l c3498l, C12875l c12875l) {
        C3498l c3498l2 = AbstractC13589l.yandex;
        if (c3498l.loadAd().length() <= 0 || c3498l.f7383l) {
            return null;
        }
        Set set = (Set) this.startapp.invoke();
        if (c12875l == null && set != null && !set.contains(c3498l.loadAd())) {
            return null;
        }
        return (InterfaceC17477l) this.adcel.invoke(new C8059l(c3498l, c12875l));
    }

    @Override // defpackage.AbstractC8028l
    public final Set metrica() {
        return C5746l.f12138l;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        return license(c3498l, null);
    }

    @Override // defpackage.AbstractC8028l
    public final Set subs(C18186l c18186l, C1490l c1490l) {
        return C5746l.f12138l;
    }

    @Override // defpackage.AbstractC8028l
    public final void remoteconfig(LinkedHashSet linkedHashSet, C3498l c3498l) {
    }
}
