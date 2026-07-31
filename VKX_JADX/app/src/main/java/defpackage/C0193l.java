package defpackage;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: renamed from: lًؑۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0193l extends LinkMovementMethod {
    public C17297l yandex;

    public static C17297l yandex(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int scrollX = textView.getScrollX() + (((int) motionEvent.getX()) - textView.getTotalPaddingLeft());
        int scrollY = textView.getScrollY() + (((int) motionEvent.getY()) - textView.getTotalPaddingTop());
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        C17297l[] c17297lArr = (C17297l[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, C17297l.class);
        if (c17297lArr.length <= 0) {
            return null;
        }
        C17297l c17297l = c17297lArr[0];
        if (offsetForHorizontal < spannable.getSpanStart(c17297l) || offsetForHorizontal > spannable.getSpanEnd(c17297l)) {
            return null;
        }
        return c17297lArr[0];
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C17297l c17297lYandex = yandex(textView, spannable, motionEvent);
            this.yandex = c17297lYandex;
            if (c17297lYandex != null) {
                c17297lYandex.f33572l = true;
                Selection.setSelection(spannable, spannable.getSpanStart(c17297lYandex), spannable.getSpanEnd(this.yandex));
                return true;
            }
        } else {
            if (motionEvent.getAction() != 2) {
                C17297l c17297l = this.yandex;
                if (c17297l != null) {
                    c17297l.f33572l = false;
                    super.onTouchEvent(textView, spannable, motionEvent);
                }
                this.yandex = null;
                Selection.removeSelection(spannable);
                return true;
            }
            C17297l c17297lYandex2 = yandex(textView, spannable, motionEvent);
            C17297l c17297l2 = this.yandex;
            if (c17297l2 != null && c17297lYandex2 != c17297l2) {
                c17297l2.f33572l = false;
                this.yandex = null;
                Selection.removeSelection(spannable);
            }
        }
        return true;
    }
}
