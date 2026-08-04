package defpackage;

import java.util.ArrayList;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lَؙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10505l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ boolean f21374l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ NextDockView f21375l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21376l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f21377l;

    public /* synthetic */ RunnableC10505l(int i, NextDockView nextDockView, boolean z, boolean z2) {
        this.f21376l = i;
        this.f21375l = nextDockView;
        this.f21374l = z;
        this.f21377l = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        NextDockView nextDockView = this.f21375l;
        ArrayList arrayList = nextDockView.f36849l;
        int size = arrayList.size();
        int i2 = this.f21376l;
        if (i2 > size || i2 < 0) {
            StringBuilder sbSignature = AbstractC2812l.Signature("index overflow / idx: ", i2, "; itemSize: ");
            sbSignature.append(arrayList.size());
            AbstractC2991l.billing("NextDock", 5, sbSignature.toString(), null);
        } else if ((!this.f21374l || ((Boolean) nextDockView.f36852l.invoke(((C9359l) arrayList.get(i2)).yandex.yandex)).booleanValue()) && (i = nextDockView.f36848l) != i2) {
            C9359l c9359l = (C9359l) AbstractC16901l.m4220for(i, arrayList);
            boolean z = this.f21377l;
            if (c9359l != null) {
                c9359l.loadAd(false, z);
            }
            ((C9359l) arrayList.get(i2)).loadAd(true, z);
            nextDockView.f36848l = i2;
        }
    }
}
