package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْۜۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llْۜۨ;", "Llَّؓ;", "Llُٜۧ;", "haze_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class C13687l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Function1 f26727l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C3227l f26728l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C18113l f26729l;

    public C13687l(C18113l c18113l, C3227l c3227l, Function1 function1) {
        this.f26729l = c18113l;
        this.f26728l = c3227l;
        this.f26727l = function1;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C11183l c11183l = (C11183l) abstractC14971l;
        c11183l.f22495l = this.f26729l;
        C3227l c3227l = c11183l.f22481l;
        C3227l c3227l2 = this.f26728l;
        if (!AbstractC8576l.yandex(c3227l, c3227l2)) {
            c11183l.m3047l(c11183l.f22481l, c3227l2);
            c11183l.f22481l = c3227l2;
        }
        c11183l.f22486l = this.f26727l;
        c11183l.mo540while();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13687l) {
            C13687l c13687l = (C13687l) obj;
            if (this.f26729l == c13687l.f26729l && this.f26728l.equals(c13687l.f26728l) && AbstractC8576l.yandex(this.f26727l, c13687l.f26727l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f26728l.hashCode() + (this.f26729l.hashCode() * 31)) * 31;
        Function1 function1 = this.f26727l;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C11183l(this.f26729l, this.f26728l, this.f26727l);
    }

    public final String toString() {
        return "HazeEffectNodeElement(state=" + this.f26729l + ", style=" + this.f26728l + ", block=" + this.f26727l + ")";
    }
}
