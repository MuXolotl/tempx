package defpackage;

import android.widget.AbsListView;

/* JADX INFO: renamed from: lٍٖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16108l implements AbsListView.OnScrollListener {
    public final /* synthetic */ C2956l yandex;

    public C16108l(C2956l c2956l) {
        this.yandex = c2956l;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C2956l c2956l = this.yandex;
        RunnableC9827l runnableC9827l = c2956l.f6441l;
        C15863l c15863l = c2956l.f6435l;
        if (i != 1 || c15863l.getInputMethodMode() == 2 || c15863l.getContentView() == null) {
            return;
        }
        c2956l.f6417l.removeCallbacks(runnableC9827l);
        runnableC9827l.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
