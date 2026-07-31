package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؔۨٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3085l implements InterfaceC6797l {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ C9117l loadAd;
    public final C4622l yandex;

    public C3085l(C9117l c9117l, Object obj) {
        this.loadAd = c9117l;
        this.crashlytics = obj;
        int[] iArr = AbstractC12047l.yandex;
        this.yandex = new C4622l();
    }

    @Override // defpackage.InterfaceC6797l
    public final int amazon() {
        C3654l c3654l = (C3654l) this.loadAd.f18733l.mopub(this.crashlytics);
        if (c3654l != null) {
            return ((C17893l) ((C4588l) c3654l.metrica()).f9321l).f34846l;
        }
        return 0;
    }

    @Override // defpackage.InterfaceC6797l
    public final long crashlytics(int i) {
        C3654l c3654l = (C3654l) this.loadAd.f18733l.mopub(this.crashlytics);
        if (c3654l == null || !c3654l.m1386native()) {
            return 0L;
        }
        int i2 = ((C17893l) ((C4588l) c3654l.metrica()).f9321l).f34846l;
        if (i < 0 || i >= i2) {
            AbstractC0081l.purchase("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (!this.yandex.crashlytics(i)) {
            return 0L;
        }
        int i3 = ((C3654l) ((C4588l) c3654l.metrica()).get(i)).f7667l.startapp.f20592l;
        return (((long) ((C3654l) ((C4588l) c3654l.metrica()).get(i)).f7667l.startapp.f20591l) & 4294967295L) | (((long) i3) << 32);
    }

    @Override // defpackage.InterfaceC6797l
    public final void loadAd(C10489l c10489l) {
        C18289l c18289l;
        C3654l c3654l = (C3654l) this.loadAd.f18733l.mopub(this.crashlytics);
        AbstractC14971l abstractC14971l = (c3654l == null || (c18289l = c3654l.f7703l) == null) ? null : (AbstractC14971l) c18289l.mopub;
        if (abstractC14971l == null || !abstractC14971l.f29462l) {
            return;
        }
        AbstractC13359l.subs(abstractC14971l, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c10489l);
    }

    @Override // defpackage.InterfaceC6797l
    public final void purchase(int i, long j) {
        C9117l c9117l = this.loadAd;
        C3654l c3654l = (C3654l) c9117l.f18733l.mopub(this.crashlytics);
        if (c3654l == null || !c3654l.m1386native()) {
            return;
        }
        int i2 = ((C17893l) ((C4588l) c3654l.metrica()).f9321l).f34846l;
        if (i < 0 || i >= i2) {
            AbstractC0081l.purchase("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (c3654l.m1389private()) {
            AbstractC0081l.yandex("Pre-measure called on node that is not placed");
        }
        C3654l c3654l2 = c9117l.f18732l;
        c3654l2.f7687l = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5672l.yandex(c3654l)).Signature((C3654l) ((C4588l) c3654l.metrica()).get(i), j);
        Unit unit = Unit.INSTANCE;
        c3654l2.f7687l = false;
        this.yandex.yandex(i);
    }

    @Override // defpackage.InterfaceC6797l
    public final void yandex() {
        C9117l.crashlytics(this.loadAd, this.crashlytics);
    }
}
