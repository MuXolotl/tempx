package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕ۟ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3678l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Throwable f7755l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f7756l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f7757l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f7758l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public /* synthetic */ Object f7759l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C0462l f7760l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ C4993l f7761l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3678l(Function2 function2, C4993l c4993l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f7758l = i;
        this.f7757l = function2;
        this.f7761l = c4993l;
    }

    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #5 {all -> 0x004d, blocks: (B:18:0x0049, B:27:0x007b, B:29:0x008c), top: B:110:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        C0462l c0462l;
        C0462l c0462l2;
        Throwable th;
        int i = this.f7758l;
        Function2 function2 = this.f7757l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C4993l c4993l = this.f7761l;
        switch (i) {
            case 0:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f7759l;
                int i2 = this.f7756l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        c0462l = this.f7760l;
                        try {
                            AbstractC2829l.crashlytics(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                c0462l.ads(AbstractC4952l.yandex("Exception thrown while reading from channel", th));
                                c4993l.yandex(th);
                                this.f7759l = null;
                                this.f7760l = null;
                                this.f7756l = 3;
                                if (c0462l.mo2158switch(this) == enumC9342l) {
                                    return enumC9342l;
                                }
                            } catch (Throwable th3) {
                                this.f7759l = null;
                                this.f7760l = null;
                                this.f7755l = th3;
                                this.f7756l = 4;
                                if (c0462l.mo2158switch(this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                throw th3;
                            }
                        }
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            if (i2 != 4) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th4 = this.f7755l;
                            AbstractC2829l.crashlytics(obj);
                            throw th4;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C0462l c0462l3 = new C0462l(AbstractC11174l.mopub(interfaceC2262l.vip()));
                try {
                    C1435l c1435l = new C1435l(c4993l, interfaceC2262l.vip().mo246l(c0462l3));
                    this.f7759l = interfaceC2262l;
                    this.f7760l = c0462l3;
                    this.f7756l = 1;
                    if (function2.invoke(c1435l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                    c0462l = c0462l3;
                } catch (Throwable th5) {
                    th = th5;
                    c0462l = c0462l3;
                    c0462l.ads(AbstractC4952l.yandex("Exception thrown while reading from channel", th));
                    c4993l.yandex(th);
                    this.f7759l = null;
                    this.f7760l = null;
                    this.f7756l = 3;
                    if (c0462l.mo2158switch(this) == enumC9342l) {
                        return enumC9342l;
                    }
                }
                c0462l.m561l();
                if (AbstractC11174l.mopub(interfaceC2262l.vip()).isCancelled()) {
                    c4993l.yandex(AbstractC11174l.mopub(interfaceC2262l.vip()).mo2153default());
                    break;
                }
                this.f7759l = null;
                this.f7760l = null;
                this.f7756l = 2;
                if (c0462l.mo2158switch(this) == enumC9342l) {
                    return enumC9342l;
                }
                return Unit.INSTANCE;
            default:
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f7759l;
                try {
                    switch (this.f7756l) {
                        case 0:
                            AbstractC2829l.crashlytics(obj);
                            C0462l c0462l4 = new C0462l(AbstractC11174l.mopub(interfaceC2262l2.vip()));
                            try {
                                C16144l c16144l = new C16144l(c4993l, interfaceC2262l2.vip().mo246l(c0462l4));
                                this.f7759l = interfaceC2262l2;
                                this.f7760l = c0462l4;
                                this.f7756l = 1;
                                if (function2.invoke(c16144l, this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                c0462l2 = c0462l4;
                                c0462l2.m561l();
                                if (AbstractC11174l.mopub(interfaceC2262l2.vip()).isCancelled()) {
                                    c4993l.yandex(AbstractC11174l.mopub(interfaceC2262l2.vip()).mo2153default());
                                    break;
                                }
                                this.f7759l = interfaceC2262l2;
                                this.f7760l = null;
                                this.f7756l = 2;
                                if (c0462l2.mo2158switch(this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                this.f7759l = null;
                                this.f7760l = null;
                                this.f7755l = null;
                                this.f7756l = 3;
                                if (c4993l.billing(this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                Unit unit = Unit.INSTANCE;
                                return Unit.INSTANCE;
                            } catch (Throwable th6) {
                                th = th6;
                                c0462l2 = c0462l4;
                                try {
                                    c0462l2.ads(AbstractC4952l.yandex("Exception thrown while writing to channel", th));
                                    c4993l.yandex(th);
                                    this.f7759l = interfaceC2262l2;
                                    this.f7760l = null;
                                    this.f7756l = 4;
                                    if (c0462l2.mo2158switch(this) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    this.f7759l = null;
                                    this.f7760l = null;
                                    this.f7755l = null;
                                    this.f7756l = 5;
                                    if (c4993l.billing(this) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    this.f7759l = interfaceC2262l2;
                                    this.f7760l = null;
                                    this.f7755l = th;
                                    this.f7756l = 6;
                                    if (c0462l2.mo2158switch(this) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                            }
                            break;
                        case 1:
                            c0462l2 = this.f7760l;
                            try {
                                AbstractC2829l.crashlytics(obj);
                                c0462l2.m561l();
                                if (AbstractC11174l.mopub(interfaceC2262l2.vip()).isCancelled()) {
                                    c4993l.yandex(AbstractC11174l.mopub(interfaceC2262l2.vip()).mo2153default());
                                }
                                this.f7759l = interfaceC2262l2;
                                this.f7760l = null;
                                this.f7756l = 2;
                                if (c0462l2.mo2158switch(this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                this.f7759l = null;
                                this.f7760l = null;
                                this.f7755l = null;
                                this.f7756l = 3;
                                if (c4993l.billing(this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                break;
                            } catch (Throwable th8) {
                                th = th8;
                                c0462l2.ads(AbstractC4952l.yandex("Exception thrown while writing to channel", th));
                                c4993l.yandex(th);
                                this.f7759l = interfaceC2262l2;
                                this.f7760l = null;
                                this.f7756l = 4;
                                if (c0462l2.mo2158switch(this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                this.f7759l = null;
                                this.f7760l = null;
                                this.f7755l = null;
                                this.f7756l = 5;
                                if (c4993l.billing(this) == enumC9342l) {
                                    return enumC9342l;
                                }
                            }
                            Unit unit2 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        case 2:
                            AbstractC2829l.crashlytics(obj);
                            this.f7759l = null;
                            this.f7760l = null;
                            this.f7755l = null;
                            this.f7756l = 3;
                            if (c4993l.billing(this) == enumC9342l) {
                                return enumC9342l;
                            }
                            Unit unit3 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        case 3:
                            AbstractC2829l.crashlytics(obj);
                            Unit unit4 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        case 4:
                            AbstractC2829l.crashlytics(obj);
                            this.f7759l = null;
                            this.f7760l = null;
                            this.f7755l = null;
                            this.f7756l = 5;
                            if (c4993l.billing(this) == enumC9342l) {
                                return enumC9342l;
                            }
                            Unit unit5 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        case 5:
                            AbstractC2829l.crashlytics(obj);
                            Unit unit6 = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        case 6:
                            Throwable th9 = this.f7755l;
                            AbstractC2829l.crashlytics(obj);
                            th = th9;
                            try {
                                this.f7759l = null;
                                this.f7760l = null;
                                this.f7755l = th;
                                this.f7756l = 7;
                                if (c4993l.billing(this) == enumC9342l) {
                                    return enumC9342l;
                                }
                                th = th;
                                Unit unit7 = Unit.INSTANCE;
                                throw th;
                            } catch (Throwable unused) {
                                throw th;
                            }
                        case 7:
                            th = this.f7755l;
                            try {
                                AbstractC2829l.crashlytics(obj);
                                Unit unit8 = Unit.INSTANCE;
                                throw th;
                            } catch (Throwable unused2) {
                                throw th;
                            }
                        default:
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable unused3) {
                }
                break;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f7758l;
        C4993l c4993l = this.f7761l;
        Function2 function2 = this.f7757l;
        switch (i) {
            case 0:
                C3678l c3678l = new C3678l(function2, c4993l, interfaceC14029l, 0);
                c3678l.f7759l = obj;
                return c3678l;
            default:
                C3678l c3678l2 = new C3678l(function2, c4993l, interfaceC14029l, 1);
                c3678l2.f7759l = obj;
                return c3678l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f7758l) {
            case 0:
                break;
        }
        return ((C3678l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
