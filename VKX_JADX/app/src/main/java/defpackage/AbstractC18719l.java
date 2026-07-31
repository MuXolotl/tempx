package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18719l {
    public static final C15578l yandex = new C15578l(1881215219, false, new C2464l(10));

    public static final void admob(C14734l c14734l, long j, float f, InterfaceC14748l interfaceC14748l, C6570l c6570l, Function1 function1) {
        long jLoadAd = f == 0.0f ? interfaceC14748l.loadAd() : (long) ((j - c14734l.crashlytics) / f);
        c14734l.mopub = j;
        c14734l.purchase.setValue(interfaceC14748l.billing(jLoadAd));
        c14734l.billing = interfaceC14748l.amazon(jLoadAd);
        if (interfaceC14748l.purchase(jLoadAd)) {
            c14734l.admob = c14734l.mopub;
            c14734l.subs.setValue(Boolean.FALSE);
        }
        remoteconfig(c14734l, c6570l);
        function1.invoke(c14734l);
    }

    public static /* synthetic */ Object amazon(float f, float f2, InterfaceC1489l interfaceC1489l, Function2 function2, AbstractC5563l abstractC5563l, int i) {
        if ((i & 8) != 0) {
            interfaceC1489l = AbstractC0532l.admob(0.0f, 0.0f, null, 7);
        }
        return loadAd(f, f2, 0.0f, interfaceC1489l, function2, abstractC5563l);
    }

    public static final Object billing(C6570l c6570l, Float f, InterfaceC1489l interfaceC1489l, boolean z, Function1 function1, AbstractC0283l abstractC0283l) {
        Object objCrashlytics = crashlytics(c6570l, new C5810l(interfaceC1489l, c6570l.f13721l, c6570l.f13720l.getValue(), f, c6570l.f13719l), z ? c6570l.f13723l : Long.MIN_VALUE, function1, abstractC0283l);
        return objCrashlytics == EnumC9342l.f19165l ? objCrashlytics : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00fd A[Catch: CancellationException -> 0x014d, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x014d, blocks: (B:46:0x00eb, B:48:0x00fd), top: B:78:0x00eb }] */
    /* JADX WARN: Code duplicated, block: B:54:0x012e A[Catch: CancellationException -> 0x003e, TryCatch #3 {CancellationException -> 0x003e, blocks: (B:14:0x0039, B:52:0x011e, B:54:0x012e, B:55:0x0133), top: B:80:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0133 A[Catch: CancellationException -> 0x003e, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x003e, blocks: (B:14:0x0039, B:52:0x011e, B:54:0x012e, B:55:0x0133), top: B:80:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object crashlytics(defpackage.C6570l r24, defpackage.InterfaceC14748l r25, long r26, final kotlin.jvm.functions.Function1 r28, defpackage.AbstractC0283l r29) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18719l.crashlytics(lؙٚۚ, lؚٔۡ, long, kotlin.jvm.functions.Function1, lّؑۧ):java.lang.Object");
    }

    public static final C3498l firebase(InterfaceC3588l interfaceC3588l, int i) {
        return C3498l.amazon(interfaceC3588l.getString(i));
    }

    public static final float isPro(InterfaceC12932l interfaceC12932l) {
        InterfaceC1110l interfaceC1110l = (InterfaceC1110l) interfaceC12932l.mo245l(C15617l.f30492l);
        float fMo817instanceof = interfaceC1110l != null ? interfaceC1110l.mo817instanceof() : 1.0f;
        if (fMo817instanceof >= 0.0f) {
            return fMo817instanceof;
        }
        AbstractC4745l.loadAd("negative scale factor");
        return fMo817instanceof;
    }

    public static final Object loadAd(float f, float f2, float f3, InterfaceC1489l interfaceC1489l, Function2 function2, AbstractC5563l abstractC5563l) {
        C0010l c0010l = AbstractC3483l.purchase;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Function1 function1 = c0010l.yandex;
        AbstractC2249l abstractC2249lCrashlytics = (AbstractC2249l) function1.invoke(f6);
        if (abstractC2249lCrashlytics == null) {
            abstractC2249lCrashlytics = ((AbstractC2249l) function1.invoke(f4)).crashlytics();
        }
        AbstractC2249l abstractC2249l = abstractC2249lCrashlytics;
        Object objCrashlytics = crashlytics(new C6570l(c0010l, f4, abstractC2249l, 56), new C5810l(interfaceC1489l, c0010l, f4, f5, abstractC2249l), Long.MIN_VALUE, new C6509l(1, function2), abstractC5563l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objCrashlytics != enumC9342l) {
            objCrashlytics = Unit.INSTANCE;
        }
        return objCrashlytics == enumC9342l ? objCrashlytics : Unit.INSTANCE;
    }

    public static /* synthetic */ Object mopub(C6570l c6570l, Float f, InterfaceC1489l interfaceC1489l, boolean z, Function1 function1, AbstractC0283l abstractC0283l, int i) {
        if ((i & 2) != 0) {
            interfaceC1489l = AbstractC0532l.admob(0.0f, 0.0f, null, 7);
        }
        InterfaceC1489l interfaceC1489l2 = interfaceC1489l;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = new C1698l(22);
        }
        return billing(c6570l, f, interfaceC1489l2, z2, function1, abstractC0283l);
    }

    public static final Object purchase(C6570l c6570l, C17308l c17308l, boolean z, Function1 function1, AbstractC0283l abstractC0283l) {
        Object objCrashlytics = crashlytics(c6570l, new C5480l(c17308l, c6570l.f13721l, c6570l.f13720l.getValue(), c6570l.f13719l), z ? c6570l.f13723l : Long.MIN_VALUE, function1, abstractC0283l);
        return objCrashlytics == EnumC9342l.f19165l ? objCrashlytics : Unit.INSTANCE;
    }

    public static final void remoteconfig(C14734l c14734l, C6570l c6570l) {
        c6570l.f13720l.setValue(c14734l.purchase.getValue());
        AbstractC2249l abstractC2249l = c6570l.f13719l;
        AbstractC2249l abstractC2249l2 = c14734l.billing;
        int iLoadAd = abstractC2249l.loadAd();
        for (int i = 0; i < iLoadAd; i++) {
            abstractC2249l.purchase(i, abstractC2249l2.yandex(i));
        }
        c6570l.f13722l = c14734l.admob;
        c6570l.f13723l = c14734l.mopub;
        c6570l.f13724l = ((Boolean) c14734l.subs.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e4 -> B:41:0x00ec). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object smaato(defpackage.C15168l r16, defpackage.C7819l r17, defpackage.C15106l r18, defpackage.C5346l r19, defpackage.AbstractC0283l r20) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC18719l.smaato(lٔۛۘ, lًؘۙ, lٔۗ۠, lؘؐۛ, lّؑۧ):java.lang.Object");
    }

    public static final C3624l subs(InterfaceC3588l interfaceC3588l, int i) {
        return C8565l.adcel(interfaceC3588l.yandex(i), interfaceC3588l.loadAd(i));
    }

    public static final boolean yandex(C6264l c6264l) {
        C4707l c4707l = AbstractC0424l.subscription;
        C13660l c13660l = c6264l.f13225l;
        Object objMopub = c13660l.mopub(c4707l);
        if (objMopub == null) {
            objMopub = null;
        }
        if (AbstractC8576l.yandex(objMopub, C11485l.f23086l)) {
            return false;
        }
        return c13660l.loadAd(AbstractC16601l.mopub) || c13660l.loadAd(AbstractC16601l.admob);
    }
}
