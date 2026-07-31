package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lَ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llَ٘ۨ;", "Llَّؓ;", "Llؚۥٞ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C18380l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5205l f35891l;

    public C18380l(C5205l c5205l) {
        this.f35891l = c5205l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C7640l c7640l = (C7640l) abstractC14971l;
        C5205l c5205l = this.f35891l;
        c7640l.f15728l = c5205l;
        if (c7640l.f29462l) {
            c5205l.invoke(c7640l.f15727l);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18380l) {
            return this.f35891l == ((C18380l) obj).f35891l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35891l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C7640l(this.f35891l);
    }
}
