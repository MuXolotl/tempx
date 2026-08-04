package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8835l extends ViewGroup {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f18142l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f18143l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f18144l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f18145l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C13645l f18146l;

    public C8835l(Context context) {
        super(context);
        this.f18144l = 5;
        ArrayList arrayList = new ArrayList();
        this.f18143l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f18142l = arrayList2;
        this.f18146l = new C13645l(11);
        setClipChildren(false);
        C15119l c15119l = new C15119l(context);
        addView(c15119l);
        arrayList.add(c15119l);
        arrayList2.add(c15119l);
        this.f18145l = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
