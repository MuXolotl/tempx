package defpackage;

import androidx.glance.session.SessionWorker;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lِٔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11847l extends AbstractC0283l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ SessionWorker f23672l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f23673l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f23674l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f23675l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f23676l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11847l(SessionWorker sessionWorker, AbstractC0283l abstractC0283l) {
        super(abstractC0283l);
        this.f23672l = sessionWorker;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        this.f23676l = obj;
        this.f23673l |= RecyclerView.UNDEFINED_DURATION;
        return this.f23672l.crashlytics(this);
    }
}
