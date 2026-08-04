package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؖٞۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؖٞۢ;", "Llَّؓ;", "Llِٖؑ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C4283l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17150l f8775l;

    public C4283l(C17150l c17150l) {
        this.f8775l = c17150l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C11870l c11870l = (C11870l) abstractC14971l;
        C17150l c17150l = c11870l.f34839l;
        C17150l c17150l2 = this.f8775l;
        if (AbstractC8576l.yandex(c17150l, c17150l2)) {
            return;
        }
        c11870l.f34839l = c17150l2;
        if (c11870l.f34840l) {
            c11870l.m4440l();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4283l) && this.f8775l.equals(((C4283l) obj).f8775l);
    }

    public final int hashCode() {
        return (this.f8775l.loadAd * 31) + 1237;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C11870l(this.f8775l, null);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f8775l + ", overrideDescendants=false)";
    }
}
