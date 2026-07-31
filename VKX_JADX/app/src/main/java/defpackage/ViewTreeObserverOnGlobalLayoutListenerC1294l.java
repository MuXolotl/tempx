package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؒۙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1294l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f3339l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3340l;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1294l(int i, Object obj) {
        this.f3340l = i;
        this.f3339l = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f3340l;
        Object obj = this.f3339l;
        switch (i) {
            case 0:
                C4313l c4313l = (C4313l) obj;
                if (!c4313l.getInternalPopup().loadAd()) {
                    c4313l.f8853l.metrica(c4313l.getTextDirection(), c4313l.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c4313l.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                C11122l c11122l = (C11122l) obj;
                C4313l c4313l2 = c11122l.f22335l;
                if (c4313l2.isAttachedToWindow() && c4313l2.getGlobalVisibleRect(c11122l.f22334l)) {
                    c11122l.subscription();
                    c11122l.mopub();
                } else {
                    c11122l.dismiss();
                }
                break;
            case 2:
                ViewOnKeyListenerC8334l viewOnKeyListenerC8334l = (ViewOnKeyListenerC8334l) obj;
                ArrayList arrayList = viewOnKeyListenerC8334l.f17243l;
                if (viewOnKeyListenerC8334l.loadAd() && arrayList.size() > 0 && !((C11095l) arrayList.get(0)).yandex.f6430l) {
                    View view = viewOnKeyListenerC8334l.f17251l;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C11095l) it.next()).yandex.mopub();
                        }
                    } else {
                        viewOnKeyListenerC8334l.dismiss();
                    }
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC12191l viewOnKeyListenerC12191l = (ViewOnKeyListenerC12191l) obj;
                C1632l c1632l = viewOnKeyListenerC12191l.f24219l;
                if (viewOnKeyListenerC12191l.loadAd() && !c1632l.f6430l) {
                    View view2 = viewOnKeyListenerC12191l.f24215l;
                    if (view2 != null && view2.isShown()) {
                        c1632l.mopub();
                    } else {
                        viewOnKeyListenerC12191l.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
