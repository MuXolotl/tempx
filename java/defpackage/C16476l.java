package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٖٚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٖٚ۟;", "Llَّؓ;", "Llِۖ۠;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C16476l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2403l f32206l;

    public C16476l(C2403l c2403l) {
        this.f32206l = c2403l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C12044l) abstractC14971l).m3354l(this.f32206l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16476l) {
            return AbstractC8576l.yandex(this.f32206l, ((C16476l) obj).f32206l);
        }
        return false;
    }

    public final int hashCode() {
        C2403l c2403l = this.f32206l;
        if (c2403l != null) {
            return c2403l.hashCode();
        }
        return 0;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C12044l(this.f32206l, (C6438l) null, 6);
    }
}
