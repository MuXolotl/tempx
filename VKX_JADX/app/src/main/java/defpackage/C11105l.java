package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.catalogkit.objects.Catalog2Placeholder;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11105l extends AbstractC14630l {
    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.c3_banner_placeholder;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        Catalog2Placeholder catalog2Placeholder = (Catalog2Placeholder) obj;
        C9257l c9257l = (C9257l) interfaceC0589l;
        String str = catalog2Placeholder.loadAd;
        TextView textView = c9257l.f19029l;
        MaterialButton materialButton = c9257l.f19027l;
        ImageView imageView = c9257l.f19026l;
        List list = catalog2Placeholder.amazon;
        Catalog2Button catalog2Button = null;
        Object obj2 = null;
        String strCrashlytics = list != null ? AbstractC8320l.crashlytics(list) : null;
        C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
        C9477l c9477l = new C9477l(imageView.getContext());
        c9477l.crashlytics = strCrashlytics;
        AbstractC10413l.amazon(c9477l, imageView);
        c13177lYandex.yandex(c9477l.yandex());
        imageView.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
        textView.setText(str);
        c9257l.f19030l.setText(catalog2Placeholder.crashlytics);
        textView.setVisibility(str.length() > 0 ? 0 : 8);
        List list2 = catalog2Placeholder.purchase;
        if (list2 != null) {
            for (Object obj3 : list2) {
                if (((Catalog2Button) obj3).yandex instanceof Catalog2ButtonAction.OpenUrl) {
                    obj2 = obj3;
                    break;
                }
            }
            catalog2Button = (Catalog2Button) obj2;
        }
        materialButton.setVisibility(catalog2Button != null ? 0 : 8);
        if (catalog2Button != null) {
            materialButton.setText(catalog2Button.isPro);
            materialButton.setOnClickListener(new ViewOnClickListenerC0344l(catalog2Button, 1));
        }
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_banner_placeholder, viewGroup, false);
        int i = R.id.button;
        MaterialButton materialButton = (MaterialButton) AbstractC8576l.smaato(viewInflate, R.id.button);
        if (materialButton != null) {
            MaterialCardView materialCardView = (MaterialCardView) viewInflate;
            i = R.id.image;
            ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.image);
            if (imageView != null) {
                i = R.id.text;
                TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.text);
                if (textView != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.title);
                    if (textView2 != null) {
                        return new C9257l(imageView, textView, textView2, materialButton, materialCardView);
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
