package defpackage;

import android.content.res.Resources;
import android.os.CancellationSignal;
import android.view.MotionEvent;
import android.view.inputmethod.InputConnection;
import androidx.car.app.navigation.model.Maneuver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۣؔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3006l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6513l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6514l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3006l(C13191l c13191l, long j) {
        super(1);
        this.f6514l = 7;
        this.f6513l = c13191l;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0366 A[DONT_INVERT, PHI: r9
  0x0366: PHI (r9v7 boolean) = (r9v6 boolean), (r9v8 boolean) binds: [B:163:0x02f9, B:191:0x0364] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:193:0x0368 A[LOOP:1: B:162:0x02eb->B:193:0x0368, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:236:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C5109l c5109l;
        C5109l c5109l2;
        InterfaceC12244l interfaceC12244l;
        int i = this.f6514l;
        EnumC8647l enumC8647l = EnumC8647l.f17806l;
        int i2 = -1;
        byte b = 0;
        int i3 = 0;
        Object obj2 = this.f6513l;
        switch (i) {
            case 0:
                InterfaceC2800l interfaceC2800l = (InterfaceC2800l) obj;
                C7074l c7074l = (C7074l) obj2;
                if (interfaceC2800l.vip() != Integer.MAX_VALUE) {
                    if (interfaceC2800l.yandex().loadAd) {
                        interfaceC2800l.appmetrica();
                    }
                    for (Map.Entry entry : interfaceC2800l.yandex().subs.entrySet()) {
                        C7074l.yandex(c7074l, (AbstractC12914l) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC2800l.purchase());
                    }
                    for (AbstractC18026l abstractC18026l = interfaceC2800l.purchase().f35294l; !AbstractC8576l.yandex(abstractC18026l, c7074l.yandex.purchase()); abstractC18026l = abstractC18026l.f35294l) {
                        for (AbstractC12914l abstractC12914l : c7074l.loadAd(abstractC18026l).keySet()) {
                            C7074l.yandex(c7074l, abstractC12914l, c7074l.crashlytics(abstractC18026l, abstractC12914l), abstractC18026l);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C3384l c3384l = (C3384l) obj;
                C4682l c4682l = (C4682l) obj2;
                if (c4682l.f9519l == null) {
                    c4682l.f9519l = new C5112l(c4682l.f9520l.getInsetsWatcher());
                }
                C16977l c16977l = C5112l.purchase;
                int[] iArr = c16977l.loadAd;
                Object[] objArr = c16977l.crashlytics;
                long[] jArr = c16977l.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    z = false;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            int i6 = i3;
                            while (true) {
                                if (i6 < i5) {
                                    if ((255 & j) < 128) {
                                        int i7 = (i4 << 3) + i6;
                                        int i8 = iArr[i7];
                                        InterfaceC16067l interfaceC16067l = (InterfaceC16067l) objArr[i7];
                                        if (C5112l.yandex(c3384l, ((C7404l) interfaceC16067l).crashlytics) || C5112l.yandex(c3384l, ((C7404l) interfaceC16067l).amazon) || !(i8 == -1 || (c5109l = (C5109l) C5112l.crashlytics.loadAd(i8)) == null || (!C5112l.yandex(c3384l, c5109l) && ((c5109l2 = (C5109l) C5112l.amazon.loadAd(i8)) == null || !C5112l.yandex(c3384l, c5109l2))))) {
                                            z4 = true;
                                            z = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                        }
                                    }
                                    j >>= 8;
                                    i6++;
                                } else if (i5 == 8) {
                                    if (i4 != length) {
                                        i4++;
                                        i3 = 0;
                                    }
                                }
                            }
                        } else if (i4 != length) {
                            i4++;
                            i3 = 0;
                        }
                        z3 = z;
                        return Boolean.valueOf(z3);
                    }
                }
                z = false;
                InterfaceC16067l.yandex.getClass();
                C7404l c7404l = C9624l.isPro;
                if (C5112l.yandex(c3384l, c7404l.crashlytics) || C5112l.yandex(c3384l, c7404l.amazon)) {
                    z2 = true;
                    z = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = z;
                } else {
                    for (C5109l c5109l3 : C5112l.loadAd) {
                        if (C5112l.yandex(c3384l, c5109l3)) {
                            z3 = true;
                        }
                    }
                    z3 = z;
                }
                return Boolean.valueOf(z3);
            case 2:
                return Boolean.valueOf(((C6543l) obj).m2026l(((C3475l) obj2).yandex));
            case 3:
                return Boolean.valueOf(((AbstractC14183l) obj2).yandex(((C18666l) obj).billing));
            case 4:
                return Boolean.valueOf(AbstractC3292l.crashlytics((C18666l) obj, (Resources) obj2));
            case 5:
                ((C3654l) obj2).m1391public((InterfaceC13490l) obj);
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf(AbstractC8576l.yandex(obj, obj2));
            case 7:
                InterfaceC17460l interfaceC17460l = (InterfaceC17460l) obj;
                C13191l c13191l = (C13191l) obj2;
                if (!AbstractC8576l.yandex(interfaceC17460l.loadAd(), c13191l.f25804l.loadAd()) && (interfaceC12244l = (InterfaceC12244l) c13191l.f25804l.amazon.mopub(interfaceC17460l.loadAd())) != null) {
                    long j2 = ((C4999l) interfaceC12244l.getValue()).yandex;
                }
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) c13191l.f25804l.amazon.mopub(interfaceC17460l.amazon());
                if (interfaceC12244l2 != null) {
                    long j3 = ((C4999l) interfaceC12244l2.getValue()).yandex;
                }
                if (((C7066l) c13191l.f25803l.getValue()) == null) {
                    return AbstractC0532l.admob(0.0f, 400.0f, null, 5);
                }
                C8896l c8896l = AbstractC11922l.yandex;
                return AbstractC0532l.admob(0.0f, 400.0f, new C4999l(4294967297L), 1);
            case 8:
                return ((C17154l) obj2).billing;
            case 9:
                C8896l c8896l2 = (C8896l) obj;
                C7640l c7640l = (C7640l) obj2;
                if (c7640l.f29462l) {
                    AbstractC10999l.mopub(c7640l.m3914l(), null, 0, new C5163l(c7640l, c8896l2, b == true ? 1 : 0, 15), 3);
                }
                return Unit.INSTANCE;
            case 10:
                C10369l c10369l = (C10369l) obj;
                float f = c10369l.loadAd;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = c10369l.crashlytics;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = c10369l.amazon;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = c10369l.yandex;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new C9735l(C9735l.yandex(AbstractC12953l.yandex(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, C3955l.ad), (AbstractC11833l) obj2));
            case 11:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return Unit.INSTANCE;
            case 12:
                return new C9582l(9, (C0907l) obj2);
            case 13:
                return Boolean.valueOf(!AbstractC8576l.yandex(obj, ((C18656l) obj2).amazon.getValue()));
            case 14:
                ((C6148l) obj).crashlytics(((Number) ((InterfaceC12244l) obj2).getValue()).floatValue());
                return Unit.INSTANCE;
            case 15:
                C8449l c8449l = (C8449l) obj;
                if (!c8449l.f29454l.f29462l) {
                    return EnumC8647l.f17805l;
                }
                InterfaceC18545l interfaceC18545l = c8449l.f17456l;
                if (interfaceC18545l != null) {
                    interfaceC18545l.mo2324package((C1323l) obj2);
                }
                c8449l.f17456l = null;
                c8449l.f17455l = null;
                return enumC8647l;
            case 16:
                return new C5177l(((long) ((Number) ((C15760l) obj2).invoke(Integer.valueOf((int) (((C4999l) obj).yandex & 4294967295L)))).intValue()) & 4294967295L);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                if (AbstractC18206l.loadAd.compareAndSet(false, true)) {
                    ((C7119l) obj2).amazon(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                C11925l c11925l = (C11925l) obj2;
                C9902l c9902l = c11925l.smaato;
                if (c11925l.vip && c11925l.signatures && c9902l != null) {
                    C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
                    long jM4551private = c18449lMo2065break.m4551private();
                    c18449lMo2065break.m4555synchronized().mopub();
                    try {
                        ((C18449l) ((C16543l) c18449lMo2065break.f36010l).f32482l).m4555synchronized().remoteconfig(c9902l);
                        c11925l.crashlytics(interfaceC13349l);
                    } finally {
                        AbstractC0653l.license(c18449lMo2065break, jM4551private);
                    }
                } else {
                    c11925l.crashlytics(interfaceC13349l);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj;
                InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l2.mo2065break().m4555synchronized();
                Function2 function2 = ((C6577l) obj2).f13743l;
                if (function2 != null) {
                    function2.invoke(interfaceC14859lM4555synchronized, (C11925l) interfaceC13349l2.mo2065break().f36009l);
                }
                return Unit.INSTANCE;
            case 20:
                AbstractC16175l abstractC16175l = (AbstractC16175l) obj;
                C8006l c8006l = (C8006l) obj2;
                c8006l.mopub(abstractC16175l);
                Function1 function1 = c8006l.subs;
                if (function1 != null) {
                    function1.invoke(abstractC16175l);
                }
                return Unit.INSTANCE;
            case 21:
                if (!((AbstractC17886l) obj).f34840l) {
                    return enumC8647l;
                }
                ((C9122l) obj2).f18750l = false;
                return EnumC8647l.f17804l;
            case 22:
                InputConnectionC7023l inputConnectionC7023l = (InputConnectionC7023l) obj;
                InputConnection inputConnection = inputConnectionC7023l.loadAd;
                if (inputConnection != null) {
                    inputConnectionC7023l.yandex(inputConnection);
                    inputConnectionC7023l.loadAd = null;
                }
                C11195l c11195l = (C11195l) obj2;
                C17893l c17893l = c11195l.amazon;
                Object[] objArr2 = c17893l.f34848l;
                int i9 = c17893l.f34846l;
                while (i3 < i9) {
                    if (AbstractC8576l.yandex((C4059l) objArr2[i3], inputConnectionC7023l)) {
                        i2 = i3;
                        if (i2 >= 0) {
                            c17893l.vip(i2);
                        }
                        if (c17893l.f34846l == 0) {
                            c11195l.loadAd.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                    i3++;
                }
                if (i2 >= 0) {
                    c17893l.vip(i2);
                }
                if (c17893l.f34846l == 0) {
                    c11195l.loadAd.invoke();
                }
                return Unit.INSTANCE;
            case 23:
                ((ListenableFuture) obj2).cancel(false);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C17893l) obj2).crashlytics((InterfaceC13112l) obj);
                return Boolean.TRUE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                C5205l c5205l = ((C13408l) obj2).f26311l;
                (c5205l != null ? c5205l : null).invoke(motionEvent);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((InterfaceC8714l) obj2).setValue(new C1187l(((InterfaceC18212l) obj).mo2591strictfp(0L)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Boolean.valueOf(((C5371l) obj).yandex() != ((C5371l) obj2).yandex());
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, ((C6402l) obj2).yandex);
                return Unit.INSTANCE;
            default:
                AbstractC3668l.mopub((InterfaceC17593l) obj, (String) obj2);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3006l(int i, Object obj) {
        super(1);
        this.f6514l = i;
        this.f6513l = obj;
    }
}
