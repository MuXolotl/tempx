package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.CustomBottomSheetBehavior;
import com.google.android.material.carousel.CarouselLayoutManager;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC18363l implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ ViewOnLayoutChangeListenerC18363l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.yandex;
        Object obj = this.loadAd;
        switch (i9) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new RunnableC16112l(15, carouselLayoutManager));
                }
                break;
            case 1:
                C13530l c13530l = (C13530l) obj;
                CustomBottomSheetBehavior customBottomSheetBehavior = c13530l.amazon;
                if (customBottomSheetBehavior == null) {
                    customBottomSheetBehavior = null;
                }
                int height = ((LinearLayout) c13530l.yandex.f36640l.f15739l).getHeight();
                VKXApplication.Companion companion = VKXApplication.f36628l;
                customBottomSheetBehavior.applovin(VKXApplication.Companion.yandex(61.0f) + height);
                break;
            default:
                C7591l c7591l = (C7591l) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    c7591l.loadAd();
                    c7591l.yandex(true);
                }
                break;
        }
    }
}
