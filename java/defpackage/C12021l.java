package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: lِٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12021l implements InterfaceC1925l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C9522l f23955l;

    public C12021l(C9522l c9522l) {
        this.f23955l = c9522l;
    }

    @Override // defpackage.InterfaceC1925l
    public final List getParameters() {
        List list = this.f23955l.f19411l;
        if (list == null) {
            return null;
        }
        return list;
    }

    @Override // defpackage.InterfaceC1925l
    public final boolean premium() {
        return true;
    }

    @Override // defpackage.InterfaceC1925l
    public final InterfaceC15234l pro() {
        return this.f23955l;
    }

    @Override // defpackage.InterfaceC1925l
    public final AbstractC16860l subs() {
        return AbstractC3759l.purchase(this.f23955l);
    }

    public final String toString() {
        return "[typealias " + this.f23955l.getName().loadAd() + ']';
    }

    @Override // defpackage.InterfaceC1925l
    public final Collection yandex() {
        AbstractC15211l abstractC15211l = this.f23955l.f19413l;
        if (abstractC15211l == null) {
            abstractC15211l = null;
        }
        return abstractC15211l.mo1339native().yandex();
    }
}
