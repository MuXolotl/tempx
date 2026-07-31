package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: lّۖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12779l extends LayoutInflater {
    public final LayoutInflater yandex;

    public C12779l(Context context, LayoutInflater layoutInflater) {
        super(layoutInflater, context);
        this.yandex = layoutInflater;
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        return new C12779l(context, this.yandex);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        int i2 = AbstractC12930l.crashlytics.get(i, i);
        if (!AbstractC12930l.purchase.contains(Integer.valueOf(i2))) {
            AbstractC12930l.amazon(i2);
        }
        if (i2 != 0) {
            View viewInflate = this.yandex.inflate(i2, viewGroup, z);
            AbstractC12930l.crashlytics(viewInflate, (SparseArray) AbstractC12930l.amazon.get(i2));
            AbstractC12930l.loadAd(viewInflate);
            return viewInflate;
        }
        TextView textView = new TextView(AbstractC12930l.yandex);
        textView.setTextSize(16.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setPadding(42, 42, 42, 42);
        textView.setTextColor(AbstractC13209l.yandex(R.attr.textColorPrimary));
        return textView;
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(String str, AttributeSet attributeSet) {
        str.getClass();
        switch (str) {
            case "WebView":
                return createView(str, "android.webkit.", attributeSet);
            case "TextureView":
            case "View":
            case "SurfaceView":
            case "ViewStub":
                return createView(str, "android.view.", attributeSet);
            default:
                return super.onCreateView(str, attributeSet);
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFactory(LayoutInflater.Factory factory) {
        super.setFactory(factory);
        this.yandex.setFactory(factory);
    }

    @Override // android.view.LayoutInflater
    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        super.setFactory2(factory2);
        LayoutInflater layoutInflater = this.yandex;
        if (layoutInflater.getFactory2() == null) {
            layoutInflater.setFactory2(new LayoutInflaterFactory2C6983l(1, factory2));
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFilter(LayoutInflater.Filter filter) {
        super.setFilter(filter);
        LayoutInflater layoutInflater = this.yandex;
        if (layoutInflater != null) {
            layoutInflater.setFilter(filter);
        }
    }
}
