package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑٚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؑٚٚ;", "Llَّؓ;", "Llٍؖۡ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0416l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function1 f1534l;

    public C0416l(Function1 function1) {
        this.f1534l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C9339l) abstractC14971l).f19160l = this.f1534l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0416l) {
            return this.f1534l == ((C0416l) obj).f1534l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1534l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C9339l c9339l = new C9339l();
        c9339l.f19160l = this.f1534l;
        return c9339l;
    }
}
