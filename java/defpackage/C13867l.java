package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٓؑٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٓؑٗ;", "Llَّؓ;", "Llَؚٞ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C13867l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function1 f27124l;

    public C13867l(Function1 function1) {
        this.f27124l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C10452l c10452l = (C10452l) abstractC14971l;
        c10452l.f21267l = this.f27124l;
        c10452l.f21266l = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13867l) {
            return this.f27124l == ((C13867l) obj).f27124l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27124l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C10452l c10452l = new C10452l();
        c10452l.f21267l = this.f27124l;
        c10452l.f21266l = -9223372034707292160L;
        return c10452l;
    }
}
