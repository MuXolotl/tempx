package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18557l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C4271l f36232l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f36233l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f36234l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18557l(C4271l c4271l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f36232l = c4271l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f36233l = obj;
        this.f36234l |= RecyclerView.UNDEFINED_DURATION;
        return C4271l.crashlytics(this.f36232l, this);
    }
}
