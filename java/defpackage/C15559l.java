package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lًٕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15559l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f30399l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f30400l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f30401l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f30402l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15559l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f30401l = i;
        this.f30399l = obj;
        this.f30400l = obj2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Object objLoadAd;
        Object c18435l;
        Object c18435l2;
        Object c18435l3;
        Object c18435l4;
        Object c18435l5;
        Object c18435l6;
        Object c18435l7;
        Object c18435l8;
        Object obj2;
        Object c18435l9;
        Object objYandex;
        int i = this.f30401l;
        int i2 = 9;
        EnumC16636l enumC16636l = EnumC16636l.SECONDS;
        Object obj3 = this.f30400l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i3 = 0;
        int i4 = 1;
        InterfaceC14029l interfaceC14029l = null;
        switch (i) {
            case 0:
                int i5 = this.f30402l;
                try {
                    if (i5 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        AbstractC12866l abstractC12866l = (AbstractC12866l) obj3;
                        C12183l c12183l = new C12183l((Context) this.f30399l);
                        AbstractC5518l abstractC5518lPurchase = abstractC12866l.purchase();
                        this.f30402l = 1;
                        if (c12183l.amazon(abstractC12866l, abstractC5518lPurchase, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i5 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    break;
                } catch (CancellationException unused) {
                } catch (Throwable th) {
                    Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
                }
                return Unit.INSTANCE;
            case 1:
                int i6 = this.f30402l;
                if (i6 != 0) {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC2829l.crashlytics(obj);
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C7549l c7549lYandex = AbstractC0622l.yandex(((AbstractActivityC14666l) this.f30399l).f23523l.isPro);
                C2354l c2354l = new C2354l(i2, (C16604l) obj3);
                this.f30402l = 1;
                if (c7549lYandex.f15551l.yandex(c2354l, this) == enumC9342l) {
                    return enumC9342l;
                }
                C17132l.firebase();
                return null;
            case 2:
                C2885l c2885l = (C2885l) this.f30399l;
                int i7 = this.f30402l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c2885l.f6283l.mo245l(C1083l.f2996l);
                if (!(interfaceC7042l != null ? interfaceC7042l.mopub() : false)) {
                    throw new C17072l("Client already closed", 0);
                }
                this.f30402l = 1;
                Object objYandex2 = c2885l.yandex((C6472l) obj3, this);
                return objYandex2 == enumC9342l ? enumC9342l : objYandex2;
            case 3:
                int i8 = this.f30402l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    AbstractC16584l.loadAd().metrica(((C15050l) this.f30399l).yandex);
                    C16552l c16552l = AbstractC11463l.yandex;
                    C2975l c2975l = AbstractC17278l.yandex;
                    C14951l c14951l = new C14951l((C17984l) obj3, interfaceC14029l, 24);
                    this.f30402l = 1;
                    if (AbstractC10999l.firebase(c2975l, c14951l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 4:
                C15581l c15581l = (C15581l) this.f30399l;
                ThreadLocal threadLocal = c15581l.loadAd;
                int i9 = this.f30402l;
                try {
                    if (i9 != 0) {
                        if (i9 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                        objLoadAd = obj;
                        C16221l c16221l = (C16221l) objLoadAd;
                        threadLocal.set(Boolean.FALSE);
                        return c16221l;
                    }
                    AbstractC2829l.crashlytics(obj);
                    Object obj4 = threadLocal.get();
                    Boolean bool = Boolean.TRUE;
                    if (AbstractC8576l.yandex(obj4, bool)) {
                        C8339l.smaato("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        return null;
                    }
                    threadLocal.set(bool);
                    InterfaceC15829l interfaceC15829l = c15581l.crashlytics;
                    C13344l c13344l = new C13344l((Function1) obj3, null);
                    this.f30402l = 1;
                    objLoadAd = interfaceC15829l.loadAd(new C17949l(c13344l, interfaceC14029l, 12), this);
                    if (objLoadAd == enumC9342l) {
                        return enumC9342l;
                    }
                    C16221l c16221l2 = (C16221l) objLoadAd;
                    threadLocal.set(Boolean.FALSE);
                    return c16221l2;
                } catch (Throwable th2) {
                    threadLocal.set(Boolean.FALSE);
                    throw th2;
                }
            case 5:
                int i10 = this.f30402l;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                InterfaceC15829l interfaceC15829l2 = ((C15581l) this.f30399l).crashlytics;
                C13624l c13624l = new C13624l((Long) obj3, interfaceC14029l, 25);
                this.f30402l = 1;
                Object objLoadAd2 = interfaceC15829l2.loadAd(new C17949l(c13624l, interfaceC14029l, 12), this);
                return objLoadAd2 == enumC9342l ? enumC9342l : objLoadAd2;
            case 6:
                int i11 = this.f30402l;
                if (i11 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC6843l interfaceC6843l = (InterfaceC6843l) this.f30399l;
                    C3977l c3977l = new C3977l((AbstractC13264l) obj3, interfaceC14029l, i4);
                    this.f30402l = 1;
                    if (AbstractC11141l.crashlytics(interfaceC6843l, c3977l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i11 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 7:
                int i12 = this.f30402l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30402l = 1;
                    AbstractC12769l.yandex((C18524l) this.f30399l, (C0384l) obj3, this);
                    return enumC9342l;
                }
                if (i12 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC2829l.crashlytics(obj);
                    C17132l.firebase();
                }
                return null;
            case 8:
                int i13 = this.f30402l;
                if (i13 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30402l = 1;
                    if (((C4642l) this.f30399l).invoke((InterfaceC7702l) obj3, this) == enumC9342l) {
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
            case 9:
                InterfaceC7702l interfaceC7702l = (InterfaceC7702l) this.f30399l;
                int i14 = this.f30402l;
                try {
                    if (i14 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l = AbstractC6025l.yandex;
                        C4642l c4642l = (C4642l) obj3;
                        C6760l c6760l = C9658l.f19699l;
                        long jTapsense = AbstractC15918l.tapsense(30, enumC16636l);
                        C15559l c15559l = new C15559l(c4642l, interfaceC7702l, interfaceC14029l, 8);
                        this.f30399l = null;
                        this.f30402l = 1;
                        if (AbstractC15342l.mopub(jTapsense, c15559l, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i14 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l = Unit.INSTANCE;
                    break;
                } catch (Throwable th3) {
                    c18435l = new C18435l(th3);
                }
                Throwable thYandex = C1171l.yandex(c18435l);
                if (thYandex != null) {
                    C15589l c15589l = C5013l.yandex;
                    C5013l.amazon(thYandex, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C3689l.class.getName())));
                }
                return Unit.INSTANCE;
            case 10:
                int i15 = this.f30402l;
                if (i15 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30402l = 1;
                    if (((C10481l) this.f30399l).invoke((InterfaceC7702l) obj3, this) == enumC9342l) {
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
            case 11:
                InterfaceC7702l interfaceC7702l2 = (InterfaceC7702l) this.f30399l;
                int i16 = this.f30402l;
                try {
                    if (i16 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l2 = AbstractC6025l.yandex;
                        C10481l c10481l = (C10481l) obj3;
                        C6760l c6760l2 = C9658l.f19699l;
                        long jTapsense2 = AbstractC15918l.tapsense(30, enumC16636l);
                        C15559l c15559l2 = new C15559l(c10481l, interfaceC7702l2, interfaceC14029l, 10);
                        this.f30399l = null;
                        this.f30402l = 1;
                        if (AbstractC15342l.mopub(jTapsense2, c15559l2, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i16 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l2 = Unit.INSTANCE;
                    break;
                } catch (Throwable th4) {
                    c18435l2 = new C18435l(th4);
                }
                Throwable thYandex2 = C1171l.yandex(c18435l2);
                if (thYandex2 != null) {
                    C15589l c15589l2 = C5013l.yandex;
                    C5013l.amazon(thYandex2, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", AbstractC5753l.class.getName())));
                }
                return Unit.INSTANCE;
            case 12:
                int i17 = this.f30402l;
                if (i17 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30402l = 1;
                    if (((C10481l) this.f30399l).invoke((InterfaceC7702l) obj3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i17 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 13:
                InterfaceC7702l interfaceC7702l3 = (InterfaceC7702l) this.f30399l;
                int i18 = this.f30402l;
                try {
                    if (i18 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l3 = AbstractC6025l.yandex;
                        C10481l c10481l2 = (C10481l) obj3;
                        C6760l c6760l3 = C9658l.f19699l;
                        long jTapsense3 = AbstractC15918l.tapsense(30, enumC16636l);
                        C15559l c15559l3 = new C15559l(c10481l2, interfaceC7702l3, interfaceC14029l, 12);
                        this.f30399l = null;
                        this.f30402l = 1;
                        if (AbstractC15342l.mopub(jTapsense3, c15559l3, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i18 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l3 = Unit.INSTANCE;
                    break;
                } catch (Throwable th5) {
                    c18435l3 = new C18435l(th5);
                }
                Throwable thYandex3 = C1171l.yandex(c18435l3);
                if (thYandex3 != null) {
                    C15589l c15589l3 = C5013l.yandex;
                    C5013l.amazon(thYandex3, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C13865l.class.getName())));
                }
                return Unit.INSTANCE;
            case 14:
                int i19 = this.f30402l;
                if (i19 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30402l = 1;
                    if (((C15816l) this.f30399l).invoke((InterfaceC7702l) obj3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i19 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 15:
                InterfaceC7702l interfaceC7702l4 = (InterfaceC7702l) this.f30399l;
                int i20 = this.f30402l;
                try {
                    if (i20 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l4 = AbstractC6025l.yandex;
                        C15816l c15816l = (C15816l) obj3;
                        C6760l c6760l4 = C9658l.f19699l;
                        long jTapsense4 = AbstractC15918l.tapsense(30, enumC16636l);
                        C15559l c15559l4 = new C15559l(c15816l, interfaceC7702l4, interfaceC14029l, 14);
                        this.f30399l = null;
                        this.f30402l = 1;
                        if (AbstractC15342l.mopub(jTapsense4, c15559l4, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i20 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l4 = Unit.INSTANCE;
                    break;
                } catch (Throwable th6) {
                    c18435l4 = new C18435l(th6);
                }
                Throwable thYandex4 = C1171l.yandex(c18435l4);
                if (thYandex4 != null) {
                    C15589l c15589l4 = C5013l.yandex;
                    C5013l.amazon(thYandex4, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C11134l.class.getName())));
                }
                return Unit.INSTANCE;
            case 16:
                int i21 = this.f30402l;
                if (i21 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30402l = 1;
                    if (((C15816l) this.f30399l).invoke((InterfaceC7702l) obj3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i21 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC7702l interfaceC7702l5 = (InterfaceC7702l) this.f30399l;
                int i22 = this.f30402l;
                try {
                    if (i22 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l5 = AbstractC6025l.yandex;
                        C15816l c15816l2 = (C15816l) obj3;
                        C6760l c6760l5 = C9658l.f19699l;
                        long jTapsense5 = AbstractC15918l.tapsense(30, enumC16636l);
                        C15559l c15559l5 = new C15559l(c15816l2, interfaceC7702l5, interfaceC14029l, 16);
                        this.f30399l = null;
                        this.f30402l = 1;
                        if (AbstractC15342l.mopub(jTapsense5, c15559l5, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i22 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l5 = Unit.INSTANCE;
                    break;
                } catch (Throwable th7) {
                    c18435l5 = new C18435l(th7);
                }
                Throwable thYandex5 = C1171l.yandex(c18435l5);
                if (thYandex5 != null) {
                    C15589l c15589l5 = C5013l.yandex;
                    C5013l.amazon(thYandex5, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C1725l.class.getName())));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int i23 = this.f30402l;
                if (i23 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30402l = 1;
                    if (((C15816l) this.f30399l).invoke((InterfaceC7702l) obj3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i23 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC7702l interfaceC7702l6 = (InterfaceC7702l) this.f30399l;
                int i24 = this.f30402l;
                try {
                    if (i24 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l6 = AbstractC6025l.yandex;
                        C15816l c15816l3 = (C15816l) obj3;
                        C6760l c6760l6 = C9658l.f19699l;
                        long jTapsense6 = AbstractC15918l.tapsense(30, enumC16636l);
                        C15559l c15559l6 = new C15559l(c15816l3, interfaceC7702l6, interfaceC14029l, 18);
                        this.f30399l = null;
                        this.f30402l = 1;
                        if (AbstractC15342l.mopub(jTapsense6, c15559l6, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i24 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l6 = Unit.INSTANCE;
                    break;
                } catch (Throwable th8) {
                    c18435l6 = new C18435l(th8);
                }
                Throwable thYandex6 = C1171l.yandex(c18435l6);
                if (thYandex6 != null) {
                    C15589l c15589l6 = C5013l.yandex;
                    C5013l.amazon(thYandex6, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C14759l.class.getName())));
                }
                return Unit.INSTANCE;
            case 20:
                int i25 = this.f30402l;
                if (i25 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30402l = 1;
                    if (((C15816l) this.f30399l).invoke((InterfaceC7702l) obj3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i25 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 21:
                InterfaceC7702l interfaceC7702l7 = (InterfaceC7702l) this.f30399l;
                int i26 = this.f30402l;
                try {
                    if (i26 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l7 = AbstractC6025l.yandex;
                        C15816l c15816l4 = (C15816l) obj3;
                        C6760l c6760l7 = C9658l.f19699l;
                        long jTapsense7 = AbstractC15918l.tapsense(30, enumC16636l);
                        C15559l c15559l7 = new C15559l(c15816l4, interfaceC7702l7, interfaceC14029l, 20);
                        this.f30399l = null;
                        this.f30402l = 1;
                        if (AbstractC15342l.mopub(jTapsense7, c15559l7, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i26 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l7 = Unit.INSTANCE;
                    break;
                } catch (Throwable th9) {
                    c18435l7 = new C18435l(th9);
                }
                Throwable thYandex7 = C1171l.yandex(c18435l7);
                if (thYandex7 != null) {
                    C15589l c15589l7 = C5013l.yandex;
                    C5013l.amazon(thYandex7, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C15553l.class.getName())));
                }
                return Unit.INSTANCE;
            case 22:
                int i27 = this.f30402l;
                if (i27 != 0) {
                    if (i27 == 1) {
                        AbstractC2829l.crashlytics(obj);
                    } else {
                        if (i27 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    return Unit.INSTANCE;
                }
                AbstractC2829l.crashlytics(obj);
                C3544l c3544l = C3544l.yandex;
                this.f30402l = 1;
                if (c3544l.yandex(this) == enumC9342l) {
                    return enumC9342l;
                }
                if (C3544l.loadAd.yandex()) {
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    C2975l c2975l2 = AbstractC17278l.yandex.f6462l;
                    C14951l c14951l2 = new C14951l((C1027l) obj3, interfaceC14029l, 25);
                    this.f30402l = 2;
                    if (AbstractC10999l.firebase(c2975l2, c14951l2, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    AbstractC11708l.yandex(new C15245l(i3, (AppActivity) this.f30399l, "Возникла ошибка при входе в аккаунт сервиса."));
                }
                return Unit.INSTANCE;
            case 23:
                int i28 = this.f30402l;
                if (i28 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30402l = 1;
                    if (((C0857l) this.f30399l).invoke((InterfaceC7702l) obj3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i28 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC7702l interfaceC7702l8 = (InterfaceC7702l) this.f30399l;
                int i29 = this.f30402l;
                try {
                    if (i29 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l8 = AbstractC6025l.yandex;
                        C0857l c0857l = (C0857l) obj3;
                        C6760l c6760l8 = C9658l.f19699l;
                        long jTapsense8 = AbstractC15918l.tapsense(30, enumC16636l);
                        C15559l c15559l8 = new C15559l(c0857l, interfaceC7702l8, interfaceC14029l, 23);
                        this.f30399l = null;
                        this.f30402l = 1;
                        if (AbstractC15342l.mopub(jTapsense8, c15559l8, this) == enumC9342l) {
                            return enumC9342l;
                        }
                    } else {
                        if (i29 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                    }
                    c18435l8 = Unit.INSTANCE;
                    break;
                } catch (Throwable th10) {
                    c18435l8 = new C18435l(th10);
                }
                Throwable thYandex8 = C1171l.yandex(c18435l8);
                if (thYandex8 != null) {
                    C15589l c15589l8 = C5013l.yandex;
                    C5013l.amazon(thYandex8, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l("type", C1725l.class.getName())));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                int i30 = this.f30402l;
                if (i30 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f30402l = 1;
                    if (((C0857l) this.f30399l).invoke((InterfaceC7702l) obj3, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i30 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                InterfaceC7702l interfaceC7702l9 = (InterfaceC7702l) this.f30399l;
                int i31 = this.f30402l;
                try {
                    if (i31 == 0) {
                        AbstractC2829l.crashlytics(obj);
                        C8490l c8490l9 = AbstractC6025l.yandex;
                        C0857l c0857l2 = (C0857l) obj3;
                        C6760l c6760l9 = C9658l.f19699l;
                        obj2 = "type";
                        try {
                            long jTapsense9 = AbstractC15918l.tapsense(30, enumC16636l);
                            C15559l c15559l9 = new C15559l(c0857l2, interfaceC7702l9, interfaceC14029l, 25);
                            this.f30399l = null;
                            this.f30402l = 1;
                            if (AbstractC15342l.mopub(jTapsense9, c15559l9, this) == enumC9342l) {
                                return enumC9342l;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            c18435l9 = new C18435l(th);
                        }
                    } else {
                        if (i31 != 1) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC2829l.crashlytics(obj);
                        obj2 = "type";
                    }
                    c18435l9 = Unit.INSTANCE;
                    break;
                } catch (Throwable th12) {
                    th = th12;
                    obj2 = "type";
                }
                Throwable thYandex9 = C1171l.yandex(c18435l9);
                if (thYandex9 != null) {
                    C15589l c15589l9 = C5013l.yandex;
                    C5013l.amazon(thYandex9, AbstractC8676l.remoteconfig(new C8195l("reason", "bus_message_collection_timeout"), new C8195l(obj2, C14759l.class.getName())));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                int i32 = this.f30402l;
                if (i32 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6760l c6760l10 = C9658l.f19699l;
                    long jTapsense10 = AbstractC15918l.tapsense(3, enumC16636l);
                    this.f30402l = 1;
                    if (AbstractC8532l.billing(jTapsense10, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i32 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                ((C11362l) ((C14965l) this.f30399l).f29441l).remove((C5726l) obj3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C11249l c11249l = (C11249l) obj3;
                int i33 = this.f30402l;
                if (i33 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    int i34 = C11249l.f22670l;
                    if (((InterfaceC0582l) c11249l.f22671l.getValue()) == null) {
                        C13602l c13602l = C13602l.yandex;
                        AbstractC18643l abstractC18643l = c11249l.f22672l;
                        this.f30399l = c11249l;
                        this.f30402l = 1;
                        objYandex = c13602l.yandex(abstractC18643l, null, this);
                        if (objYandex == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i33 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c11249l = (C11249l) this.f30399l;
                AbstractC2829l.crashlytics(obj);
                objYandex = obj;
                c11249l.f22671l.setValue((InterfaceC0582l) objYandex);
                return Unit.INSTANCE;
            default:
                int i35 = this.f30402l;
                if (i35 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C4875l c4875l = new C4875l(i2);
                    this.f30402l = 1;
                    if (C13270l.f26055l.m3626l(((C0228l) this.f30399l).f1209l, (AudioPlaylist) obj3, c4875l, this) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i35 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f30401l;
        Object obj2 = this.f30400l;
        switch (i) {
            case 0:
                return new C15559l((Context) this.f30399l, (AbstractC12866l) obj2, interfaceC14029l, 0);
            case 1:
                return new C15559l((AbstractActivityC14666l) this.f30399l, (C16604l) obj2, interfaceC14029l, 1);
            case 2:
                return new C15559l((C2885l) this.f30399l, (C6472l) obj2, interfaceC14029l, 2);
            case 3:
                return new C15559l((C15050l) this.f30399l, (C17984l) obj2, interfaceC14029l, 3);
            case 4:
                return new C15559l((C15581l) this.f30399l, (Function1) obj2, interfaceC14029l, 4);
            case 5:
                return new C15559l((C15581l) this.f30399l, (Long) obj2, interfaceC14029l, 5);
            case 6:
                return new C15559l((InterfaceC6843l) this.f30399l, (AbstractC13264l) obj2, interfaceC14029l, 6);
            case 7:
                return new C15559l((C18524l) this.f30399l, (C0384l) obj2, interfaceC14029l, 7);
            case 8:
                return new C15559l((C4642l) this.f30399l, (InterfaceC7702l) obj2, interfaceC14029l, 8);
            case 9:
                C15559l c15559l = new C15559l((C4642l) obj2, interfaceC14029l, 9);
                c15559l.f30399l = obj;
                return c15559l;
            case 10:
                return new C15559l((C10481l) this.f30399l, (InterfaceC7702l) obj2, interfaceC14029l, 10);
            case 11:
                C15559l c15559l2 = new C15559l((C10481l) obj2, interfaceC14029l, 11);
                c15559l2.f30399l = obj;
                return c15559l2;
            case 12:
                return new C15559l((C10481l) this.f30399l, (InterfaceC7702l) obj2, interfaceC14029l, 12);
            case 13:
                C15559l c15559l3 = new C15559l((C10481l) obj2, interfaceC14029l, 13);
                c15559l3.f30399l = obj;
                return c15559l3;
            case 14:
                return new C15559l((C15816l) this.f30399l, (InterfaceC7702l) obj2, interfaceC14029l, 14);
            case 15:
                C15559l c15559l4 = new C15559l((C15816l) obj2, interfaceC14029l, 15);
                c15559l4.f30399l = obj;
                return c15559l4;
            case 16:
                return new C15559l((C15816l) this.f30399l, (InterfaceC7702l) obj2, interfaceC14029l, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C15559l c15559l5 = new C15559l((C15816l) obj2, interfaceC14029l, 17);
                c15559l5.f30399l = obj;
                return c15559l5;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C15559l((C15816l) this.f30399l, (InterfaceC7702l) obj2, interfaceC14029l, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C15559l c15559l6 = new C15559l((C15816l) obj2, interfaceC14029l, 19);
                c15559l6.f30399l = obj;
                return c15559l6;
            case 20:
                return new C15559l((C15816l) this.f30399l, (InterfaceC7702l) obj2, interfaceC14029l, 20);
            case 21:
                C15559l c15559l7 = new C15559l((C15816l) obj2, interfaceC14029l, 21);
                c15559l7.f30399l = obj;
                return c15559l7;
            case 22:
                return new C15559l((AppActivity) this.f30399l, (C1027l) obj2, interfaceC14029l, 22);
            case 23:
                return new C15559l((C0857l) this.f30399l, (InterfaceC7702l) obj2, interfaceC14029l, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C15559l c15559l8 = new C15559l((C0857l) obj2, interfaceC14029l, 24);
                c15559l8.f30399l = obj;
                return c15559l8;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C15559l((C0857l) this.f30399l, (InterfaceC7702l) obj2, interfaceC14029l, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C15559l c15559l9 = new C15559l((C0857l) obj2, interfaceC14029l, 26);
                c15559l9.f30399l = obj;
                return c15559l9;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C15559l((C14965l) this.f30399l, (C5726l) obj2, interfaceC14029l, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C15559l((C11249l) obj2, interfaceC14029l, 28);
            default:
                return new C15559l((C0228l) this.f30399l, (AudioPlaylist) obj2, interfaceC14029l, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f30401l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 0:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
                return enumC9342l;
            case 2:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
                return enumC9342l;
            case 8:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC7702l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C15559l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15559l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f30401l = i;
        this.f30400l = obj;
    }
}
