package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙٞۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6637l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f13878l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f13879l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f13880l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f13881l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6637l(C0360l c0360l, C6394l c6394l, InterfaceC8282l interfaceC8282l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f13880l = 18;
        this.f13878l = c0360l;
        this.f13879l = c6394l;
    }

    /* JADX WARN: Code duplicated, block: B:255:0x0473  */
    /* JADX WARN: Code duplicated, block: B:513:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:257:0x047e -> B:259:0x0481). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:230:0x0423
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2166
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6637l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f13880l) {
            case 0:
                return new C6637l((C5165l) this.f13878l, (InterfaceC7702l) this.f13879l, interfaceC14029l, 0);
            case 1:
                C6637l c6637l = new C6637l((C5165l) this.f13878l, interfaceC14029l);
                c6637l.f13879l = obj;
                return c6637l;
            case 2:
                return new C6637l((C5165l) this.f13878l, (InterfaceC7702l) this.f13879l, interfaceC14029l, 2);
            case 3:
                C6637l c6637l2 = new C6637l((C5165l) this.f13879l, interfaceC14029l, 3);
                c6637l2.f13878l = obj;
                return c6637l2;
            case 4:
                return new C6637l((C5165l) this.f13878l, (InterfaceC7702l) this.f13879l, interfaceC14029l, 4);
            case 5:
                C6637l c6637l3 = new C6637l((C5165l) this.f13879l, interfaceC14029l, 5);
                c6637l3.f13878l = obj;
                return c6637l3;
            case 6:
                return new C6637l((C6449l) this.f13879l, interfaceC14029l, 6);
            case 7:
                return new C6637l((ScrollCaptureCallbackC6465l) this.f13878l, (Runnable) this.f13879l, interfaceC14029l, 7);
            case 8:
                return new C6637l((Function2) this.f13878l, (C10539l) this.f13879l, interfaceC14029l, 8);
            case 9:
                return new C6637l((Function2) this.f13878l, (C10700l) this.f13879l, interfaceC14029l, 9);
            case 10:
                return new C6637l((C16173l) this.f13878l, (C1739l) this.f13879l, interfaceC14029l, 10);
            case 11:
                return new C6637l((InterfaceC6843l) this.f13878l, (C16173l) this.f13879l, interfaceC14029l, 11);
            case 12:
                return new C6637l((AbstractC9694l) this.f13878l, (List) this.f13879l, interfaceC14029l, 12);
            case 13:
                return new C6637l((AbstractC9694l) this.f13878l, (C13954l) this.f13879l, interfaceC14029l, 13);
            case 14:
                return new C6637l((AbstractC3372l) this.f13878l, (List) this.f13879l, interfaceC14029l, 14);
            case 15:
                return new C6637l((InterfaceC7042l) this.f13878l, (C13404l) this.f13879l, interfaceC14029l, 15);
            case 16:
                C6637l c6637l4 = new C6637l((ArrayList) this.f13879l, interfaceC14029l, 16);
                c6637l4.f13878l = obj;
                return c6637l4;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C6637l((C0360l) this.f13878l, (InterfaceC8282l) null, (C11644l) this.f13879l, interfaceC14029l);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C6637l((C0360l) this.f13878l, (C6394l) this.f13879l, (InterfaceC8282l) null, interfaceC14029l);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6637l c6637l5 = new C6637l((C0360l) this.f13879l, interfaceC14029l, 19);
                c6637l5.f13878l = obj;
                return c6637l5;
            case 20:
                return new C6637l((C13025l) this.f13878l, (InterfaceC7702l) this.f13879l, interfaceC14029l, 20);
            case 21:
                C6637l c6637l6 = new C6637l((C13025l) this.f13879l, interfaceC14029l, 21);
                c6637l6.f13878l = obj;
                return c6637l6;
            case 22:
                return new C6637l((C13025l) this.f13878l, (InterfaceC7702l) this.f13879l, interfaceC14029l, 22);
            case 23:
                C6637l c6637l7 = new C6637l((C13025l) this.f13879l, interfaceC14029l, 23);
                c6637l7.f13878l = obj;
                return c6637l7;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C6637l((C13025l) this.f13878l, (InterfaceC7702l) this.f13879l, interfaceC14029l, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6637l c6637l8 = new C6637l((C13025l) this.f13879l, interfaceC14029l, 25);
                c6637l8.f13878l = obj;
                return c6637l8;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C6637l((C13025l) this.f13878l, (InterfaceC7702l) this.f13879l, interfaceC14029l, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6637l c6637l9 = new C6637l((C13025l) this.f13879l, interfaceC14029l, 27);
                c6637l9.f13878l = obj;
                return c6637l9;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C6637l((C13025l) this.f13878l, (InterfaceC7702l) this.f13879l, interfaceC14029l, 28);
            default:
                C6637l c6637l10 = new C6637l((C13025l) this.f13879l, interfaceC14029l, 29);
                c6637l10.f13878l = obj;
                return c6637l10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f13880l) {
            case 0:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
                return EnumC9342l.f19165l;
            case 16:
                return ((C6637l) ads((InterfaceC14029l) obj2, (C14875l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C6637l) ads((InterfaceC14029l) obj2, (C6394l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C6637l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6637l(C5165l c5165l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f13880l = 1;
        this.f13878l = c5165l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6637l(C0360l c0360l, InterfaceC8282l interfaceC8282l, C11644l c11644l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f13880l = 17;
        this.f13878l = c0360l;
        this.f13879l = c11644l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6637l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f13880l = i;
        this.f13879l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6637l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f13880l = i;
        this.f13878l = obj;
        this.f13879l = obj2;
    }
}
