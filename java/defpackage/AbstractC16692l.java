package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16692l {
    public static final C10707l yandex = new C10707l(new C3342l(0));
    public static final C11891l loadAd = new C11891l(14);

    public static final InterfaceC13515l loadAd(EnumC16103l enumC16103l, C10537l c10537l, C6956l c6956l, int i) {
        c6956l.m2123default(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            c6956l.startapp(false);
            return null;
        }
        Context context = (Context) c6956l.isPro(AbstractC1242l.loadAd);
        InterfaceC12932l interfaceC12932l = (InterfaceC12932l) c6956l.isPro(yandex);
        boolean zBilling = ((((i & 112) ^ 48) > 32 && c6956l.billing(c10537l)) || (i & 48) == 32) | c6956l.billing(interfaceC12932l) | c6956l.billing(context);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            loadAd.getClass();
            objM2132native = new C11528l(interfaceC12932l, context, enumC16103l, c10537l);
            c6956l.m2147try(objM2132native);
        }
        InterfaceC13515l interfaceC13515l = (InterfaceC13515l) objM2132native;
        c6956l.startapp(false);
        return interfaceC13515l;
    }

    public static final void yandex(C18624l c18624l, Context context, boolean z, CharSequence charSequence, C12814l c12814l, InterfaceC13515l interfaceC13515l, Function1 function1) {
        if (Build.VERSION.SDK_INT >= 28 && charSequence != null && c12814l != null && interfaceC13515l != null && (interfaceC13515l instanceof C11528l)) {
            ((C11528l) interfaceC13515l).loadAd(c18624l, charSequence, c12814l.yandex, function1);
            AbstractC16947l.yandex(c18624l, context, z, charSequence, c12814l.yandex);
            return;
        }
        function1.invoke(c18624l);
        if (charSequence == null || c12814l == null) {
            return;
        }
        AbstractC16947l.yandex(c18624l, context, z, charSequence, c12814l.yandex);
    }
}
