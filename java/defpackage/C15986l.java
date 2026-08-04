package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕۡؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Llٕۡؔ;", "Llَّؓ;", "Ll٘ۛۚ;", "Llؗۘۚ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C15986l extends AbstractC12338l implements InterfaceC5116l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function1 f31365l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f31366l;

    public C15986l(Function1 function1, boolean z) {
        this.f31366l = z;
        this.f31365l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C18205l c18205l = (C18205l) abstractC14971l;
        c18205l.f35656l = this.f31366l;
        c18205l.f35655l = this.f31365l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15986l)) {
            return false;
        }
        C15986l c15986l = (C15986l) obj;
        return this.f31366l == c15986l.f31366l && this.f31365l == c15986l.f31365l;
    }

    public final int hashCode() {
        return this.f31365l.hashCode() + ((this.f31366l ? 1231 : 1237) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C18205l(this.f31366l, false, this.f31365l);
    }

    @Override // defpackage.InterfaceC5116l
    /* JADX INFO: renamed from: lؘْؒ */
    public final C6264l mo1690l() {
        C6264l c6264l = new C6264l();
        c6264l.f13223l = this.f31366l;
        this.f31365l.invoke(c6264l);
        return c6264l;
    }
}
