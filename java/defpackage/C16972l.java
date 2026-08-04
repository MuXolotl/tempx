package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lؚۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16972l extends AbstractC0013l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f33089l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33090l;

    public /* synthetic */ C16972l(int i, Object obj) {
        this.f33090l = i;
        this.f33089l = obj;
    }

    @Override // defpackage.InterfaceC5174l
    public final void crashlytics() {
        int i = this.f33090l;
        Object obj = this.f33089l;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = ((RunnableC11679l) obj).f23425l;
                layoutInflaterFactory2C14405l.f28174l.setAlpha(1.0f);
                layoutInflaterFactory2C14405l.f28183l.amazon(null);
                layoutInflaterFactory2C14405l.f28183l = null;
                break;
            case 1:
                LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l2 = (LayoutInflaterFactory2C14405l) obj;
                layoutInflaterFactory2C14405l2.f28174l.setAlpha(1.0f);
                layoutInflaterFactory2C14405l2.f28183l.amazon(null);
                layoutInflaterFactory2C14405l2.f28183l = null;
                break;
            default:
                LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l3 = (LayoutInflaterFactory2C14405l) ((C10023l) obj).f20418l;
                layoutInflaterFactory2C14405l3.f28174l.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C14405l3.f28170l;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C14405l3.f28174l.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C14405l3.f28174l.getParent();
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    view.requestApplyInsets();
                }
                layoutInflaterFactory2C14405l3.f28174l.purchase();
                layoutInflaterFactory2C14405l3.f28183l.amazon(null);
                layoutInflaterFactory2C14405l3.f28183l = null;
                ViewGroup viewGroup = layoutInflaterFactory2C14405l3.f28201l;
                WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.AbstractC0013l, defpackage.InterfaceC5174l
    public void loadAd() {
        int i = this.f33090l;
        Object obj = this.f33089l;
        switch (i) {
            case 0:
                ((RunnableC11679l) obj).f23425l.f28174l.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) obj;
                layoutInflaterFactory2C14405l.f28174l.setVisibility(0);
                if (layoutInflaterFactory2C14405l.f28174l.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C14405l.f28174l.getParent();
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    view.requestApplyInsets();
                }
                break;
        }
    }
}
