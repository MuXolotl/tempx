package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: renamed from: lَُٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10223l extends AbstractC0283l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ ConstraintTrackingWorker f20835l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public /* synthetic */ Object f20836l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20837l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10223l(ConstraintTrackingWorker constraintTrackingWorker, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f20835l = constraintTrackingWorker;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f20836l = obj;
        this.f20837l |= RecyclerView.UNDEFINED_DURATION;
        return ConstraintTrackingWorker.purchase(this.f20835l, null, null, null, this);
    }
}
