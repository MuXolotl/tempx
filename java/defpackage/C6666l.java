package defpackage;

import android.R;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lًؙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6666l {
    public static final C6666l yandex = new C6666l();

    public static void yandex(AppActivity appActivity, C10734l c10734l) {
        String str = c10734l.loadAd;
        String str2 = c10734l.crashlytics;
        Integer num = c10734l.yandex;
        C8195l c8195l = c10734l.amazon;
        C12823l c12823l = c8195l != null ? new C12823l(Integer.valueOf(c10734l.mopub), c8195l.f17098l, c8195l.f17097l) : null;
        C12823l c12823l2 = c10734l.purchase;
        C18449l c18449l = new C18449l(appActivity, new C12606l(str, str2, num, c12823l, c12823l2 != null ? new C12823l(c12823l2.f25200l, c12823l2.f25199l, c12823l2.f25198l) : null, c10734l.billing, c10734l.admob));
        ComposeView composeView = new ComposeView(appActivity, null, 0, 6, null);
        composeView.setViewCompositionStrategy(C1083l.f2991l);
        composeView.setContent(new C15578l(-1208591237, true, new C7916l(c18449l, 0)));
        FrameLayout frameLayout = new FrameLayout(appActivity);
        frameLayout.setId(R.id.content);
        frameLayout.setTag(ua.itaysonlab.vkx.R.id.view_tree_lifecycle_owner, appActivity);
        frameLayout.setTag(ua.itaysonlab.vkx.R.id.view_tree_saved_state_registry_owner, appActivity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(composeView);
        PopupWindow popupWindow = new PopupWindow(frameLayout, -1, -2);
        c18449l.f36012l = popupWindow;
        popupWindow.setOutsideTouchable(false);
        PopupWindow popupWindow2 = (PopupWindow) c18449l.f36012l;
        if (popupWindow2 != null) {
            popupWindow2.setFocusable(false);
        }
        PopupWindow popupWindow3 = (PopupWindow) c18449l.f36012l;
        if (popupWindow3 != null) {
            popupWindow3.setOnDismissListener(new C14877l());
        }
        appActivity.getWindow().getDecorView().post(new RunnableC16112l(19, c18449l));
    }
}
