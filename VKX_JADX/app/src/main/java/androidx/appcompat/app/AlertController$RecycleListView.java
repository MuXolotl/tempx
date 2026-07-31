package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import defpackage.AbstractC14657l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f62l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f63l;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14657l.tapsense);
        this.f62l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f63l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }
}
