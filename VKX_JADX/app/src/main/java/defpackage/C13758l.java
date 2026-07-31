package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lْۣٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llْۣٛ;", "Llَّؓ;", "Llۣٔٞ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C13758l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15308l f26852l;

    public C13758l(C15308l c15308l) {
        this.f26852l = c15308l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C15061l c15061l = (C15061l) abstractC14971l;
        c15061l.f29592l = 1.0f;
        c15061l.f29591l = this.f26852l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13758l) && AbstractC8576l.yandex(this.f26852l, ((C13758l) obj).f26852l);
    }

    public final int hashCode() {
        C15308l c15308l = this.f26852l;
        return Float.floatToIntBits(1.0f) + ((c15308l != null ? c15308l.hashCode() : 0) * 961);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C15061l c15061l = new C15061l();
        c15061l.f29592l = 1.0f;
        c15061l.f29591l = this.f26852l;
        return c15061l;
    }
}
