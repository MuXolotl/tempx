package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lُۗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11252l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f22677l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f22678l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C4043l f22679l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C4043l f22680l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11252l(C4043l c4043l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f22680l = c4043l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f22678l = obj;
        this.f22677l |= RecyclerView.UNDEFINED_DURATION;
        return C4043l.crashlytics(this.f22680l, null, null, this);
    }
}
