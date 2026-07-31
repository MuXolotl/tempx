package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًَٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17026l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f33164l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f33165l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33166l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f33167l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f33168l;

    public /* synthetic */ C17026l(C8954l c8954l, InterfaceC2262l interfaceC2262l, C5616l c5616l, Function0 function0) {
        this.f33166l = 2;
        this.f33164l = c8954l;
        this.f33168l = interfaceC2262l;
        this.f33167l = c5616l;
        this.f33165l = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 1;
        int i2 = 3;
        InterfaceC14029l interfaceC14029l = null;
        int i3 = 0;
        switch (this.f33166l) {
            case 0:
                Function0 function0 = (Function0) this.f33165l;
                Function1 function1 = (Function1) this.f33164l;
                C7968l c7968l = (C7968l) this.f33168l;
                EnumC1518l enumC1518l = (EnumC1518l) this.f33167l;
                function0.invoke();
                function1.invoke(C7968l.loadAd(c7968l, false, false, false, false, enumC1518l, 207));
                return Unit.INSTANCE;
            case 1:
                Function0 function2 = (Function0) this.f33165l;
                C15178l c15178l = (C15178l) this.f33164l;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f33168l;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f33167l;
                if (function2 != null) {
                    function2.invoke();
                } else if (c15178l.loadAd()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C14951l(c15178l, interfaceC14029l, i2), 3);
                    interfaceC8714l.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 2:
                C8954l c8954l = (C8954l) this.f33164l;
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f33168l;
                C5616l c5616l = (C5616l) this.f33167l;
                Function0 function3 = (Function0) this.f33165l;
                if (c8954l.amazon() == EnumC9129l.f18764l && c8954l.purchase()) {
                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C12328l(c8954l, interfaceC14029l, i3), 3);
                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C1803l(c5616l, interfaceC14029l, i3), 3);
                } else {
                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C12328l(c8954l, interfaceC14029l, i), 3).mo2154l(new C7366l(c8954l, function3, 0));
                }
                return Unit.INSTANCE;
            case 3:
                Context context = (Context) this.f33165l;
                C13316l c13316l = (C13316l) this.f33164l;
                C6655l c6655l = (C6655l) this.f33168l;
                C3797l c3797l = (C3797l) this.f33167l;
                Trace.beginSection("CameraFactoryAdapter#appComponent");
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                C9377l c9377l = new C9377l(new C1424l(context, c13316l, (C4723l) c6655l.yandex.getValue(), c3797l, c6655l.purchase, c6655l.amazon));
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Created CameraFactoryAdapter in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1))));
                }
                Trace.endSection();
                return c9377l;
            case 4:
                C10203l c10203l = (C10203l) this.f33165l;
                Context context2 = (Context) this.f33164l;
                C13316l c13316l2 = (C13316l) this.f33168l;
                C6879l c6879l = (C6879l) this.f33167l;
                try {
                    Trace.beginSection("Create CameraPipe");
                    long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    Context contextYandex = AbstractC8626l.yandex(context2);
                    C10717l c10717l = new C10717l(new ExecutorC7870l(c13316l2.yandex), 119);
                    C3797l c3797l2 = c10203l.yandex;
                    C4723l c4723lYandex = AbstractC6608l.yandex(new C3026l(contextYandex, c10717l, new C9066l((C15715l) c3797l2.f7903l, (C0458l) c3797l2.f7902l, c6879l)));
                    if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", "Created CameraPipe in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2) / 1000000.0d)}, 1))));
                        break;
                    }
                    return c4723lYandex;
                } finally {
                    Trace.endSection();
                }
            case 5:
                C11359l c11359l = (C11359l) this.f33165l;
                InterfaceC2262l interfaceC2262l3 = (InterfaceC2262l) this.f33164l;
                C17136l c17136l = (C17136l) this.f33168l;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) this.f33167l;
                if (AbstractC8576l.yandex(c11359l.yandex, ((C3554l) interfaceC8714l2.getValue()).f7471l)) {
                    C18454l c18454l = C18454l.f36052l;
                    interfaceC8714l2.setValue(C18454l.loadAd());
                }
                AbstractC10999l.mopub(interfaceC2262l3, null, 0, new C18020l(c11359l, interfaceC14029l, i3), 3);
                c17136l.f33323l.setValue(null);
                return Unit.INSTANCE;
            case 6:
                Number number = (Number) this.f33165l;
                C8456l c8456l = (C8456l) this.f33164l;
                Number number2 = (Number) this.f33168l;
                C4165l c4165l = (C4165l) this.f33167l;
                if (!number.equals(c8456l.f17488l) || !number2.equals(c8456l.f17487l)) {
                    c8456l.f17488l = number;
                    c8456l.f17487l = number2;
                    c8456l.f17489l = new C5810l(c4165l, c8456l.f17484l, number, number2, null);
                    c8456l.f17491l.loadAd.setValue(Boolean.TRUE);
                    c8456l.f17492l = false;
                    c8456l.f17485l = true;
                }
                return Unit.INSTANCE;
            case 7:
                AbstractC10999l.mopub((InterfaceC2262l) this.f33165l, null, 0, new C1914l((InterfaceC8714l) this.f33164l, (InterfaceC8714l) this.f33168l, (InterfaceC8714l) this.f33167l, (InterfaceC14029l) null), 3);
                return Unit.INSTANCE;
            case 8:
                InterfaceC2262l interfaceC2262l4 = (InterfaceC2262l) this.f33165l;
                InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) this.f33164l;
                C12823l c12823l = (C12823l) this.f33168l;
                C0072l c0072l = (C0072l) this.f33167l;
                interfaceC8714l3.setValue(Boolean.FALSE);
                AbstractC10999l.mopub(interfaceC2262l4, null, 0, new C15352l(c12823l, c0072l, interfaceC14029l, 20), 3);
                return Unit.INSTANCE;
            default:
                C8742l c8742l = (C8742l) this.f33165l;
                UUID uuid = (UUID) this.f33164l;
                C6842l c6842l = (C6842l) this.f33168l;
                Context context3 = (Context) this.f33167l;
                String string = uuid.toString();
                C7718l c7718lAmazon = c8742l.crashlytics.amazon(string);
                if (c7718lAmazon == null || c7718lAmazon.loadAd.yandex()) {
                    C8339l.smaato("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    C5648l c5648l = c8742l.loadAd;
                    synchronized (c5648l.firebase) {
                        try {
                            C14513l.tapsense().isVip(C5648l.smaato, "Moving WorkSpec (" + string + ") to the foreground");
                            C11120l c11120l = (C11120l) c5648l.mopub.remove(string);
                            if (c11120l != null) {
                                if (c5648l.yandex == null) {
                                    PowerManager.WakeLock wakeLockYandex = AbstractC17013l.yandex(c5648l.loadAd);
                                    c5648l.yandex = wakeLockYandex;
                                    wakeLockYandex.acquire();
                                }
                                c5648l.billing.put(string, c11120l);
                                AbstractC7720l.mopub(c5648l.loadAd, C14891l.crashlytics(c5648l.loadAd, AbstractC3605l.isPro(c11120l.yandex), c6842l));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    C0350l c0350lIsPro = AbstractC3605l.isPro(c7718lAmazon);
                    String str = C14891l.f29278l;
                    Intent intent = new Intent(context3, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", c6842l.yandex);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c6842l.loadAd);
                    intent.putExtra("KEY_NOTIFICATION", c6842l.crashlytics);
                    intent.putExtra("KEY_WORKSPEC_ID", c0350lIsPro.yandex);
                    intent.putExtra("KEY_GENERATION", c0350lIsPro.loadAd);
                    context3.startService(intent);
                }
                return null;
        }
    }

    public /* synthetic */ C17026l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f33166l = i;
        this.f33165l = obj;
        this.f33164l = obj2;
        this.f33168l = obj3;
        this.f33167l = obj4;
    }
}
