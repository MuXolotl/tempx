package com.skydoves.balloon.vectortext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC12396l;
import defpackage.AbstractC1753l;
import defpackage.AbstractC3308l;
import defpackage.AbstractC9277l;
import defpackage.C9189l;
import defpackage.C9675l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/skydoves/balloon/vectortext/VectorTextView;", "Llٌۦؕ;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Llٍٍٛ;", "value", "lؕؕؒ", "Llٍٍٛ;", "getDrawableTextViewParams", "()Llٍٍٛ;", "setDrawableTextViewParams", "(Llٍٍٛ;)V", "drawableTextViewParams", "balloon_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VectorTextView extends C9189l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters and from kotlin metadata */
    public C9675l drawableTextViewParams;

    public VectorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC9277l.yandex);
            setDrawableTextViewParams(new C9675l(AbstractC3308l.isPro(typedArrayObtainStyledAttributes.getResourceId(5, RecyclerView.UNDEFINED_DURATION)), AbstractC3308l.isPro(typedArrayObtainStyledAttributes.getResourceId(1, RecyclerView.UNDEFINED_DURATION)), AbstractC3308l.isPro(typedArrayObtainStyledAttributes.getResourceId(0, RecyclerView.UNDEFINED_DURATION)), AbstractC3308l.isPro(typedArrayObtainStyledAttributes.getResourceId(7, RecyclerView.UNDEFINED_DURATION)), null, null, null, null, AbstractC3308l.isPro(typedArrayObtainStyledAttributes.getResourceId(3, RecyclerView.UNDEFINED_DURATION)), AbstractC3308l.isPro(typedArrayObtainStyledAttributes.getColor(6, RecyclerView.UNDEFINED_DURATION)), AbstractC3308l.isPro(typedArrayObtainStyledAttributes.getResourceId(8, RecyclerView.UNDEFINED_DURATION)), AbstractC3308l.isPro(typedArrayObtainStyledAttributes.getResourceId(2, RecyclerView.UNDEFINED_DURATION)), AbstractC3308l.isPro(typedArrayObtainStyledAttributes.getResourceId(4, RecyclerView.UNDEFINED_DURATION)), 8176));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final C9675l getDrawableTextViewParams() {
        return this.drawableTextViewParams;
    }

    public final void setDrawableTextViewParams(C9675l c9675l) {
        if (c9675l != null) {
            AbstractC12396l.loadAd(this, c9675l);
        } else {
            c9675l = null;
        }
        this.drawableTextViewParams = c9675l;
    }

    public VectorTextView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VectorTextView(Context context, AttributeSet attributeSet, int i, AbstractC1753l abstractC1753l) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
