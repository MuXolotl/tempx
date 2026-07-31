package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.AbstractC0283l;
import defpackage.AbstractC10076l;
import defpackage.AbstractC10999l;
import defpackage.AbstractC11990l;
import defpackage.AbstractC16137l;
import defpackage.AbstractC16733l;
import defpackage.AbstractC16901l;
import defpackage.AbstractC17496l;
import defpackage.AbstractC1872l;
import defpackage.AbstractC2829l;
import defpackage.AbstractC5103l;
import defpackage.C0384l;
import defpackage.C10223l;
import defpackage.C11039l;
import defpackage.C13432l;
import defpackage.C14513l;
import defpackage.C14637l;
import defpackage.C14680l;
import defpackage.C18702l;
import defpackage.C1914l;
import defpackage.C4833l;
import defpackage.C7718l;
import defpackage.C8125l;
import defpackage.C8339l;
import defpackage.C9990l;
import defpackage.EnumC9342l;
import defpackage.InterfaceC14029l;
import defpackage.InterfaceC4117l;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "lِۣؗ", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters mopub;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.mopub = workerParameters;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public static final Object billing(ConstraintTrackingWorker constraintTrackingWorker, AbstractC0283l abstractC0283l) {
        C14680l c14680l;
        Object obj;
        AbstractC16137l abstractC16137lMetrica;
        int i;
        AtomicInteger atomicInteger = constraintTrackingWorker.crashlytics;
        WorkerParameters workerParameters = constraintTrackingWorker.mopub;
        Context context = constraintTrackingWorker.yandex;
        WorkerParameters workerParameters2 = constraintTrackingWorker.loadAd;
        if (abstractC0283l instanceof C14680l) {
            c14680l = (C14680l) abstractC0283l;
            int i2 = c14680l.f28729l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14680l.f28729l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14680l = new C14680l(constraintTrackingWorker, abstractC0283l);
            }
        } else {
            c14680l = new C14680l(constraintTrackingWorker, abstractC0283l);
        }
        C14680l c14680l2 = c14680l;
        Object objFirebase = c14680l2.f28730l;
        int i3 = c14680l2.f28729l;
        Object obj2 = null;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            Object obj3 = workerParameters2.loadAd.yandex.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str == null || str.length() == 0) {
                C14513l.tapsense().startapp(AbstractC16733l.yandex, "No worker to delegate to.");
                return new C18702l();
            }
            C13432l c13432lCrashlytics = C13432l.crashlytics(context);
            C7718l c7718lAmazon = c13432lCrashlytics.crashlytics.Signature().amazon(workerParameters2.yandex.toString());
            if (c7718lAmazon == null) {
                return new C18702l();
            }
            C14637l c14637l = new C14637l(c13432lCrashlytics.isPro);
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : c14637l.yandex) {
                Object obj5 = obj2;
                if (((InterfaceC4117l) obj4).yandex(c7718lAmazon)) {
                    arrayList.add(obj4);
                }
                obj2 = obj5;
            }
            obj = obj2;
            if (!arrayList.isEmpty()) {
                C14513l.tapsense().vip(AbstractC10076l.yandex, "Work " + c7718lAmazon.yandex + " constrained by " + AbstractC16901l.m4210case(arrayList, null, null, null, new C8125l(11), 31));
            }
            if (!arrayList.isEmpty()) {
                String str2 = AbstractC16733l.yandex;
                C14513l.tapsense().vip(str2, "Constraints not met for delegate " + str + ". Requesting retry.");
                return new C9990l();
            }
            C14513l.tapsense().vip(AbstractC16733l.yandex, "Constraints met for delegate ".concat(str));
            try {
                abstractC16137lMetrica = workerParameters2.mopub.metrica(context, str, workerParameters);
                try {
                    AbstractC1872l abstractC1872lBilling = AbstractC5103l.billing(workerParameters.billing.amazon);
                    try {
                        C0384l c0384l = new C0384l(constraintTrackingWorker, abstractC16137lMetrica, c14637l, c7718lAmazon, (InterfaceC14029l) null, 12);
                        c14680l2.f28731l = abstractC16137lMetrica;
                        c14680l2.f28729l = 1;
                        objFirebase = AbstractC10999l.firebase(abstractC1872lBilling, c0384l, c14680l2);
                        EnumC9342l enumC9342l = EnumC9342l.f19165l;
                        if (objFirebase == enumC9342l) {
                            return enumC9342l;
                        }
                        abstractC16137lMetrica = abstractC16137lMetrica;
                        return (AbstractC17496l) objFirebase;
                    } catch (CancellationException e) {
                        e = e;
                        abstractC16137lMetrica = abstractC16137lMetrica;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                }
            } catch (Throwable unused) {
                C14513l.tapsense().vip(AbstractC16733l.yandex, "No worker to delegate to.");
                c13432lCrashlytics.loadAd.getClass();
                return new C18702l();
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            abstractC16137lMetrica = c14680l2.f28731l;
            try {
                AbstractC2829l.crashlytics(objFirebase);
                obj = null;
                try {
                    return (AbstractC17496l) objFirebase;
                } catch (CancellationException e3) {
                    e = e3;
                }
            } catch (CancellationException e4) {
                e = e4;
                obj = null;
            }
        }
        if (atomicInteger.get() != -256 || (e instanceof C4833l)) {
            if (Build.VERSION.SDK_INT < 31) {
                i = -512;
            } else if (atomicInteger.get() != -256) {
                i = atomicInteger.get();
            } else {
                if (!(e instanceof C4833l)) {
                    C8339l.smaato("Unreachable");
                    return obj;
                }
                i = ((C4833l) e).f9877l;
            }
            abstractC16137lMetrica.crashlytics.compareAndSet(-256, i);
        }
        if (e instanceof C4833l) {
            return new C9990l();
        }
        throw e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object purchase(ConstraintTrackingWorker constraintTrackingWorker, AbstractC16137l abstractC16137l, C14637l c14637l, C7718l c7718l, AbstractC0283l abstractC0283l) {
        C10223l c10223l;
        if (abstractC0283l instanceof C10223l) {
            c10223l = (C10223l) abstractC0283l;
            int i = c10223l.f20837l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10223l.f20837l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10223l = new C10223l(constraintTrackingWorker, abstractC0283l);
            }
        } else {
            c10223l = new C10223l(constraintTrackingWorker, abstractC0283l);
        }
        Object objAdmob = c10223l.f20836l;
        int i2 = c10223l.f20837l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            C1914l c1914l = new C1914l(abstractC16137l, c14637l, c7718l, null, 4);
            c10223l.f20837l = 1;
            objAdmob = AbstractC11990l.admob(c1914l, c10223l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAdmob);
        }
        return objAdmob;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object crashlytics(InterfaceC14029l interfaceC14029l) {
        return AbstractC10999l.firebase(AbstractC5103l.billing(this.loadAd.amazon), new C11039l(this, null, 15), interfaceC14029l);
    }
}
