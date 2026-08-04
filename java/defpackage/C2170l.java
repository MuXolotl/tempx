package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemMeta;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؓۡؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2170l extends AbstractC14630l {
    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.v7_post_header;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        CharSequence charSequenceSubSequence;
        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
        C16354l c16354l = (C16354l) interfaceC0589l;
        TextView textView = c16354l.f31984l;
        ImageView imageView = c16354l.f31981l;
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = customCatalogBlockItem.subs;
        AbstractC17891l.crashlytics(imageView, customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.yandex : null, Integer.valueOf(R.drawable.ic_user_outline_28), new C10923l(new C16849l(), 14));
        c16354l.f31980l.setText(customCatalogBlockItem.yandex);
        LinearLayout linearLayout = c16354l.f31983l;
        VKXApplication.Companion companion = VKXApplication.f36628l;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), VKXApplication.Companion.yandex(16.0f));
        textView.setMovementMethod(new C0193l());
        C11155l c11155l = AbstractC0990l.yandex;
        String str = customCatalogBlockItem.loadAd;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != ' ') {
                charSequenceSubSequence = str.subSequence(i2, str.length());
                textView.setText(AbstractC0990l.yandex(charSequenceSubSequence.toString()));
                AbstractC5309l.yandex(textView);
            }
        }
        charSequenceSubSequence = "";
        textView.setText(AbstractC0990l.yandex(charSequenceSubSequence.toString()));
        AbstractC5309l.yandex(textView);
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16354l.yandex(layoutInflater, viewGroup);
    }
}
