package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: lُؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1785l implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f4207l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4208l;

    public /* synthetic */ C1785l(int i, Object obj) {
        this.f4208l = i;
        this.f4207l = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.f4208l;
        Object obj = this.f4207l;
        switch (i2) {
            case 0:
                C11122l c11122l = (C11122l) obj;
                C4313l c4313l = c11122l.f22335l;
                c4313l.setSelection(i);
                if (c4313l.getOnItemClickListener() != null) {
                    c4313l.performItemClick(view, i, c11122l.f22333l.getItemId(i));
                }
                c11122l.dismiss();
                break;
            default:
                C15664l c15664l = (C15664l) obj;
                C2956l c2956l = c15664l.f30617l;
                if (i < 0) {
                    item = !c2956l.f6435l.isShowing() ? null : c2956l.f6419l.getSelectedItem();
                } else {
                    item = c15664l.getAdapter().getItem(i);
                }
                C15664l.yandex(c15664l, item);
                AdapterView.OnItemClickListener onItemClickListener = c15664l.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c2956l.f6435l.isShowing() ? null : c2956l.f6419l.getSelectedView();
                        i = !c2956l.f6435l.isShowing() ? -1 : c2956l.f6419l.getSelectedItemPosition();
                        j = !c2956l.f6435l.isShowing() ? Long.MIN_VALUE : c2956l.f6419l.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c2956l.f6419l, view, i, j);
                }
                c2956l.dismiss();
                break;
        }
    }
}
