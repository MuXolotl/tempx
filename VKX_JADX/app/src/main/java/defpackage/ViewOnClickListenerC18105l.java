package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: lٟٟ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC18105l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Context f35400l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35401l;

    public /* synthetic */ ViewOnClickListenerC18105l(Context context, int i) {
        this.f35401l = i;
        this.f35400l = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f35401l;
        Context context = this.f35400l;
        switch (i) {
            case 0:
                ((Activity) context).onBackPressed();
                break;
            default:
                ((Activity) context).onBackPressed();
                break;
        }
    }
}
