package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚؓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2064l extends ViewGroup {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f4598l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f4599l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f4600l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f4601l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2494l f4602l;

    public C2064l(Context context) {
        super(context);
        this.f4600l = 5;
        ArrayList arrayList = new ArrayList();
        this.f4599l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f4598l = arrayList2;
        this.f4602l = new C2494l(17);
        setClipChildren(false);
        C5659l c5659l = new C5659l(context);
        addView(c5659l);
        arrayList.add(c5659l);
        arrayList2.add(c5659l);
        this.f4601l = 1;
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
