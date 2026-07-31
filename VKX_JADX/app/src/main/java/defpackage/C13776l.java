package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lْٜۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13776l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8189l f26888l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f26889l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f26890l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13776l(AbstractC8189l abstractC8189l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f26888l = abstractC8189l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f26889l = obj;
        this.f26890l |= RecyclerView.UNDEFINED_DURATION;
        return this.f26888l.subs(this);
    }
}
