package defpackage;

import android.view.View;
import java.util.Stack;

/* JADX INFO: renamed from: lّٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15634l implements InterfaceC14255l {
    public final /* synthetic */ C9967l crashlytics;
    public final /* synthetic */ AbstractC17777l loadAd;
    public final /* synthetic */ View yandex;

    public C15634l(C9967l c9967l, View view, View view2, View view3, AbstractC17777l abstractC17777l) {
        this.crashlytics = c9967l;
        this.yandex = view;
        this.loadAd = abstractC17777l;
    }

    @Override // defpackage.InterfaceC14255l
    public final void loadAd() {
        this.yandex.setVisibility(0);
    }

    @Override // defpackage.InterfaceC14255l
    public final void yandex(C1796l c1796l) {
        c1796l.loadAd();
        C9967l c9967l = this.crashlytics;
        ((InterfaceC9215l) c9967l.f20348l.f9862l).getClass();
        c9967l.f20348l = null;
        this.loadAd.getClass();
        if (c9967l.f20330l.size() > 1) {
            Stack stack = c9967l.f20330l;
            C9967l c9967l2 = ((AbstractC17777l) stack.get(stack.size() - 2)).f34613l;
            InterfaceC10665l instanceDefaultTouchTransformer = c9967l2 != null ? c9967l2.getInstanceDefaultTouchTransformer() : null;
            if (instanceDefaultTouchTransformer == null) {
                instanceDefaultTouchTransformer = C9967l.getDefaultTouchTransformer();
            }
            c9967l.f20342l = instanceDefaultTouchTransformer;
            ((C4269l) instanceDefaultTouchTransformer).getClass();
            c9967l.f20332l = new EnumC14806l[]{EnumC14806l.f28954l};
        }
        c9967l.loadAd();
        c9967l.admob();
        if (c9967l.getBackView() != null) {
            c9967l.getBackView().setVisibility(8);
        }
        InterfaceC9686l interfaceC9686l = c9967l.f20347l;
        if (interfaceC9686l != null) {
            ((AbstractActivityC2569l) interfaceC9686l).Signature();
        }
    }
}
