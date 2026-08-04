package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍؓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2172l implements InterfaceC3841l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f4814l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4815l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2172l(InterfaceC3841l[] interfaceC3841lArr) {
        this(1, AbstractC8669l.m2415super(interfaceC3841lArr));
        this.f4815l = 1;
    }

    @Override // defpackage.InterfaceC3841l
    public final boolean isEmpty() {
        int i = this.f4815l;
        Object obj = this.f4814l;
        switch (i) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC3841l) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.InterfaceC3841l
    public final boolean isPro(C2312l c2312l) {
        switch (this.f4815l) {
            case 0:
                return loadAd(c2312l) != null;
            case 1:
                Iterator it = ((List) this.f4814l).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC3841l) it.next()).isPro(c2312l)) {
                        return true;
                    }
                }
                return false;
            default:
                return loadAd(c2312l) != null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f4815l;
        Object obj = this.f4814l;
        switch (i) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new C12588l(new C8767l(new C17798l(1, (List) obj), C5818l.f12241l, C6657l.f13994l));
            default:
                return C17255l.f33480l;
        }
    }

    @Override // defpackage.InterfaceC3841l
    public final InterfaceC1910l loadAd(C2312l c2312l) {
        int i = this.f4815l;
        Object obj = this.f4814l;
        Object obj2 = null;
        switch (i) {
            case 0:
                for (Object obj3 : this) {
                    if (AbstractC8576l.yandex(((InterfaceC1910l) obj3).mopub(), c2312l)) {
                        obj2 = obj3;
                        return (InterfaceC1910l) obj2;
                    }
                }
                return (InterfaceC1910l) obj2;
            case 1:
                C12588l c12588l = (C12588l) AbstractC17587l.startapp(new C17798l(1, (List) obj), new C1258l(c2312l, 0)).iterator();
                return (InterfaceC1910l) (c12588l.hasNext() ? c12588l.next() : null);
            default:
                if (c2312l.equals((C2312l) obj)) {
                    return C18257l.yandex;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f4815l) {
            case 0:
                return ((List) this.f4814l).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C2172l(int i, Object obj) {
        this.f4815l = i;
        this.f4814l = obj;
    }
}
