package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;

/* JADX INFO: renamed from: lؙٞؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6621l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AudioBook f13857l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13858l;

    public /* synthetic */ ViewOnClickListenerC6621l(AudioBook audioBook, int i) {
        this.f13858l = i;
        this.f13857l = audioBook;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        int i = this.f13858l;
        AudioBook audioBook = this.f13857l;
        switch (i) {
            case 0:
                Context context = view.getContext();
                activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    AbstractC1213l.billing(activity, new C13849l(audioBook.yandex));
                }
                break;
            default:
                Context context2 = view.getContext();
                activity = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity != null) {
                    AbstractC1213l.billing(activity, new C13849l(audioBook.yandex));
                }
                break;
        }
    }
}
