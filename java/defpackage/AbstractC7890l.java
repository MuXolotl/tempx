package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًٍٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7890l {
    public static final int crashlytics;
    public static final int loadAd;
    public static final int yandex;

    static {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        yandex = VKXApplication.Companion.yandex(92.0f);
        loadAd = VKXApplication.Companion.yandex(34.0f);
        crashlytics = VKXApplication.Companion.yandex(52.0f);
    }

    public static void yandex(Activity activity, C18351l c18351l, boolean z, Function3 function3) {
        Handler handler = new Handler(Looper.getMainLooper());
        MaterialCardView materialCardView = new MaterialCardView(activity);
        materialCardView.setCardBackgroundColor(AbstractC13209l.yandex(R.attr.bg_primary));
        materialCardView.setElevation(0.0f);
        materialCardView.setCardElevation(0.0f);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        materialCardView.setRadius(VKXApplication.Companion.yandex(8.0f));
        int i = yandex;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        materialCardView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(activity);
        C4520l c4520l = new C4520l(activity);
        c4520l.setIndeterminate(true);
        c4520l.setIndicatorSize(crashlytics);
        c4520l.setIndicatorColor(AbstractC13209l.yandex(R.attr.global_accent));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 17;
        Unit unit = Unit.INSTANCE;
        frameLayout.addView(c4520l, layoutParams2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(activity);
        int i2 = loadAd;
        appCompatImageView.setPadding(i2, i2, i2, i2);
        appCompatImageView.setImageResource(R.drawable.ic_close);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(AbstractC13209l.yandex(R.attr.text_secondary)));
        appCompatImageView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i, i);
        layoutParams3.gravity = 17;
        frameLayout.addView(appCompatImageView, layoutParams3);
        materialCardView.addView(frameLayout);
        C12823l c12823l = new C12823l(materialCardView, appCompatImageView, c4520l);
        C10700l c10700l = new C10700l();
        DialogC0230l dialogC0230l = new DialogC0230l(activity, R.style.TransparentDialog);
        dialogC0230l.setContentView(materialCardView);
        dialogC0230l.setCancelable(false);
        dialogC0230l.setCanceledOnTouchOutside(false);
        dialogC0230l.show();
        int i3 = AbstractC5852l.yandex;
        Window window = dialogC0230l.getWindow();
        if (window == null) {
            C8339l.smaato("This shouldn't be possible!");
            return;
        }
        AbstractC2829l.yandex(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        if (!z) {
            appCompatImageView.setOnClickListener(new ViewOnClickListenerC11062l(c10700l, handler, dialogC0230l, 1));
            handler.postDelayed(new RunnableC11297l(27, c12823l), 1500L);
        }
        c10700l.f21708l = AbstractC10999l.mopub(c18351l, new C18431l(handler, dialogC0230l, 1), 0, new C0469l(function3, c12823l, handler, dialogC0230l, null, 14), 2);
    }
}
