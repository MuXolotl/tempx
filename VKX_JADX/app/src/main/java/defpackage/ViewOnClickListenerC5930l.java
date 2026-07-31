package defpackage;

import android.net.Uri;
import android.view.View;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2Banner;
import ua.itaysonlab.catalogkit.objects.banner.Catalog2BannerClickActionRoot;

/* JADX INFO: renamed from: lؘۙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5930l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Banner f12488l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12489l;

    public /* synthetic */ ViewOnClickListenerC5930l(Catalog2Banner catalog2Banner, int i) {
        this.f12489l = i;
        this.f12488l = catalog2Banner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Catalog2ButtonAction catalog2ButtonAction;
        Catalog2ButtonAction catalog2ButtonAction2;
        Catalog2ButtonAction catalog2ButtonAction3;
        int i = this.f12489l;
        Catalog2Banner catalog2Banner = this.f12488l;
        switch (i) {
            case 0:
                Catalog2BannerClickActionRoot catalog2BannerClickActionRoot = catalog2Banner.loadAd;
                if (catalog2BannerClickActionRoot != null && (catalog2ButtonAction = catalog2BannerClickActionRoot.yandex) != null && (catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl)) {
                    C8183l.crashlytics(C8183l.yandex, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction).yandex), false, 6);
                    break;
                }
                break;
            case 1:
                Catalog2BannerClickActionRoot catalog2BannerClickActionRoot2 = catalog2Banner.loadAd;
                if (catalog2BannerClickActionRoot2 != null && (catalog2ButtonAction2 = catalog2BannerClickActionRoot2.yandex) != null && (catalog2ButtonAction2 instanceof Catalog2ButtonAction.OpenUrl)) {
                    C8183l.crashlytics(C8183l.yandex, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction2).yandex), false, 6);
                    break;
                }
                break;
            default:
                Catalog2BannerClickActionRoot catalog2BannerClickActionRoot3 = catalog2Banner.loadAd;
                if (catalog2BannerClickActionRoot3 != null && (catalog2ButtonAction3 = catalog2BannerClickActionRoot3.yandex) != null && (catalog2ButtonAction3 instanceof Catalog2ButtonAction.OpenUrl)) {
                    C8183l.crashlytics(C8183l.yandex, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction3).yandex), false, 6);
                    break;
                }
                break;
        }
    }
}
