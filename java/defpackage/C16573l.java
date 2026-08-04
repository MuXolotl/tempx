package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* JADX INFO: renamed from: lٖۗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16573l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final int purchase;
    public final float yandex;

    public C16573l(Context context, XmlResourceParser xmlResourceParser) {
        this.yandex = Float.NaN;
        this.loadAd = Float.NaN;
        this.crashlytics = Float.NaN;
        this.amazon = Float.NaN;
        this.purchase = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC4914l.isPro);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.purchase);
                this.purchase = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C4759l().yandex(context, resourceId);
                }
            } else if (index == 1) {
                this.amazon = typedArrayObtainStyledAttributes.getDimension(index, this.amazon);
            } else if (index == 2) {
                this.loadAd = typedArrayObtainStyledAttributes.getDimension(index, this.loadAd);
            } else if (index == 3) {
                this.crashlytics = typedArrayObtainStyledAttributes.getDimension(index, this.crashlytics);
            } else if (index == 4) {
                this.yandex = typedArrayObtainStyledAttributes.getDimension(index, this.yandex);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
