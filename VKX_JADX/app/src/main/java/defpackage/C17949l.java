package defpackage;

import android.graphics.Bitmap;
import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.session.SessionWorker;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lٕ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17949l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f34931l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f34932l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f34933l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f34934l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f34935l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17949l(Object obj, Object obj2, Object obj3, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f34933l = i;
        this.f34931l = obj;
        this.f34932l = obj2;
        this.f34934l = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r0.yandex(r1, r7) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r1, r2, r7) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object ad(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f34934l
            lؚؐٚ r0 = (defpackage.InterfaceC6942l) r0
            java.lang.Object r1 = r7.f34932l
            lّۢٚ r1 = (defpackage.InterfaceC12932l) r1
            int r2 = r7.f34935l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1e
            if (r2 == r5) goto L1a
            if (r2 != r4) goto L14
            goto L1a
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            return r3
        L1a:
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L4b
        L1e:
            defpackage.AbstractC2829l.crashlytics(r8)
            java.lang.Object r8 = r7.f34931l
            lؘْۘ r8 = (defpackage.C5655l) r8
            lٗٙۤ r2 = defpackage.C17218l.f33421l
            boolean r2 = defpackage.AbstractC8576l.yandex(r1, r2)
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r2 == 0) goto L3d
            lُٜؗ r1 = new lُٜؗ
            r1.<init>(r8, r4)
            r7.f34935l = r5
            java.lang.Object r7 = r0.yandex(r1, r7)
            if (r7 != r6) goto L4b
            goto L4a
        L3d:
            lًٗۨ r2 = new lًٗۨ
            r2.<init>(r0, r8, r3, r5)
            r7.f34935l = r4
            java.lang.Object r7 = defpackage.AbstractC10999l.firebase(r1, r2, r7)
            if (r7 != r6) goto L4b
        L4a:
            return r6
        L4b:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17949l.ad(java.lang.Object):java.lang.Object");
    }

    private final Object advert(Object obj) {
        Object c18435l;
        int i = this.f34935l;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                C5374l c5374l = (C5374l) this.f34931l;
                C5492l c5492l = (C5492l) this.f34932l;
                String str = (String) this.f34934l;
                C3316l c3316l = c5374l.loadAd;
                this.f34935l = 1;
                obj = c3316l.tapsense(c5492l, str, this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            c18435l = (Boolean) obj;
            c18435l.getClass();
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        return Boolean.valueOf(AbstractC8576l.yandex(c18435l instanceof C18435l ? null : c18435l, Boolean.TRUE));
    }

    private final Object pro(Object obj) {
        InterfaceC8714l interfaceC8714l;
        Object c18435l;
        long j;
        int i = this.f34935l;
        boolean z = false;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            Bitmap bitmap = (Bitmap) ((InterfaceC8714l) this.f34932l).getValue();
            if (bitmap != null) {
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) this.f34934l;
                try {
                    C7545l c7545l = C18718l.purchase;
                    this.f34931l = interfaceC8714l2;
                    this.f34935l = 1;
                    try {
                        obj = AbstractC10999l.firebase(AbstractC11463l.yandex, new C11671l(bitmap, z ? 1 : 0, 10), this);
                        EnumC9342l enumC9342l = EnumC9342l.f19165l;
                        if (obj == enumC9342l) {
                            return enumC9342l;
                        }
                        interfaceC8714l = interfaceC8714l2;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC8714l = interfaceC8714l2;
                        c18435l = new C18435l(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC8714l = (InterfaceC8714l) this.f34931l;
        try {
            AbstractC2829l.crashlytics(obj);
        } catch (Throwable th3) {
            th = th3;
            c18435l = new C18435l(th);
        }
        c18435l = new C9735l(((C9735l) obj).yandex);
        C9735l c9735l = (C9735l) (c18435l instanceof C18435l ? null : c18435l);
        if (c9735l != null) {
            j = c9735l.yandex;
            AbstractC12953l.firebase(C9735l.loadAd, j);
        } else {
            j = C9735l.loadAd;
        }
        interfaceC8714l.setValue(new C9735l(j));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x034f A[Catch: all -> 0x032e, CancellationException -> 0x03ca, TRY_ENTER, TryCatch #10 {CancellationException -> 0x03ca, all -> 0x032e, blocks: (B:137:0x032a, B:145:0x034f, B:147:0x036c, B:148:0x0378), top: B:492:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:147:0x036c A[Catch: all -> 0x032e, CancellationException -> 0x03ca, TryCatch #10 {CancellationException -> 0x03ca, all -> 0x032e, blocks: (B:137:0x032a, B:145:0x034f, B:147:0x036c, B:148:0x0378), top: B:492:0x032a }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0384  */
    /* JADX WARN: Code duplicated, block: B:153:0x038c  */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0382 -> B:151:0x0386). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 2802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17949l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f34933l;
        Object obj2 = this.f34934l;
        switch (i) {
            case 0:
                return new C17949l((String[]) this.f34932l, (C12158l) obj2, interfaceC14029l, 0);
            case 1:
                C17949l c17949l = new C17949l((File) obj2, interfaceC14029l, 1);
                c17949l.f34932l = obj;
                return c17949l;
            case 2:
                C17949l c17949l2 = new C17949l((C4074l) this.f34932l, (C3753l) obj2, interfaceC14029l, 2);
                c17949l2.f34931l = obj;
                return c17949l2;
            case 3:
                C17949l c17949l3 = new C17949l((C13152l) this.f34932l, (C10260l) obj2, interfaceC14029l, 3);
                c17949l3.f34931l = obj;
                return c17949l3;
            case 4:
                return new C17949l((AbstractC13264l) this.f34931l, (C6678l) this.f34932l, (InterfaceC8714l) obj2, interfaceC14029l, 4);
            case 5:
                return new C17949l((AbstractC13264l) this.f34931l, (Function1) this.f34932l, (InterfaceC8714l) obj2, interfaceC14029l, 5);
            case 6:
                C17949l c17949l4 = new C17949l((C15855l) this.f34932l, (C9122l) obj2, interfaceC14029l, 6);
                c17949l4.f34931l = obj;
                return c17949l4;
            case 7:
                C17949l c17949l5 = new C17949l((C16076l) this.f34932l, (AbstractC18643l) obj2, interfaceC14029l, 7);
                c17949l5.f34931l = obj;
                return c17949l5;
            case 8:
                return new C17949l((Function2) this.f34932l, (C16076l) obj2, interfaceC14029l, 8);
            case 9:
                return new C17949l((C12759l) this.f34931l, (InterfaceC17817l) this.f34932l, (C13305l) obj2, interfaceC14029l, 9);
            case 10:
                return new C17949l((AudioPlaylist) this.f34932l, (C0786l) obj2, interfaceC14029l, 10);
            case 11:
                C17949l c17949l6 = new C17949l((C0471l) obj2, interfaceC14029l, 11);
                c17949l6.f34932l = obj;
                return c17949l6;
            case 12:
                C17949l c17949l7 = new C17949l((Function2) obj2, interfaceC14029l, 12);
                c17949l7.f34932l = obj;
                return c17949l7;
            case 13:
                C17949l c17949l8 = new C17949l((C16076l) this.f34932l, (C4816l) obj2, interfaceC14029l, 13);
                c17949l8.f34931l = obj;
                return c17949l8;
            case 14:
                C17949l c17949l9 = new C17949l((C4261l) this.f34932l, (InterfaceC12244l) obj2, interfaceC14029l, 14);
                c17949l9.f34931l = obj;
                return c17949l9;
            case 15:
                C17949l c17949l10 = new C17949l((C1424l) obj2, interfaceC14029l, 15);
                c17949l10.f34932l = obj;
                return c17949l10;
            case 16:
                C17949l c17949l11 = new C17949l((C13177l) this.f34932l, (C7819l) obj2, interfaceC14029l, 16);
                c17949l11.f34931l = obj;
                return c17949l11;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C17949l c17949l12 = new C17949l((C7621l) this.f34932l, (InterfaceC13854l) obj2, interfaceC14029l, 17);
                c17949l12.f34931l = obj;
                return c17949l12;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C17949l((C18297l) this.f34931l, (InterfaceC8714l) this.f34932l, (InterfaceC8714l) obj2, interfaceC14029l, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C17949l c17949l13 = new C17949l((C9426l) this.f34932l, (Function2) obj2, interfaceC14029l, 19);
                c17949l13.f34931l = obj;
                return c17949l13;
            case 20:
                C17949l c17949l14 = new C17949l((C2375l) this.f34932l, (C4154l) obj2, interfaceC14029l, 20);
                c17949l14.f34931l = obj;
                return c17949l14;
            case 21:
                C17949l c17949l15 = new C17949l((C4154l) this.f34932l, (Function2) obj2, interfaceC14029l, 21);
                c17949l15.f34931l = obj;
                return c17949l15;
            case 22:
                C17949l c17949l16 = new C17949l((InterfaceC12244l) this.f34932l, (C5616l) obj2, interfaceC14029l, 22);
                c17949l16.f34931l = obj;
                return c17949l16;
            case 23:
                C17949l c17949l17 = new C17949l((SessionWorker) this.f34932l, (C4043l) obj2, interfaceC14029l, 23);
                c17949l17.f34931l = obj;
                return c17949l17;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C17949l((C13009l) this.f34931l, (EnumC11011l) this.f34932l, (Function2) obj2, interfaceC14029l, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C17949l((InterfaceC8714l) this.f34932l, (InterfaceC8714l) obj2, interfaceC14029l, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C17949l c17949l18 = new C17949l((InterfaceC12932l) this.f34932l, (InterfaceC6942l) obj2, interfaceC14029l, 26);
                c17949l18.f34931l = obj;
                return c17949l18;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C17949l((C5374l) this.f34931l, (C5492l) this.f34932l, (String) obj2, interfaceC14029l, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C17949l((Function1) this.f34932l, (C5374l) obj2, interfaceC14029l, 28);
            default:
                C17949l c17949l19 = new C17949l((C8884l) obj2, interfaceC14029l, 29);
                c17949l19.f34932l = obj;
                return c17949l19;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34933l) {
            case 0:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C17949l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C17949l) ads((InterfaceC14029l) obj2, (C16144l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C17949l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C17949l) ads((InterfaceC14029l) obj2, (List) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C17949l) ads((InterfaceC14029l) obj2, (C16811l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C17949l) ads((InterfaceC14029l) obj2, (C16221l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C17949l) ads((InterfaceC14029l) obj2, (C15222l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC1555l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C17949l) ads((InterfaceC14029l) obj2, (C3399l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C17949l) ads((InterfaceC14029l) obj2, (C5655l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C17949l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C17949l) ads((InterfaceC14029l) obj2, (String) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17949l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f34933l = i;
        this.f34932l = obj;
        this.f34934l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17949l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f34933l = i;
        this.f34934l = obj;
    }
}
