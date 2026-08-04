package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lؚْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13204l {
    public static final C13204l yandex = new C13204l();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(C13177l c13177l, C7819l c7819l, AbstractC0283l abstractC0283l) {
        C9357l c9357l;
        if (abstractC0283l instanceof C9357l) {
            c9357l = (C9357l) abstractC0283l;
            int i = c9357l.f19186l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9357l.f19186l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9357l = new C9357l(this, abstractC0283l);
            }
        } else {
            c9357l = new C9357l(this, abstractC0283l);
        }
        Object objCrashlytics = c9357l.f19187l;
        int i2 = c9357l.f19186l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            c9357l.f19188l = c7819l;
            c9357l.f19186l = 1;
            objCrashlytics = c13177l.crashlytics(c7819l, c9357l);
            Object obj = EnumC9342l.f19165l;
            if (objCrashlytics == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c7819l = c9357l.f19188l;
            AbstractC2829l.crashlytics(objCrashlytics);
        }
        InterfaceC11509l interfaceC11509l = (InterfaceC11509l) objCrashlytics;
        if (interfaceC11509l instanceof C6165l) {
            C6165l c6165l = (C6165l) interfaceC11509l;
            return new C16508l(C5883l.loadAd(c6165l.yandex, c7819l.yandex, 1), c6165l);
        }
        if (!(interfaceC11509l instanceof C14542l)) {
            C18725l.billing();
            return null;
        }
        C14542l c14542l = (C14542l) interfaceC11509l;
        InterfaceC1286l interfaceC1286l = c14542l.yandex;
        return new C10710l(interfaceC1286l != null ? C5883l.loadAd(interfaceC1286l, c7819l.yandex, 1) : null, c14542l);
    }
}
