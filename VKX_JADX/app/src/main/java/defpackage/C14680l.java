package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* JADX INFO: renamed from: lٔؖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14680l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f28729l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f28730l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC16137l f28731l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ ConstraintTrackingWorker f28732l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14680l(ConstraintTrackingWorker constraintTrackingWorker, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f28732l = constraintTrackingWorker;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f28730l = obj;
        this.f28729l |= RecyclerView.UNDEFINED_DURATION;
        return ConstraintTrackingWorker.billing(this.f28732l, this);
    }
}
