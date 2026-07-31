package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lۣٔ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llۣٔ٘;", "Llَّؓ;", "Llؗٙۜ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C15274l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f29873l;

    public C15274l(int i) {
        this.f29873l = i;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C4979l c4979l = (C4979l) abstractC14971l;
        c4979l.f10176l = this.f29873l;
        c4979l.f10177l = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C15274l c15274l = obj instanceof C15274l ? (C15274l) obj : null;
        return c15274l != null && this.f29873l == c15274l.f29873l;
    }

    public final int hashCode() {
        return (AbstractC5020l.inmobi(this.f29873l) * 31) + 1231;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C4979l c4979l = new C4979l(0);
        c4979l.f10176l = this.f29873l;
        c4979l.f10177l = true;
        return c4979l;
    }
}
