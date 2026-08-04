package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lِْؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC3367l implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ ViewOnLayoutChangeListenerC3367l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.yandex;
        Object obj = this.loadAd;
        switch (i9) {
            case 0:
                throw null;
            case 1:
                ((AbstractC2338l) obj).f5074l.setSheetHeight(view.getHeight());
                view.removeOnLayoutChangeListener(this);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                ((C11260l) obj).amazon(0.0d);
                AbstractC2338l.f5069l.post(new RunnableC17827l(view, 0));
                return;
        }
    }
}
