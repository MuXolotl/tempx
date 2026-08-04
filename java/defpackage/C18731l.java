package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;

/* JADX INFO: renamed from: lۨؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18731l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f36510l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f36511l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f36512l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f36513l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18731l(C14358l c14358l, InterfaceC14029l interfaceC14029l, List list) {
        super(2, interfaceC14029l);
        this.f36512l = 11;
        this.f36510l = c14358l;
        this.f36511l = list;
    }

    private final Object ad(Object obj) {
        int i = this.f36513l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C9154l c9154l = (C9154l) this.f36510l;
            C2322l c2322l = (C2322l) this.f36511l;
            float f = c2322l.yandex;
            float f2 = c2322l.loadAd;
            float f3 = c2322l.amazon;
            float f4 = c2322l.crashlytics;
            this.f36513l = 1;
            c9154l.yandex = f;
            c9154l.loadAd = f2;
            c9154l.crashlytics = f3;
            c9154l.amazon = f4;
            Object objLoadAd = c9154l.loadAd(this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd != enumC9342l) {
                objLoadAd = Unit.INSTANCE;
            }
            if (objLoadAd == enumC9342l) {
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

    private final Object advert(Object obj) {
        int i = this.f36513l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C9154l c9154l = (C9154l) this.f36510l;
            InterfaceC12553l interfaceC12553l = (InterfaceC12553l) this.f36511l;
            this.f36513l = 1;
            Object objYandex = c9154l.yandex(interfaceC12553l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
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

    private final Object isVip(Object obj) {
        C12428l c12428l = (C12428l) this.f36510l;
        int i = this.f36513l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            InterfaceC6942l interfaceC6942l = (InterfaceC6942l) this.f36511l;
            C10034l c10034l = new C10034l(c12428l, 1);
            this.f36510l = null;
            this.f36513l = 1;
            Object objYandex = interfaceC6942l.yandex(c10034l, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
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

    private final Object premium(Object obj) {
        int i = this.f36513l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            if (AbstractC8576l.yandex(((InterfaceC4138l) this.f36510l).amazon(), C17306l.yandex)) {
                AbstractC11383l abstractC11383l = (AbstractC11383l) this.f36511l;
                String str = (String) abstractC11383l.f22965l.getValue();
                this.f36513l = 1;
                Object objM3075break = AbstractC11383l.m3075break(abstractC11383l, str, this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM3075break == enumC9342l) {
                    return enumC9342l;
                }
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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r1.loadAd(r7) == r6) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object pro(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f36510l
            lَٝۛ r0 = (defpackage.C10443l) r0
            lًٜۥ r1 = r0.loadAd
            int r2 = r7.f36513l
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            r5 = 1
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L18
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L68
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r7)
            r7 = 0
            return r7
        L1f:
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L31
        L23:
            defpackage.AbstractC2829l.crashlytics(r8)
            lًّؗ r8 = defpackage.C4749l.yandex
            r7.f36513l = r5
            java.lang.Object r8 = r8.loadAd(r7)
            if (r8 != r6) goto L31
            goto L67
        L31:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Collection r8 = r8.values()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r2 = r8 instanceof java.util.Collection
            if (r2 == 0) goto L47
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L47
            goto L9d
        L47:
            java.util.Iterator r8 = r8.iterator()
        L4b:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L9d
            java.lang.Object r2 = r8.next()
            lًؓۖ r2 = (defpackage.C7747l) r2
            lٖۖٔ r2 = r2.yandex
            boolean r2 = r2.yandex()
            if (r2 == 0) goto L4b
            r7.f36513l = r4
            java.lang.Object r7 = r1.loadAd(r7)
            if (r7 != r6) goto L68
        L67:
            return r6
        L68:
            lؒؖ۟ r7 = r1.yandex
            java.lang.Boolean r7 = r7.yandex()
            if (r7 == 0) goto L75
        L70:
            boolean r5 = r7.booleanValue()
            goto L7e
        L75:
            lؒؖ۟ r7 = r1.loadAd
            java.lang.Boolean r7 = r7.yandex()
            if (r7 == 0) goto L7e
            goto L70
        L7e:
            if (r5 != 0) goto L8a
            java.lang.String r7 = "Sessions SDK disabled. Not listening to lifecycle events."
            int r7 = android.util.Log.d(r3, r7)
            defpackage.AbstractC15300l.loadAd(r7)
            goto La6
        L8a:
            lٖٓٙ r7 = r0.yandex
            l٘۠ۨ r8 = new l٘۠ۨ
            r0 = 7
            r8.<init>(r0)
            r7.yandex()
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.isPro
            r7.add(r8)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            goto La6
        L9d:
            java.lang.String r7 = "No Sessions subscribers. Not listening to lifecycle events."
            int r7 = android.util.Log.d(r3, r7)
            defpackage.AbstractC15300l.loadAd(r7)
        La6:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18731l.pro(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:229:0x054b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0555  */
    /* JADX WARN: Code duplicated, block: B:233:0x055f  */
    /* JADX WARN: Code duplicated, block: B:240:0x058b  */
    /* JADX WARN: Code duplicated, block: B:241:0x0598  */
    /* JADX WARN: Code duplicated, block: B:242:0x059e  */
    /* JADX WARN: Code duplicated, block: B:244:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:246:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:247:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:250:0x05d3  */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x036d, code lost:
    
        if (r0 == r14) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04b6, code lost:
    
        if (r0 == r11) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0578, code lost:
    
        if (r0 == r11) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0652, code lost:
    
        if (defpackage.AbstractC8532l.purchase(3500, r25) == r1) goto L274;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:247:0x05b1, please report this as an issue */
    @Override // defpackage.AbstractC12050l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Signature(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 3008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18731l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f36512l) {
            case 0:
                return new C18731l((C13624l) this.f36510l, (InterfaceC7702l) this.f36511l, interfaceC14029l, 0);
            case 1:
                C18731l c18731l = new C18731l((C13624l) this.f36510l, interfaceC14029l);
                c18731l.f36511l = obj;
                return c18731l;
            case 2:
                return new C18731l((C14951l) this.f36510l, (InterfaceC7702l) this.f36511l, interfaceC14029l, 2);
            case 3:
                C18731l c18731l2 = new C18731l((C14951l) this.f36511l, interfaceC14029l, 3);
                c18731l2.f36510l = obj;
                return c18731l2;
            case 4:
                return new C18731l((DedicatedCacheMigrationService) this.f36510l, (C17098l) this.f36511l, interfaceC14029l, 4);
            case 5:
                return new C18731l((InterfaceC11075l) this.f36510l, (C17685l) this.f36511l, interfaceC14029l, 5);
            case 6:
                return new C18731l((C13624l) this.f36510l, (InterfaceC7702l) this.f36511l, interfaceC14029l, 6);
            case 7:
                C18731l c18731l3 = new C18731l((C13624l) this.f36511l, interfaceC14029l, 7);
                c18731l3.f36510l = obj;
                return c18731l3;
            case 8:
                return new C18731l((C14951l) this.f36510l, (InterfaceC7702l) this.f36511l, interfaceC14029l, 8);
            case 9:
                C18731l c18731l4 = new C18731l((C14951l) this.f36511l, interfaceC14029l, 9);
                c18731l4.f36510l = obj;
                return c18731l4;
            case 10:
                C18731l c18731l5 = new C18731l((C10954l) this.f36511l, interfaceC14029l, 10);
                c18731l5.f36510l = obj;
                return c18731l5;
            case 11:
                return new C18731l((C14358l) this.f36510l, interfaceC14029l, (List) this.f36511l);
            case 12:
                return new C18731l((C1026l) this.f36511l, interfaceC14029l, 12);
            case 13:
                return new C18731l((C13624l) this.f36510l, (InterfaceC7702l) this.f36511l, interfaceC14029l, 13);
            case 14:
                C18731l c18731l6 = new C18731l((C13624l) this.f36511l, interfaceC14029l, 14);
                c18731l6.f36510l = obj;
                return c18731l6;
            case 15:
                return new C18731l((C14951l) this.f36510l, (InterfaceC7702l) this.f36511l, interfaceC14029l, 15);
            case 16:
                C18731l c18731l7 = new C18731l((C14951l) this.f36511l, interfaceC14029l, 16);
                c18731l7.f36510l = obj;
                return c18731l7;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C18731l((C10111l) this.f36510l, (C10419l) this.f36511l, interfaceC14029l, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C18731l((C13046l) this.f36510l, (C14187l) this.f36511l, interfaceC14029l, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C18731l((C16854l) this.f36510l, (String) this.f36511l, interfaceC14029l, 19);
            case 20:
                return new C18731l((C4560l) this.f36510l, (String) this.f36511l, interfaceC14029l, 20);
            case 21:
                return new C18731l((C0996l) this.f36510l, (String) this.f36511l, interfaceC14029l, 21);
            case 22:
                return new C18731l((String) this.f36510l, (C11562l) this.f36511l, interfaceC14029l, 22);
            case 23:
                return new C18731l((C0554l) this.f36510l, (C8863l) this.f36511l, interfaceC14029l, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C18731l((C10443l) this.f36510l, (C7909l) this.f36511l, interfaceC14029l, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C18731l((C9154l) this.f36510l, (C2322l) this.f36511l, interfaceC14029l, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C18731l((C9154l) this.f36510l, (InterfaceC12553l) this.f36511l, interfaceC14029l, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C18731l c18731l8 = new C18731l((InterfaceC6942l) this.f36511l, interfaceC14029l, 27);
                c18731l8.f36510l = obj;
                return c18731l8;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C18731l((InterfaceC4138l) this.f36510l, (AbstractC11383l) this.f36511l, interfaceC14029l, 28);
            default:
                C18731l c18731l9 = new C18731l((C3445l) this.f36511l, interfaceC14029l, 29);
                c18731l9.f36510l = obj;
                return c18731l9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36512l) {
            case 0:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C18731l) ads((InterfaceC14029l) obj2, (AbstractC8972l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C18731l) ads((InterfaceC14029l) obj2, (C12428l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C18731l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C18731l) ads((InterfaceC14029l) obj2, (C2319l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18731l(C13624l c13624l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f36512l = 1;
        this.f36510l = c13624l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18731l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f36512l = i;
        this.f36511l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18731l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f36512l = i;
        this.f36510l = obj;
        this.f36511l = obj2;
    }
}
