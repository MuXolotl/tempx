package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: lؑ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0373l implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14225l f1447l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C14126l f1448l;

    public C0373l(C14225l c14225l, C14126l c14126l) {
        this.f1447l = c14225l;
        this.f1448l = c14126l;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C14225l c14225l = this.f1447l;
        DialogInterface.OnClickListener onClickListener = c14225l.metrica;
        C14126l c14126l = this.f1448l;
        onClickListener.onClick(c14126l.loadAd, i);
        if (c14225l.adcel) {
            return;
        }
        c14126l.loadAd.dismiss();
    }
}
