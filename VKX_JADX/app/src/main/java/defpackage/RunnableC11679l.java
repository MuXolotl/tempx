package defpackage;

import android.view.ViewGroup;

/* JADX INFO: renamed from: lؙِٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC11679l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C14405l f23425l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23426l;

    public /* synthetic */ RunnableC11679l(LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l, int i) {
        this.f23426l = i;
        this.f23425l = layoutInflaterFactory2C14405l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f23426l;
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = this.f23425l;
        switch (i) {
            case 0:
                if ((layoutInflaterFactory2C14405l.f28191l & 1) != 0) {
                    layoutInflaterFactory2C14405l.ad(0);
                }
                if ((layoutInflaterFactory2C14405l.f28191l & 4096) != 0) {
                    layoutInflaterFactory2C14405l.ad(108);
                }
                layoutInflaterFactory2C14405l.f28176l = false;
                layoutInflaterFactory2C14405l.f28191l = 0;
                break;
            default:
                layoutInflaterFactory2C14405l.f28170l.showAtLocation(layoutInflaterFactory2C14405l.f28174l, 55, 0, 0);
                C2932l c2932l = layoutInflaterFactory2C14405l.f28183l;
                if (c2932l != null) {
                    c2932l.loadAd();
                }
                if (layoutInflaterFactory2C14405l.f28192l && (viewGroup = layoutInflaterFactory2C14405l.f28201l) != null && viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C14405l.f28174l.setAlpha(0.0f);
                    C2932l c2932lYandex = AbstractC15872l.yandex(layoutInflaterFactory2C14405l.f28174l);
                    c2932lYandex.yandex(1.0f);
                    layoutInflaterFactory2C14405l.f28183l = c2932lYandex;
                    c2932lYandex.amazon(new C16972l(0, this));
                } else {
                    layoutInflaterFactory2C14405l.f28174l.setAlpha(1.0f);
                    layoutInflaterFactory2C14405l.f28174l.setVisibility(0);
                }
                break;
        }
    }
}
