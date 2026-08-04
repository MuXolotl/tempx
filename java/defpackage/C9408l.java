package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lًٍ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9408l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C14042l f19250l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f19251l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f19252l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9408l(C14042l c14042l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f19250l = c14042l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f19251l = obj;
        this.f19252l |= RecyclerView.UNDEFINED_DURATION;
        return this.f19250l.crashlytics(this, null);
    }
}
