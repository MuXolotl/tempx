package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؙۣۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؙۣۙ;", "Llَّؓ;", "Llؙّؓ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C6722l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f14086l;

    public C6722l(String str) {
        this.f14086l = str;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C6414l) abstractC14971l).f13396l = this.f14086l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6722l) && this.f14086l.equals(((C6722l) obj).f14086l);
    }

    public final int hashCode() {
        return this.f14086l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C6414l c6414l = new C6414l();
        c6414l.f13396l = this.f14086l;
        return c6414l;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f14086l) + ")";
    }
}
