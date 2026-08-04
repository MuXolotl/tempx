package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؓۦۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؓۦۥ;", "Llَّؓ;", "Llِۥٓ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C2259l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function2 f4940l;

    public C2259l(Function2 function2) {
        this.f4940l = function2;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C12236l) abstractC14971l).f24294l = this.f4940l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2259l) {
            return this.f4940l == ((C2259l) obj).f4940l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4940l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C12236l c12236l = new C12236l();
        c12236l.f24294l = this.f4940l;
        C1412l c1412l = new C1412l(2, c12236l);
        C6244l c6244l = new C6244l();
        c6244l.f13184l = c1412l;
        c12236l.m3069l(c6244l);
        return c12236l;
    }
}
