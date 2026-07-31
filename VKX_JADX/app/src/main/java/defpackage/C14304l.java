package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lِٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llِٓٞ;", "Llَّؓ;", "Llًٍْ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C14304l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC17030l f27990l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC13460l f27991l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC14165l f27992l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AbstractC8939l f27993l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f27994l;

    public C14304l(AbstractC14165l abstractC14165l, InterfaceC13460l interfaceC13460l, InterfaceC17030l interfaceC17030l, float f, AbstractC8939l abstractC8939l) {
        this.f27992l = abstractC14165l;
        this.f27991l = interfaceC13460l;
        this.f27990l = interfaceC17030l;
        this.f27994l = f;
        this.f27993l = abstractC8939l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C13249l c13249l = (C13249l) abstractC14971l;
        boolean z = c13249l.f26024l;
        AbstractC14165l abstractC14165l = this.f27992l;
        boolean z2 = (z && C14174l.loadAd(c13249l.f26027l.subs(), abstractC14165l.subs())) ? false : true;
        c13249l.f26027l = abstractC14165l;
        c13249l.f26024l = true;
        c13249l.f26026l = this.f27991l;
        c13249l.f26028l = this.f27990l;
        c13249l.f26025l = this.f27994l;
        c13249l.f26023l = this.f27993l;
        if (z2) {
            AbstractC4047l.isPro(c13249l);
        }
        AbstractC2697l.firebase(c13249l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14304l)) {
            return false;
        }
        C14304l c14304l = (C14304l) obj;
        return AbstractC8576l.yandex(this.f27992l, c14304l.f27992l) && AbstractC8576l.yandex(this.f27991l, c14304l.f27991l) && AbstractC8576l.yandex(this.f27990l, c14304l.f27990l) && Float.compare(this.f27994l, c14304l.f27994l) == 0 && AbstractC8576l.yandex(this.f27993l, c14304l.f27993l);
    }

    public final int hashCode() {
        int iMopub = AbstractC9029l.mopub((this.f27990l.hashCode() + ((this.f27991l.hashCode() + (((this.f27992l.hashCode() * 31) + 1231) * 31)) * 31)) * 31, this.f27994l, 31);
        AbstractC8939l abstractC8939l = this.f27993l;
        return iMopub + (abstractC8939l == null ? 0 : abstractC8939l.hashCode());
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C13249l c13249l = new C13249l();
        c13249l.f26027l = this.f27992l;
        c13249l.f26024l = true;
        c13249l.f26026l = this.f27991l;
        c13249l.f26028l = this.f27990l;
        c13249l.f26025l = this.f27994l;
        c13249l.f26023l = this.f27993l;
        return c13249l;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f27992l + ", sizeToIntrinsics=true, alignment=" + this.f27991l + ", contentScale=" + this.f27990l + ", alpha=" + this.f27994l + ", colorFilter=" + this.f27993l + ")";
    }
}
