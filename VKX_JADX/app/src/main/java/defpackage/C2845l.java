package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٕؔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٕؔۗ;", "Llَّؓ;", "Llُ٘۟;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C2845l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Function3 f6192l;

    public C2845l(Function3 function3) {
        this.f6192l = function3;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C18235l) abstractC14971l).f35745l = this.f6192l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2845l) {
            return this.f6192l == ((C2845l) obj).f6192l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6192l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C18235l c18235l = new C18235l();
        c18235l.f35745l = this.f6192l;
        return c18235l;
    }
}
