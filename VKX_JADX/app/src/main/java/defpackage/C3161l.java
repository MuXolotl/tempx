package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٖؕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3161l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C0720l f6790l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f6791l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C17239l f6792l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C4543l f6793l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f6794l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3161l(C0720l c0720l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f6790l = c0720l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f6794l = obj;
        this.f6791l |= RecyclerView.UNDEFINED_DURATION;
        return this.f6790l.subscription(null, null, null, this);
    }
}
