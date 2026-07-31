package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.metrica;

/* JADX INFO: renamed from: lؙْؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C13036l extends ViewGroup.MarginLayoutParams {
    public boolean amazon;
    public boolean crashlytics;
    public final Rect loadAd;
    public metrica yandex;

    public C13036l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadAd = new Rect();
        this.crashlytics = true;
        this.amazon = false;
    }

    public C13036l(int i, int i2) {
        super(i, i2);
        this.loadAd = new Rect();
        this.crashlytics = true;
        this.amazon = false;
    }

    public C13036l(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.loadAd = new Rect();
        this.crashlytics = true;
        this.amazon = false;
    }

    public C13036l(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.loadAd = new Rect();
        this.crashlytics = true;
        this.amazon = false;
    }

    public C13036l(C13036l c13036l) {
        super((ViewGroup.LayoutParams) c13036l);
        this.loadAd = new Rect();
        this.crashlytics = true;
        this.amazon = false;
    }
}
