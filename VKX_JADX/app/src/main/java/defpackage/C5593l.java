package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: lؘُؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5593l extends AbstractC1299l {

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public static final String[] f11882l = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public static final C10550l f11885l = new C10550l(0, PointF.class, "topLeft");

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final C10550l f11881l = new C10550l(1, PointF.class, "bottomRight");

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public static final C10550l f11883l = new C10550l(2, PointF.class, "bottomRight");

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public static final C10550l f11880l = new C10550l(3, PointF.class, "topLeft");

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public static final C10550l f11884l = new C10550l(4, PointF.class, "position");

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static void m1828extends(C18285l c18285l) {
        View view = c18285l.loadAd;
        HashMap map = c18285l.yandex;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.AbstractC1299l
    public final void admob(C18285l c18285l) {
        m1828extends(c18285l);
    }

    @Override // defpackage.AbstractC1299l
    public final String[] ads() {
        return f11882l;
    }

    @Override // defpackage.AbstractC1299l
    public final void amazon(C18285l c18285l) {
        m1828extends(c18285l);
    }

    @Override // defpackage.AbstractC1299l
    public final Animator smaato(ViewGroup viewGroup, C18285l c18285l, C18285l c18285l2) {
        int i;
        C5593l c5593l;
        Animator animatorYandex;
        if (c18285l == null) {
            return null;
        }
        HashMap map = c18285l.yandex;
        if (c18285l2 == null) {
            return null;
        }
        HashMap map2 = c18285l2.yandex;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c18285l2.loadAd;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 <= 0) {
            return null;
        }
        AbstractC4770l.yandex(view, i2, i4, i6, i8);
        if (i14 != 2) {
            c5593l = this;
            if (i2 == i3 && i4 == i5) {
                c5593l.f3354l.getClass();
                animatorYandex = AbstractC7018l.yandex(view, f11883l, C6565l.tapsense(i6, i8, i7, i9));
            } else {
                c5593l.f3354l.getClass();
                animatorYandex = AbstractC7018l.yandex(view, f11880l, C6565l.tapsense(i2, i4, i3, i5));
            }
        } else if (i10 == i12 && i11 == i13) {
            c5593l = this;
            c5593l.f3354l.getClass();
            animatorYandex = AbstractC7018l.yandex(view, f11884l, C6565l.tapsense(i2, i4, i3, i5));
        } else {
            c5593l = this;
            C15579l c15579l = new C15579l(view);
            c5593l.f3354l.getClass();
            ObjectAnimator objectAnimatorYandex = AbstractC7018l.yandex(c15579l, f11885l, C6565l.tapsense(i2, i4, i3, i5));
            c5593l.f3354l.getClass();
            ObjectAnimator objectAnimatorYandex2 = AbstractC7018l.yandex(c15579l, f11881l, C6565l.tapsense(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorYandex, objectAnimatorYandex2);
            animatorSet.addListener(new C7309l(c15579l));
            animatorYandex = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC13702l.billing(viewGroup4, true);
            c5593l.startapp().yandex(new C1093l(viewGroup4));
        }
        return animatorYandex;
    }
}
