package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C17223l {
    public InterfaceC1076l admob;
    public final int amazon;
    public final boolean crashlytics;
    public PopupWindow.OnDismissListener isPro;
    public final MenuC4984l loadAd;
    public boolean mopub;
    public View purchase;
    public AbstractC2080l subs;
    public final Context yandex;
    public int billing = 8388611;
    public final C4270l firebase = new C4270l(this);

    public C17223l(Context context, MenuC4984l menuC4984l, View view, boolean z, int i, int i2) {
        this.yandex = context;
        this.loadAd = menuC4984l;
        this.purchase = view;
        this.crashlytics = z;
        this.amazon = i;
    }

    public final void amazon(int i, int i2, boolean z, boolean z2) {
        AbstractC2080l abstractC2080lYandex = yandex();
        abstractC2080lYandex.subscription(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.billing, this.purchase.getLayoutDirection()) & 7) == 5) {
                i -= this.purchase.getWidth();
            }
            abstractC2080lYandex.adcel(i);
            abstractC2080lYandex.tapsense(i2);
            int i3 = (int) ((this.yandex.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC2080lYandex.f4656l = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC2080lYandex.mopub();
    }

    public void crashlytics() {
        this.subs = null;
        PopupWindow.OnDismissListener onDismissListener = this.isPro;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean loadAd() {
        AbstractC2080l abstractC2080l = this.subs;
        return abstractC2080l != null && abstractC2080l.loadAd();
    }

    public final AbstractC2080l yandex() {
        AbstractC2080l viewOnKeyListenerC12191l;
        if (this.subs == null) {
            Context context = this.yandex;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.yandex;
            if (iMin >= dimensionPixelSize) {
                viewOnKeyListenerC12191l = new ViewOnKeyListenerC8334l(context2, this.purchase, this.amazon, this.crashlytics);
            } else {
                viewOnKeyListenerC12191l = new ViewOnKeyListenerC12191l(context2, this.loadAd, this.purchase, this.amazon, this.crashlytics);
            }
            viewOnKeyListenerC12191l.smaato(this.loadAd);
            viewOnKeyListenerC12191l.ads(this.firebase);
            viewOnKeyListenerC12191l.vip(this.purchase);
            viewOnKeyListenerC12191l.billing(this.admob);
            viewOnKeyListenerC12191l.metrica(this.mopub);
            viewOnKeyListenerC12191l.startapp(this.billing);
            this.subs = viewOnKeyListenerC12191l;
        }
        return this.subs;
    }
}
