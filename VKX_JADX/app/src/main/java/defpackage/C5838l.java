package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؘٝۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5838l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C2072l f12294l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f12295l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f12296l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5838l(C2072l c2072l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f12294l = c2072l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f12295l = obj;
        this.f12296l |= RecyclerView.UNDEFINED_DURATION;
        return this.f12294l.crashlytics(null, this);
    }
}
