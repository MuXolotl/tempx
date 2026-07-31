package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌؙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6208l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f13125l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f13126l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f13127l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f13128l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6208l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f13127l = i;
        this.f13125l = obj;
        this.f13126l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01bf  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C4496l c4496l;
        Object objPurchase;
        Object objLoadAd;
        C2856l c2856l;
        Object obj2;
        InterfaceC1142l interfaceC1142l;
        Object objM3895throws;
        Object objYandex;
        AutoCloseable autoCloseable;
        Object objYandex2;
        AutoCloseable autoCloseable2;
        Object objInmobi;
        AutoCloseable autoCloseable3;
        Throwable th;
        Object objBilling;
        C7644l c7644l;
        int i = this.f13127l;
        int i2 = 0;
        int i3 = 2;
        int i4 = 3;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        Object obj3 = this.f13126l;
        int i5 = 1;
        C10685l c10685l = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (i) {
            case 0:
                C15389l c15389l = (C15389l) this.f13125l;
                int i6 = this.f13128l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C9501l c9501l = new C9501l(c15389l, i3);
                    C7641l c7641l = new C7641l((Function3) obj3, c15389l, z ? 1 : 0, i4);
                    this.f13128l = 1;
                    if (AbstractC12019l.loadAd(c9501l, c7641l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                C18416l c18416lSubs = c15389l.subs();
                C13765l c13765l = (C13765l) c15389l.subs;
                Object objYandex3 = c18416lSubs.yandex(c13765l.admob());
                if (objYandex3 != null) {
                    if (Math.abs(c13765l.admob() - c15389l.subs().billing(objYandex3)) < 0.5f && ((Boolean) ((Function1) c15389l.yandex).invoke(objYandex3)).booleanValue()) {
                        ((C10086l) c15389l.amazon).setValue(objYandex3);
                        c15389l.remoteconfig(objYandex3);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C18439l c18439l = (C18439l) this.f13125l;
                C0298l c0298l = c18439l.purchase;
                View view = c18439l.yandex;
                int i7 = this.f13128l;
                try {
                    if (i7 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C17644l c17644l = new C17644l();
                        InterfaceC15209l interfaceC15209l = (InterfaceC15209l) obj3;
                        C4496l c4496l2 = new C4496l(c17644l, new C12182l(c18439l, interfaceC15209l, 0), new C12182l(c18439l, interfaceC15209l, 1), view);
                        Function1 function1 = c18439l.loadAd;
                        if (function1 != null && (c4496l = (C4496l) function1.invoke(c4496l2)) != null) {
                            c4496l2 = c4496l;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                            RunnableC10613l runnableC10613l = c18439l.subs;
                            if (runnableC10613l == null) {
                                runnableC10613l = new RunnableC10613l(c18439l, c4496l2, c17644l, i5);
                                c18439l.subs = runnableC10613l;
                            }
                            view.post(runnableC10613l);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new ActionModeCallbackC13058l(c4496l2), 1);
                            if (actionModeStartActionMode == null) {
                                return Unit.INSTANCE;
                            }
                            c18439l.admob = actionModeStartActionMode;
                        }
                        this.f13128l = 1;
                        Object objSignature = c17644l.yandex.Signature(this);
                        if (objSignature != enumC9342l) {
                            objSignature = Unit.INSTANCE;
                        }
                        if (objSignature == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i7 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c0298l.yandex();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable runnableC16112l = c18439l.isPro;
                        if (runnableC16112l == null) {
                            runnableC16112l = new RunnableC16112l(i4, c18439l);
                            c18439l.isPro = runnableC16112l;
                        }
                        view.post(runnableC16112l);
                    } else {
                        ActionMode actionMode = c18439l.admob;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    RunnableC10613l runnableC10613l2 = c18439l.subs;
                    if (runnableC10613l2 != null) {
                        view.removeCallbacks(runnableC10613l2);
                    }
                    c18439l.admob = null;
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    c0298l.yandex();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable runnableC16112l2 = c18439l.isPro;
                        if (runnableC16112l2 == null) {
                            runnableC16112l2 = new RunnableC16112l(i4, c18439l);
                            c18439l.isPro = runnableC16112l2;
                        }
                        view.post(runnableC16112l2);
                    } else {
                        ActionMode actionMode2 = c18439l.admob;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    RunnableC10613l runnableC10613l3 = c18439l.subs;
                    if (runnableC10613l3 != null) {
                        view.removeCallbacks(runnableC10613l3);
                    }
                    c18439l.admob = null;
                    throw th2;
                }
            case 2:
                C8300l c8300l = (C8300l) obj3;
                C10086l c10086l = ((C2769l) this.f13125l).crashlytics;
                int i8 = this.f13128l;
                try {
                    if (i8 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        c10086l.setValue(c8300l);
                        this.f13128l = 1;
                        Object objSignature2 = c8300l.loadAd.Signature(this);
                        if (objSignature2 != enumC9342l) {
                            objSignature2 = Unit.INSTANCE;
                        }
                        if (objSignature2 == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i8 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c10086l.setValue(null);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    c10086l.setValue(null);
                    throw th3;
                }
            case 3:
                int i9 = this.f13128l;
                if (i9 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Unit unit = Unit.INSTANCE;
                    this.f13128l = 1;
                    if (((AbstractC10598l) this.f13125l).loadAd((C7037l) obj3, unit, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i9 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 4:
                C11644l c11644l = (C11644l) this.f13125l;
                C0360l c0360l = (C0360l) obj3;
                int i10 = this.f13128l;
                if (i10 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C2592l c2592l = new C2592l(i2, (InterfaceC14029l) (z2 ? 1 : 0), c0360l);
                    List list = (List) c11644l.f23360l;
                    if (list == null || list.isEmpty()) {
                        this.f13128l = 1;
                        objPurchase = C0360l.purchase(c0360l, false, c2592l, this);
                        if (objPurchase == enumC9342l) {
                            return enumC9342l;
                        }
                        c2856l = (C2856l) objPurchase;
                    } else {
                        InterfaceC4335l interfaceC4335lMopub = c0360l.mopub();
                        C3539l c3539l = new C3539l(c0360l, c2592l, c11644l, null);
                        this.f13128l = 2;
                        objLoadAd = interfaceC4335lMopub.loadAd(c3539l, this);
                        if (objLoadAd == enumC9342l) {
                            return enumC9342l;
                        }
                        c2856l = (C2856l) objLoadAd;
                    }
                } else if (i10 == 1) {
                    AbstractC2829l.crashlytics(obj);
                    objPurchase = obj;
                    c2856l = (C2856l) objPurchase;
                } else {
                    if (i10 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objLoadAd = obj;
                    c2856l = (C2856l) objLoadAd;
                }
                return c0360l.admob.m2959public(c2856l);
            case 5:
                int i11 = this.f13128l;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                Function2 function2 = (Function2) this.f13125l;
                Object obj4 = ((C2856l) obj3).loadAd;
                this.f13128l = 1;
                Object objInvoke = function2.invoke(obj4, this);
                return objInvoke == enumC9342l ? enumC9342l : objInvoke;
            case 6:
                C0360l c0360l2 = (C0360l) this.f13125l;
                int i12 = this.f13128l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f13128l = 1;
                    obj2 = null;
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            AbstractC2829l.crashlytics(obj);
                            return obj;
                        }
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    obj2 = obj;
                }
                InterfaceC8282l interfaceC8282l = (InterfaceC8282l) obj2;
                C14477l c14477l = (C14477l) this.f1295l.mo245l(C1461l.f3656l);
                if (c14477l != null) {
                    c14477l.yandex(c0360l2);
                }
                C14477l c14477l2 = new C14477l(c14477l, c0360l2);
                C4647l c4647l = new C4647l(c0360l2, (Function2) obj3, interfaceC8282l, (InterfaceC14029l) null);
                this.f13128l = 2;
                Object objFirebase = AbstractC10999l.firebase(c14477l2, c4647l, this);
                return objFirebase == enumC9342l ? enumC9342l : objFirebase;
            case 7:
                int i13 = this.f13128l;
                if (i13 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    AbstractC10598l abstractC10598l = (AbstractC10598l) this.f13125l;
                    Unit unit2 = Unit.INSTANCE;
                    this.f13128l = 1;
                    if (abstractC10598l.loadAd(obj3, unit2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i13 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 8:
                C10700l c10700l = (C10700l) obj3;
                int i14 = this.f13128l;
                if (i14 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC9427l interfaceC9427l = (InterfaceC9427l) this.f13125l;
                    Object obj5 = c10700l.f21708l;
                    if (obj5 == AbstractC2878l.yandex) {
                        obj5 = null;
                    }
                    this.f13128l = 1;
                    if (interfaceC9427l.isPro(obj5, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i14 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                c10700l.f21708l = null;
                return Unit.INSTANCE;
            case 9:
                int i15 = this.f13128l;
                if (i15 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    Unit unit3 = Unit.INSTANCE;
                    this.f13128l = 1;
                    if (((C6731l) this.f13125l).loadAd((C4543l) obj3, unit3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i15 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 10:
                C16047l c16047l = ((C6267l) obj3).crashlytics;
                int i16 = this.f13128l;
                try {
                    try {
                        try {
                            if (i16 == 0) {
                                AbstractC2829l.crashlytics(obj);
                                if (AbstractC5088l.firebase("CXCP")) {
                                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#cancelFocusAndMeteringAsync");
                                }
                                C2667l c2667lYandex = c16047l.yandex();
                                this.f13128l = 1;
                                objYandex2 = c2667lYandex.yandex(this);
                                if (objYandex2 == enumC9342l) {
                                    return enumC9342l;
                                }
                            } else {
                                if (i16 != 1) {
                                    if (i16 == 2) {
                                        autoCloseable3 = (AutoCloseable) this.f13125l;
                                        try {
                                            AbstractC2829l.crashlytics(obj);
                                            objInmobi = obj;
                                            interfaceC1142l = (InterfaceC1142l) objInmobi;
                                            AbstractC1214l.yandex(autoCloseable3, null);
                                            this.f13125l = null;
                                            this.f13128l = 3;
                                            if (interfaceC1142l.m832l(this) == enumC9342l) {
                                                return enumC9342l;
                                            }
                                            C2667l c2667lYandex2 = c16047l.yandex();
                                            this.f13128l = 4;
                                            objYandex = c2667lYandex2.yandex(this);
                                            if (objYandex == enumC9342l) {
                                                return enumC9342l;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            autoCloseable2 = autoCloseable3;
                                            th = th;
                                            try {
                                                throw th;
                                            } catch (Throwable th5) {
                                                AbstractC1214l.yandex(autoCloseable2, th);
                                                throw th5;
                                            }
                                        }
                                    } else if (i16 == 3) {
                                        AbstractC2829l.crashlytics(obj);
                                        C2667l c2667lYandex3 = c16047l.yandex();
                                        this.f13128l = 4;
                                        objYandex = c2667lYandex3.yandex(this);
                                        if (objYandex == enumC9342l) {
                                            return enumC9342l;
                                        }
                                    } else {
                                        if (i16 != 4) {
                                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                        AbstractC2829l.crashlytics(obj);
                                        objYandex = obj;
                                    }
                                    autoCloseable = (AutoCloseable) objYandex;
                                    try {
                                        MeteringRectangle[] meteringRectangleArr = AbstractC18123l.yandex;
                                        objM3895throws = AbstractC14814l.m3895throws((C10069l) autoCloseable, null, null, null, Arrays.asList(meteringRectangleArr), Arrays.asList(meteringRectangleArr), Arrays.asList(meteringRectangleArr), 7);
                                        AbstractC1214l.yandex(autoCloseable, null);
                                        return objM3895throws;
                                    } catch (Throwable th6) {
                                        try {
                                            throw th6;
                                        } catch (Throwable th7) {
                                            AbstractC1214l.yandex(autoCloseable, th6);
                                            throw th7;
                                        }
                                    }
                                }
                                AbstractC2829l.crashlytics(obj);
                                objYandex2 = obj;
                            }
                            this.f13125l = autoCloseable2;
                            this.f13128l = 2;
                            objInmobi = AbstractC14814l.inmobi((C10069l) autoCloseable2, 0L, 56);
                            if (objInmobi == enumC9342l) {
                                return enumC9342l;
                            }
                            autoCloseable3 = autoCloseable2;
                            interfaceC1142l = (InterfaceC1142l) objInmobi;
                            AbstractC1214l.yandex(autoCloseable3, null);
                            this.f13125l = null;
                            this.f13128l = 3;
                            if (interfaceC1142l.m832l(this) == enumC9342l) {
                                return enumC9342l;
                            }
                            C2667l c2667lYandex4 = c16047l.yandex();
                            this.f13128l = 4;
                            objYandex = c2667lYandex4.yandex(this);
                            if (objYandex == enumC9342l) {
                                return enumC9342l;
                            }
                            autoCloseable = (AutoCloseable) objYandex;
                            MeteringRectangle[] meteringRectangleArr2 = AbstractC18123l.yandex;
                            objM3895throws = AbstractC14814l.m3895throws((C10069l) autoCloseable, null, null, null, Arrays.asList(meteringRectangleArr2), Arrays.asList(meteringRectangleArr2), Arrays.asList(meteringRectangleArr2), 7);
                            AbstractC1214l.yandex(autoCloseable, null);
                            return objM3895throws;
                        } catch (Throwable th8) {
                            th = th8;
                            th = th;
                            throw th;
                        }
                        autoCloseable2 = (AutoCloseable) objYandex2;
                    } catch (CancellationException e) {
                        if (AbstractC5088l.firebase("CXCP")) {
                            Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
                        }
                        interfaceC1142l = C6267l.smaato;
                    }
                } catch (CancellationException e2) {
                    if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e2);
                    }
                    objM3895throws = C6267l.smaato;
                }
                break;
            case 11:
                C6267l c6267l = (C6267l) this.f13125l;
                LinkedHashMap linkedHashMap = c6267l.firebase;
                List list2 = (List) obj3;
                int i17 = this.f13128l;
                if (i17 != 0) {
                    if (i17 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                boolean zFirebase = AbstractC5088l.firebase("CXCP");
                EnumC17911l enumC17911l = EnumC17911l.f34869l;
                if (zFirebase) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#removeParametersAsync: [" + enumC17911l + "] keys = " + list2);
                }
                Object obj6 = linkedHashMap.get(enumC17911l);
                Object obj7 = obj6;
                if (obj6 == null) {
                    C13467l c13467l = new C13467l(c10685l, (LinkedHashMap) (z4 ? 1 : 0), (C18221l) (z3 ? 1 : 0), 15);
                    linkedHashMap.put(enumC17911l, c13467l);
                    obj7 = c13467l;
                }
                C13467l c13467l2 = (C13467l) obj7;
                C10685l c10685l2 = new C10685l(3);
                c10685l2.m2950default((C5104l) c13467l2.yandex.f21690l);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((C5104l) c10685l2.f21690l).isPro(AbstractC5641l.billing((CaptureRequest.Key) it.next()));
                }
                linkedHashMap.put(enumC17911l, new C13467l(c10685l2, new LinkedHashMap(c13467l2.loadAd), AbstractC16901l.m4227l(c13467l2.crashlytics), c13467l2.amazon));
                C13467l c13467lRemoteconfig = C6267l.remoteconfig(c6267l.firebase);
                this.f13128l = 1;
                Object objMetrica = c6267l.metrica(c13467lRemoteconfig, null, this);
                return objMetrica == enumC9342l ? enumC9342l : objMetrica;
            default:
                C7644l c7644l2 = (C7644l) obj3;
                int i18 = this.f13128l;
                if (i18 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (AbstractC7866l.yandex.purchase().f4736l >= ((C4324l) c7644l2.f15734l).loadAd) {
                        this.f13125l = c7644l2;
                        this.f13128l = 1;
                        C17464l c17464l = new C17464l("get_anonym_token", C8565l.f17663l);
                        c17464l.yandex = true;
                        c17464l.loadAd(2274003, "client_id");
                        c17464l.yandex("client_secret", "hHbZxrka2uZ6jB1inYsH");
                        objBilling = c7644l2.billing(c17464l, this);
                        if (objBilling == enumC9342l) {
                            return enumC9342l;
                        }
                        c7644l = c7644l2;
                    }
                    return ((C4324l) c7644l2.f15734l).yandex;
                }
                if (i18 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                C7644l c7644l3 = (C7644l) this.f13125l;
                AbstractC2829l.crashlytics(obj);
                c7644l = c7644l3;
                objBilling = obj;
                c7644l.f15734l = (C4324l) AbstractC10802l.subs((AbstractC14237l) objBilling);
                return ((C4324l) c7644l2.f15734l).yandex;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        int i = this.f13127l;
        Object obj = this.f13126l;
        switch (i) {
            case 0:
                return new C6208l((C15389l) this.f13125l, (Function3) obj, interfaceC14029l, 0);
            case 1:
                return new C6208l((C18439l) this.f13125l, (InterfaceC15209l) obj, interfaceC14029l, 1);
            case 2:
                return new C6208l((C2769l) this.f13125l, (C8300l) obj, interfaceC14029l, 2);
            case 3:
                return new C6208l((AbstractC10598l) this.f13125l, (C7037l) obj, interfaceC14029l, 3);
            case 4:
                return new C6208l((C11644l) this.f13125l, (C0360l) obj, interfaceC14029l, 4);
            case 5:
                return new C6208l((Function2) this.f13125l, (C2856l) obj, interfaceC14029l, 5);
            case 6:
                return new C6208l((C0360l) this.f13125l, (Function2) obj, interfaceC14029l, 6);
            case 7:
                return new C6208l((AbstractC10598l) this.f13125l, obj, interfaceC14029l, 7);
            case 8:
                return new C6208l((InterfaceC9427l) this.f13125l, (C10700l) obj, interfaceC14029l, 8);
            case 9:
                return new C6208l((C6731l) this.f13125l, (C4543l) obj, interfaceC14029l, 9);
            case 10:
                return new C6208l((C6267l) obj, interfaceC14029l, 10);
            case 11:
                return new C6208l((C6267l) this.f13125l, (List) obj, interfaceC14029l, 11);
            default:
                return new C6208l((C7644l) obj, interfaceC14029l, 12);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f13127l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
        }
        return ((C6208l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6208l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f13127l = i;
        this.f13126l = obj;
    }
}
