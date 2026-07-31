package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: lِؕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3330l {
    public static final SparseIntArray vip;
    public int admob;
    public float amazon;
    public float billing;
    public float crashlytics;
    public float firebase;
    public float isPro;
    public float loadAd;
    public float mopub;
    public float purchase;
    public float remoteconfig;
    public boolean smaato;
    public float subs;
    public float yandex;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        vip = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void yandex(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4914l.subs);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (vip.get(index)) {
                case 1:
                    this.yandex = typedArrayObtainStyledAttributes.getFloat(index, this.yandex);
                    break;
                case 2:
                    this.loadAd = typedArrayObtainStyledAttributes.getFloat(index, this.loadAd);
                    break;
                case 3:
                    this.crashlytics = typedArrayObtainStyledAttributes.getFloat(index, this.crashlytics);
                    break;
                case 4:
                    this.amazon = typedArrayObtainStyledAttributes.getFloat(index, this.amazon);
                    break;
                case 5:
                    this.purchase = typedArrayObtainStyledAttributes.getFloat(index, this.purchase);
                    break;
                case 6:
                    this.billing = typedArrayObtainStyledAttributes.getDimension(index, this.billing);
                    break;
                case 7:
                    this.mopub = typedArrayObtainStyledAttributes.getDimension(index, this.mopub);
                    break;
                case 8:
                    this.subs = typedArrayObtainStyledAttributes.getDimension(index, this.subs);
                    break;
                case 9:
                    this.isPro = typedArrayObtainStyledAttributes.getDimension(index, this.isPro);
                    break;
                case 10:
                    this.firebase = typedArrayObtainStyledAttributes.getDimension(index, this.firebase);
                    break;
                case 11:
                    this.smaato = true;
                    this.remoteconfig = typedArrayObtainStyledAttributes.getDimension(index, this.remoteconfig);
                    break;
                case 12:
                    this.admob = C4759l.purchase(typedArrayObtainStyledAttributes, index, this.admob);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
