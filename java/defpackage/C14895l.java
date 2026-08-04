package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٔٔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٔٔؐ;", "Llَّؓ;", "Llِۢۗ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C14895l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC6347l f29300l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8990l f29301l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f29302l;

    public C14895l(float f, C8990l c8990l, InterfaceC6347l interfaceC6347l) {
        this.f29302l = f;
        this.f29301l = c8990l;
        this.f29300l = interfaceC6347l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C12197l c12197l = (C12197l) abstractC14971l;
        float f = c12197l.f24244l;
        C15155l c15155l = c12197l.f24240l;
        float f2 = this.f29302l;
        if (!C14467l.loadAd(f, f2)) {
            c12197l.f24244l = f2;
            c15155l.m3944l();
        }
        C8990l c8990l = c12197l.f24242l;
        C8990l c8990l2 = this.f29301l;
        if (!AbstractC8576l.yandex(c8990l, c8990l2)) {
            c12197l.f24242l = c8990l2;
            c15155l.m3944l();
        }
        InterfaceC6347l interfaceC6347l = c12197l.f24241l;
        InterfaceC6347l interfaceC6347l2 = this.f29300l;
        if (AbstractC8576l.yandex(interfaceC6347l, interfaceC6347l2)) {
            return;
        }
        c12197l.f24241l = interfaceC6347l2;
        c15155l.m3944l();
        AbstractC18037l.purchase(c12197l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14895l)) {
            return false;
        }
        C14895l c14895l = (C14895l) obj;
        return C14467l.loadAd(this.f29302l, c14895l.f29302l) && this.f29301l.equals(c14895l.f29301l) && AbstractC8576l.yandex(this.f29300l, c14895l.f29300l);
    }

    public final int hashCode() {
        return this.f29300l.hashCode() + ((this.f29301l.hashCode() + (Float.floatToIntBits(this.f29302l) * 31)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C12197l(this.f29302l, this.f29301l, this.f29300l);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + C14467l.crashlytics(this.f29302l) + ", brush=" + this.f29301l + ", shape=" + this.f29300l + ")";
    }
}
