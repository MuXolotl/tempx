package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.AbstractC14657l;
import defpackage.C8339l;
import defpackage.InterfaceC6248l;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public WeakReference f271l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f272l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f273l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public LayoutInflater f274l;

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f273l = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14657l.signatures, i, 0);
        this.f272l = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f273l = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f272l;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f274l;
    }

    public int getLayoutResource() {
        return this.f273l;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f272l = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f274l = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f273l = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f271l;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                C8339l.smaato("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            yandex();
        }
    }

    public final View yandex() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            C8339l.smaato("ViewStub must have a non-null ViewGroup viewParent");
            return null;
        }
        if (this.f273l == 0) {
            C8339l.metrica("ViewStub must have a valid layoutResource");
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f274l;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f273l, viewGroup, false);
        int i = this.f272l;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f271l = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(InterfaceC6248l interfaceC6248l) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
