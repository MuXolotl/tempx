package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؙؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4012l {
    public static final ViewGroup.LayoutParams yandex = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    public static final C8447l yandex(AbstractC15391l abstractC15391l, C11096l c11096l, C15578l c15578l) {
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l;
        C8447l c8447l;
        byte b = 0;
        if (AbstractC18206l.yandex.compareAndSet(false, true)) {
            C7119l c7119lYandex = AbstractC12098l.yandex(1, 0, null, 6);
            AbstractC10999l.mopub(AbstractC11990l.yandex((InterfaceC12932l) C13896l.f27161l.getValue()), null, 0, new C4647l((Object) c7119lYandex, (InterfaceC14029l) (b == true ? 1 : 0), 19), 3);
            C3006l c3006l = new C3006l(17, c7119lYandex);
            synchronized (AbstractC9620l.crashlytics) {
                AbstractC9620l.subs = AbstractC16901l.m4218final(c3006l, AbstractC9620l.subs);
                Unit unit = Unit.INSTANCE;
            }
            AbstractC9620l.yandex();
        }
        if (abstractC15391l.getChildCount() > 0) {
            View childAt = abstractC15391l.getChildAt(0);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC13840l) {
                viewTreeObserverOnGlobalLayoutListenerC13840l = (ViewTreeObserverOnGlobalLayoutListenerC13840l) childAt;
            }
            if (viewTreeObserverOnGlobalLayoutListenerC13840l == null) {
                viewTreeObserverOnGlobalLayoutListenerC13840l = new ViewTreeObserverOnGlobalLayoutListenerC13840l(abstractC15391l.getContext(), c11096l);
                abstractC15391l.addView(viewTreeObserverOnGlobalLayoutListenerC13840l.getView(), yandex);
            }
            if (viewTreeObserverOnGlobalLayoutListenerC13840l.getComposeViewContext() != c11096l) {
                abstractC15391l.smaato(c11096l);
            }
            if (abstractC15391l.getComposeViewContext$ui() != null) {
                c11096l.crashlytics();
                viewTreeObserverOnGlobalLayoutListenerC13840l.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = viewTreeObserverOnGlobalLayoutListenerC13840l.getTag(R.id.wrapped_composition_tag);
            c8447l = tag instanceof C8447l ? (C8447l) tag : null;
            if (c8447l == null) {
                C11803l c11803l = new C11803l(viewTreeObserverOnGlobalLayoutListenerC13840l.getRoot());
                c11096l.purchase();
                c8447l = new C8447l(viewTreeObserverOnGlobalLayoutListenerC13840l, new C6931l(c11096l.crashlytics, c11803l));
                viewTreeObserverOnGlobalLayoutListenerC13840l.setTag(R.id.wrapped_composition_tag, c8447l);
            }
            c8447l.loadAd(c15578l);
            c11096l.purchase();
            viewTreeObserverOnGlobalLayoutListenerC13840l.setFrameEndScheduler$ui(new C0596l(c11096l.crashlytics));
            return c8447l;
        }
        abstractC15391l.removeAllViews();
        viewTreeObserverOnGlobalLayoutListenerC13840l = null;
        if (viewTreeObserverOnGlobalLayoutListenerC13840l == null) {
            viewTreeObserverOnGlobalLayoutListenerC13840l = new ViewTreeObserverOnGlobalLayoutListenerC13840l(abstractC15391l.getContext(), c11096l);
            abstractC15391l.addView(viewTreeObserverOnGlobalLayoutListenerC13840l.getView(), yandex);
        }
        if (viewTreeObserverOnGlobalLayoutListenerC13840l.getComposeViewContext() != c11096l) {
            abstractC15391l.smaato(c11096l);
        }
        if (abstractC15391l.getComposeViewContext$ui() != null) {
            c11096l.crashlytics();
            viewTreeObserverOnGlobalLayoutListenerC13840l.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = viewTreeObserverOnGlobalLayoutListenerC13840l.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof C8447l) {
        }
        if (c8447l == null) {
            C11803l c11803l2 = new C11803l(viewTreeObserverOnGlobalLayoutListenerC13840l.getRoot());
            c11096l.purchase();
            c8447l = new C8447l(viewTreeObserverOnGlobalLayoutListenerC13840l, new C6931l(c11096l.crashlytics, c11803l2));
            viewTreeObserverOnGlobalLayoutListenerC13840l.setTag(R.id.wrapped_composition_tag, c8447l);
        }
        c8447l.loadAd(c15578l);
        c11096l.purchase();
        viewTreeObserverOnGlobalLayoutListenerC13840l.setFrameEndScheduler$ui(new C0596l(c11096l.crashlytics));
        return c8447l;
    }
}
