package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lِؑؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnLayoutChangeListenerC0254l implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ View loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ ViewOnLayoutChangeListenerC0254l(Object obj, View view, int i) {
        this.yandex = i;
        this.crashlytics = obj;
        this.loadAd = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.yandex;
        View view2 = this.loadAd;
        Object obj = this.crashlytics;
        switch (i9) {
            case 0:
                if (view2.getVisibility() == 0) {
                    ((C0282l) obj).amazon(view2);
                }
                break;
            default:
                ((C5514l) obj).invoke();
                view2.removeOnLayoutChangeListener(this);
                break;
        }
    }
}
