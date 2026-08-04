package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lٌَؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC10099l implements View.OnFocusChangeListener {
    public final /* synthetic */ AbstractC13799l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ ViewOnFocusChangeListenerC10099l(AbstractC13799l abstractC13799l, int i) {
        this.yandex = i;
        this.loadAd = abstractC13799l;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.yandex;
        AbstractC13799l abstractC13799l = this.loadAd;
        switch (i) {
            case 0:
                C1500l c1500l = (C1500l) abstractC13799l;
                c1500l.subscription(c1500l.tapsense());
                break;
            default:
                C0602l c0602l = (C0602l) abstractC13799l;
                c0602l.smaato = z;
                c0602l.startapp();
                if (!z) {
                    c0602l.subscription(false);
                    c0602l.remoteconfig = false;
                }
                break;
        }
    }
}
