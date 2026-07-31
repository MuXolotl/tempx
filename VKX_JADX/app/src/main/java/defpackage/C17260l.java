package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٜٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17260l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C1476l f33486l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f33487l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33488l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17260l(C1476l c1476l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f33486l = c1476l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f33487l = obj;
        this.f33488l |= RecyclerView.UNDEFINED_DURATION;
        return this.f33486l.crashlytics(null, null, null, this);
    }
}
