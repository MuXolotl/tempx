package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0295l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f1343l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f1344l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1345l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f1346l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f1347l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f1348l;

    public /* synthetic */ RunnableC0295l(ServiceC16415l serviceC16415l, C6499l c6499l, C18689l c18689l, String str, Bundle bundle) {
        this.f1345l = 7;
        this.f1344l = serviceC16415l;
        this.f1343l = c6499l;
        this.f1346l = c18689l;
        this.f1347l = str;
        this.f1348l = bundle;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C1852l c1852lAppmetrica;
        ListenableFuture listenableFuturePurchase;
        C17425l c17425lAdmob;
        C17425l c17425l = null;
        c17425l = null;
        switch (this.f1345l) {
            case 0:
                C11090l c11090l = (C11090l) this.f1344l;
                EnumC9931l enumC9931l = (EnumC9931l) this.f1343l;
                String str = (String) this.f1347l;
                InterfaceC13490l interfaceC13490l = (InterfaceC13490l) this.f1346l;
                InterfaceC16061l interfaceC16061l = (InterfaceC16061l) this.f1348l;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
                    C1852l c1852l = abstractC18620lIsPro instanceof C1852l ? (C1852l) abstractC18620lIsPro : null;
                    if (c1852l == null || (c1852lAppmetrica = c1852l.appmetrica(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC18620l abstractC18620lIsPro2 = c1852lAppmetrica.isPro();
                        try {
                            C11090l c11090lCrashlytics = AbstractC7709l.crashlytics(c11090l, enumC9931l);
                            C2580l c2580l = C2580l.f5619l;
                            C14442l c14442l = new C14442l(str, c11090lCrashlytics, c2580l, c2580l, interfaceC16061l, interfaceC13490l);
                            c14442l.mo1547l();
                            c14442l.mo1546l();
                            Unit unit = Unit.INSTANCE;
                            AbstractC18620l.adcel(abstractC18620lIsPro2);
                            c1852lAppmetrica.pro().yandex();
                            c1852lAppmetrica.crashlytics();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            AbstractC18620l.adcel(abstractC18620lIsPro2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            c1852lAppmetrica.crashlytics();
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    Trace.endSection();
                    throw th4;
                }
            case 1:
                ((InterfaceC1374l) this.f1343l).run().yandex(new RunnableC4063l((C12014l) this.f1344l, (AtomicBoolean) this.f1347l, (C6694l) this.f1346l, (AtomicBoolean) this.f1348l, 2), EnumC1535l.f3808l);
                return;
            case 2:
                AbstractC0559l abstractC0559l = (AbstractC0559l) this.f1344l;
                C11404l c11404l = (C11404l) this.f1343l;
                C11404l c11404l2 = (C11404l) this.f1347l;
                AbstractActivityC14666l abstractActivityC14666l = (AbstractActivityC14666l) this.f1346l;
                View view = (View) this.f1348l;
                abstractC0559l.loadAd(c11404l, c11404l2, abstractActivityC14666l.getWindow(), view, ((Boolean) c11404l.crashlytics.invoke(view.getResources())).booleanValue(), ((Boolean) c11404l2.crashlytics.invoke(view.getResources())).booleanValue());
                return;
            case 3:
                RunnableFutureC13286l runnableFutureC13286l = (RunnableFutureC13286l) this.f1344l;
                C1090l c1090l = (C1090l) this.f1343l;
                ListenableFuture listenableFuture = (ListenableFuture) this.f1347l;
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f1346l;
                ExecutorC5263l executorC5263l = (ExecutorC5263l) this.f1348l;
                if (runnableFutureC13286l.isDone()) {
                    c1090l.vip(listenableFuture);
                    return;
                } else {
                    if (listenableFuture2.isCancelled()) {
                        int i = ExecutorC5263l.f11347l;
                        if (executorC5263l.compareAndSet(EnumC7860l.f16398l, EnumC7860l.f16397l)) {
                            runnableFutureC13286l.cancel(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 4:
                ServiceC16415l serviceC16415l = (ServiceC16415l) this.f1344l;
                AtomicReference atomicReference = (AtomicReference) this.f1343l;
                C6499l c6499l = (C6499l) this.f1347l;
                C17425l c17425l2 = (C17425l) this.f1346l;
                C5811l c5811l = (C5811l) this.f1348l;
                atomicReference.set(serviceC16415l.f32112l.pro(c6499l, c17425l2));
                c5811l.amazon();
                return;
            case 5:
                ServiceC16415l serviceC16415l2 = (ServiceC16415l) this.f1344l;
                String str2 = (String) this.f1347l;
                C6499l c6499l2 = (C6499l) this.f1343l;
                C18689l c18689l = (C18689l) this.f1346l;
                Bundle bundle = (Bundle) this.f1348l;
                C12417l c12417l = new C12417l(str2, Bundle.EMPTY);
                if (!serviceC16415l2.f32115l.m3302for(c6499l2, c12417l)) {
                    c18689l.purchase();
                    return;
                }
                C3726l c3726l = serviceC16415l2.f32112l;
                C15035l c15035l = c3726l.purchase;
                c3726l.m1421volatile(c6499l2);
                if (str2.length() == 0) {
                    c15035l.getClass();
                    listenableFuturePurchase = AbstractC7151l.purchase(C15035l.yandex());
                } else {
                    C18662l c18662l = c15035l.yandex;
                    C16552l c16552l = AbstractC11463l.yandex;
                    listenableFuturePurchase = AbstractC16840l.purchase(2, AbstractC17278l.yandex, c18662l, new C8036l(c15035l, c12417l, bundle, null, 15));
                }
                AbstractC12442l.metrica(listenableFuturePurchase, "Callback.onCustomCommandOnHandler must return non-null future");
                listenableFuturePurchase.yandex(new RunnableC12388l(listenableFuturePurchase, c18689l, 10), EnumC1535l.f3808l);
                return;
            case 6:
                EnumC1535l enumC1535l = EnumC1535l.f3808l;
                ServiceC16415l serviceC16415l3 = (ServiceC16415l) this.f1344l;
                C6499l c6499l3 = (C6499l) this.f1343l;
                AbstractC14330l abstractC14330l = (AbstractC14330l) this.f1346l;
                Bundle bundle2 = (Bundle) this.f1348l;
                String str3 = (String) this.f1347l;
                C3726l c3726l2 = serviceC16415l3.f32112l;
                if (!serviceC16415l3.f32115l.m3301extends(c6499l3, 50003)) {
                    abstractC14330l.billing(null);
                    return;
                }
                int i2 = 1;
                if (bundle2 != null) {
                    bundle2.setClassLoader(c3726l2.billing.getClassLoader());
                    try {
                        int i3 = bundle2.getInt("android.media.browse.extra.PAGE");
                        int i4 = bundle2.getInt("android.media.browse.extra.PAGE_SIZE");
                        c17425lAdmob = AbstractC18585l.admob(c3726l2.billing, bundle2);
                        if (i3 >= 0 && i4 > 0) {
                            try {
                                C1090l c1090lM3983this = AbstractC15323l.m3983this(serviceC16415l3.f32112l.Signature(c6499l3, str3, i3, i4, c17425lAdmob), new C6680l(serviceC16415l3, i2));
                                c1090lM3983this.yandex(new RunnableC10879l(c1090lM3983this, abstractC14330l, i2), enumC1535l);
                                return;
                            } catch (BadParcelableException unused) {
                                c17425l = c17425lAdmob;
                            }
                        }
                    } catch (BadParcelableException unused2) {
                    }
                } else {
                    c17425lAdmob = c17425l;
                }
                C1090l c1090lM3983this2 = AbstractC15323l.m3983this(serviceC16415l3.f32112l.Signature(c6499l3, str3, 0, Alert.DURATION_SHOW_INDEFINITELY, c17425lAdmob), new C6680l(serviceC16415l3, i2));
                c1090lM3983this2.yandex(new RunnableC10879l(c1090lM3983this2, abstractC14330l, i2), enumC1535l);
                return;
            case 7:
                ServiceC16415l serviceC16415l4 = (ServiceC16415l) this.f1344l;
                C6499l c6499l4 = (C6499l) this.f1343l;
                C18689l c18689l2 = (C18689l) this.f1346l;
                String str4 = (String) this.f1347l;
                Bundle bundle3 = (Bundle) this.f1348l;
                if (!serviceC16415l4.f32115l.m3301extends(c6499l4, 50005)) {
                    c18689l2.billing(null);
                    return;
                }
                InterfaceC3270l interfaceC3270l = c6499l4.amazon;
                interfaceC3270l.getClass();
                C17947l c17947l = (C17947l) interfaceC3270l;
                synchronized (c17947l.f34929l) {
                    c17947l.f34927l.add(new C11814l(c6499l4, c6499l4.yandex, str4, bundle3, c18689l2));
                    break;
                }
                serviceC16415l4.f32112l.applovin(c6499l4, str4, AbstractC18585l.admob(serviceC16415l4.f32112l.billing, bundle3));
                return;
            default:
                C15617l c15617l = (C15617l) this.f1344l;
                String str5 = (String) this.f1347l;
                Function0 function0 = (Function0) this.f1343l;
                C13716l c13716l = (C13716l) this.f1346l;
                C5807l c5807l = (C5807l) this.f1348l;
                c15617l.getClass();
                boolean zAdmob = AbstractC15011l.admob();
                if (zAdmob) {
                    try {
                        String strSubstring = str5.length() <= 127 ? str5 : null;
                        if (strSubstring == null) {
                            strSubstring = str5.substring(0, 127);
                        }
                        Trace.beginSection(strSubstring);
                    } catch (Throwable th5) {
                        if (!zAdmob) {
                            throw th5;
                        }
                        Trace.endSection();
                        throw th5;
                    }
                }
                try {
                    function0.invoke();
                    C2260l c2260l = C16543l.f32480l;
                    c13716l.isPro(c2260l);
                    c5807l.loadAd(c2260l);
                    break;
                } catch (Throwable th6) {
                    c13716l.isPro(new C11348l(th6));
                    c5807l.amazon(th6);
                }
                Unit unit2 = Unit.INSTANCE;
                if (zAdmob) {
                    Trace.endSection();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0295l(ServiceC16415l serviceC16415l, C6499l c6499l, AbstractC14330l abstractC14330l, Bundle bundle, String str) {
        this.f1345l = 6;
        this.f1344l = serviceC16415l;
        this.f1343l = c6499l;
        this.f1346l = abstractC14330l;
        this.f1348l = bundle;
        this.f1347l = str;
    }

    public /* synthetic */ RunnableC0295l(C11090l c11090l, EnumC9931l enumC9931l, String str, InterfaceC13490l interfaceC13490l, InterfaceC16061l interfaceC16061l, boolean z) {
        this.f1345l = 0;
        this.f1344l = c11090l;
        this.f1343l = enumC9931l;
        this.f1347l = str;
        this.f1346l = interfaceC13490l;
        this.f1348l = interfaceC16061l;
    }

    public /* synthetic */ RunnableC0295l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1345l = i;
        this.f1344l = obj;
        this.f1343l = obj2;
        this.f1347l = obj3;
        this.f1346l = obj4;
        this.f1348l = obj5;
    }

    public /* synthetic */ RunnableC0295l(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.f1345l = i;
        this.f1344l = obj;
        this.f1347l = str;
        this.f1343l = obj2;
        this.f1346l = obj3;
        this.f1348l = obj4;
    }
}
