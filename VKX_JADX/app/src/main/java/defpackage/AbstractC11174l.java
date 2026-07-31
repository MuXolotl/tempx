package defpackage;

import android.view.View;
import android.view.inputmethod.ExtractedText;
import java.lang.reflect.Field;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: lُٜٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11174l {
    public static boolean amazon = false;
    public static Field crashlytics = null;
    public static boolean loadAd = true;
    public static final StringBuilder yandex = new StringBuilder(48);

    public static final Object amazon(InterfaceC7042l interfaceC7042l, AbstractC0283l abstractC0283l) {
        interfaceC7042l.ads(null);
        Object objMo2158switch = interfaceC7042l.mo2158switch(abstractC0283l);
        return objMo2158switch == EnumC9342l.f19165l ? objMo2158switch : Unit.INSTANCE;
    }

    public static final void billing(InterfaceC12932l interfaceC12932l) {
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l);
        if (interfaceC7042l != null && !interfaceC7042l.mopub()) {
            throw interfaceC7042l.mo2153default();
        }
    }

    public static final void crashlytics(InterfaceC12932l interfaceC12932l, CancellationException cancellationException) {
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l);
        if (interfaceC7042l != null) {
            interfaceC7042l.ads(cancellationException);
        }
    }

    public static final boolean isPro(InterfaceC12932l interfaceC12932l) {
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l);
        if (interfaceC7042l != null) {
            return interfaceC7042l.mopub();
        }
        return true;
    }

    public static final ExtractedText loadAd(C0639l c0639l) {
        ExtractedText extractedText = new ExtractedText();
        String str = c0639l.yandex.f7563l;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c0639l.loadAd;
        extractedText.selectionStart = C12814l.mopub(j);
        extractedText.selectionEnd = C12814l.billing(j);
        extractedText.flags = !AbstractC12024l.inmobi(c0639l.yandex.f7563l, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final InterfaceC7042l mopub(InterfaceC12932l interfaceC12932l) {
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l);
        if (interfaceC7042l != null) {
            return interfaceC7042l;
        }
        C17132l.metrica(interfaceC12932l, "Current context doesn't contain Job in it: ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [lؘؕٚ] */
    /* JADX WARN: Type inference failed for: r5v25, types: [lؘؕٚ] */
    /* JADX WARN: Type inference failed for: r5v27, types: [lؘؕٚ] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 l￙ﾓ￙ﾕ￙ﾙ, still in use, count: 2, list:
          (r10v2 l￙ﾓ￙ﾕ￙ﾙ) from 0x016e: PHI (r10v3 l￙ﾓ￙ﾕ￙ﾙ) = (r10v2 l￙ﾓ￙ﾕ￙ﾙ), (r10v5 l￙ﾓ￙ﾕ￙ﾙ) binds: [B:44:0x015e, B:83:0x0233] A[DONT_GENERATE, DONT_INLINE]
          (r10v2 l￙ﾓ￙ﾕ￙ﾙ) from 0x00fc: MOVE (r19v9 l￙ﾓ￙ﾕ￙ﾙ) = (r10v2 l￙ﾓ￙ﾕ￙ﾙ) (LINE:253)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static defpackage.C11919l purchase(defpackage.InterfaceC17842l r23, defpackage.InterfaceC16920l r24, java.lang.String r25, kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function1 r27, kotlin.jvm.functions.Function1 r28, kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function2 r30, kotlin.jvm.functions.Function3 r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function2 r33) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11174l.purchase(lُّ٘, lٟٗؗ, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2):lِ٘ۢ");
    }

    public static final InterfaceC11791l subs(InterfaceC7042l interfaceC7042l, boolean z, AbstractC7581l abstractC7581l) {
        if (interfaceC7042l instanceof C14750l) {
            return ((C14750l) interfaceC7042l).m3888static(z, abstractC7581l);
        }
        return interfaceC7042l.signatures(abstractC7581l.subs(), new C17847l(1, abstractC7581l, AbstractC7581l.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 18), z);
    }

    public static C0462l yandex() {
        return new C0462l(null);
    }

    public float admob(View view) {
        if (loadAd) {
            try {
                return AbstractC18144l.yandex(view);
            } catch (NoSuchMethodError unused) {
                loadAd = false;
            }
        }
        return view.getAlpha();
    }

    public void firebase(View view, float f) {
        if (loadAd) {
            try {
                AbstractC18144l.loadAd(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                loadAd = false;
            }
        }
        view.setAlpha(f);
    }
}
