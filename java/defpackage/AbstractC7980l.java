package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًٌٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7980l {
    public static final C13660l yandex;

    static {
        long[] jArr = AbstractC12154l.yandex;
        yandex = new C13660l();
    }

    public static final C4791l loadAd(View view) {
        InterfaceC12932l interfaceC12932l;
        C2552l c2552l;
        if (!view.isAttachedToWindow()) {
            AbstractC0081l.crashlytics("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objBilling = AbstractC6710l.billing(view);
        while (objBilling instanceof View) {
            View view2 = (View) objBilling;
            if (view2.getId() == 16908290) {
                break;
            }
            objBilling = view2.getParent();
            view = view2;
        }
        AbstractC0306l abstractC0306lYandex = yandex(view);
        InterfaceC14029l interfaceC14029l = null;
        if (abstractC0306lYandex != null) {
            if (abstractC0306lYandex instanceof C4791l) {
                return (C4791l) abstractC0306lYandex;
            }
            C8339l.smaato("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((C5102l) AbstractC2513l.yandex.get()).getClass();
        InterfaceC12932l interfaceC12932l2 = C17218l.f33421l;
        C8688l c8688l = C13896l.f27161l;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            interfaceC12932l = (InterfaceC12932l) C13896l.f27161l.getValue();
        } else {
            interfaceC12932l = (InterfaceC12932l) C13896l.f27162l.get();
            if (interfaceC12932l == null) {
                C8339l.smaato("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        InterfaceC12932l interfaceC12932lMo246l = interfaceC12932l.mo246l(interfaceC12932l2);
        InterfaceC13854l interfaceC13854l = (InterfaceC13854l) interfaceC12932lMo246l.mo245l(C11140l.f22361l);
        if (interfaceC13854l != null) {
            c2552l = new C2552l(interfaceC13854l);
            C11919l c11919l = (C11919l) c2552l.f5556l;
            synchronized (c11919l.f23763l) {
                c11919l.f23764l = false;
                Unit unit = Unit.INSTANCE;
            }
        } else {
            c2552l = null;
        }
        C10700l c10700l = new C10700l();
        InterfaceC12932l c18307l = (InterfaceC1110l) interfaceC12932lMo246l.mo245l(C15617l.f30492l);
        if (c18307l == null) {
            c18307l = new C18307l(view.getContext().getApplicationContext());
            c10700l.f21708l = c18307l;
        }
        if (c2552l != null) {
            interfaceC12932l2 = c2552l;
        }
        InterfaceC12932l interfaceC12932lMo246l2 = interfaceC12932lMo246l.mo246l(interfaceC12932l2).mo246l(c18307l);
        C4791l c4791l = new C4791l(interfaceC12932lMo246l2);
        c4791l.m1607native();
        C18662l c18662lYandex = AbstractC11990l.yandex(interfaceC12932lMo246l2);
        InterfaceC3177l interfaceC3177lPurchase = AbstractC6889l.purchase(view);
        AbstractC6475l abstractC6475lLoadAd = interfaceC3177lPurchase != null ? interfaceC3177lPurchase.loadAd() : null;
        if (abstractC6475lLoadAd == null) {
            AbstractC0081l.amazon("ViewTreeLifecycleOwner not found from " + view);
            C17132l.firebase();
            return null;
        }
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC17311l(view, c4791l));
        abstractC6475lLoadAd.yandex(new C11576l(c18662lYandex, c2552l, c4791l, c10700l));
        view.setTag(R.id.androidx_compose_ui_view_composition_context, c4791l);
        C1732l c1732l = C1732l.f4136l;
        Handler handler = view.getHandler();
        int i = AbstractC8991l.yandex;
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC11783l(4, AbstractC10999l.mopub(c1732l, new C2975l(handler, "windowRecomposer cleanup", false).f6462l, 0, new C15556l(c4791l, view, interfaceC14029l, 19), 2)));
        return c4791l;
    }

    public static final AbstractC0306l yandex(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0306l) {
            return (AbstractC0306l) tag;
        }
        return null;
    }
}
