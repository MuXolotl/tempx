package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15726l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C11625l f30890l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f30891l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f30892l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15726l(C11625l c11625l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f30890l = c11625l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f30891l = obj;
        this.f30892l |= RecyclerView.UNDEFINED_DURATION;
        return this.f30890l.crashlytics(null, 0L, this);
    }
}
