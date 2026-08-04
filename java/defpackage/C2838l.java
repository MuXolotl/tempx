package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؔۗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؔۗؒ;", "Llَّؓ;", "Llؚٖۙ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C2838l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function2 f6188l;

    public C2838l(Function2 function2) {
        this.f6188l = function2;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C7292l) abstractC14971l).f15141l = this.f6188l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2838l) {
            return this.f6188l == ((C2838l) obj).f6188l;
        }
        return false;
    }

    public final int hashCode() {
        Function2 function2 = this.f6188l;
        if (function2 != null) {
            return function2.hashCode();
        }
        return 0;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C7292l(this.f6188l);
    }
}
