package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٖٟۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٖٟۡ;", "Llَّؓ;", "Llؙؑۦ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C16695l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f32716l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f32717l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11090l f32718l;

    public C16695l(C11090l c11090l, int i, int i2) {
        this.f32718l = c11090l;
        this.f32717l = i;
        this.f32716l = i2;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C6187l c6187l = (C6187l) abstractC14971l;
        C11090l c11090l = c6187l.f13051l;
        C11090l c11090l2 = this.f32718l;
        boolean zYandex = AbstractC8576l.yandex(c11090l, c11090l2);
        int i = this.f32717l;
        int i2 = this.f32716l;
        if (zYandex && c6187l.f13048l == i && c6187l.f13050l == i2) {
            return;
        }
        c6187l.f13051l = c11090l2;
        c6187l.f13048l = i;
        c6187l.f13050l = i2;
        c6187l.f13046l = AbstractC7709l.crashlytics(c11090l2, AbstractC5573l.metrica(c6187l).f7691l);
        c6187l.f13052l = true;
        AbstractC4047l.isPro(c6187l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16695l)) {
            return false;
        }
        C16695l c16695l = (C16695l) obj;
        return AbstractC8576l.yandex(this.f32718l, c16695l.f32718l) && this.f32717l == c16695l.f32717l && this.f32716l == c16695l.f32716l;
    }

    public final int hashCode() {
        return (((this.f32718l.hashCode() * 31) + this.f32717l) * 31) + this.f32716l;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C6187l c6187l = new C6187l();
        c6187l.f13051l = this.f32718l;
        c6187l.f13048l = this.f32717l;
        c6187l.f13050l = this.f32716l;
        c6187l.f13049l = -1;
        c6187l.f13047l = -1;
        return c6187l;
    }
}
