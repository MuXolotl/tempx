package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: renamed from: lْٚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC13486l implements View.OnDragListener, InterfaceC17324l {
    public final C8449l yandex = new C8449l(null, 3);
    public final C10834l loadAd = new C10834l(0);
    public final C3360l crashlytics = new C3360l(this);

    public ViewOnDragListenerC13486l(C4236l c4236l) {
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C1323l c1323l = new C1323l(dragEvent);
        int action = dragEvent.getAction();
        C10834l c10834l = this.loadAd;
        C8449l c8449l = this.yandex;
        switch (action) {
            case 1:
                C9122l c9122l = new C9122l();
                C12683l c12683l = new C12683l(c1323l, c8449l, c9122l, 3);
                if (c12683l.invoke(c8449l) == EnumC8647l.f17806l) {
                    AbstractC13359l.isPro(c8449l, c12683l);
                }
                boolean z = c9122l.f18750l;
                c10834l.getClass();
                C11786l c11786l = new C11786l(c10834l);
                while (c11786l.hasNext()) {
                    ((InterfaceC18545l) c11786l.next()).mo2321implements(c1323l);
                }
                return z;
            case 2:
                c8449l.mo2323l(c1323l);
                return false;
            case 3:
                return c8449l.mo2322l(c1323l);
            case 4:
                c8449l.mo2324package(c1323l);
                c10834l.clear();
                return false;
            case 5:
                c8449l.pro(c1323l);
                return false;
            case 6:
                c8449l.mo2325public(c1323l);
                return false;
            default:
                return false;
        }
    }
}
