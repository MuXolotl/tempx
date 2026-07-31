package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: renamed from: lَّّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12564l {
    public C11140l firebase;
    public C11140l isPro;
    public C11140l smaato;
    public C11140l subs;
    public AbstractC16431l yandex = new C10978l();
    public AbstractC16431l loadAd = new C10978l();
    public AbstractC16431l crashlytics = new C10978l();
    public AbstractC16431l amazon = new C10978l();
    public InterfaceC13600l purchase = new C16304l(0.0f);
    public InterfaceC13600l billing = new C16304l(0.0f);
    public InterfaceC13600l mopub = new C16304l(0.0f);
    public InterfaceC13600l admob = new C16304l(0.0f);

    public C12564l() {
        int i = 0;
        this.subs = new C11140l(i);
        this.isPro = new C11140l(i);
        this.firebase = new C11140l(i);
        this.smaato = new C11140l(i);
    }

    public static InterfaceC13600l crashlytics(TypedArray typedArray, int i, InterfaceC13600l interfaceC13600l) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C16304l(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C1255l(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC13600l;
    }

    public static C4968l loadAd(Context context, AttributeSet attributeSet, int i, int i2) {
        C16304l c16304l = new C16304l(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4548l.adcel, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return yandex(context, resourceId, resourceId2, c16304l);
    }

    public static C4968l yandex(Context context, int i, int i2, C16304l c16304l) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC4548l.license);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC13600l interfaceC13600lCrashlytics = crashlytics(typedArrayObtainStyledAttributes, 5, c16304l);
            InterfaceC13600l interfaceC13600lCrashlytics2 = crashlytics(typedArrayObtainStyledAttributes, 8, interfaceC13600lCrashlytics);
            InterfaceC13600l interfaceC13600lCrashlytics3 = crashlytics(typedArrayObtainStyledAttributes, 9, interfaceC13600lCrashlytics);
            InterfaceC13600l interfaceC13600lCrashlytics4 = crashlytics(typedArrayObtainStyledAttributes, 7, interfaceC13600lCrashlytics);
            InterfaceC13600l interfaceC13600lCrashlytics5 = crashlytics(typedArrayObtainStyledAttributes, 6, interfaceC13600lCrashlytics);
            C4968l c4968l = new C4968l();
            c4968l.yandex = AbstractC11621l.amazon(i4);
            c4968l.purchase = interfaceC13600lCrashlytics2;
            c4968l.loadAd = AbstractC11621l.amazon(i5);
            c4968l.billing = interfaceC13600lCrashlytics3;
            c4968l.crashlytics = AbstractC11621l.amazon(i6);
            c4968l.mopub = interfaceC13600lCrashlytics4;
            c4968l.amazon = AbstractC11621l.amazon(i7);
            c4968l.admob = interfaceC13600lCrashlytics5;
            return c4968l;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean amazon(RectF rectF) {
        boolean z = this.smaato.getClass().equals(C11140l.class) && this.isPro.getClass().equals(C11140l.class) && this.subs.getClass().equals(C11140l.class) && this.firebase.getClass().equals(C11140l.class);
        float fYandex = this.purchase.yandex(rectF);
        return z && ((this.billing.yandex(rectF) > fYandex ? 1 : (this.billing.yandex(rectF) == fYandex ? 0 : -1)) == 0 && (this.admob.yandex(rectF) > fYandex ? 1 : (this.admob.yandex(rectF) == fYandex ? 0 : -1)) == 0 && (this.mopub.yandex(rectF) > fYandex ? 1 : (this.mopub.yandex(rectF) == fYandex ? 0 : -1)) == 0) && ((this.loadAd instanceof C10978l) && (this.yandex instanceof C10978l) && (this.crashlytics instanceof C10978l) && (this.amazon instanceof C10978l));
    }

    public final C4968l purchase() {
        C4968l c4968l = new C4968l();
        c4968l.yandex = this.yandex;
        c4968l.loadAd = this.loadAd;
        c4968l.crashlytics = this.crashlytics;
        c4968l.amazon = this.amazon;
        c4968l.purchase = this.purchase;
        c4968l.billing = this.billing;
        c4968l.mopub = this.mopub;
        c4968l.admob = this.admob;
        c4968l.subs = this.subs;
        c4968l.isPro = this.isPro;
        c4968l.firebase = this.firebase;
        c4968l.smaato = this.smaato;
        return c4968l;
    }
}
