package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٔ۠ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC15229l implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15391l f29827l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29828l;

    public /* synthetic */ ViewOnAttachStateChangeListenerC15229l(AbstractC15391l abstractC15391l, int i) {
        this.f29828l = i;
        this.f29827l = abstractC15391l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f29828l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        int i = this.f29828l;
        AbstractC15391l abstractC15391l = this.f29827l;
        switch (i) {
            case 0:
                abstractC15391l.purchase();
                break;
            default:
                Iterator it = AbstractC17587l.remoteconfig(abstractC15391l.getParent(), C0626l.f2079l).iterator();
                while (true) {
                    z = false;
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            Object tag = ((View) obj).getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    abstractC15391l.purchase();
                }
                break;
        }
    }

    private final void loadAd(View view) {
    }

    private final void yandex(View view) {
    }
}
