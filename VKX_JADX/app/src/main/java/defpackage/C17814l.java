package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17814l extends AbstractC14630l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f34745l;

    public C17814l(boolean z) {
        this.f34745l = z;
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return this.f34745l ? R.layout.c3_link_horizontal_small : R.layout.c3_link_horizontal;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
        Integer numValueOf = Integer.valueOf(R.drawable.placeholder_link);
        String str = customCatalogBlockItem.yandex;
        List list = customCatalogBlockItem.crashlytics;
        if (this.f34745l) {
            C12440l c12440l = (C12440l) interfaceC0589l;
            AbstractC17891l.crashlytics(c12440l.f24554l, list != null ? AbstractC8320l.crashlytics(list) : null, numValueOf, new C10923l(new C16849l(), 14));
            c12440l.f24553l.setText(str);
            c12440l.f24555l.setOnClickListener(new ViewOnClickListenerC0486l(customCatalogBlockItem, 3));
            return;
        }
        C18106l c18106l = (C18106l) interfaceC0589l;
        AbstractC17891l.crashlytics(c18106l.f35403l, list != null ? AbstractC8320l.crashlytics(list) : null, numValueOf, new C10923l(new C16849l(), 14));
        c18106l.f35402l.setText(str);
        c18106l.f35404l.setOnClickListener(new ViewOnClickListenerC0486l(customCatalogBlockItem, 4));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f34745l) {
            return C12440l.yandex(layoutInflater, viewGroup);
        }
        View viewInflate = layoutInflater.inflate(R.layout.c3_link_horizontal, viewGroup, false);
        int i = R.id.catalog_item_photo;
        ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.catalog_item_photo);
        if (imageView != null) {
            i = R.id.catalog_item_title;
            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.catalog_item_title);
            if (textView != null) {
                return new C18106l((LinearLayout) viewInflate, imageView, textView);
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
