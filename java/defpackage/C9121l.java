package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌۡۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٌۡۚ;", "Llَّؓ;", "Llؖۡۜ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C9121l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Function1 f18746l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Function1 f18747l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10715l f18748l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Function1 f18749l;

    public C9121l(C10715l c10715l, Function1 function1, Function1 function2, Function1 function3) {
        this.f18748l = c10715l;
        this.f18747l = function1;
        this.f18746l = function2;
        this.f18749l = function3;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C4451l c4451l = (C4451l) abstractC14971l;
        c4451l.f9061l.yandex = null;
        C10715l c10715l = this.f18748l;
        c4451l.f9061l = c10715l;
        c10715l.yandex = c4451l;
        c10715l.loadAd = c4451l.f29462l ? 3 : 2;
        c4451l.f9062l = this.f18747l;
        c4451l.f9060l = this.f18746l;
        c4451l.f9059l = this.f18749l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9121l)) {
            return false;
        }
        C9121l c9121l = (C9121l) obj;
        return this.f18748l == c9121l.f18748l && this.f18747l == c9121l.f18747l && this.f18746l == c9121l.f18746l && this.f18749l == c9121l.f18749l;
    }

    public final int hashCode() {
        int iHashCode = (this.f18747l.hashCode() + (this.f18748l.hashCode() * 31)) * 31;
        Function1 function1 = this.f18746l;
        return this.f18749l.hashCode() + ((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C4451l(this.f18748l, this.f18747l, this.f18746l, this.f18749l);
    }
}
