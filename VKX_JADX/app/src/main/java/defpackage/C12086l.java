package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.appwidget.AsyncRequestWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِۙٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12086l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f24013l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f24014l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f24015l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f24016l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12086l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f24015l = i;
        this.f24013l = obj;
        this.f24014l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:360:0x0720  */
    /* JADX WARN: Code duplicated, block: B:362:0x0730  */
    /* JADX WARN: Code duplicated, block: B:368:0x0747  */
    /* JADX WARN: Code duplicated, block: B:370:0x0754  */
    /* JADX WARN: Code duplicated, block: B:373:0x075c  */
    /* JADX WARN: Code duplicated, block: B:556:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v189, types: [lّۜؑ] */
    /* JADX WARN: Type inference failed for: r15v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:363:0x0738 -> B:365:0x073b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12086l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f24015l;
        Object obj2 = this.f24014l;
        switch (i) {
            case 0:
                return new C12086l((C0483l) this.f24013l, (EnumC12999l) obj2, interfaceC14029l, 0);
            case 1:
                return new C12086l((C2403l) this.f24013l, (C0261l) obj2, interfaceC14029l, 1);
            case 2:
                return new C12086l((C2403l) this.f24013l, (C12134l) obj2, interfaceC14029l, 2);
            case 3:
                return new C12086l((C14951l) this.f24013l, (InterfaceC7702l) obj2, interfaceC14029l, 3);
            case 4:
                C12086l c12086l = new C12086l((C14951l) obj2, interfaceC14029l, 4);
                c12086l.f24013l = obj;
                return c12086l;
            case 5:
                return new C12086l((C10987l) this.f24013l, (C5685l) obj2, interfaceC14029l, 5);
            case 6:
                return new C12086l((C14624l) this.f24013l, (C10023l) obj2, interfaceC14029l, 6);
            case 7:
                C12086l c12086l2 = new C12086l((C12095l) obj2, interfaceC14029l, 7);
                c12086l2.f24013l = obj;
                return c12086l2;
            case 8:
                C12086l c12086l3 = new C12086l((C11941l) obj2, interfaceC14029l, 8);
                c12086l3.f24013l = obj;
                return c12086l3;
            case 9:
                return new C12086l((C16328l) this.f24013l, (C0554l) obj2, interfaceC14029l, 9);
            case 10:
                return new C12086l((InterfaceC5995l) this.f24013l, (C0554l) obj2, interfaceC14029l, 10);
            case 11:
                return new C12086l((C13834l) this.f24013l, (C6839l) obj2, interfaceC14029l, 11);
            case 12:
                return new C12086l((C17097l) this.f24013l, (InterfaceC7702l) obj2, interfaceC14029l, 12);
            case 13:
                C12086l c12086l4 = new C12086l((C17097l) obj2, interfaceC14029l, 13);
                c12086l4.f24013l = obj;
                return c12086l4;
            case 14:
                return new C12086l((C5814l) this.f24013l, (InterfaceC7702l) obj2, interfaceC14029l, 14);
            case 15:
                C12086l c12086l5 = new C12086l((C5814l) obj2, interfaceC14029l, 15);
                c12086l5.f24013l = obj;
                return c12086l5;
            case 16:
                return new C12086l((C5580l) this.f24013l, (InterfaceC7702l) obj2, interfaceC14029l, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C12086l c12086l6 = new C12086l((C5580l) obj2, interfaceC14029l, 17);
                c12086l6.f24013l = obj;
                return c12086l6;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C12086l((C14951l) this.f24013l, (InterfaceC7702l) obj2, interfaceC14029l, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C12086l c12086l7 = new C12086l((C14951l) obj2, interfaceC14029l, 19);
                c12086l7.f24013l = obj;
                return c12086l7;
            case 20:
                return new C12086l((C4254l) this.f24013l, (InterfaceC7702l) obj2, interfaceC14029l, 20);
            case 21:
                C12086l c12086l8 = new C12086l((C4254l) obj2, interfaceC14029l, 21);
                c12086l8.f24013l = obj;
                return c12086l8;
            case 22:
                return new C12086l((C4254l) this.f24013l, (InterfaceC7702l) obj2, interfaceC14029l, 22);
            case 23:
                C12086l c12086l9 = new C12086l((C4254l) obj2, interfaceC14029l, 23);
                c12086l9.f24013l = obj;
                return c12086l9;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C12086l((C0071l) this.f24013l, (InterfaceC7702l) obj2, interfaceC14029l, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C12086l c12086l10 = new C12086l((C0071l) obj2, interfaceC14029l, 25);
                c12086l10.f24013l = obj;
                return c12086l10;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C12086l((C17097l) this.f24013l, (InterfaceC7702l) obj2, interfaceC14029l, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C12086l c12086l11 = new C12086l((C17097l) obj2, interfaceC14029l, 27);
                c12086l11.f24013l = obj;
                return c12086l11;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C12086l((C18159l) this.f24013l, (InterfaceC8714l) obj2, interfaceC14029l, 28);
            default:
                C12086l c12086l12 = new C12086l((AsyncRequestWorker) obj2, interfaceC14029l, 29);
                c12086l12.f24013l = obj;
                return c12086l12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.f24015l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                ((C12086l) ads((InterfaceC14029l) obj2, (C11195l) obj)).Signature(Unit.INSTANCE);
                return enumC9342l;
            case 8:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
                return enumC9342l;
            case 10:
                ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
                return enumC9342l;
            case 11:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C12086l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12086l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f24015l = i;
        this.f24014l = obj;
    }
}
