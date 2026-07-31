package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.C12418l;
import defpackage.C17858l;
import defpackage.InterfaceC16405l;
import defpackage.InterfaceC9863l;
import defpackage.MenuC4984l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC9863l, InterfaceC16405l, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final int[] f76l = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public MenuC4984l f77l;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C12418l c12418lPro = C12418l.pro(context, attributeSet, f76l, i);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c12418lPro.ads(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c12418lPro.ads(1));
        }
        c12418lPro.advert();
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.InterfaceC16405l
    public final void loadAd(MenuC4984l menuC4984l) {
        this.f77l = menuC4984l;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        yandex((C17858l) getAdapter().getItem(i));
    }

    @Override // defpackage.InterfaceC9863l
    public final boolean yandex(C17858l c17858l) {
        return this.f77l.adcel(c17858l, null, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
