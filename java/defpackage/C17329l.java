package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2Placeholder;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٗۖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17329l extends AbstractC14630l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f33639l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final AbstractC9694l f33640l;

    public C17329l(AbstractC9694l abstractC9694l, boolean z) {
        this.f33640l = abstractC9694l;
        this.f33639l = z;
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.c3_placeholder;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        Catalog2Button catalog2Button;
        Catalog2Placeholder catalog2Placeholder = (Catalog2Placeholder) obj;
        String str = catalog2Placeholder.yandex;
        C1966l c1966l = (C1966l) interfaceC0589l;
        String str2 = catalog2Placeholder.crashlytics;
        String str3 = catalog2Placeholder.loadAd;
        List list = catalog2Placeholder.amazon;
        TextView textView = c1966l.f4478l;
        ImageView imageView = c1966l.f4476l;
        if (this.f33639l) {
            AbstractC9694l abstractC9694l = this.f33640l;
            if (abstractC9694l.subscription()) {
                C10086l c10086l = abstractC9694l.f23169l;
                C10086l c10086l2 = abstractC9694l.f23162l;
                if (!AbstractC8576l.yandex(str, "synth_search")) {
                    String strCrashlytics = list != null ? AbstractC8320l.crashlytics(list) : null;
                    List list2 = catalog2Placeholder.purchase;
                    String str4 = (list2 == null || (catalog2Button = (Catalog2Button) AbstractC16901l.m4217extends(list2)) == null) ? null : catalog2Button.isPro;
                    C9810l c9810l = new C9810l(abstractC9694l, catalog2Placeholder, 1);
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str5 = strCrashlytics != null ? strCrashlytics : "";
                    if (str4 == null) {
                        str4 = "Reload";
                    }
                    c10086l2.setValue(new C4494l(str5, str3, str2, str4));
                    c10086l.setValue(Boolean.TRUE);
                    abstractC9694l.f23166l = c9810l;
                    FrameLayout frameLayout = abstractC9694l.f23158l;
                    if (frameLayout == null) {
                        frameLayout = null;
                    }
                    frameLayout.setVisibility(8);
                    ComposeView composeView = abstractC9694l.f23172l;
                    (composeView != null ? composeView : null).setVisibility(0);
                    return;
                }
                FrameLayout frameLayout2 = abstractC9694l.f23158l;
                if (frameLayout2 == null) {
                    frameLayout2 = null;
                }
                frameLayout2.setVisibility(8);
                ComposeView composeView2 = abstractC9694l.f23172l;
                if (composeView2 == null) {
                    composeView2 = null;
                }
                composeView2.setVisibility(0);
                if (str3 == null) {
                    str3 = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                c10086l2.setValue(new C10543l(R.drawable.ic_search_outline_28, R.string.error_occurred_reload, str3, str2));
                c10086l.setValue(Boolean.FALSE);
                abstractC9694l.f23166l = new C1990l(16);
                FrameLayout frameLayout3 = abstractC9694l.f23158l;
                if (frameLayout3 == null) {
                    frameLayout3 = null;
                }
                frameLayout3.setVisibility(8);
                ComposeView composeView3 = abstractC9694l.f23172l;
                (composeView3 != null ? composeView3 : null).setVisibility(0);
                return;
            }
        }
        if (list == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            String strCrashlytics2 = AbstractC8320l.crashlytics(list);
            C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
            C9477l c9477l = new C9477l(imageView.getContext());
            c9477l.crashlytics = strCrashlytics2;
            AbstractC10413l.amazon(c9477l, imageView);
            c13177lYandex.yandex(c9477l.yandex());
        }
        if (AbstractC16648l.isVip(str, "_synth", false)) {
            textView.setVisibility(0);
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_error_outline_28);
            imageView.setImageTintList(ColorStateList.valueOf(AbstractC13209l.yandex(R.attr.text_primary)));
            textView.setText(str3);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            VKXApplication.Companion companion = VKXApplication.f36628l;
            layoutParams.height = VKXApplication.Companion.yandex(64.0f);
            layoutParams.width = VKXApplication.Companion.yandex(64.0f);
            imageView.setLayoutParams(layoutParams);
        } else {
            imageView.setImageTintList(null);
            textView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            VKXApplication.Companion companion2 = VKXApplication.f36628l;
            layoutParams2.height = VKXApplication.Companion.yandex(128.0f);
            layoutParams2.width = VKXApplication.Companion.yandex(128.0f);
            imageView.setLayoutParams(layoutParams2);
        }
        TextView textView2 = c1966l.f4475l;
        if (str2 == null || str2.length() == 0) {
            str2 = str3;
        }
        textView2.setText(AbstractC16648l.advert(str2, "<br/>", "\n", false));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_placeholder, viewGroup, false);
        int i = R.id.image;
        ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.image);
        if (imageView != null) {
            i = R.id.text;
            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.text);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.title);
                if (textView2 != null) {
                    return new C1966l(imageView, (LinearLayout) viewInflate, textView, textView2);
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
