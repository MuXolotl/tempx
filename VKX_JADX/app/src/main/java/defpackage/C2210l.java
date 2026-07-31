package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lۣؓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2210l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f4879l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8189l f4880l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Function1 f4881l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Function1 f4882l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f4883l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Exception f4884l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2210l(AbstractC8189l abstractC8189l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f4880l = abstractC8189l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f4879l = obj;
        this.f4883l |= RecyclerView.UNDEFINED_DURATION;
        return this.f4880l.loadAd(null, null, this);
    }
}
