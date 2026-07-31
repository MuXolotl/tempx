package defpackage;

import android.net.Uri;
import android.view.View;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;

/* JADX INFO: renamed from: lٕؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0344l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Button f1399l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1400l;

    public /* synthetic */ ViewOnClickListenerC0344l(Catalog2Button catalog2Button, int i) {
        this.f1400l = i;
        this.f1399l = catalog2Button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1400l;
        Catalog2Button catalog2Button = this.f1399l;
        switch (i) {
            case 0:
                Catalog2ButtonAction catalog2ButtonAction = catalog2Button.yandex;
                if (catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl) {
                    C8183l.crashlytics(C8183l.yandex, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction).yandex), false, 6);
                }
                break;
            default:
                C8183l.yandex.loadAd(((Catalog2ButtonAction.OpenUrl) catalog2Button.yandex).yandex);
                break;
        }
    }
}
