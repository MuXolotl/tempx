package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٟٓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٟٓۙ;", "Llَّؓ;", "Llَِؖ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C14387l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function1 f28131l;

    public C14387l(Function1 function1) {
        this.f28131l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C10231l c10231l = (C10231l) abstractC14971l;
        Function1 function1 = c10231l.f20852l;
        Function1 function2 = this.f28131l;
        if (function2 != function1) {
            c10231l.f20852l = function2;
            c10231l.mo2588l();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14387l) && ((C14387l) obj).f28131l == this.f28131l;
    }

    public final int hashCode() {
        return this.f28131l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C10231l c10231l = new C10231l();
        c10231l.f20852l = this.f28131l;
        return c10231l;
    }
}
