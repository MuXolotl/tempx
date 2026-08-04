package defpackage;

import android.util.Log;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕۛۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15939l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ List f31285l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f31286l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C6953l f31287l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final /* synthetic */ C6953l f31288l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C6558l f31289l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f31290l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ List f31291l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f31292l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C6267l f31293l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C6558l f31294l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public List f31295l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f31296l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final /* synthetic */ List f31297l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ long f31298l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15939l(C6267l c6267l, List list, List list2, List list3, C6953l c6953l, C6558l c6558l, long j, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f31293l = c6267l;
        this.f31285l = list;
        this.f31297l = list2;
        this.f31291l = list3;
        this.f31288l = c6953l;
        this.f31289l = c6558l;
        this.f31298l = j;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        List list;
        List list2;
        List list3;
        C6953l c6953l;
        C6558l c6558l;
        long j;
        Object objYandex;
        List list4;
        C6953l c6953l2;
        AutoCloseable autoCloseable;
        Object objYandex2;
        AutoCloseable autoCloseable2;
        Throwable th;
        int i = this.f31296l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            try {
                if (i == 0) {
                    AbstractC2829l.crashlytics(obj);
                    if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", "UseCaseCameraRequestControlImpl#startFocusAndMeteringAsync");
                    }
                    C6267l c6267l = this.f31293l;
                    list = this.f31285l;
                    list2 = this.f31297l;
                    list3 = this.f31291l;
                    c6953l = this.f31288l;
                    c6558l = this.f31289l;
                    j = this.f31298l;
                    C2667l c2667lYandex = c6267l.crashlytics.yandex();
                    this.f31292l = list;
                    this.f31295l = list2;
                    this.f31286l = list3;
                    this.f31287l = c6953l;
                    this.f31294l = c6558l;
                    this.f31290l = j;
                    this.f31296l = 1;
                    objYandex = c2667lYandex.yandex(this);
                    if (objYandex == enumC9342l) {
                    }
                    return enumC9342l;
                }
                if (i != 1) {
                    if (i != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    autoCloseable2 = (AutoCloseable) this.f31292l;
                    try {
                        AbstractC2829l.crashlytics(obj);
                        objYandex2 = obj;
                        InterfaceC1142l interfaceC1142l = (InterfaceC1142l) objYandex2;
                        AbstractC1214l.yandex(autoCloseable2, null);
                        return interfaceC1142l;
                    } catch (Throwable th2) {
                        th = th2;
                        autoCloseable = autoCloseable2;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AbstractC1214l.yandex(autoCloseable, th);
                            throw th3;
                        }
                    }
                }
                long j2 = this.f31290l;
                C6558l c6558l2 = this.f31294l;
                c6953l = this.f31287l;
                list3 = this.f31286l;
                list2 = this.f31295l;
                list = (List) this.f31292l;
                AbstractC2829l.crashlytics(obj);
                j = j2;
                c6558l = c6558l2;
                objYandex = obj;
                C10069l c10069l = (C10069l) autoCloseable;
                this.f31292l = autoCloseable;
                this.f31295l = null;
                this.f31286l = null;
                this.f31287l = null;
                this.f31294l = null;
                this.f31296l = 2;
                if ((7175 & 8) != 0) {
                    list = null;
                }
                if ((7175 & 16) != 0) {
                    list2 = null;
                }
                if ((7175 & 32) != 0) {
                    list4 = null;
                }
                if ((7175 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    c6558l = null;
                }
                if (c10069l.f20544l.yandex()) {
                    C8936l.firebase(c10069l, " after close.", "Cannot call lock3A on ");
                    objYandex2 = null;
                } else {
                    List list5 = list;
                    C6558l c6558l3 = c6558l;
                    objYandex2 = c10069l.f20542l.yandex(list5, list2, list4, null, c6953l2, null, c6558l3, null, 60, new Long(j), new Long(j), this);
                }
                if (objYandex2 != enumC9342l) {
                    autoCloseable2 = autoCloseable;
                    InterfaceC1142l interfaceC1142l2 = (InterfaceC1142l) objYandex2;
                    AbstractC1214l.yandex(autoCloseable2, null);
                    return interfaceC1142l2;
                }
                return enumC9342l;
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
            list4 = list3;
            c6953l2 = c6953l;
            autoCloseable = (AutoCloseable) objYandex;
        } catch (CancellationException e) {
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return C6267l.smaato;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C15939l(this.f31293l, this.f31285l, this.f31297l, this.f31291l, this.f31288l, this.f31289l, this.f31298l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C15939l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
