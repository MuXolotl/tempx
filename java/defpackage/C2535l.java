package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lُؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llُؔؒ;", "Llَّؓ;", "Llٔؕۖ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C2535l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f5515l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11194l f5516l;

    public C2535l(C11194l c11194l, boolean z) {
        this.f5516l = c11194l;
        this.f5515l = z;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C14664l c14664l = (C14664l) abstractC14971l;
        c14664l.f28675l = this.f5516l;
        c14664l.f28674l = this.f5515l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2535l)) {
            return false;
        }
        C2535l c2535l = (C2535l) obj;
        return AbstractC8576l.yandex(this.f5516l, c2535l.f5516l) && this.f5515l == c2535l.f5515l;
    }

    public final int hashCode() {
        return (((this.f5516l.hashCode() * 31) + 1237) * 31) + (this.f5515l ? 1231 : 1237);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C14664l c14664l = new C14664l();
        c14664l.f28675l = this.f5516l;
        c14664l.f28674l = this.f5515l;
        return c14664l;
    }
}
