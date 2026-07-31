package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: lٔۙ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15141l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f29690l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f29691l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f29692l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C13161l f29693l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15141l(C13161l c13161l, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f29693l = c13161l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f29691l = obj;
        this.f29690l |= RecyclerView.UNDEFINED_DURATION;
        return this.f29693l.crashlytics(this);
    }
}
