package defpackage;

import android.view.View;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;

/* JADX INFO: renamed from: lٌؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2191l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Podcast f4844l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4845l;

    public /* synthetic */ ViewOnClickListenerC2191l(Podcast podcast, int i) {
        this.f4845l = i;
        this.f4844l = podcast;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f4845l;
        Podcast podcast = this.f4844l;
        switch (i) {
            case 0:
                AbstractC1213l.crashlytics(view, new C0471l(podcast.loadAd));
                break;
            default:
                AbstractC1213l.crashlytics(view, new C0471l(podcast.loadAd));
                break;
        }
    }
}
