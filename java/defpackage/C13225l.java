package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lًْۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13225l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C2688l f26004l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f26005l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f26006l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13225l(C2688l c2688l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f26004l = c2688l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f26005l = obj;
        this.f26006l |= RecyclerView.UNDEFINED_DURATION;
        return this.f26004l.crashlytics(this);
    }
}
