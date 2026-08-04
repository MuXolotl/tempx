package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؒۥٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1471l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13852l f3675l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f3676l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f3677l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1471l(AbstractC13852l abstractC13852l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f3675l = abstractC13852l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f3676l = obj;
        this.f3677l |= RecyclerView.UNDEFINED_DURATION;
        return this.f3675l.crashlytics(this);
    }
}
