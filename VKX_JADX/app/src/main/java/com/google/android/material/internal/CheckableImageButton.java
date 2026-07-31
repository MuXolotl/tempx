package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.AbstractC15872l;
import defpackage.C10318l;
import defpackage.C10325l;
import defpackage.C5841l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class CheckableImageButton extends C10318l implements Checkable {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final int[] f678l = {R.attr.state_checked};

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f679l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f680l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f681l;

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f679l = true;
        this.f681l = true;
        AbstractC15872l.vip(this, new C5841l(this, 1));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f680l;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f680l ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f678l) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C10325l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C10325l c10325l = (C10325l) parcelable;
        super.onRestoreInstanceState(c10325l.f5855l);
        setChecked(c10325l.f21050l);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C10325l c10325l = new C10325l(super.onSaveInstanceState());
        c10325l.f21050l = this.f680l;
        return c10325l;
    }

    public void setCheckable(boolean z) {
        if (this.f679l != z) {
            this.f679l = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f679l || this.f680l == z) {
            return;
        }
        this.f680l = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f681l = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f681l) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f680l);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ua.itaysonlab.vkx.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }
}
