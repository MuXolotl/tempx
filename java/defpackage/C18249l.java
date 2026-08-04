package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٍ٘۠;", "Llَّؓ;", "Llؚۚؐ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C18249l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function1 f35757l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function1 f35758l;

    public C18249l(Function1 function1, Function1 function2) {
        this.f35758l = function1;
        this.f35757l = function2;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C7495l c7495l = (C7495l) abstractC14971l;
        c7495l.f15500l = this.f35758l;
        c7495l.f15499l = this.f35757l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18249l)) {
            return false;
        }
        C18249l c18249l = (C18249l) obj;
        return this.f35758l == c18249l.f35758l && this.f35757l == c18249l.f35757l;
    }

    public final int hashCode() {
        Function1 function1 = this.f35758l;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function2 = this.f35757l;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C7495l c7495l = new C7495l();
        c7495l.f15500l = this.f35758l;
        c7495l.f15499l = this.f35757l;
        return c7495l;
    }
}
