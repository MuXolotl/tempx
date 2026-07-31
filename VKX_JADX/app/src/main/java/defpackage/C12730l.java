package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: lَّٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12730l {
    public static final SparseIntArray isPro;
    public String admob;
    public float amazon;
    public float billing;
    public int crashlytics;
    public int loadAd;
    public int mopub;
    public float purchase;
    public int subs;
    public int yandex;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        isPro = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void yandex(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4914l.billing);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (isPro.get(index)) {
                case 1:
                    this.purchase = typedArrayObtainStyledAttributes.getFloat(index, this.purchase);
                    break;
                case 2:
                    this.crashlytics = typedArrayObtainStyledAttributes.getInt(index, this.crashlytics);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC5711l.yandex[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.yandex = C4759l.purchase(typedArrayObtainStyledAttributes, index, this.yandex);
                    break;
                case 6:
                    this.loadAd = typedArrayObtainStyledAttributes.getInteger(index, this.loadAd);
                    break;
                case 7:
                    this.amazon = typedArrayObtainStyledAttributes.getFloat(index, this.amazon);
                    break;
                case 8:
                    this.mopub = typedArrayObtainStyledAttributes.getInteger(index, this.mopub);
                    break;
                case 9:
                    this.billing = typedArrayObtainStyledAttributes.getFloat(index, this.billing);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.subs = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.admob = string;
                        if (string.indexOf("/") > 0) {
                            this.subs = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.subs);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
