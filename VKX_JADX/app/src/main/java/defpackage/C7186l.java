package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍُؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Llٍُؚ;", "Llَّؓ;", "Ll٘ۛۚ;", "Llؗۘۚ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C7186l extends AbstractC12338l implements InterfaceC5116l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function1 f15023l;

    public C7186l(Function1 function1) {
        this.f15023l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C18205l) abstractC14971l).f35655l = this.f15023l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7186l) {
            return this.f15023l == ((C7186l) obj).f15023l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15023l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C18205l(false, true, this.f15023l);
    }

    @Override // defpackage.InterfaceC5116l
    /* JADX INFO: renamed from: lؘْؒ */
    public final C6264l mo1690l() {
        C6264l c6264l = new C6264l();
        c6264l.f13223l = false;
        c6264l.f13226l = true;
        this.f15023l.invoke(c6264l);
        return c6264l;
    }
}
