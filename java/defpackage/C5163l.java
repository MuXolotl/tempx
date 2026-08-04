package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraManager;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٟؗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5163l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ Object f11213l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f11214l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f11215l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f11216l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5163l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f11215l = i;
        this.f11213l = obj;
        this.f11214l = obj2;
    }

    private final Object pro(Object obj) {
        ArrayList arrayList;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i = this.f11216l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C12428l c12428l = (C12428l) this.f11213l;
            C10698l c10698l = new C10698l((C14232l) this.f11214l, c12428l);
            CameraManager cameraManager = (CameraManager) ((C14232l) this.f11214l).yandex.get();
            cameraManager.registerAvailabilityCallback(c10698l, ((C14232l) this.f11214l).loadAd.yandex());
            C14232l c14232l = (C14232l) this.f11214l;
            synchronized (c14232l.billing) {
                arrayList = c14232l.mopub;
            }
            C14232l c14232l2 = (C14232l) this.f11214l;
            if (arrayList != null) {
                C14232l.purchase(c12428l, arrayList);
            } else {
                ArrayList arrayListAmazon = c14232l2.amazon();
                if (arrayListAmazon != null) {
                    C14232l.purchase(c12428l, arrayListAmazon);
                }
            }
            Ctry ctry = new Ctry(cameraManager, c10698l, 28);
            this.f11216l = 1;
            if (AbstractC3230l.amazon(c12428l, ctry, this) == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:459:0x088a  */
    /* JADX WARN: Code duplicated, block: B:461:0x0892  */
    /* JADX WARN: Code duplicated, block: B:464:0x08ab A[Catch: all -> 0x08d2, TryCatch #2 {all -> 0x08d2, blocks: (B:462:0x0896, B:464:0x08ab, B:469:0x08b5, B:472:0x08d0, B:456:0x0883), top: B:487:0x0883 }] */
    /* JADX WARN: Code duplicated, block: B:465:0x08af  */
    /* JADX WARN: Code duplicated, block: B:468:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:471:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:472:0x08d0 A[Catch: all -> 0x08d2, TRY_LEAVE, TryCatch #2 {all -> 0x08d2, blocks: (B:462:0x0896, B:464:0x08ab, B:469:0x08b5, B:472:0x08d0, B:456:0x0883), top: B:487:0x0883 }] */
    /* JADX WARN: Code duplicated, block: B:476:0x08dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [lؚٗ٘] */
    /* JADX WARN: Type inference failed for: r15v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v8, types: [lؖۥٙ] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:417:0x07da -> B:406:0x0776). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:477:0x08e5 -> B:459:0x088a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 2346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5163l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f11215l;
        Object obj2 = this.f11214l;
        switch (i) {
            case 0:
                C5163l c5163l = new C5163l((C9174l) obj2, interfaceC14029l, 0);
                c5163l.f11213l = obj;
                return c5163l;
            case 1:
                return new C5163l((C7721l) this.f11213l, (AbstractC13264l) obj2, interfaceC14029l, 1);
            case 2:
                return new C5163l((C2887l) this.f11213l, (C7721l) obj2, interfaceC14029l, 2);
            case 3:
                C5163l c5163l2 = new C5163l((C7721l) obj2, interfaceC14029l, 3);
                c5163l2.f11213l = obj;
                return c5163l2;
            case 4:
                return new C5163l((Context) this.f11213l, (Intent) obj2, interfaceC14029l, 4);
            case 5:
                return new C5163l((C5766l) this.f11213l, (C5419l) obj2, interfaceC14029l, 5);
            case 6:
                return new C5163l((String) this.f11213l, (C7968l) obj2, interfaceC14029l, 6);
            case 7:
                return new C5163l((C4940l) this.f11213l, (InterfaceC8639l) obj2, interfaceC14029l, 7);
            case 8:
                C5163l c5163l3 = new C5163l((AbstractC12432l) obj2, interfaceC14029l, 8);
                c5163l3.f11213l = obj;
                return c5163l3;
            case 9:
                return new C5163l((AbstractServiceC5477l) this.f11213l, (AbstractC7317l) obj2, interfaceC14029l, 9);
            case 10:
                return new C5163l((AbstractC8189l) this.f11213l, (Function1) obj2, interfaceC14029l, 10);
            case 11:
                return new C5163l((AbstractC8189l) this.f11213l, (Function0) obj2, interfaceC14029l, 11);
            case 12:
                return new C5163l((C14951l) this.f11213l, (InterfaceC7702l) obj2, interfaceC14029l, 12);
            case 13:
                C5163l c5163l4 = new C5163l((C14951l) obj2, interfaceC14029l, 13);
                c5163l4.f11213l = obj;
                return c5163l4;
            case 14:
                return new C5163l((C15050l) this.f11213l, (C2814l) obj2, interfaceC14029l, 14);
            case 15:
                return new C5163l((C7640l) this.f11213l, (C8896l) obj2, interfaceC14029l, 15);
            case 16:
                return new C5163l((C1252l) this.f11213l, (Cfinally) obj2, interfaceC14029l, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C5163l((InterfaceC8639l) this.f11213l, (byte[]) obj2, interfaceC14029l, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C5163l((C5060l) this.f11213l, (InterfaceC7702l) obj2, interfaceC14029l, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C5163l c5163l5 = new C5163l((C5060l) obj2, interfaceC14029l, 19);
                c5163l5.f11213l = obj;
                return c5163l5;
            case 20:
                return new C5163l((C5060l) this.f11213l, (InterfaceC7702l) obj2, interfaceC14029l, 20);
            case 21:
                C5163l c5163l6 = new C5163l((C5060l) obj2, interfaceC14029l, 21);
                c5163l6.f11213l = obj;
                return c5163l6;
            case 22:
                C5163l c5163l7 = new C5163l((C12014l) obj2, interfaceC14029l, 22);
                c5163l7.f11213l = obj;
                return c5163l7;
            case 23:
                C5163l c5163l8 = new C5163l((C11751l) obj2, interfaceC14029l, 23);
                c5163l8.f11213l = obj;
                return c5163l8;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C5163l c5163l9 = new C5163l((C14232l) obj2, interfaceC14029l, 24);
                c5163l9.f11213l = obj;
                return c5163l9;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C5163l((C10299l) this.f11213l, (InterfaceC8714l) obj2, interfaceC14029l, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C5163l c5163l10 = new C5163l((C5891l) obj2, interfaceC14029l, 26);
                c5163l10.f11213l = obj;
                return c5163l10;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C5163l c5163l11 = new C5163l((AbstractC18135l) obj2, interfaceC14029l, 27);
                c5163l11.f11213l = obj;
                return c5163l11;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C5163l c5163l12 = new C5163l((AbstractC11465l) obj2, interfaceC14029l, 28);
                c5163l12.f11213l = obj;
                return c5163l12;
            default:
                return new C5163l((InterfaceC6942l) this.f11213l, (C7173l) obj2, interfaceC14029l, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11215l) {
            case 0:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC9427l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC9427l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C5163l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C5163l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C5163l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C5163l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C5163l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC9427l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C5163l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5163l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f11215l = i;
        this.f11214l = obj;
    }
}
