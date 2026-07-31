package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؔؑۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2331l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f5054l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f5055l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C10700l f5056l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C2748l f5057l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2331l(C2748l c2748l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f5057l = c2748l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f5055l = obj;
        this.f5054l |= RecyclerView.UNDEFINED_DURATION;
        return this.f5057l.crashlytics(null, null, null, null, null, this);
    }
}
