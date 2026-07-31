package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l٘ۥۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18341l implements InterfaceC3841l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2911l f35851l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC3841l f35852l;

    public C18341l(InterfaceC3841l interfaceC3841l, C2911l c2911l) {
        this.f35852l = interfaceC3841l;
        this.f35851l = c2911l;
    }

    @Override // defpackage.InterfaceC3841l
    public final boolean isEmpty() {
        InterfaceC3841l interfaceC3841l = this.f35852l;
        if ((interfaceC3841l instanceof Collection) && ((Collection) interfaceC3841l).isEmpty()) {
            return false;
        }
        Iterator it = interfaceC3841l.iterator();
        while (it.hasNext()) {
            C2312l c2312lMopub = ((InterfaceC1910l) it.next()).mopub();
            if (c2312lMopub != null && ((Boolean) this.f35851l.invoke(c2312lMopub)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3841l
    public final boolean isPro(C2312l c2312l) {
        if (((Boolean) this.f35851l.invoke(c2312l)).booleanValue()) {
            return this.f35852l.isPro(c2312l);
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f35852l) {
            C2312l c2312lMopub = ((InterfaceC1910l) obj).mopub();
            if (c2312lMopub != null && ((Boolean) this.f35851l.invoke(c2312lMopub)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // defpackage.InterfaceC3841l
    public final InterfaceC1910l loadAd(C2312l c2312l) {
        if (((Boolean) this.f35851l.invoke(c2312l)).booleanValue()) {
            return this.f35852l.loadAd(c2312l);
        }
        return null;
    }
}
