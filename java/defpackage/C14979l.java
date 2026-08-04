package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔٚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٔٚؑ;", "Llَّؓ;", "Llٓۦۛ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C14979l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function1 f29481l;

    public C14979l(Function1 function1, C0786l c0786l) {
        this.f29481l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C14556l c14556l = (C14556l) abstractC14971l;
        Function1 function1 = c14556l.f28504l;
        Function1 function2 = this.f29481l;
        if (function1 != function2 || !c14556l.f28503l) {
            AbstractC5573l.metrica(c14556l).m1387new(false);
        }
        c14556l.f28504l = function2;
        c14556l.f28503l = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C14979l c14979l = obj instanceof C14979l ? (C14979l) obj : null;
        return c14979l != null && this.f29481l == c14979l.f29481l;
    }

    public final int hashCode() {
        return (this.f29481l.hashCode() * 31) + 1231;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C14556l c14556l = new C14556l();
        c14556l.f28504l = this.f29481l;
        c14556l.f28503l = true;
        return c14556l;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f29481l + ", rtlAware=true)";
    }
}
