package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْؐۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llْؐۥ;", "Llَّؓ;", "Llؘؕۦ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C13048l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function1 f25552l;

    public C13048l(Function1 function1) {
        this.f25552l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C5444l) abstractC14971l).f11672l = this.f25552l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13048l) {
            return this.f25552l == ((C13048l) obj).f25552l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25552l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C5444l c5444l = new C5444l();
        c5444l.f11672l = this.f25552l;
        return c5444l;
    }
}
