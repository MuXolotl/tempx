package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemMeta;

/* JADX INFO: renamed from: lؑٞۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0486l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CustomCatalogBlockItem f1796l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1797l;

    public /* synthetic */ ViewOnClickListenerC0486l(AbstractC14630l abstractC14630l, CustomCatalogBlockItem customCatalogBlockItem, int i) {
        this.f1797l = i;
        this.f1796l = customCatalogBlockItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1797l;
        CustomCatalogBlockItem customCatalogBlockItem = this.f1796l;
        switch (i) {
            case 0:
                Context context = view.getContext();
                CustomCatalogBlockItemMeta customCatalogBlockItemMeta = customCatalogBlockItem.subs;
                C14100l.loadAd(context, customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.loadAd : null, customCatalogBlockItem.mopub);
                break;
            case 1:
                Context context2 = view.getContext();
                CustomCatalogBlockItemMeta customCatalogBlockItemMeta2 = customCatalogBlockItem.subs;
                C14100l.loadAd(context2, customCatalogBlockItemMeta2 != null ? customCatalogBlockItemMeta2.loadAd : null, customCatalogBlockItem.mopub);
                break;
            case 2:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(customCatalogBlockItem.mopub)));
                break;
            case 3:
                Context context3 = view.getContext();
                CustomCatalogBlockItemMeta customCatalogBlockItemMeta3 = customCatalogBlockItem.subs;
                C14100l.loadAd(context3, customCatalogBlockItemMeta3 != null ? customCatalogBlockItemMeta3.loadAd : null, customCatalogBlockItem.mopub);
                break;
            case 4:
                Context context4 = view.getContext();
                CustomCatalogBlockItemMeta customCatalogBlockItemMeta4 = customCatalogBlockItem.subs;
                C14100l.loadAd(context4, customCatalogBlockItemMeta4 != null ? customCatalogBlockItemMeta4.loadAd : null, customCatalogBlockItem.mopub);
                break;
            default:
                Context context5 = view.getContext();
                CustomCatalogBlockItemMeta customCatalogBlockItemMeta5 = customCatalogBlockItem.subs;
                C14100l.loadAd(context5, customCatalogBlockItemMeta5 != null ? customCatalogBlockItemMeta5.loadAd : null, customCatalogBlockItem.mopub);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0486l(CustomCatalogBlockItem customCatalogBlockItem, int i) {
        this.f1797l = i;
        this.f1796l = customCatalogBlockItem;
    }
}
