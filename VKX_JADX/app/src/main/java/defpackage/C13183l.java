package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lؙْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13183l implements InterfaceC1925l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8688l f25796l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Set f25797l;

    public C13183l(Set set) {
        C16017l.f31395l.getClass();
        AbstractC3605l.subscription(C8741l.yandex(2, true, "unknown integer literal type"), C16017l.f31394l, this, C2580l.f5619l, false);
        this.f25796l = new C8688l(new C15152l(this));
        this.f25797l = set;
    }

    @Override // defpackage.InterfaceC1925l
    public final List getParameters() {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC1925l
    public final boolean premium() {
        return false;
    }

    @Override // defpackage.InterfaceC1925l
    public final InterfaceC15234l pro() {
        return null;
    }

    @Override // defpackage.InterfaceC1925l
    public final AbstractC16860l subs() {
        throw null;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + AbstractC16901l.m4210case(this.f25797l, ",", null, null, C2100l.f4718l, 30) + ']');
    }

    @Override // defpackage.InterfaceC1925l
    public final Collection yandex() {
        return (List) this.f25796l.getValue();
    }
}
