package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِٕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12181l extends AbstractC2842l {
    public final C5665l admob;
    public final C2312l isPro;
    public final InterfaceC9921l mopub;
    public final String subs;

    public C12181l(InterfaceC9921l interfaceC9921l, C5665l c5665l, InterfaceC3588l interfaceC3588l, AbstractC12974l abstractC12974l, C8269l c8269l, C0511l c0511l, String str, Function0 function0) {
        C14965l c14965l = new C14965l(c5665l.f12047l);
        C5557l c5557l = C5557l.loadAd;
        super(new C7644l(c0511l, interfaceC3588l, interfaceC9921l, c14965l, AbstractC5712l.loadAd(c5665l.f12048l), abstractC12974l, c8269l, null, C2580l.f5619l), c5665l.f12052l, c5665l.f12051l, c5665l.f12054l, function0);
        this.mopub = interfaceC9921l;
        this.admob = c5665l;
        this.subs = str;
        this.isPro = ((AbstractC3740l) interfaceC9921l).f7826l;
    }

    @Override // defpackage.AbstractC2842l
    public final boolean adcel(C3498l c3498l) {
        if (super.adcel(c3498l)) {
            return true;
        }
        Iterable iterable = (Iterable) ((C0511l) this.loadAd.f15738l).isPro;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((InterfaceC13390l) it.next()).crashlytics(this.isPro, c3498l)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        List listSubs = subs(c18186l, function1);
        Iterable iterable = (Iterable) ((C0511l) this.loadAd.f15738l).isPro;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC3984l.license(arrayList, ((InterfaceC13390l) it.next()).loadAd(this.isPro));
        }
        return AbstractC16901l.m4232new(listSubs, arrayList);
    }

    @Override // defpackage.AbstractC2842l
    public final Set metrica() {
        return C5746l.f12138l;
    }

    @Override // defpackage.AbstractC2842l, defpackage.AbstractC5662l, defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        Object obj = this.loadAd.f15738l;
        String str = ((AbstractC3740l) this.mopub).f7826l.yandex.yandex;
        c3498l.loadAd();
        return super.purchase(c3498l, enumC11300l);
    }

    @Override // defpackage.AbstractC2842l
    public final C3624l smaato(C3498l c3498l) {
        return new C3624l(this.isPro, c3498l);
    }

    @Override // defpackage.AbstractC2842l
    public final Set startapp() {
        return C5746l.f12138l;
    }

    public final String toString() {
        return this.subs;
    }

    @Override // defpackage.AbstractC2842l
    public final Set vip() {
        return C5746l.f12138l;
    }

    @Override // defpackage.AbstractC2842l
    public final void admob(ArrayList arrayList) {
    }
}
