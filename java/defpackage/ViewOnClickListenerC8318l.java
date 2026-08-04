package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import ua.itaysonlab.vkapi2.objects.radio.RadioStation;

/* JADX INFO: renamed from: lًْۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC8318l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ RadioStation f17217l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17218l;

    public /* synthetic */ ViewOnClickListenerC8318l(RadioStation radioStation, int i) {
        this.f17218l = i;
        this.f17217l = radioStation;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        int i = this.f17218l;
        RadioStation radioStation = this.f17217l;
        switch (i) {
            case 0:
                Context context = view.getContext();
                activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    AbstractC9092l.amazon(activity, new C6333l(radioStation));
                }
                break;
            default:
                Context context2 = view.getContext();
                activity = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity != null) {
                    AbstractC9092l.amazon(activity, new C6333l(radioStation));
                }
                break;
        }
    }
}
