package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.IOException;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lْۡٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13732l extends AbstractC14630l {
    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.c3_catalog_banner;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) throws IOException {
        Catalog2Banner catalog2Banner = (Catalog2Banner) obj;
        C16196l c16196l = (C16196l) interfaceC0589l;
        String str = catalog2Banner.mopub;
        TextView textView = c16196l.f31692l;
        TextView textView2 = c16196l.f31696l;
        c16196l.f31695l.setText(catalog2Banner.billing);
        String str2 = catalog2Banner.purchase;
        if (str2 == null || str2.length() == 0) {
            AbstractC5833l.purchase(textView2);
        } else {
            textView2.setText(str2);
            AbstractC5833l.subs(textView2);
        }
        if (str == null || str.length() == 0) {
            AbstractC5833l.purchase(textView);
        } else {
            textView.setText(str);
            AbstractC5833l.subs(textView);
        }
        ImageView imageView = c16196l.f31693l;
        String strCrashlytics = AbstractC8320l.crashlytics(catalog2Banner.amazon);
        C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
        C9477l c9477l = new C9477l(imageView.getContext());
        c9477l.crashlytics = strCrashlytics;
        AbstractC10413l.amazon(c9477l, imageView);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        AbstractC12872l.crashlytics(c9477l, new C1061l(VKXApplication.Companion.yandex(8.0f)));
        c13177lYandex.yandex(c9477l.yandex());
        c16196l.f31694l.setOnClickListener(new ViewOnClickListenerC5930l(catalog2Banner, 1));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_catalog_banner_promo, viewGroup, false);
        int i = R.id.banner_bg;
        ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.banner_bg);
        if (imageView != null) {
            i = R.id.subtext;
            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.subtext);
            if (textView != null) {
                i = R.id.text;
                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.text);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.title);
                    if (textView3 != null) {
                        return new C16196l(imageView, (LinearLayout) viewInflate, textView, textView2, textView3);
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
