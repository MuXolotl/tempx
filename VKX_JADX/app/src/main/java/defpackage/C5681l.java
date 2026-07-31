package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: lؘٔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5681l implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C2956l f12075l;

    public C5681l(C2956l c2956l) {
        this.f12075l = c2956l;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C9945l c9945l;
        if (i == -1 || (c9945l = this.f12075l.f6419l) == null) {
            return;
        }
        c9945l.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
