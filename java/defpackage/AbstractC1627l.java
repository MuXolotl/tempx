package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؓؖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1627l {
    public static final C8540l yandex = new C8540l(new C1990l(25));

    public static InterfaceC14926l yandex(C6956l c6956l) {
        InterfaceC14926l interfaceC14926l = (InterfaceC14926l) c6956l.isPro(yandex);
        Object obj = null;
        if (interfaceC14926l == null) {
            c6956l.m2123default(1208426157);
            View view = (View) c6956l.isPro(AbstractC1242l.billing);
            while (true) {
                if (view == null) {
                    interfaceC14926l = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                InterfaceC14926l interfaceC14926l2 = tag instanceof InterfaceC14926l ? (InterfaceC14926l) tag : null;
                if (interfaceC14926l2 != null) {
                    interfaceC14926l = interfaceC14926l2;
                    break;
                }
                Object objBilling = AbstractC6710l.billing(view);
                view = objBilling instanceof View ? (View) objBilling : null;
            }
        } else {
            c6956l.m2123default(1208423708);
        }
        c6956l.startapp(false);
        if (interfaceC14926l != null) {
            c6956l.m2123default(1208423789);
            c6956l.startapp(false);
            return interfaceC14926l;
        }
        c6956l.m2123default(1208428160);
        for (Context baseContext = (Context) c6956l.isPro(AbstractC1242l.loadAd); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof InterfaceC14926l) {
                obj = baseContext;
                break;
            }
        }
        InterfaceC14926l interfaceC14926l3 = (InterfaceC14926l) obj;
        c6956l.startapp(false);
        return interfaceC14926l3;
    }
}
